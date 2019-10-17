package HashMap;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
public class DuplicatesFindScannerString 
{
	public static void main(String[]args) throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		System.out.println("The string is :"+str);
		String [] stt = str.split(" ");
		int len = stt.length;
		
		HashMap<String, Integer> list = new HashMap<>();
		for(String a : stt)
		{
			if(list.get(a)!=null)
			{
				list.put(a,list.get(a)+1);
			}
			else
			{
				list.put(a, 1);
			}
		}	
		System.out.println(list);
		
		for(Entry<String,Integer>e:list.entrySet())
		{
		
			if(e.getValue()>1)
			{
				int num = e.getValue();
				FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
				Workbook wb =WorkbookFactory.create(fis);
				Sheet sh = wb.getSheet("Sheet2");
				for(int a= 1; a<=len ; a++)
				{
					Row rw = sh.getRow(a);
					if(rw==null) 
					{
						rw=sh.createRow(a);
					}
					Cell cl = rw.getCell(1);
					if(cl==null)
					{
						cl=rw.createCell(1);
					}
					cl.setCellValue(stt[a-1]);
					Cell cl1 = rw.getCell(2);
					if(cl1==null)
					{
						cl1=rw.createCell(2);
					}
					cl1.setCellValue(num);
				}
		FileOutputStream fos = new FileOutputStream(".//ExcelFolder/Excel.xlsx");
		wb.write(fos);
		
					System.out.println("The STring Key is: "+e.getKey()+"\t"+"and the value is: "+e.getValue()+" times.");
			}
		}
	}
}
