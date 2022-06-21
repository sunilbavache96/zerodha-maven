package UTILITY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
public static String parameterise(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("F:\\new\\ZerodhaKite\\src\\test\\resources\\zerodha logins.xlsx");
	String  userdata= WorkbookFactory.create(file).getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	return userdata;
}
}
