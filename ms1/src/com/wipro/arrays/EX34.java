package com.wipro.arrays;

public class EX34 
{
	public static void main(String[] ar) 
	{
		int a[]=new int[3];
		int b[]=new int[3];
		int i,j;
		for(i=0;i<3;i++) 
		{
			a[i]=Integer.parseInt(ar[i]);
		}
		for(j=0;j<3;j++) 
		{
			b[j]=Integer.parseInt(ar[i+j]);
		}
		int c[]=new int[2];
		c[0]=a[1];
		c[1]=b[1];
		for(int k=0;k<2;k++) 
		{
			System.out.print(c[k]+" ");
		}
	}
}