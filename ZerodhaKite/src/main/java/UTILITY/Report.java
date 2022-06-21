package UTILITY;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
public static ExtentReports extendReport()
{
	ExtentSparkReporter htmlReporter=new ExtentSparkReporter("extentReport.html");
	ExtentReports reports=new ExtentReports();
	reports.attachReporter(htmlReporter);
	reports.setSystemInfo("project name", "zerodha");
	reports.setSystemInfo("test type", "regression");
	reports.setSystemInfo("browser", "chrome");
	return reports;
}
}
