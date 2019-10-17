package HashMap;
import java.util.HashMap;
import java.util.Map.Entry;
public class FindDuplicateStrings 
{
	public static void main(String[]args)
	{
		String st = "ankur mor malviya mor ankur don lara ankur mor kogan lara teraa tiara";
		String [] str = st.split(" ");
		
		HashMap<String , Integer > hm = new HashMap<>();
		for(String s : str)
		{
			
			if(hm.get(s)!=null)
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
		}
		System.out.println(hm);
		for(Entry<String,Integer> e : hm.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey()+"\t"+e.getValue());
			}
		}
		
	}
}
