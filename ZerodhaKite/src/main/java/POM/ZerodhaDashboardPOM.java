package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import UTILITY.WaitsAll;

public class ZerodhaDashboardPOM {
@FindBy(css = "input[icon=\"search\"]") private WebElement searchStocks;
@FindBy(xpath = "//span[text()=\"TATAMOTORS\"]")private WebElement tataMotorsStock;
@FindBy(xpath = "(//span[text()=\"RELIANCE\"])[1]")private WebElement relianceStock;
@FindBy(xpath = "//span[text()=\"AIRTELPP-E1\"]")private WebElement airtel;
@FindBy(xpath = "(//span[text()=\"IDEA\"])[1]")private WebElement idea;
@FindBy(xpath = "//li[@class='search-result-item']")private List<WebElement> acc;
@FindBy(xpath = "(//button[@class=\"button-blue\"])[1]")private WebElement toggleBuy;
@FindBy(xpath = "//button[@data-balloon=\"chart\"]")private WebElement toggleChart;
@FindBy(xpath = "//button[@data-balloon=\"Market depth widget\"]")private WebElement toggleWidget;
@FindBy(xpath = "(//span[@data-balloon=\"Delete (del)\"])")private WebElement toggleDelet;
@FindBy(css = "label[for=\"radio-119\"]")private WebElement limit;
@FindBy(xpath = "//label[@for=\"radio-119\"]")private WebElement market;
@FindBy(xpath = "//span[@class=\"symbol\"]")private List<WebElement> tata;
@FindBy(xpath = "//button[@class=\"button-blue buy\"]")private WebElement buyAfterAdd;
@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement buyButton;
@FindBy(xpath = "//button[@class=\"button-orange sell\"]")private WebElement sellAfterAdd;
@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement sellButton;

public ZerodhaDashboardPOM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterStockNameOnSearchStocks(WebDriver driver, String stockName)
{
	//WaitsAll.ExplicityWaits(driver, searchStocks, 3000);
	searchStocks.sendKeys(stockName);
	
}
public void clickOnTataMotors(WebDriver driver) throws InterruptedException
{

	int l=tata.size();
	for(int i=0;i<l;i++)
	{
		WebElement accwebelment=tata.get(i);
		String str= accwebelment.getText();
		System.out.println(str);
		Thread.sleep(3000);
		if(str.equalsIgnoreCase("TATAMOTORS JUL FUT"))
		{
			Actions act=new Actions(driver);
			act.moveToElement(accwebelment);
			//act.click();
			act.perform();
			Thread.sleep(3000);
			//buyAfterAdd.click();
			sellAfterAdd.click();
            
		}
		else {
			System.out.println("element not clickable");
		}
		
	}
//	Actions act=MouseKeyboardActions.actionOnMK(driver);
//	act.moveToElement(toggleBuy);
//	act.build().perform();

}
public void clickOnReliance()

{
	relianceStock.click();
}
public void clickOnAirtel() throws InterruptedException
{
	Thread.sleep(4000);
airtel.click();
}
public void clickOnIdea()
{
	idea.click();
}
public void clickOnAcc(WebDriver driver) throws InterruptedException
{
	int l=acc.size();
	for(int i=0;i<l;i++)
	{
		WebElement accwebelment=acc.get(i);
		String str= accwebelment.getText();
		System.out.println(str);
		Thread.sleep(5000);
		if(str.equalsIgnoreCase("ACC"))
		{
			Actions act=new Actions(driver);
			act.moveToElement(accwebelment);
			Thread.sleep(3000);
			act.click(toggleBuy);
			act.perform();

			//accwebelment.click();
            
		}
		else {
			System.out.println("element not clickable");
		}
		
	}
}
public void clickOnBuy(WebDriver driver)
{
	FluentWait<WebDriver> flWaits= WaitsAll.Fluintwaits(driver, toggleBuy);
	flWaits.until(ExpectedConditions.visibilityOf(toggleBuy));
	toggleBuy.click();
}

public void clickOnLimit()
{
	limit.click();
	
	
}
public void clickOnMarket(WebDriver driver)
{
	WaitsAll.ExplicityWaits(driver, market, 3000);
    market.click();
	
}
public void cilcOnBuyButton() throws InterruptedException
{
	Thread.sleep(3000);
	buyButton.click();
}
public void clickOnSellButton() throws InterruptedException
{
	Thread.sleep(3000);
	sellButton.click();
	
}
public void clickOnDelettoggle() throws InterruptedException
{
	Thread.sleep(3000);
	toggleDelet.click();
}


}
