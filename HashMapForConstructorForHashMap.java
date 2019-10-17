package HashMap;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapForConstructorForHashMap {

	public static void main(String[] args) 
	{
		HashMap<Integer , ConstructorForHashMap> hm = new  HashMap<Integer , ConstructorForHashMap>();
		
		ConstructorForHashMap e1= new ConstructorForHashMap(1 , "Ankur Malviya" , "QA" );
		ConstructorForHashMap e2 = new ConstructorForHashMap(2,"Tom" , "Coder");
		ConstructorForHashMap e3 = new ConstructorForHashMap(3, "Peter ENgland","Markeeter");
		
		hm.put(10, e1);
		hm.put(20, e2);
		hm.put(30, e3);
		Set <Integer>key = hm.keySet();
				 
		for (int num : key)
		{
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		 for( Entry<Integer, ConstructorForHashMap> m : hm.entrySet())
//		 {
//			int key = m.getKey();
//			ConstructorForHashMap emp = m.getValue();
//			System.out.println(key + " " +"Info");
//			
//			System.out.println(emp.Name +" "+emp.sno +"  " +emp.Dept);
//			
//		 }
		
		
		

	}

}
