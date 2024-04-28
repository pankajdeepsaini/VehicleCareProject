package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutButton10 {
	
	 WebDriver driver;
	  
	  public LogOutButton10(WebDriver D) {
		  driver =D;
		  PageFactory.initElements(D, this);
	  }
	  
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/section/div[2]/div/div/div[1]/div/div[2]/div[6]/button"    )WebElement Logoutbutton;
	  
	  
	  public void logoutbutton() {
		  Logoutbutton.click();
	  }
	  

}
