package HashMap;

import java.util.HashMap;

public class HashMapOld 
{
	public static void main(String[] args) 
	{
		HashMap<Integer , String> hm = new HashMap<>();
		hm.put(101, "Ankur");
		hm.put(102, "Malviya");
		hm.put(103, "Tom");
		Object a=hm.put(101,"MavenDude");
		System.out.println(hm);
		System.out.println(a);
	}
}
