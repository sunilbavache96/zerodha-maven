package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignInPagePOM {
@FindBy(xpath = "(//a[text()=\"Signup\"])[1]") private WebElement signUp;
@FindBy(xpath = "(//a[text()=\"About\"])[1]")private WebElement about;
@FindBy(xpath = "(//a[text()=\"Products\"])[1]")private WebElement products;
@FindBy(xpath = "(//a[text()=\"Pricing\"])[1]")private WebElement pricing;
@FindBy(xpath = "(//a[text()=\"Support\"])[1]")private WebElement support;
@FindBy(xpath = "(//div[@onclick=\"toggleMenu()\"])[1]")private WebElement toggle_menu;
@FindBy(xpath = "//input[@type=\"text\"]")private WebElement mobileNumber;
@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement continNUe;
@FindBy(xpath = "//a[text()=\"Want to open an NRI account?\"]")private WebElement nriAccount;


public ZerodhaSignInPagePOM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickOnSignUp()
{
	signUp.click();
}
public void clickOnAbout()
{
	about.click();
}
public void clickOnProducts()
{
	products.click();
}
public void clickOnPricing()
{
	pricing.click();
}
public void clickOnSuppor()
{
	support.click();
}
public void clickOnToggaleMenu()
{
	toggle_menu.click();
}
public void entermobilenumber(String number)
{
	mobileNumber.sendKeys(number);
}
public void clickOnContiNue()
{
	continNUe.click();
}
public void clickOnNRIaccount()
{
	nriAccount.click();
}


}
