package R.S_Question;
import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("enter string");
	String s=new Scanner(System.in).next();
	Map<Character,Integer>map=new HashMap<>();
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(map.containsKey(ch))
		{
			count=map.get(ch);
			count++;
			map.replace(ch,count);
		}
		else
		{
			map.put(ch,1);
		}
	}
	int max=Collections.max(map.values());
	int min=Collections.min(map.values());
	for(Character key:map.keySet())
	{
		if(map.get(key)==max)
			System.out.println("maximum="+key+" "+map.get(key));
		if(map.get(key)==min)
			System.out.println("minimun="+key+" "+map.get(key));
	}
	}
}
