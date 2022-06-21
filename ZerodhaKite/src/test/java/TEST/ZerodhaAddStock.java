package TEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser;
import POJO.FireFoxBrowser;
import POM.ZerodhaDashBoardAddStockPOM;
import POM.ZerodhaHomePagePom;
import UTILITY.Parameterization;
import UTILITY.Report;
import UTILITY.ScreenShot;
@Listeners(TestListners.class)

public class ZerodhaAddStock extends BaseClassTest {
	ExtentReports reports;
	ExtentTest test;
@BeforeTest
	public void extendreport()
	{
	reports=Report.extendReport();
	}
@BeforeMethod
public void openBrowser()
{
//driver=FireFoxBrowser.openFireFoxBrowser();
driver=Browser.openBrowser();
}
//@DataProvider(name ="nameOfstock")
//public Object[][] data(){
//	return new Object[][] {{"reliance"},{"airtel"},{"tatamotors"},{"acccement"}};
//}

//@Test(dataProvider = "nameOfstock")
@Test
public void addAnyStockInWatchList() throws EncryptedDocumentException, IOException, InterruptedException
{
	test=reports.createTest("addAnyStockInWatchList");
	ZerodhaHomePagePom zerodhaHomePagePom=new ZerodhaHomePagePom(driver);
	String userid=Parameterization.parameterise("UserDetails", 0, 1);
	String passWord=Parameterization.parameterise("UserDetails", 1, 1);
	zerodhaHomePagePom.enterUserID(userid);
	zerodhaHomePagePom.enterPassword(passWord);
	zerodhaHomePagePom.clickOnLogIn();
	String pin=Parameterization.parameterise("UserDetails", 2, 1);
	zerodhaHomePagePom.enterPin(pin, driver);
	zerodhaHomePagePom.clickOnContinue();
	ZerodhaDashBoardAddStockPOM zerodhaDashBoardAddStockPOM=new ZerodhaDashBoardAddStockPOM(driver);
	String stockname=Parameterization.parameterise("Stocks", 1, 1);
    zerodhaDashBoardAddStockPOM.searchStocks(stockname);
    String text=zerodhaDashBoardAddStockPOM.clickOnAnyStock(driver,"TATAMOTORS AUG FUT");
    SoftAssert assertion=new SoftAssert();
    assertion.assertEquals(text, "TATAMOTORS AUG FUT");
  // Assert.assertEquals(text,"TATAMOTORS AUG FUT");
    zerodhaDashBoardAddStockPOM.clearSerachTab();
    String stockname1=Parameterization.parameterise("Stocks", 2, 1);
    zerodhaDashBoardAddStockPOM.searchStocks(stockname1);
    String text1=zerodhaDashBoardAddStockPOM.clickOnAnyStock(driver,"RELIANCE JUN 1860 CE");
   // Thread.sleep(2000);
    assertion.assertAll();

}
@AfterMethod
public void closeBrowser(ITestResult result) {
	//ScreenShot.screenShot(driver, "addAnyStockInWatchList");
	
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL, result.getName());
	}
		else if(result.getStatus()==ITestResult.SUCCESS){
			test.log(Status.PASS, result.getName());
		}
		else {
			test.log(Status.SKIP, result.getName());
	}
	
}
@AfterTest
public void flush()
{
	reports.flush();
}

}
