package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MechanicalRepairs2 {

	
	 WebDriver driver;
	  
	  public  MechanicalRepairs2(WebDriver D) {
		  driver =D;
		  PageFactory.initElements(D, this);
	  }
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div/div[3]"    )WebElement mechanical ;
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div[1]/div/div/div[3]/aside/div/div[2]/div[1]/div[2]/div/button"    )WebElement changebrand  ;
	  @FindBy(xpath= "/html/body/div[4]/div/div/div[2]/div/div[2]/div/div[1]/div[1] "    )WebElement changecarbrand  ;
	  @FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/div/div[2]"    )WebElement changecarmodel ;
	  @FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/div/div[1]"    )WebElement changecarvariant  ;
	  @FindBy(xpath="//*[@id=\"basic-navbar-nav\"]/div/a[5]"    )WebElement login ;
	  
	  
	  
 public void mechanicalrepair   () {
		 mechanical.click();
	  }
	  
 public void changebrand   () {
		changebrand.click();  
	  }
 public void changecarbrand   () {
	  changecarbrand.click();
 }
 public void changecarmodel   () {
	  changecarmodel.click();
	  
 }
 public void changecarvariant   () {
	  changecarvariant.click();
 }
 public void login   () {
	  login.click();
 }
}
