package UTILITY;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;


public class ChidBrowserHandle {
	public static String chilBrowser(WebDriver driver) throws InterruptedException
	{
		 String title="";
		ArrayList<String> addreses=new ArrayList<String>(driver.getWindowHandles());
		int count=addreses.size();
		for(int i=0;i<count;i++)
		{
			String addres=addreses.get(i);
			driver.switchTo().window(addres);
			title=driver.getTitle();
			Thread.sleep(3000);
	}
		return title;	
	}}
