package rev;

import java.util.Scanner;

public class Reverse 
{
	static void reverse(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char c=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=c;
		}
		st=new String(ch);
		System.out.println(st);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter an string");
		String st=s.nextLine();
		reverse(st);
	}
}
