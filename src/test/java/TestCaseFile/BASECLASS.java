package TestCaseFile;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import UtilitiesFiles.ReadConfigurations;

public class BASECLASS {
	
	public static WebDriver driver = null;
	public  static Logger log;
	public  static Actions act = null;
	public static  JavascriptExecutor js;
	
	
	
	
	ReadConfigurations read = new ReadConfigurations();
	
	
	String BROWSER = read.getbrowser();
	String URLS = read.geturl();
	String URLS2 = read.geturl2();
	String URLS3 = read.geturl3();
	@BeforeTest
	public void BrowserLaunchMethod() {
		
		
		
		ChromeOptions option1 = new ChromeOptions();
//		option1.addArguments("--incognito");
		option1.addArguments("--disable-notifications");
		
		EdgeOptions option2 = new EdgeOptions();
//		option2.addArguments("--inPrivate");
		option2.addArguments("--disable-notifications");
		
		FirefoxOptions option3 = new FirefoxOptions();
//		option3.addArguments("--Private");
		option3.addArguments("--disable-notifications");
		
		switch(BROWSER.toLowerCase()) {
		
		case"chrome":
			driver = new ChromeDriver(option1);
			driver.manage().window().maximize();
			break;
		
		case"edge":
			driver = new EdgeDriver(option2);
			driver.manage().window().maximize();
			break;
			
		case"firefox":
			driver = new FirefoxDriver(option3);
			driver.manage().window().maximize();
			break;
			
		default:
			driver = null;
			break;
		}
		log = LogManager.getLogger("ApplicationBehaviourRecords");
		act= new Actions(driver);
		js = (JavascriptExecutor)driver;
		
	}
	
	public void ScreenShots() throws Exception {
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\panks\\Contacts\\VechicleRepairMechanicalRepairProject\\ScreenShots\\Images.png" );
		FileUtils.copyFile(source, dest);
		
		
	}
	@AfterTest
	public void CloseMethod() throws Exception {
		ScreenShots();
	}
	

}
