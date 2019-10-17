package HashMap;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Methods
{
void ExcelMethod(String sn , int n , int cl1 , int cl2) throws EncryptedDocumentException, IOException
{
	ArrayList<String>list1=new ArrayList<String>();
	ArrayList<String>list2=new ArrayList<String>();
	FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sn);
	for(int a = 1 ; a<=10 ;a ++) 
	{
		Row rw = sh.getRow(a);
		Cell cel1 = rw.getCell(cl1);
		Cell cel2 = rw.getCell(cl2);
		String data1=cel1.getStringCellValue();
		String data2 = cel2.getStringCellValue();
		list1.add(data1);
		list2.add(data2);
	}
}