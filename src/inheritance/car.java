package inheritance;

public class car extends vehicle {
	void ca()
	{
		System.out.println(" i am a car");
	}
public static void main(String[] args) {
	car c1=new car();
	c1.color();
	c1.fuction();
	c1.wheel();
	c1.vehi();
	System.out.println(" wwe can inheerit vehicle properties");
	c1.ca();
}
}
