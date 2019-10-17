package HashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Comparator;
public class HashMapCompareByValue1 
{
	public static void main(String[]args)
	{
		String st="I am am Ankur Ankur Ankur Malviya Ze Yow Kite";
		String[] str = st.split(" ");
		HashMap <Integer , String> hm = new HashMap<>();
		for(int a=1; a<str.length ;a++)
		{
			hm.put(a,str[a]);
		}
		System.out.println(hm);
		LinkedList<Entry<Integer,String>>list=new LinkedList<>(hm.entrySet());
		Collections.sort(list,new Comparator<Entry <Integer,String>>()
				
				{
					public int compare(Entry<Integer,String>a ,Entry<Integer,String>b)
					{
						return a.getValue().compareTo(b.getValue());
					}
				});
		
	}

}
