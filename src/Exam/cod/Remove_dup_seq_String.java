package Exam.cod;

public class Remove_dup_seq_String {
public static void main(String[] args) {
	String s="saurabh saurabh is my my name";
	String temp="";
	String temp1="";//saurabh saurabh 
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch=s.charAt(i);// 
		temp=temp+ch;//saurabh  
		if(ch==32||ch==s.length()-1)
		{
			temp1=temp1+temp;
			if(temp1.equals(temp))
			{
				continue;
			}
			temp="";
		}
	}
	System.out.println(temp1);
}
}
