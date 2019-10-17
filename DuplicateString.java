package HashMap;

import java.util.Set;
import java.util.HashSet;

public class DuplicateString 
{

	public static void main(String[] args) 
	{
		String[] str = {"ank" ,"mal", "ank", "ank", "mal"};
		Set<String> list = new HashSet<String>();
		for(String a:str)
		{
			if(list.add(a)==false)	
			{
				System.out.println("Duplicates value : "+a);
			}
			else
			{
				System.out.println("The duplicate value is not present");
			}
		}
		
	}

}
