package loop;

public class display_a_to_z {
public static void main(String[] args) {
	for(char c='a';c<='z';c++)
	{
		int ascii=c;
		System.err.println(c+ "="+ascii);
	}
	for(char d='A';d<='Z';d++)
	{
		int ascii=d;
		System.out.println(d+ "="+ascii);
	}
}
}
