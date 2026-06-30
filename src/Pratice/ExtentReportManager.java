package Pratice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

	public static ExtentReports  getExtentReport() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./REPORT/report1.html");///path set and config html
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Regression Suite");
		spark.config().setTheme(Theme.DARK);
		
		ExtentReports extent = new ExtentReports();//data collection
		extent.attachReporter(spark);
		extent.setSystemInfo("Tester", "Akhilesh");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("OS", "Windows 11");
		return extent;
	}
}
