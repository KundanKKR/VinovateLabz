package rev;
import java.util.Scanner;
public class Rotate
{
	void rotate(int a[],int d,int n)
	{
		int b[]=new int[n];
		int i=0,k=d,j=0;
		while(d<a.length)
		{
			b[i]=a[d];
			d++;
			i++;
		}
		while(j<k)
		{
			b[i]=a[j];
			i++;
			j++;
		}
		for(int x=0;x<n;x++)
		{
			System.out.print(b[x]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter "+n+" elements of array");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("enter the value of d");
		int d=s.nextInt();
		s.close();
		new Rotate().rotate(a,d,a.length);
	}
}
