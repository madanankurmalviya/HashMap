package HashMap;
import java.util.HashMap;
import java.util.Map.Entry;
public class CharacterDuplicates 
{
	public static void main(String[]args)
	{
		String s = "helloiamankurmalviya";
		char [] ch = s.toCharArray();
		HashMap<Character,Integer>hm = new HashMap<>();
		for(char a : ch)
		{
			if(hm.get(a)!=null)
			{
				hm.put(a, hm.get(a)+1);
			}
			else
			{
				hm.put(a, 1);
			}
		}
		System.out.println(hm);
		for(Entry<Character,Integer> e:hm.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey()+"\t"+e.getValue());
			}
		}
		
	}
}
