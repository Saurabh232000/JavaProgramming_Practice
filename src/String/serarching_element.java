package String;

public class serarching_element {
public static void main(String[] args) {
	String []s= {"deepak","amit","rahul" ,"vironika","deepesh","rohit"};
	//String temp = "rohit";
	int index=0;
	for(int i=0;i<=s.length-1;i++)
	{
		if(s[i].equals("amit"))
		{
			index=i;
			System.out.println(s[i] + " " +index);
		}
	}
} 
}
