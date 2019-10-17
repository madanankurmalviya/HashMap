package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDuplicates1 {

	public static void main(String[] args) 
	{
		String[] str = {"A","A","Q","Y","Q","P","B","W"};
		HashMap<String , Integer> hm = new HashMap<>();
		for(String s:str)
		{
			if(hm.get(s)!=null)
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
		}
		for(Entry<String,Integer> e:hm.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey()+"\t"+e.getValue());
			}
		}

	}

}
