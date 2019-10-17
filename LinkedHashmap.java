package HashMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.IdentityHashMap;
public class LinkedHashmap {

	public static void main(String[] args)
	{
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println("-------------------------");
		System.out.println(i1==i2);
		System.out.println("-------------------------");
		System.out.println(i1.equals(i2));
		System.out.println("-------------------------");
		lhm.put(i1, "Hello");
		lhm.put(i2, "world");
		System.out.println("lhm: "+lhm);
		System.out.println("-------------------------");
		HashMap<Integer,String> hm = new HashMap<>();
		hm.putAll(lhm);
		System.out.println("hm: "+hm);
		System.out.println("-------------------------");
		IdentityHashMap<Integer,String> ihm = new IdentityHashMap<>();
		ihm.put(i1,"hello");
		ihm.put(i2,	"world");
		System.out.println("ihm : "+ihm);
		
		System.out.println("-------------------------");
		

	}

}
