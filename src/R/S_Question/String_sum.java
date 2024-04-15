package R.S_Question;

public class String_sum {

	public static void main(String[] args) {
         
		String name="Abhay37Saurabh3";
		int sum=0;
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			if(ch>=49&&ch<=58)
			{
				sum=(ch-48)+sum;
			}
		}
		System.out.println(sum);
		
		
	}

}
