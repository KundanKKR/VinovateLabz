package test;

public class Reverse
{
	static String reverse(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char c=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=c;
		}
		return new String(ch);
	}
	public static void main(String[] args)
	{
		String st="kundan";
		System.out.println(reverse(st));
	}
}
