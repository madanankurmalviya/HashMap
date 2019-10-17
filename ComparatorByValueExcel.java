package HashMap;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import java.util.Map.Entry;

public class ComparatorByValueExcel 

{
	public static void main(String[]args) throws EncryptedDocumentException, IOException 

	{
	      FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet("Sheet1");
	      HashMap<String, Integer> list = new HashMap<>();
	      for(int a=0; a<11 ; a++ )
	      {
	    	  Row rw = sh.getRow(a+1);
	    	  Cell cl = rw.getCell(0);
	    	  String data = cl.getStringCellValue();
	    	  list.put(data,data.length());
	    	  
	      }
	      System.out.println(list);
	      for(Entry<String , Integer> e: list.entrySet())
	      {
	    	  if(e.getValue()>14)
	    	  {
	    		  System.out.println(e.getKey()+"\t"+e.getValue());
	    	  }
	      }
	      System.out.println(list);		  
	      LinkedList ll = new LinkedList<>(list.entrySet());
	      Collections.sort(ll, new Comparator<Entry<String , Integer>>()
	    		  
	    		  {
	    	  			public int compare(Entry<String, Integer>a1 ,Entry<String ,Integer>a2)
	    	  			{
	    	  				return a1.getValue().compareTo(a2.getValue());
	    	  			}
	    	  
	    		  });
	      System.out.println(ll);
	     
	      System.out.println("The print has done");

	}
}