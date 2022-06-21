package TEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaHomePagePom;
import UTILITY.Parameterization;
import UTILITY.ScreenShot;

public class ZerodhaLoginPageTest extends BaseClassTest {
@BeforeMethod
public void openLink()
{
	driver=Browser.openBrowser();
}
@AfterMethod
public void screenShot() throws IOException
{
	ScreenShot.screenShot(driver,"screenphoto");
}
@Test
public void loginWithValidCredentials() throws EncryptedDocumentException, IOException, InterruptedException
{
	ZerodhaHomePagePom zerodhaHomePagePom=new ZerodhaHomePagePom(driver);
	String userid=Parameterization.parameterise("UserDetails", 0, 1);
	String passWord=Parameterization.parameterise("UserDetails", 1, 1);
	Thread.sleep(2000);
	zerodhaHomePagePom.enterUserID(userid);
	zerodhaHomePagePom.enterPassword(passWord);
	zerodhaHomePagePom.clickOnLogIn();
}

	
}
