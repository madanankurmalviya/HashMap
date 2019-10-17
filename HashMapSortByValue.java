package HashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class HashMapSortByValue 
{
	public static void main(String[]args)
	{
		HashMap <String,Integer> hm = new HashMap<String,Integer>();
		hm.put("A", 10);
		hm.put("B", 2);
		hm.put("E", 20);
		hm.put("F", 18);
		hm.put("D", 3);
		
		//System.out.println(hm);
		
		LinkedList<Entry<String,Integer>> list = new LinkedList<>(hm.entrySet());
		Collections.sort(list,new Comparator<Entry<String,Integer>>()
		{
			@Override
			public int compare(Entry<String,Integer>arg1, Entry<String,Integer>arg2)
			{
				return arg1.getValue().compareTo(arg2.getValue());
			}
		});
		
		for(Entry e: list)
		{
			System.out.println(e);
		}
			
	}
}
