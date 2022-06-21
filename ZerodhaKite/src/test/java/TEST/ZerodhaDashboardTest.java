package TEST;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POJO.FireFoxBrowser;
import POM.ZerodhaDashboardPOM;
import POM.ZerodhaHomePagePom;
import POM.ZerodhaPinPagePOM;
import UTILITY.Parameterization;

public class ZerodhaDashboardTest {
	WebDriver driver;
	@BeforeMethod
public void openBrowser()
{
	//driver=FireFoxBrowser.openFireFoxBrowser();
	driver=Browser.openBrowser();
}
	@Test(priority = 1)
	public void addStocksInWatchList() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaHomePagePom zerodhaHomePagePom=new ZerodhaHomePagePom(driver);
		String userid=Parameterization.parameterise("UserDetails", 0, 1);
		String passWord=Parameterization.parameterise("UserDetails", 1, 1);
		zerodhaHomePagePom.enterUserID(userid);
		zerodhaHomePagePom.enterPassword(passWord);
		zerodhaHomePagePom.clickOnLogIn();
		String pin=Parameterization.parameterise("UserDetails", 2, 1);
		zerodhaHomePagePom.enterPin(pin, driver);
		zerodhaHomePagePom.clickOnContinue();
        ZerodhaDashboardPOM zerodhaDashboardPOM=new ZerodhaDashboardPOM(driver);
//		String stock=Parameterization.parameterise("Stocks", 1, 1);
//		zerodhaDashboardPOM.enterStockNameOnSearchStocks(driver,stock);
		zerodhaDashboardPOM.clickOnTataMotors(driver);
		zerodhaDashboardPOM.clickOnDelettoggle();;

		
//		zerodhaDashboardPOM.cilcOnBuyButton();
//		zerodhaDashboardPOM.clickOnSellButton();

//		String stock1=Parameterization.parameterise("Stocks", 2, 1);
//		zerodhaDashboardPOM.enterStockNameOnSearchStocks(driver,stock1);
//		zerodhaDashboardPOM.clickOnReliance();
//		String stock2=Parameterization.parameterise("Stocks", 3, 1);
//		zerodhaDashboardPOM.enterStockNameOnSearchStocks(driver,stock2);
//		zerodhaDashboardPOM.clickOnAirtel();
//		String stock3=Parameterization.parameterise("Stocks", 4, 1);
//		zerodhaDashboardPOM.enterStockNameOnSearchStocks(driver,stock3);
//     	zerodhaDashboardPOM.clickOnIdea();
//     	String stock4=Parameterization.parameterise("Stocks",5, 1);
//		zerodhaDashboardPOM.enterStockNameOnSearchStocks(driver,stock4);
//     	zerodhaDashboardPOM.clickOnAcc(driver);
	}
//    @Test(priority = 2)
//    public void 
		
		
	
//	@AfterClass
//	public void quiteBrowser() throws InterruptedException
//	{
//		Thread.sleep(10000);
//		driver.quit();
//	}
}
