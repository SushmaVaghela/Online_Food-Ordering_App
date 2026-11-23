package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PizzaHutPage;
import utils.DriverFactory;


public class PizzaHutSteps {
	
	WebDriver driver = DriverFactory.driver;
	PizzaHutPage pages;
	
	
	 @Given("User launch Pizzahut application with {string}")
	 public void user_launch_application(String url) {

		 driver = DriverFactory.initDriver();
	        driver.get(url);

	        pages = new PizzaHutPage(driver);       
	    }
	 
	 @When("User wait for auto location black pop up screen")
	    public void wait_for_popup() {

	        System.out.println("Waiting for popup");
	    }

	 @Then("User close the pop up screen")
	    public void close_popup() {

	        System.out.println("Popup closed");
	    }
	 @Then("User see pop up for Collect From Store")
	 	public void see_popup() {
		 pages.collectStore.click();
	 	}
	 @Then("User see textbox to enter the location")
	 public void validate_location() {
		  Assert.assertTrue(pages.locationInput.isDisplayed());
	 	}
	 @Then("User type address as {string}")
	 public void user_type_address(String location) {
		 pages.locationInput.sendKeys(location);
	    }
	
	    }

	 
	 

