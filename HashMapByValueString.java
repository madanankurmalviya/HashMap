package HashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Comparator;


public class HashMapByValueString {

	public static void main(String[] args)
	{
		HashMap<String,String> hm = new HashMap<>();
		hm.put("ONE","A");
		hm.put("Ten", "Z");
		hm.put("Three", "B");
		hm.put("Five","E");
		hm.put("Six", "Y");
		System.out.println(hm);
		System.out.println("------------------------------------");
		LinkedList <Entry<String,String>> list = new LinkedList<>(hm.entrySet());
		
		Collections.sort(list,new Comparator<Entry<String,String>>()
			{
				public int compare(Entry<String,String> arg1,Entry<String,String>arg2)
				{
					return arg1.getValue().compareTo(arg2.getValue());
				}
			
			});
		for(Entry e:list)
		{
			System.out.println(e);
		}
		
		System.out.println("------------------------------------");
	}
}
