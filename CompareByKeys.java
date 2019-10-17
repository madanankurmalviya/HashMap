package HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CompareByKeys 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		HashMap<String , String> hm = new HashMap<>();
		FileInputStream fis = new FileInputStream("C://Users/Prafulla/Desktop/List.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rn = sh.getLastRowNum();
		for(int a=0 ; a<rn ;a++)
		{
			Row rw = sh.getRow(a);
			Cell cl = rw.getCell(0);
			String data = cl.getStringCellValue();
			String [] dat =data.split("-");
			hm.put(dat[0].toString(), dat[1].toString());
		}
		System.out.println(hm);
		LinkedList<Entry<String,String>> ll = new LinkedList<>(hm.entrySet());
		Collections.sort(ll, new Comparator<Entry<String,String>>()
				{
					public int compare(Entry<String,String>arg1 , Entry<String,String>arg2)
					{
						return arg1.getKey().compareTo(arg2.getKey());
					}
				});
		System.out.println(ll);
	}
}

