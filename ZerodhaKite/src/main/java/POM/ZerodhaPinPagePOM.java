package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPagePOM {
@FindBy(xpath = "//input[@type=\"password\"]")private WebElement pin;
@FindBy(xpath ="//button[@type=\"submit\"]")private WebElement contiNue;
@FindBy(xpath = "//a[text()=\"Forgot 2FA?\"]")private WebElement forgotPin;
@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUpPinPage;

public ZerodhaPinPagePOM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterPin(String pinNumber)
{
	pin.sendKeys(pinNumber);
}
public void clickOnContinue()
{
	contiNue.click();
}
public void clickOnForgotPin() {
	forgotPin.click();
}
public void clickOnSignUpPinPage() {
	signUpPinPage.click();
}
}
