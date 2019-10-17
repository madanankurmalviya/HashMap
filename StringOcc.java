package HashMap;
import java.util.HashMap;
public class StringOcc 
{
	public static void main(String[]args)
	{
		String sen = "Hi my name is wonderfull land";
		String a = sen.replaceAll(" ","");
		System.out.print(a);
		String[] s = a.split("");
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int aaa=0; aaa<a.length();aaa++)
		{
			char aa= a.charAt(aaa);
			if(hm.get(aa)!=null)
			{
				hm.put(aa, hm.get(aa)+1);
			}
			else
			{
				hm.put(aa, 1);
			}
		}
		System.out.println(hm);
		
	}
}
