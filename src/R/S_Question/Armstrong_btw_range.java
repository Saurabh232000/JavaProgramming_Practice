package R.S_Question;

import java.util.Scanner;

public class Armstrong_btw_range
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	for(int i=n;i<=m;i++)
	      {
	      if(isArmstrong(i))
	         {
	             System.out.println(i+" "+"Armstrong");
	          }
	     
	     }
	}
	  public static boolean isArmstrong(int n)
	    { 
	      int m=n;
	      int countDigit=count(n);
	      double sum=0;
	       while(n!=0)
	         {
	           int r=n%10;
	           sum=sum+Math.pow(r,countDigit);
	           n=n/10;
	         }
	     if(sum==m)
	        {
	            return true;
	        }
	     else
	         {
	              return false;
	          }
	    }
	public static int count(int k)
	      {
	         int count=0;
	          while(k!=0)
	            {
	               k=k/10;
	                count++;
	            }
	      return count;
	       }
	}
