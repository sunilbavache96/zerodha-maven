package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import UTILITY.WaitsAll;

public class ZerodhaHomePagePom {
@FindBy (xpath = "//input[@type=\"text\"]") private WebElement userID;
@FindBy(xpath = "//input[@type=\"password\"]") private WebElement passWord;
@FindBy(xpath = "//button[@type=\"submit\"]") private WebElement logIN;
@FindBy(xpath = "//a[text()=\"Forgot user ID or password?\"]")private WebElement forgot;
@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;
@FindBy(css = "input[label=\"PIN\"]")private WebElement pin;
@FindBy(xpath ="//button[@type=\"submit\"]")private WebElement contiNue;


public ZerodhaHomePagePom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterUserID(String userid)
{
	userID.sendKeys(userid);
}
public void enterPassword(String pass)
{
	passWord.sendKeys(pass);
}
public void clickOnLogIn()
{
	logIN.click();	
}
public void clickOnForgot()
{
	forgot.click();
}
public void clickOnSignUp()
{
	signUp.click();
}
public void enterPin(String pinNumber,WebDriver driver)
{
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(4000));
//	wait.until(ExpectedConditions.visibilityOf(pin));
	//WaitsAll.ExplicityWaits(driver, pin, 5000);
	FluentWait<WebDriver> flwaits= WaitsAll.Fluintwaits(driver, pin);
	flwaits.until(ExpectedConditions.visibilityOf(pin));
	pin.sendKeys(pinNumber);
}
public void clickOnContinue()
{
	contiNue.click();
}
}