package rev;
import java.util.*;
public class Palindrome
{
	static boolean isPalindrome(String st)
	{
		for(int i=0;i<st.length()/2;i++)
		{
			if(st.charAt(i)!=st.charAt(st.length()-1-i))
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String st=s.next();
		boolean b=isPalindrome(st);
		if(b==true)
			System.out.println("Palindrome");
		else
			System.err.println("Not Palindrome");
	}
}
