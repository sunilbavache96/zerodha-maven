package UTILITY;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsAll {
public static void ExplicityWaits(WebDriver driver,WebElement element,int time)
{
	WebDriverWait exwait=new WebDriverWait(driver, Duration.ofMillis(time));
	exwait.until(ExpectedConditions.visibilityOf(element));
}
public static FluentWait<WebDriver> Fluintwaits(WebDriver driver,WebElement elements)
{
	FluentWait<WebDriver> flwaits=new FluentWait<WebDriver>(driver);
	flwaits.withTimeout(Duration.ofMillis(50000));
	flwaits.pollingEvery(Duration.ofMillis(50));
	flwaits.ignoring(Exception.class);
	return flwaits;	
}
}
