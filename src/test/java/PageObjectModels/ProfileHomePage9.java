package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileHomePage9 {
	
	 WebDriver driver;
	  
	  public ProfileHomePage9(WebDriver D) {
		  driver =D;
		  PageFactory.initElements(D, this);
	  }
	  
	  @FindBy(xpath="//*[@id=\"basic-navbar-nav\"]/div/a[5]"   )WebElement profileButton;
	  
	  
	  public void profilebutton() {
		  profileButton.click();
		  
	  }
	  

}
