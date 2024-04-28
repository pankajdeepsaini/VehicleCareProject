package UtilitiesFiles;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import TestCaseFile.TestCases;

public class ExtentWithListenerss  extends TestCases implements ITestListener {

	
	ExtentSparkReporter ESR;
	ExtentReports ER;
	ExtentTest ET;
	
	public void setupmethod() {
		
		ESR=new ExtentSparkReporter("MechanicalRepairs.html");
		ER= new ExtentReports();
		ER.attachReporter(ESR);
		
		ER.setSystemInfo("Windows", "11");
		ER.setSystemInfo("Operating", "Windows");
		ER.setSystemInfo("Browser","Edge" );
		ER.setSystemInfo("Environment", "Testing");
		ER.setSystemInfo("Application", "Web");
		ER.setSystemInfo("AppBasedOn", "AutoMobiles");
		
		ESR.config().setDocumentTitle("My Document");
		ESR.config().setReportName("Testing Report");
		ESR.config().setTheme(Theme.STANDARD);
		
		
	}
	
	public void onStart(ITestContext Result) {
		setupmethod();
		System.out.println("Test is going to be start");
	}
	
	public void onFinish(ITestContext Result) {
		ER.flush();
		System.out.println("Test is finished");
	}
	public void onTestStart(ITestResult Result) {
		System.out.println("Test is started");
	}
	public void onTestSuccess(ITestResult Result) {
		ET= ER.createTest(Result.getName());
		ET.log(Status.PASS, MarkupHelper.createLabel("TestCaseisPassed", ExtentColor.PINK));
	}
	public void onTestFailure(ITestResult Result) {
		
		 try {
			ScreenShots();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		ET=ER.createTest(Result.getName());
		ET.log(Status.FAIL, MarkupHelper.createLabel("TestCaseFail", ExtentColor.WHITE));
		
		String path="C:\\Users\\panks\\Contacts\\VechicleRepairMechanicalRepairProject\\ScreenShots\\Images.png";

		ET.fail("captureshot"+ET.addScreenCaptureFromPath( path));

		
	}
	
	public void onTestSkipped(ITestResult Result) {
		ET= ER.createTest(Result.getName());
		ET.log(Status.SKIP, MarkupHelper.createLabel("TestCaseSkip", ExtentColor.PURPLE));
	}

	
	
}
