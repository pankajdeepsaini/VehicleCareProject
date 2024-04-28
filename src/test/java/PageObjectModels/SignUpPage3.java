package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage3 {
	
	
	 WebDriver driver;
	  
	  public  SignUpPage3(WebDriver D) {
		  driver =D;
		  PageFactory.initElements(D, this);
	  }
	  
	  @FindBy(xpath="//*[@id=\"phoneNumberContainer\"]/div[2]/div/div[2]/input"   )WebElement  mobnoforlog ;
	  @FindBy(xpath="//*[@id=\"phoneNumberContainer\"]/button"   )WebElement loginbutton ;
	  @FindBy(xpath=" //*[@id=\"otpCodeContainer\"]/div[2]/div/input "   )WebElement OTPrecieve;
	  @FindBy(xpath="//*[@id=\"otpCodeContainer\"]/button[2]"   )WebElement OTPsubmitbutton ;
	  
	  
	  
	  public void mobilenoforlog  (String Mobileno) {
		  mobnoforlog.sendKeys(Mobileno);
	  }
	  
  public void loginbutton  () {
		  loginbutton.click();
	  }
  
  public void otprecieve  (String OTPno) {
	  OTPrecieve.sendKeys(OTPno);
  }
  
  public void otpsubmitbutton  () {
	  OTPsubmitbutton.click();
  }

}
