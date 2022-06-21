package TEST;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaHomePagePom;
import POM.ZerodhaSignInPagePOM;
import UTILITY.ChidBrowserHandle;

public class ZerodhaSignInPageTest {
	WebDriver driver;
@BeforeMethod
public void openBrowser()
{
	driver=Browser.openBrowser();
}
@Test
public void signInPage() throws InterruptedException
{
	ZerodhaHomePagePom zerodhaHomePagePom=new ZerodhaHomePagePom(driver);
	zerodhaHomePagePom.clickOnSignUp();

	String title= ChidBrowserHandle.chilBrowser(driver);
	
	if(title.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha"))
	{
		ZerodhaSignInPagePOM zerodhaSignInPagePOM=new ZerodhaSignInPagePOM(driver);
		zerodhaSignInPagePOM.clickOnSignUp();
		
	}
}

}
