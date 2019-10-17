package HashMap;


import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class CompareDataFromTwoTables 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		ArrayList<String>list1=new ArrayList<String>();
		ArrayList<String>list2=new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String sn="3";
		int cl0=0 ,cl1=1 ,rn=11;
		Sheet sh = wb.getSheet(sn);
		for(int a = 1 ; a<rn ;a ++) 
		{
			Row rw = sh.getRow(a);
			Cell cel1 = rw.getCell(cl0);
			Cell cel2 = rw.getCell(cl1);
			String data1=cel1.getStringCellValue();
			String data2 = cel2.getStringCellValue();
			list1.add(data1);
			list2.add(data2);
		}
		
			System.out.println("list1 "+list1);
			System.out.println("list2 :"+list2);
			
			if(Arrays.equals(list1.toArray(), list2.toArray()))
			{
				System.out.println("The values in the list are equals");
			}
			else
			{
				System.out.println("The values in the list are not equals");
			}

	}
}
	


