package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapDuplicates
{
	public static void main(String [] args)
	{
		String[] str = { "Z" ,"10","8","3", "A" ,"Y" ,"Z" ,"10","8","3", "A","O", "A" ,"Z" ,"10","8","3", "A","Y" ,"O" };
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String s :str)
		{
			if(hm.get(s)!=null)
			{
				int val=hm.get(s);
				System.out.print("Thevalue are: "+val);
				hm.put(s,val+1);
			}
			else 
			{
				hm.put(s, 1);
			}
			
			//System.out.println(hm);
		}
		for(Entry <String,Integer> e : hm.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getValue() +"\t"+e.getKey());
			}
		}
	}

}
