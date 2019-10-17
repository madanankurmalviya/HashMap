package HashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
public class DuplicateExample 
{

	public static void main(String[] args)
	{
		String str = "Hello World";
		HashMap<Character,Integer> list = new HashMap<>();
		
		for(char ch: str.toCharArray())
		{
			if(list.containsKey(ch))
			{
				int val = list.get(ch);
				list.put(ch, val+1);
			}
			else
			{
				list.put(ch, 1);
			}
		}
		System.out.println(list);
		
		Set<Character> key = list.keySet();
		for(char a:key)
		{
			if(list.get(a)>1)
			{
				System.out.println(a+"--"+list.get(a));
			}
		}
	}
}
