package TestObjects;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import resources.GetExtendReport;
import resources.base;

public class Listeners extends base implements ITestListener {
	
	 ExtentReports extent=GetExtendReport.extentobject();
	 ExtentTest test;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		 test =extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		test.pass("Pass method "+result.getMethod().getMethodName());
	
		//System.out.println("Pass method :"+result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		test.fail(result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
