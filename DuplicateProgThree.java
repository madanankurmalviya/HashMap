package HashMap;

import java.util.HashMap;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;


public class DuplicateProgThree {

	public static void main(String[] args) {
		
		String str2 = "Ankur           Malviya    is a         Monkey. Ha Ha   ";
		//String str2=StringUtils.normalizeSpace(str1);
		String str = str2.replaceAll("\\s+","");
		System.out.println(str);
		HashMap <Character , Integer> list = new HashMap<>();
		for(char ch : str.toCharArray())
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
		System.out.print(list);
		System.out.println();
		Set<Character> key = list.keySet();
		for(char a:key)
		{
			if(list.get(a)>1)
				{
		        	System.out.println(a+"   "+list.get(a));
		        }
		}
	}

}
