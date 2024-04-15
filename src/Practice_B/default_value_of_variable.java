package Practice_B;
public class default_value_of_variable {
	int a;
	short s;
	byte b;
	long d;
	char c;
	float f;
	double de;
	boolean be;
	void show()
	{
		System.out.println(this.a);
		System.out.println(this.s);
		System.out.println(this.b);
		System.out.println(this.d);
		System.out.println(this.c);
		System.out.println(this.f);
		System.out.println(this.de);
		System.out.println(this.be);
	}
public static void main(String[] args) {
	default_value_of_variable a=new default_value_of_variable();
	System.out.println("BY USING THIS METHOD CREATED INSIDE CLASS");
	a.show();
	System.err.println(" BY USING OBJECT");
	System.out.println(a.a);
	System.out.println(a.s);
	System.out.println(a.b);
	System.out.println(a.d);
	System.out.println(a.c);
	System.out.println(a.f);
	System.out.println(a.de);
	System.out.println(a.be);
}
}
