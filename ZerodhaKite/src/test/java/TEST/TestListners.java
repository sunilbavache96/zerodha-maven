package TEST;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import POJO.Browser;
import UTILITY.ScreenShot;

public class TestListners extends BaseClassTest implements ITestListener {
public void onTestStart(ITestResult result)
{
	
	System.out.println("before test start"+result.getName());
}
public void onTestFailure(ITestResult result) {
	try {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ScreenShot.screenShot(driver, "Fail Test"+result.getName());
	} 
	catch (IOException e) {
		e.printStackTrace();
	}
	
}
public void onTestSkipped(ITestResult result)
{
	System.out.println("for skip test cases"+result.getName());
}
public void onTestSuccess(ITestResult result)
{
	System.out.println("for success test cases"+result.getName());
	try {
		ScreenShot.screenShot(driver, "PassTest"+result.getName());
	} 
	catch (IOException e) {
		e.printStackTrace();
	}
}
}