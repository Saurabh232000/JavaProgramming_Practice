package R.S_Question;

public class search_an_element {
public static void main(String[] args) {
	int[]a= {12,15,21,24,27};
	int search=21;
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]==search)
		{
			System.out.println(a[i]+" ="+i);
		}
	}
}
}
