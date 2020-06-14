package com.wipro.loops;
public class EX14
{
	public static void main(String args[])
	{
		if(args.length==0)
			System.out.println("please enter an integer number");
		else
			{
			int num=Integer.parseInt(args[0]);
			if(num==0||num==1)
				System.out.println(num+" is neither prime nor composite ");
			else
				{
				int l=0;
				for(int i=2;i<=Math.sqrt(num);i++)
					{
					if(num%i==0)
						{
						l=1;
						System.out.println(num+" is not a prime number ");
						System.exit(0);
						}
					}
				if(l==0)
					System.out.println(num+" is a prime number ");
				}
			}
		}
}
