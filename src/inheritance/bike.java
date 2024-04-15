package inheritance;

public class bike extends car {
void bi()
{
	System.out.println(" i am a  bikke");
}
public static void main(String[] args) {
	bike b1=new bike();
	b1.ca();
	System.err.println(" by creating bike class object we can call car class propeerties");
	b1.fuction();
	b1.color();
	b1.wheel();
	b1.vehi();
	System.err.println(" by creating bike  class object we can call vehicle as well  as car prperties");
	b1.bi();
}
}
