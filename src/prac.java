import java.util.Scanner;

import Exam.cod.main;

public class prac {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	if((n%400==0)||(n%4==0 &&n%100!=0))
//	{
//		System.out.println("leap year");
//	}
//	else
//	{
//		System.out.println("not leap year");
//	}
	//------------
//	int k=Area(n);
//	System.out.println(k);
//}
//public static int Area(int m) {
//	int l=m*m;
//	return l;
	//----------   3.14*r*r
//	double  Ar=Area(n);
//	System.out.println(Ar);
//}
//public static double Area(int n)
//{
//	double A=3.14*n*n;
//	return A;
	//----------
//	System.out.println("enter 1 subject:");
//	int a=sc.nextInt();
//	System.out.println("enter 2 subject:");
//	int b=sc.nextInt();
//	System.out.println("enter 3 subject:");
//	int c=sc.nextInt();
//	System.out.println("enter 4 subject:");
//	int d=sc.nextInt();
//	double total=a+b+c+d;
//	System.out.println("enter total subject");
//	double per=total/sc.nextInt();
//	System.out.println(per);
//	if(per<35)
//	{
//		System.out.println("fail");
//	}
//	else if(a<35||b<35||c<35||d<35)
//	{
//		System.out.println("fail");
//	}
//	else if(per>80)
//	{
//		System.out.println("distinct");
//	}
//	else if(per>60&&per<80)
//	{
//		System.out.println("first");
//	}
//	else if(per>40&&per<60)
//	{
//		System.out.println("second");
//	}
	//------------
//	int count=0;
//	int sum=0;
//	for(int i=1;i<=50;i++)
//	{    if(i%2==0) 
//	   {
//		count++;
//		System.out.println(i);
//		sum=sum+i;
//		}
//	}
//	System.err.println(count);
//	System.out.println(sum);
	//---------
//	for(int i=1;i<=10;i++)
//	{
//		for(int j=1;j<=10;j++)
//		{
//			System.out.print(i*j+" ");
//		}
//		System.out.println();
//	}
	//--------
//	int n=sc.nextInt();
//		int pr=product(n);
//		System.out.println(pr);
//}
//public static int product(int n)
//    {
//	int product=1;
//	for(int i=1;i<=n;i++)
//	{
//		product=product*i;  //1*1=1*2=2*3=6*4=24*5=120*6=720*7=5040*8=40320*9=362880*10=3628800
//	}
//	  return product;
	  //-------
//	int n=123456789;
//	int count=0;
//	  while(n!=0)
//	  {
//		  n=n/10;
//		  count++;
//	  }
//	  System.out.println(count);
	  //-----
	int n=123456789;
	while(n!=0)
	{
		//System.out.println("igf");
		int r=n%10;
		if(r%2==0)
		{
			System.out.println(n+ "even");
		}
		n=n/10;
	}
    }
}
