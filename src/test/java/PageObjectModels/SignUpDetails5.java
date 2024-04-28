package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpDetails5  {


	 WebDriver driver;
	 Actions act = new Actions(driver);
	  public SignUpDetails5(WebDriver D) {
		  driver =D;
		  PageFactory.initElements(D, this);
		  
	  }
	  

	
	  @FindBy(xpath="//*[@id=\"otpCodeContainer\"]/div[2]/div/div[1]/input"   )WebElement firstname1 ;
	 
	  @FindBy(xpath="//*[@id=\"otpCodeContainer\"]/div[2]/div/div[2]/input"   )WebElement lastname1 ;
	
	  @FindBy(xpath="//*[@id=\"otpCodeContainer\"]/div[2]/div/div[3]/input"   )WebElement emailid1 ;
	  
	  @FindBy(xpath="//*[@id=\"otpCodeContainer\"]/div[2]/div/div[5]/select") WebElement citys;
	 
	  @FindBy(xpath="//*[@id=\"otpCodeContainer\"]/button"   )WebElement  signupbutton ;
	  
	  

	  
	  
	  
	  
	  
	
	  public void firstname (String first) {
		  firstname1.sendKeys(first);
		  
	  }
	 
	 
	  
 public void lastname (String last) {
		  lastname1.sendKeys(last);
	  }
 
 

 
 public void emailid (String email) {
	  emailid1.sendKeys(email);
 }
 
 
 public void city() {
	
	    act.click(citys).build().perform();
	    Select s1 = new Select(citys);  
		s1.selectByValue("16");
 }
 
 
 public void signupbutton  () {
	  signupbutton.click();
 }
	
}
