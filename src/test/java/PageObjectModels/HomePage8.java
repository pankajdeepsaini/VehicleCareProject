package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage8 {
	 WebDriver driver;
	  
	  public HomePage8(WebDriver D) {
		  driver =D;
		  PageFactory.initElements(D, this);
	  }
	  
	  
	  
	  @FindBy(xpath="/html/body/div[5]/div/div/div[2]/div/div/div/div[2]/button"    )WebElement homebutton;
	  
	  
	  
	  
	  public void HomeButtonclick() {
		  homebutton.click();
	  }

}
