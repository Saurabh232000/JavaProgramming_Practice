package defPackage;
import java.lang.*;
class  thread
{
	
}
public class multiThreading extends thread{
public static void main(String[] args) {
	try {
	System.out.println("program started");
	int a=3;
	int b=5;
	int c=a+b;
	System.out.println(c);
	thread t1=new thread();
	//thread t2=Thread.currentThread();
   // String tname=t2.getName();
	System.out.println(t1.hashCode());
	System.out.println(t1.getClass());
	//System.out.println(t1.wait(1000));
	System.out.println("program ended");}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
