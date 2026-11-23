package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hook {
	
	@After
	 public void tearDown() {

        DriverFactory.driver.quit();
    }

}
