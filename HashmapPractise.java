package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;


public class HashmapPractise {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Hello");
		hm.put(2, "World");
		hm.put(3, "india");
		System.out.println(hm);
		System.out.println("-------------------------");
		
		hm.put(1, "Hi");
		Object hmm=	hm.put(1, "Hii");
		System.out.println("The old value is :"+hmm);
		System.out.println("-------------------------");
		
		Set s = hm.entrySet();
		System.out.println(s);
		System.out.println("-------------------------");
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println(me.getKey()+"\t"+me.getValue());
		} 
		System.out.println("-------------------------");
			
		 Set key = hm.keySet();
		
		 System.out.println(key);
		System.out.println("-------------------------");
		
		Iterator tr1 = key.iterator();
		while(tr1.hasNext())
		{
			 Object me = tr1.next();
			System.out.println(me);
		}
		
			
		 
		
		
		
		
		
		

	}

}
