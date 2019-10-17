package HashMap;

import java.util.HashMap;
import java.util.Set;

public class DuplicateNumbers 
{

	public static void main(String[] args) 
	{
		String str = "AnkurMabdbdbdbdbdbdlviya";
		HashMap <Character,Integer> map = new HashMap<>();
		for(char ch : str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				int count = map.get(ch);
				map.put(ch, count+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		Set <Character> key = map.keySet();
		for(char a:key)
		{
			if(map.get(a)>1)
			{
				System.out.println(a+" "+map.get(a));
			}
		}
	}

}
