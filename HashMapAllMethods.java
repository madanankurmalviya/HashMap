package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapAllMethods {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("Hello", 10);
		hm.put("World", 20);
		hm.put("India", 30);
//		System.out.println(hm);
//		
//		System.out.println();
//		
//		Object old = hm.put("Hello", 100);
//		System.out.println(old);
//	
//		
//		System.out.println();
//		
//		System.out.println(hm);
//		
//		
//		System.out.println();
//		
//		for(Entry e : hm.entrySet())
//		{
//			System.out.println("***" +e);
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
//		System.out.println();
//		Set key = hm.keySet();
//		System.out.println(key);
//		
//		System.out.println();
//		
//		Collection cl = hm.values();
//		System.out.println(cl);
//		
//		System.out.println();
		
		Set k = hm.entrySet();
		//System.out.println(k);
		
		System.out.println();
		
		System.out.println(hm);
		Iterator itr = k.iterator();
		while(itr.hasNext())
		{
			
			Map.Entry me = (Map.Entry)itr.next();
			//System.out.println(me.getKey()+"   "+me.getValue());
			
			if(me.getKey().equals("India"))
			{
				me.setValue(3000);
				//System.out.println("The change : "+me);
			}
				
		}
		System.out.println(hm);
		System.out.println();
		
		
		
		

	}

}
