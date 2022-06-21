package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser  {

	public static WebDriver openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\velocity automation\\selenium\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		return driver;
		
	}
}
