package Practice_L;

import java.util.Scanner;

public class print_ato_z_with_ascii {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    for(char i='a';i<='z';i++)
    {
    	int ascii=i;
    	System.out.println(i+"= "+ascii);
    }
    for(char i='A';i<='Z';i++)
    {
    	int ascii=i;
    	System.out.println(i+" ="+ascii);
    }
}
}
