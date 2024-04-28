package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage6 {
	
	 WebDriver driver;
	 Actions act = new Actions(driver);
	  public AddToCartPage6(WebDriver D) {
		  driver =D;
		  PageFactory.initElements(D, this);
	  }
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/button"   )WebElement firstaddtocart ;

	  
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/div/div[40]/div/div[2]/div[3]/button") WebElement Secondaddtocart;
		

	  @FindBy(xpath="//*[@id=\"root\"]/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/div/div[40]/div/div[2]/div[3]/button"   )WebElement afterremoveanotheraddtocart ;

	  
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div[1]/div/div/div[3]/aside/div/div[2]/div[2]/div/button" )WebElement placeorder;
	
	  
	  
	  public void  firstaddtocart  () {
		  firstaddtocart.click();
	  }
	  
	  public  void secondaddto() {
		 act.scrollToElement(Secondaddtocart).click(Secondaddtocart).build().perform();
		 
	  }
	  
      public void  addanotherafterremove  () {
    	  afterremoveanotheraddtocart.click();
    	 
	  }
      
      public void placedorder() {
    	  placeorder.click();
      }
    
	  
	  
	  

}
