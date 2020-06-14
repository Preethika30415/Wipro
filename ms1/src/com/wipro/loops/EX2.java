package com.wipro.loops;
public class EX2 
{
	public static void main(String a[])
	{
		try
		{
			int l=Integer.parseInt(a[0]);
			int h=l,k;
			int c=0;
			while(l>0)
				{
				k=l%10;
				c=c+k;
				l=l/10;
				}
			System.out.println("The sum of digits of "+h +" is " +c);
		}
		catch(Exception ae)
		{
			System.out.println("The number is not a integer");
		}
	}
}
