package Pratice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class MyListener implements ITestListener   {
	ExtentReports extent;
	ExtentTest test;

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution start on class level");
		extent=ExtentReportManager.getExtentReport();
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Method Execution Started");
		test = extent.createTest(result.getName());
	}

	
//	@Override
//	public void onTestSuccess(ITestResult result) {
//		System.out.println("Test Method Execution Passed");
//		test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
//	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAIL : =============================================================================" + result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		test.fail(result.getThrowable());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
