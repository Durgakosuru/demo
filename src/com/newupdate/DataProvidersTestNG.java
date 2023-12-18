package com.newupdate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersTestNG 
{
@Test(dataProvider="logindatafromexcel")
public static void methodtest(String x,String y) 
{
	System.out.println(x);
	System.out.println(y);
	System.out.println("Hello World");
}
@DataProvider(name="logindatafromexcel")
public static String[][]datareaderfromexcel() throws IOException
{
	File f=new File("./Utilities/InputFile.xlsx");
	FileInputStream fio=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fio);
	XSSFSheet ws= wb.getSheet("Sheet1");
	String username=ws.getRow(0).getCell(0).getStringCellValue();
	String pwd=ws.getRow(0).getCell(1).getStringCellValue();
	String data[][]=new String[1][2];
	data[0][0]=username;
	data[0][1]=pwd;
	return data;
	
	
}
	
}
