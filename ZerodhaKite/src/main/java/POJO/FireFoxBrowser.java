package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
public static WebDriver openFireFoxBrowser()
{
	System.setProperty("webdriver.gecko.driver", "F:\\velocity automation\\selenium\\firefox\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://kite.zerodha.com/#loggedout");
	driver.manage().window().maximize();
	return driver;
}
}