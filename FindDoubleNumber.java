package HashMap;

import java.util.HashMap;
import java.util.Set;

public class FindDoubleNumber 
{
	public static void main(String[] args) 
	{
		String str = "AnkurMalviyaGoluMalviya";
		HashMap <Character,Integer> list = new HashMap<>();
		for(char ch : str.toCharArray())
		{
			if(list.containsKey(ch))
			{
				int val = list.get(ch);
				list.put(ch,val+1);
			}
			else
			{
				list.put(ch, 1);
			}
		}
		System.out.println(list);
		Set <Character> key = list.keySet();
		for(char a : key)
		{
			if(list.get(a)>2)
			{
				System.out.println(a);
			}
		}
	}
	
	
}
