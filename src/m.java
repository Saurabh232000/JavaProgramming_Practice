
public class m {
  int x=888;
}
 class c extends m{
	int x=999;
}
 class Test{
	 public static void main(String[] args) {
		m m=new m();
		System.out.println(m.x);
		c c=new c();
		System.out.println(c.x);
		m m1=new c();
		System.out.println(m1.x);
	}
 }
