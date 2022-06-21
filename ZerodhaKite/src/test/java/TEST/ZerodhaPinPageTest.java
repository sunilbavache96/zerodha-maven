package TEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaHomePagePom;
import POM.ZerodhaPinPagePOM;
import UTILITY.Parameterization;

public class ZerodhaPinPageTest {
	WebDriver driver;
	@BeforeMethod
public void openLink()
{
		driver=Browser.openBrowser();
}
	
	@Test
	public void conitUneWithPin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaHomePagePom zerodhaHomePagePom=new ZerodhaHomePagePom(driver);
		String userid=Parameterization.parameterise("UserDetails", 0, 1);
		String passWord=Parameterization.parameterise("UserDetails", 1, 1);
		Thread.sleep(2000);
		zerodhaHomePagePom.enterUserID(userid);
		zerodhaHomePagePom.enterPassword(passWord);
		zerodhaHomePagePom.clickOnLogIn();
		Thread.sleep(4000);
		ZerodhaPinPagePOM zerodhaPinPagePOM=new ZerodhaPinPagePOM(driver);
		String pin=Parameterization.parameterise("UserDetails", 2, 1);
		zerodhaPinPagePOM.enterPin(pin);
		zerodhaPinPagePOM.clickOnContinue();
	}
}
