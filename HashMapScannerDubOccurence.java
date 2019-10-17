package HashMap;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
public class HashMapScannerDubOccurence 
{
	public static void main(String[]args)
	{
		HashMap<String , Integer> hm = new HashMap<>();
		String st = "I am am Ankur Ankur Ankur  am Om Om The the The Country Country";
		String [] str = st.split(" ");
		for(String a : str)
		{
			//System.out.println(a);
			if(hm.get(a)!=null)
			{
				hm.put(a, hm.get(a));
				
			}
			
			
		}
		
		
		
	}
}
