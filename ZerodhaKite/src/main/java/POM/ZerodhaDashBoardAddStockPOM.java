package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaDashBoardAddStockPOM {
@FindBy(xpath = "//input[@type=\"text\"]")private WebElement searchStock;
@FindBy(xpath = "//span[@class=\"tradingsymbol\"]")private List<WebElement> anyStock;
@FindBy(xpath = "//button[@data-balloon=\"Buy\"]")private WebElement togglebuy;
@FindBy(xpath = "//button[@data-balloon=\"Sell\"]")private WebElement toggleSell;


public ZerodhaDashBoardAddStockPOM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void searchStocks(String stockname)
{
	searchStock.sendKeys(stockname);
}
public void clearSerachTab()
{
	searchStock.clear();
}
public String clickOnAnyStock(WebDriver driver,String expectedStockName) throws InterruptedException
{
	String text="";
	int count=anyStock.size();
	for(int i=0;i<count;i++)
	{
		WebElement stockName=anyStock.get(i);
		 text= stockName.getText();
		//System.out.println(text);
		if(text.equalsIgnoreCase(expectedStockName))
		{
			Actions act=new Actions(driver);
			act.moveToElement(stockName);
			act.build().perform();
			stockName.click();
			break;

		}
	}
	return text;
	
}
}