package test;
public class Rotate 
{
	static void rotate(int ar[],int d,int n)
	{
		int b[]=new int[n];
		int j=0,k=d;
		int i=0;
			while(d<ar.length)
			{
				b[i]=ar[d];
				i++;
				d++;
			}
			while(j<k)
			{
				b[i]=ar[j];
				i++;
				j++;
			}
			for(int a=0;a<n;a++)
				System.out.print(b[a]+" ");
	}
	public static void main(String[] args)
	{
		int ar[]= {1,2,3,4,5,6,7,8};
		int d=2;
		rotate(ar,d,ar.length);
	}
}
