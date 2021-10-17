package rev;

import java.util.Scanner;

public class Frequency
{
	static void frequency(int a[],int n)
	{
		int x=0,p=0;
		for(int i=0;i<n;i++)
		{
			int ct=0;
			for(int j=i;j<n;j++)
			{
				if(a[i]==a[j])
					ct++;
			}
			if(ct>x)
			{
				p=a[i];
				x=ct;
			}
		}
		System.out.println(p+" occured "+x+" times");
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter "+n+" elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		frequency(a,n);
	}
}
