import java.util.Arrays;
import java.util.Scanner;

import Exam.cod.main;

public class rzdu {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	System.out.println("enter char:");
//	char c=sc.next().charAt(0);
//	int ascii=c;
//	System.out.println(ascii);
	//-------------------------------------------
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	//int m=n;
//	int rev=0;
//	while(n!=0)
//	{
//		int r=n%10;
//		rev=rev*10+r;
//		n=n/10;
//	}
//	System.out.println(rev);
	//_________________________________________
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	int m=n*n;
//	String s=String.valueOf(n);
//	String s1=String.valueOf(m);
//	if(s1.endsWith(s))
//	{
//		System.out.println(s+" "+"is automorphic");
//	}
//	else
//	{
//		System.out.println(s+" "+" is not automorphic");
//	}
	//-------------------------------------   k    -------------------------
//	System.out.println("enter no:");
//	int n=sc.nextInt();
//	int m=n;
//	int sum=0;
//	while(m!=0)
//	{
//		int r=m%10;
//		sum=sum+fact(r);
//		m=m/10;
//	}
//	if(sum==n)
//	{
//		System.out.println(true);
//	}
//	else
//	{
//		System.out.println(false);
//	}
//}
//public static int fact(int r)
//{
//	int fa=1;
//	for(int i=1;i<=r;i++)
//	{
//		fa=fa*i;
//	}
//	return fa;
	//______________________________________________________________
//	String s="He said, 'The mailman loves you.' I heard it with my own ears";
//	int Vowcount=0;
//	int Conscount=0;
//	System.out.println(s.length());
//	for(int i=0;i<=s.length()-1;i++)
//	{  
//		//char[] c=s.toCharArray();
//		char c=s.charAt(i);
//		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//		{
//		Vowcount++;
//	   }
//		else
//		{Conscount++;
//			
//		}
//	}
//	System.out.println(Vowcount);
//	System.out.println(Conscount);
	//________________________________________________________
//	String s="silent";
//	String s1="listen";
//	if(isAnagram(s,s1))
//	{
//		System.out.println(true);
//	}
//	else
//	{
//		System.out.println(false);
//	}
//}
//public static boolean isAnagram(String s,String s1)
//{
//	if(s.length()!=s1.length())
//	{
//		return false;
//	}
//	else
//	{
//		char[]a=s.toCharArray();
//		char[]b=s1.toCharArray();
//		Arrays.sort(a);
//		Arrays.sort(b);
//		if(Arrays.equals(a, b))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
	//------------------------------------------------------
//	String s=" Java Program to remove all the white spaces from a string";
//	String s1=s.replace(" ", "%");
//	System.out.println(s1);
//	//_______________________________________________-
//	String s=" Java Program to remove all the white spaces from a string";
//	String s1=s.toUpperCase();
//	System.out.println(s1);
	//----------------------------------------
//	String s="ABC";
//	String s1=s;
//	String rev="";
//	for(int i=s.length()-1;i>=0;i--)
//	{
//		rev=rev+s1.charAt(i);
//	}
//	System.err.println(rev);
//	if(rev==s1)
//	{
//		System.out.println(true);
//	}
//	else
//	{
//		System.out.println(false);
//	}
	//--------------------------------------------
//	String s="abbcccdddd";
//	int[]a=new int[127];
//	for(int i=0;i<=s.length()-1;i++)
//	{
//		a[s.charAt(i)]=a[s.charAt(i)]+1;
//		System.out.println(s.charAt(i)+" "+a[s.charAt(i)]);
//	}
//	int max=Integer.MIN_VALUE;
//	char c=' ';
//	for(int i=0;i<=s.length()-1;i++)
//	{
//		if(max<a[s.charAt(i)])
//		{
//			max=a[s.charAt(i)];
//			c=s.charAt(i);
//		}
//	}
//	System.out.println(max);
//	System.out.println(c);
//	System.err.println("for min");
//	int min=Integer.MAX_VALUE;
//	char c1=' ';
//	for(int i=0;i<=s.length()-1;i++)
//	{
//		if(min>a[s.charAt(i)])
//		{
//			min=a[s.charAt(i)];
//			c1=s.charAt(i);
//		}
//	}
//	System.out.println(min);
//	System.out.println(c1);
	//_________________________________________________
// String s="acdbbr";
// for(int i=0;i<=s.length()-1;i++)
// {
//	 for(int j=i+1;j<=s.length()-1;j++)
//	 {
//		 if(s.charAt(i)==s.charAt(j))
//		 {
//			 System.out.println(s.charAt(i));
//			 break;
//		 }
//	 }
// }
	//-----------------------------------
//	String s="th is a good boy a th";
////	String[] s1=s.split(" ");
////	System.out.println(s1);
//	char[]s1=s.toCharArray();
//	for(int i=0;i<=s1.length-1;i++)
//	{
//		for(int j=i+1;j<=s1.length-1;j++)
//		{
//			if(s1[i]==s1[j]&&i!=j)
//            {
//	             System.out.println(s1[i]);
//	             break;
//
//              }
//		}
//	}
	//_____________________________
//	String s="this is a boy";
//	String []s1=s.split(" ");
//	int count=0;
//	for(int i=0;i<=s1.length-1;i++)
//	{
//       count++;
//       System.out.println(s1[i]+" "+s1[i].length());
//	}
//	System.out.println(count);
	//___________________________________
//	String s="abc";
//	String s1="def";
//	String temp;
//	System.out.println(s);
//	System.out.println(s1);
//	temp=s;
//	s=s1;
//	s1=temp;
//	System.err.println(s);
//	System.err.println(s1);
	//-----------------------------------------
//  System.out.println("enter no:");
//  int n=sc.nextInt();
//  if(isArms(n))
//  {
//	  System.out.println(true);
//  }
//  else
//  {
//	  System.out.println(false);
//  }
//}
//public static boolean isArms(int n)
//{ 
//	int m=n;
//	double sum=0;
//	while(m!=0)
//	{
//		int r=m%10;
//		sum=sum+Math.pow(r, count(n));
//		m/=10;
//	}
//	if(sum==n)
//	{
//		return true;
//	}
//	else
//	{
//		return false;
//	}
//}
//public static int count(int n)
//{  
//	int count=0;
//	while(n!=0)
//	{
//		count++;
//		n/=10;
//	}
//	return count;
	//_____________________________________
//	String s="this is a boy";
//	String[]s1=s.split(" ");
//	String rev="";
//	for(int i=s1.length-1;i>=0;i--)
//	{
//	rev=rev+s1[i]+" ";	
//	}
//	System.out.println(rev+" ");
	//-----------------------------------------
//	String s="saurabh";
//	String rev="";
//	for(int i=s.length()-1;i>=0;i--)
//	{
//		rev=rev+s.charAt(i);
//	}
//	System.out.println(rev);
	//______________________________
//	String s="this a boy without mind";
//	String[] s1=s.split(" ");
//	String s2="";
//	for(int i=0;i<=s1.length-1;i++)
//	{
//		for(int j=0;j<=s1[i].length()-1;j++)
//		{
//			if(j==0||j==s1[i].length()-1)
//			{
//				s2=s2+String.valueOf(s1[i].charAt(j)).toUpperCase();
//			}
//			
//				else
//		  		{
//		  			s2=s2+String.valueOf(s1[i].charAt(j));
//		  		}
//			}
//		s2=s2+" ";
//		}
//	System.out.println(s2);
}
}
