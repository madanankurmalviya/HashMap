package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DupVar
{
	public static void main(String []args)
	{
		String str = "Hi world Hi is not not not enough for is  pyaar";
		String [] s = str.split(" ");
		HashMap<String , Integer> list = new HashMap<>();
		for(String ss : s)
		{
			
			if(list.get(ss)!=null)
			{
				list.put(ss,list.get(ss)+1);
				//System.out.println("The val1="+list);
				
			}
			else
			{
				list.put(ss, 1);
				//System.out.println("The val2="+list);
			}
			
		}
		//System.out.println(list);
		
		for(Entry<String,Integer> e: list.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey()+"\t"+e.getValue());
			}
		}
	}
}
