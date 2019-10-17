package HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ListToHashMap {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Hello");
		al.add("World");
		al.add("India");
		System.out.println("The array list are: " + al);
		
		HashMap<String,Integer> hm = new HashMap<>();
		for(String s: al)
		{
			hm.put(s, s.length());
		}
		System.out.println(hm);
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			 Object aa = itr.next();
			 System.out.println(aa);
		}
		
		
			
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("Hello",1);
		hm1.put("World",2);
		hm1.put("India",3);
		System.out.println("The hm value is : "+hm1);
		
		HashMap<String, Integer> nhm = new HashMap<>();
		nhm.putAll(hm1);
		System.out.println("The new map value is : "+nhm);
		
		
	}

}
