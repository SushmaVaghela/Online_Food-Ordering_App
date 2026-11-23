package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PizzaHutPage {
	
	  WebDriver driver;
	 
	 public PizzaHutPage(WebDriver driver) {
		 
		this.driver = driver;
	     PageFactory.initElements(driver, this);
		 }
	 @FindBy(xpath = "//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]")
	    public WebElement collectStore;
	 
	 @FindBy(xpath = "//*[@id=\"app\"]/div/div[4]/div/div/div/div[2]/form/div/div[1]/input")
	    public WebElement locationInput;
	 
	}
