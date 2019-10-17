package HashMap;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class DuplicatesStringInList
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
	  // Fetch / get data from excel sheet - 16 rows
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("3");
		
		HashMap<String,Integer > hm = new HashMap<String ,Integer >();
		for(int i = 1 ; i<=16 ; i++)  
		{
			Row rw = sh.getRow(i); 
			Cell cl = rw.getCell(0);
			String data = cl.getStringCellValue();
			hm.put(data , data.length());   
		}
		LinkedList<Entry<String,Integer>> al = new LinkedList<>(hm.entrySet());
		Collections.sort(al,new Comparator<Entry<String,Integer>>()
			     {
					public int compare(Entry<String,Integer>a  , Entry<String,Integer>b)
					{
						return a.getValue().compareTo(b.getValue());
					}
				});
		
		for(Entry e:al)
		{
			System.out.println(e);
		}

	}
}