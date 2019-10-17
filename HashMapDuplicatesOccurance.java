package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapDuplicatesOccurance
{
	public static void main(String []args)
	{
		String str = "Your***Hey %am Dear Hey HEy Hey HeyDear @I am Hey Here##Me Tell Whats Your Name Name Tell Me Baby.";
		String st1=str.replaceAll("[^a-zA-Z]"," ");
		String[] st=st1.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		for(String a:st)
		{
			if(hm.get(a)!=null)
			{
				hm.put(a, hm.get(a)+1);
			}
			else
			{
				hm.put(a, 1);
			}
			
		}
		System.out.println(hm);
		
		for(Entry e :hm.entrySet())
		{
			if(hm.get(e.getKey())>1)
			{
				System.out.println(hm.get(e.getKey()) +"\t"+e.getKey());
			}
		}
//		Set<String> key = hm.keySet();
//		for(String k :key)
//		{
//			
//			Integer ab = hm.get(k);
//			if(hm.get(k)>1)
//		
//			{
//				System.out.println(k +"\t"+hm.get(k));
//			}
//		}
		
		
	}
}
