package TestCaseFile;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjectModels.AddToCartPage6;
import PageObjectModels.BillingDetailsPage7;
import PageObjectModels.CarServices1;
import PageObjectModels.HomePage8;
import PageObjectModels.LogOutButton10;
import PageObjectModels.MechanicalRepairs2;
import PageObjectModels.ProfileHomePage9;
import PageObjectModels.SignUpDetails5;
import PageObjectModels.SignUpPage3;
import UtilitiesFiles.DataDrivenTesting;

@Listeners(UtilitiesFiles.ExtentWithListenerss.class)
public class TestCaseDataProviderTest extends BASECLASS {

 @Parameters( {"mob"})
 @Test(priority=1)
public void carservice(String mob ) throws Exception{
		
	       driver.get(URLS);
	 CarServices1 cr= new CarServices1(driver);
		Thread.sleep(2000);
		cr.carservice();
		
		Thread.sleep(4000);
		cr.selectbrand();
		
		Thread.sleep(5000);
		cr.carbrand();
		
		Thread.sleep(5000);
		cr.carmodel();
		
		Thread.sleep(4000);
		cr.carvariant();
		
		Thread.sleep(4000);
		cr.mobileno(mob);
		
		Thread.sleep(2000);
		cr.getquote();
		
		
		
 }
 
 

 @Test(priority=2)
 public void MechnicalRepair() throws Exception {
	 MechanicalRepairs2 mr = new  MechanicalRepairs2(driver);
	 
	 Thread.sleep(4000);
	 mr.mechanicalrepair();
	 
	 mr.changebrand();
	 
	 Thread.sleep(4000);
	 mr.changecarbrand();
	 
	 Thread.sleep(4000);
	 mr.changecarmodel();
	 
	 Thread.sleep(4000);
	 mr.changecarvariant();
	 
	 Thread.sleep(2000);
	 mr.login();
	 	 
 }
 
 
 
 

 @Parameters({"Mobileno", "OTPno"})
 @Test(priority=3)
 public void data(String Mobileno, String OTPno) throws Exception {
	 SignUpPage3 sup = new  SignUpPage3(driver);
	 Thread.sleep(2000);
	sup.mobilenoforlog(Mobileno);
	
	sup.loginbutton();

	sup.otprecieve(OTPno);
	
	sup.otpsubmitbutton();
	
	 	 
 }
 
 
 
 

 
 

 @Test(dataProvider = "ExcelData1",priority=4)
 public void data(String first, String last, String email) throws Exception {
	 SignUpDetails5 signup = new SignUpDetails5(driver);
	  Thread.sleep(2000);
	 signup.firstname(first);
	 
	  Thread.sleep(2000);
	 signup.lastname(last);
	 
	  Thread.sleep(2000);
	 signup.emailid(email);
	 
	  Thread.sleep(2000);
     signup.city();
     
     Thread.sleep(2000);
     signup.signupbutton();
     
 }
 @DataProvider(name = "ExcelData1")
 public Object[][] searchdata() throws Exception{
	 
	 String filename = " C:\\Users\\panks\\Downloads\\VehicleCares.xlsx";
	 int ro = DataDrivenTesting.getrow(filename,"Sheet1" );
	 int col = DataDrivenTesting.getcol(filename, "Sheet1");
	 
	 Object [][] filedata = new Object[ro-1][col];
	 
	 for(int i=1;i<ro;i++) {
		 for(int j=0; j<col;j++) {
			 
			 filedata[i-1][j] = DataDrivenTesting.getcellvalue(filename, "Sheet1", i, j);
		 }
	 }
	 return filedata;
			 
 }
 
 
 
 
 
 @Test(priority=5)
 public void addtocart() throws Exception {
	 AddToCartPage6 ac = new AddToCartPage6(driver);
	 
		Thread.sleep(5000);
	 ac.firstaddtocart();
	 
		Thread.sleep(8000);
	 ac.secondaddto();
	 
		Thread.sleep(8000);
	 ac.addanotherafterremove();
	 
		Thread.sleep(5000);
	 ac.placedorder();
 }
 
 
 
 
 
 @Parameters({"carmodel"})
 @Test(dataProvider= "ExcelData2",priority=6)
 public void billings(String carreg, String carmodel, String stated, String citys  ) throws Exception {
	 BillingDetailsPage7 bd = new BillingDetailsPage7(driver);
	 
	 Thread.sleep(5000);
	 bd.carregisterno(carreg);
	 
	 bd.carmodelyear(carmodel);
	 
	 bd.state(stated);
	 
	 bd.city(citys);
	 
	 Thread.sleep(5000);
	 bd.calenderclick();
	 
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
		  
		 
		  bd.preferedmodeofcar();
		  
		  
		  bd.paymentoption();
		  
		  Thread.sleep(5000);
		  bd.submitnowbutton();
	 
	 
 }
 
 @DataProvider(name = "ExcelData2")
 public Object[][] searchdata1() throws Exception{
	 
	 String filename = " C:\\Users\\panks\\Downloads\\VehicleCares.xlsx";
	 int ro = DataDrivenTesting.getrow(filename, "Sheet2");
	 int col = DataDrivenTesting.getcol(filename, "Sheet2");
	 
	 Object [][] filedata = new Object [ro-1] [col];
	 
	 for(int i =1; i<ro;i++) {
		 for(int j =0; j<col; j++) {
			 
			 filedata[i-1][j] = DataDrivenTesting.getcellvalue(filename, "Sheet2", i, j);
			 
		 }
	 }
	 return filedata;
	 
 }
 
 
 
 
 
 
 @Test(priority=7)
 public void homepage() {
	 
	 HomePage8 hp = new HomePage8(driver);
	 hp.HomeButtonclick();
 }
 
 
 
 
 
 
 @Test(priority=8)
 public void profile() {
	 ProfileHomePage9 ph = new ProfileHomePage9(driver);
	 
	 ph.profilebutton();
 }
 
 
 
 
 
 @Test(priority=9)
 public void Logoutbutton() throws Exception {
	 
	 LogOutButton10 lb = new LogOutButton10(driver);
	 lb.logoutbutton();
	 
	 Alert alert = driver.switchTo().alert();
	 
	 alert.dismiss();
	 
	 lb.logoutbutton();
	 
	 alert.accept();
	 
	 Thread.sleep(3000);
	 
	 driver.close();
 }

  }

