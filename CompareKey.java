package HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;


public class CompareKey
{
	public static void main(String[]args)
	{
		HashMap<String, String > hm = new HashMap<String , String>();
		hm.put("Ankur", "Berlin");
		hm.put("Zero", "York");
		hm.put("YoYo", "Peru");
		hm.put("Tiger", "Germany");
		hm.put("Data", "Poland");
		System.out.println(hm);
		LinkedList <Entry<String,String>>ll = new LinkedList<>(hm.entrySet());
		Collections.sort(ll, new Comparator<Entry<String,String>>()
				{
						public int compare(Entry<String,String>arg1 , Entry<String,String>arg2)
						{
							return arg1.getKey().compareTo(arg2.getKey());							
						}
				});
		System.out.println(ll);
	}
}
