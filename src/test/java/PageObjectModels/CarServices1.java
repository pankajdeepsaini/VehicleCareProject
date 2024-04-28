package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarServices1 {
  WebDriver driver;
  
  public CarServices1(WebDriver D) {
	  driver =D;
	  PageFactory.initElements(D, this);
  }
  
  @FindBy(xpath="//a[contains(text(),'Car Service')]"  )WebElement carservice;
  @FindBy(xpath= "//button[contains(text(),'Select Brand')] "  )WebElement  selectbrand;
  @FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/div/div[1]/div[1]"  )WebElement  carbrand ;
  @FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/div/div[1]"  )WebElement  carmodel ;
  @FindBy(xpath= " /html/body/div[4]/div/div/div[2]/div/div[2]/div/div[2]"  )WebElement  carvariant;
  @FindBy(xpath="//*[@id=\"landingForm\"]/form/div[5]/div/div[1]/input"  )WebElement  mobileno ;
  @FindBy(xpath="//*[@id=\"landingForm\"]/form/div[5]/div/div[2]/button"  )WebElement  getquote ;
  

  public void carservice() {
	  carservice.click();
  }
  
  public void selectbrand   () {
	  selectbrand.click();
  }
  
public void carbrand   () {
	  carbrand.click();
  }

public void carmodel   () {
	  carmodel.click();
}

public void  carvariant  () {
	  carvariant.click();
}

public void mobileno   (String mob) {
	  mobileno.sendKeys(mob);
}

public void getquote   () {
	  getquote.click();
}
  
  
  
  
  
  
  
}
