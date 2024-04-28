package PageObjectModels;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingDetailsPage7 {
	
	 WebDriver driver;
	  
	  public BillingDetailsPage7(WebDriver D) {
		  driver =D;
		  PageFactory.initElements(D, this);
	  }
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div/section[1]/div/div/div[1]/div[2]/div/form/div[1]/div/div[1]/input"   )WebElement carregisterno  ;
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div/section[1]/div/div/div[1]/div[2]/div/form/div[1]/div/div[2]/input"        )WebElement  carmodelyear    ;
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div/section[1]/div/div/div[1]/div[2]/div/form/div[1]/div/div[3]/input"        )WebElement state     ;
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div/section[1]/div/div/div[1]/div[2]/div/form/div[1]/div/div[4]/input"        )WebElement  city    ;
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div/section[1]/div/div/div[1]/div[2]/div/form/div[1]/div/div[5]/div[1]/div/input"        )WebElement  prefereeddatecalenderclick   ;
	 
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div/section[1]/div/div/div[1]/div[2]/div/form/div[1]/div/div[6]/div[2]/label"        )WebElement  preferedmodeofcar    ;
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div/section[1]/div/div/div[1]/div[2]/div/form/div[1]/div/div[7]/div[1]/label"        )WebElement paymentoption     ;
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div/section[1]/div/div/div[1]/div[2]/div/form/div[2]/button"        )WebElement submitnowbutton     ;
	  
	  public void carregisterno      (String carreg ) {
		  carregisterno.sendKeys(carreg); 
	  }
 
	  
  public void  carmodelyear     ( String carmodel) {
	  carmodelyear.sendKeys(carmodel);
	  }
  
  public void  state      (String stated) {
	  state.sendKeys(stated);
  }
  
  public void  city     (String citys) {
	  city.sendKeys(citys);
  }
  
  public void   calenderclick()     {
	  
	  prefereeddatecalenderclick.click();
  }
  
 
  
  public void  preferedmodeofcar      () {
	  preferedmodeofcar.click();
  }
  
  public void    paymentoption     () {
	  paymentoption.click();
  }
  
  public void  submitnowbutton      () {
	  submitnowbutton.click();
  }
	  

}
