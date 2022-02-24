package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GetExtendReport {
	
	 static ExtentReports extent;
	
	public static ExtentReports extentobject()
	{
		String path =System.getProperty("user.dir")+"//Report//Extentreport.html";
		//ExtentReports report=new  ExtentReports(System.getProperty("user.dir")+"//Report//Extentreport.html");

		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Web Automation Report");
		
		 extent=new ExtentReports();
		 
		extent.attachReporter(reporter);
	
		
		return extent;
		
		
	}

}
