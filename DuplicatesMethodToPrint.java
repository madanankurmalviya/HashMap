package HashMap;
import java.util.HashMap;
import java.util.Set;

public class DuplicatesMethodToPrint 
{

	static void Duplicates(String str)
	{
		 String[] st = str.split(" ");
		 HashMap <String, Integer> list = new HashMap<>();
		 for(String string : st)
		 {
			 if(list.get(string)!=null)
			 {
				 list.put(string,list.get(string) + 1 );
			 }
			 else
			 {
				 list.put(string,1);
			 }
		 }
		 Set<String> ky = list.keySet();
		 for(String s:ky)
		 {
			 if(list.get(s)>1)
			 {
				 System.out.println(s+"     "+list.get(s));
			 }
			 else
			 {
				 System.out.println("Hello");
			 }
		 }
		 //System.out.println(list);
	}
	public static void main(String[] args) 
	{
		Duplicates("I am am Indian Ankur Ankur .");
	}

}
