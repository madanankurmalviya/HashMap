package HashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;


public class HashMapExpTwo {
	//Comparator<Entry<String, Integer>> comparator ;

	public static void main(String[] args)
	{
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("A", 20);
		hm.put("Z", 10);
		hm.put("B",30);
		
		hm.put("E",10);
		hm.put("G", 30);
		System.out.println(hm);
		
		System.out.println("--------------------------------");
		
		LinkedList <Entry<String,Integer>> list = new LinkedList<>(hm.entrySet());
		System.out.println(list);
		
		System.out.println("--------------------------------");
		
		Collections.sort(list, new Comparator<Entry<String,Integer>>()
				{
					
					public int compare(Entry<String, Integer> OM1, Entry<String, Integer> OM2)
					{
						
						return OM1.getValue().compareTo(OM2.getValue());
					}
				});
		
		for(Entry <String,Integer> item : list)
		{
			System.out.println(item);
		}
	}

}
