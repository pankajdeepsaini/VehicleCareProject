package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResendOTPSignUpPage4 {

	//enabled= false
	
	 WebDriver driver;
	  
	  public ResendOTPSignUpPage4(WebDriver D) {
		  driver =D;
		  PageFactory.initElements(D, this);
	  }
	  
	  @FindBy(xpath="//*[@id=\"phoneNumberContainer\"]/div[2]/div/div[2]/input"   )WebElement  reOTPmobnoforlog ;
	  @FindBy(xpath="//*[@id=\"phoneNumberContainer\"]/button"   )WebElement reOTPloginButton ;
	  @FindBy(xpath="	//*[@id=\"otpCodeContainer\"]/button[1]"   )WebElement resenOTP;
	  @FindBy(xpath=" //*[@id=\"otpCodeContainer\"]/div[2]/div/input "   )WebElement reOTPrecieve;
	  @FindBy(xpath="//*[@id=\"otpCodeContainer\"]/button[2]"   )WebElement reOTPsubmitbutton ;
	  
	  public void mobilenoforlog  (String reMobileno) {
		  reOTPmobnoforlog.sendKeys(reMobileno);
	  }
	  
  public void loginbutton  () {
	  reOTPloginButton .click();
	  }
  
  public void ResendOTP() {
	  resenOTP.click();
  }
  
  public void otprecieve  (String reOTPno) {
	  reOTPrecieve.sendKeys(reOTPno);
  }
  
  public void otpsubmitbutton  () {
	  reOTPsubmitbutton.click();
  }
	  
}
