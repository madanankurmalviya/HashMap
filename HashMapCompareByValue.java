package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Collections;
public class HashMapCompareByValue
{
	public static void main(String[]args)
	{
	String[] str = {"Ankur","Z","Y","E","T","K","Q"};
	HashMap<Integer,String> hm = new HashMap<>();
	for(String s:str)
	{
		hm.put(s.length()+1,s);
	}
	System.out.println(hm);
	}

}
