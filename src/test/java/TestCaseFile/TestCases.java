package TestCaseFile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjectModels.AddToCartPage6;
import PageObjectModels.BillingDetailsPage7;
import PageObjectModels.CarServices1;
import PageObjectModels.HomePage8;
import PageObjectModels.LogOutButton10;
import PageObjectModels.MechanicalRepairs2;
import PageObjectModels.ProfileHomePage9;
import PageObjectModels.ResendOTPSignUpPage4;
import PageObjectModels.SignUpDetails5;
import PageObjectModels.SignUpPage3;
@Listeners(UtilitiesFiles.ExtentWithListenerss.class)
public class TestCases  extends BASECLASS{
	
	
	
	@Test(priority=1,enabled=true)
	public void carservice() throws Exception {
		
		driver.get(URLS);
		
		
		CarServices1 carserv = new CarServices1(driver);
		
		Thread.sleep(5000);
		carserv.carservice();
		
		Thread.sleep(6000);
		carserv.selectbrand();
		
		Thread.sleep(6000);
		carserv.carbrand();
		
		Thread.sleep(6000);
		carserv.carmodel();
		
		Thread.sleep(6000);
		carserv.carvariant();
		
		Thread.sleep(4000);
		carserv.mobileno("8433426482");
		
		Thread.sleep(3000);
		carserv.getquote();
		
		
	}
	
	@Test(priority=2,enabled=true)
	public void mechanicalpage() throws Exception {
	
	
		MechanicalRepairs2 mech = new MechanicalRepairs2(driver);

		Thread.sleep(6000);
		mech.mechanicalrepair();
		
		Thread.sleep(5000);
		mech.changebrand();
		
		Thread.sleep(5000);
		mech.changecarbrand();
		
		Thread.sleep(4000);
		mech.changecarmodel();
		
		Thread.sleep(3000);
		mech.changecarvariant();
		
		Thread.sleep(3000);
		mech.login();
		
		
	}
	
	@Test(priority=3,enabled=true)
	public void signuptoenter1() throws Exception {
		
		
		SignUpPage3 sign = new SignUpPage3(driver);
		
		Thread.sleep(5000);
		sign.mobilenoforlog("8433426682");
		
		Thread.sleep(3000);
		sign.loginbutton();
		
		Thread.sleep(22000);
		sign.otprecieve("165750");
		
		
		Thread.sleep(2000);
		sign.otpsubmitbutton();
		
		
	}
	
	
	@Test(enabled=false)
  public void resendotpsignup() throws Exception {
	  
		ResendOTPSignUpPage4 resend = new ResendOTPSignUpPage4(driver);

		Thread.sleep(3000);
		resend.mobilenoforlog("8433426682");
		
		Thread.sleep(5000);
		resend.loginbutton();
		
		Thread.sleep(70000);                 
		resend.ResendOTP();
		
		Thread.sleep(20000);
		resend.otprecieve("");
		
		Thread.sleep(10000);
		resend.otpsubmitbutton();
  }
	
	
	
	
	@Test(priority=4,enabled=true)
	public void SignUpDetails() throws Exception {
		
		SignUpDetails5 signdetail = new SignUpDetails5(driver);
	
		
		 Thread.sleep(5000);
		 signdetail.firstname("Pranjal");
		
		
		 Thread.sleep(5000);
		 signdetail.lastname("Singh");
		
		 
		 Thread.sleep(5000);
	  	signdetail.emailid("prnjlsingh81@gmail.com");
		
		
		 Thread.sleep(5000);
		 signdetail.city();
	   
	    
	    Thread.sleep(5000);
	    signdetail.signupbutton();
	   
	   
  
		
	}
	
	@Test(priority=5,enabled=true)
	public void addtocartoption() throws Exception {
		
		AddToCartPage6 addto = new AddToCartPage6(driver);
		
		Thread.sleep(10000);
		addto.firstaddtocart();
		
		Thread.sleep(8000);
	    addto.secondaddto();
	
		
		Thread.sleep(8000);
		addto.addanotherafterremove();
		
		Thread.sleep(5000);
		addto.placedorder();
		
		
		
	}
	
	@Test(priority=6,enabled=true)
	public void billdetail() throws Exception {
		
		
		
		BillingDetailsPage7 bill = new BillingDetailsPage7(driver);
		
		Thread.sleep(8000);
		bill.carregisterno("HR15Q6987");
		
		
		Thread.sleep(3000);
		bill.carmodelyear("2019");
		
		Thread.sleep(2000);
		bill.state("UttarPradesh");
		
		Thread.sleep(2000);
		bill.city("Lucknow");
		
		Thread.sleep(6000);
		bill.calenderclick();
		

		String expmonyear = "April 2024";
		String expdate ="25";
		
		Thread.sleep(5000);
		  while(true) {
			  String actmonyear = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/section[1]/div/div/div[1]/div[2]/div/form/div[1]/div/div[5]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
			  if(actmonyear.equals(expmonyear)) {
					break;
				}
				else {
					System.out.println("monthyear Not Found");
				}
			}
		  List <WebElement> dateselect  = driver.findElements(By.xpath("//*[@id=\"root\"]/div[3]/div/section[1]/div/div/div[1]/div[2]/div/form/div[1]/div/div[5]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]"));	  
		  for(WebElement dateselect2:dateselect) {
				String actdate = dateselect2.getText();
				if(actdate.equals(expdate)) {
					dateselect2.click();
					break;
				}
				else {
					System.out.println("dateselect not found");
				}
			} 
		
	
		Thread.sleep(5000);
		bill.preferedmodeofcar();
		
		Thread.sleep(4000);
		bill.paymentoption();
		
		Thread.sleep(4000);
		bill.submitnowbutton();
		
		
		
		
	}
	
	
	@Test(priority=7,enabled=true)
	public void homebutton() throws Exception  {
		
		
		HomePage8 hobut = new HomePage8(driver);
		
		Thread.sleep(8000);
		hobut.HomeButtonclick();
		
	}
	
	
	
	
	@Test(priority=8,enabled=true)
	public void profilesection() throws Exception {
		
		ProfileHomePage9 profile = new ProfileHomePage9(driver);
	
		Thread.sleep(8000);
		profile.profilebutton();
	}
	
	
	
	@Test(priority=9,enabled=true)
	public void LogsOut() throws Exception {
		
		
		LogOutButton10 logout = new LogOutButton10(driver);
		
		Thread.sleep(10000);
		logout.logoutbutton();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		Thread.sleep(3000);
		logout.logoutbutton();
		
		Thread.sleep(1000);
		alert.accept();
		
		Thread.sleep(5000);
		driver.close();
	}
	
	

	
	
	

}
