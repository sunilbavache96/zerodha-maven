package UTILITY;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void screenShot(WebDriver driver,String name) throws IOException
	{
	String time=new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date());
	File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File desti=new File("F:\\new\\ZerodhaKite\\src\\test\\resources\\Screenshot\\Zerodha"+name+time+"jpeg");
	FileHandler.copy(source, desti);
		
	}
	public static String time()
	{
		String timestamp=new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date());
//		Date time=Calendar.getInstance().getTime();
//		String timestamp=time.toString().replace(":", "").replace(" ", "");
		return timestamp;

	}
}
