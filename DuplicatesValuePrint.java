package HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicatesValuePrint 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String[]st=str.split(" ");
		int len=st.length;
		
		HashMap<String, Integer> list = new HashMap<>();
		for(String s:st)
		{
			if(list.get(s)!=null)
			{
				list.put(s, list.get(s)+1);
			}
			else
			{
				list.put(s,1);
			}
		}
		//System.out.println(list);
		
		for(Entry <String, Integer> e :list.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey()+"\t"+e.getValue());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Set<String> key =list.keySet();
//		for(String s:key)
//		{
//			if(list.get(s)>1)
//			{
//				System.out.println(s+"\t"+list.get(s));
//			}
//		}
	}
}
