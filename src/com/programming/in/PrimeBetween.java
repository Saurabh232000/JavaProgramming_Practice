
package com.programming.in;

public class PrimeBetween 
{
  public static void main(String[] args)
   {
		for(int i=1;i<=50;i++)
		{
			if(isprime(i))
			{
				System.out.println(i);
			}
		}
  }
  public static boolean isprime(int n)
  {
	  int count=0;
	  boolean isprime=true;
	  for(int i=2;i<n;i++)
	  {
		  if(n%i==0)
		  {
			  isprime=false;
			  count++;
		  }
	  }
	  if(count==0)
	  {
		  isprime=true;
	  }
	  return isprime;
  }
}
