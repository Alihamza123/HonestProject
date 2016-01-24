package framework.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FreeTrial;
import framework.pages.Press;

public class Press_Image_Select extends TestCore {

	FreeTrial freetrial;
	Press press;
	
	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( PRESS IMAGE SELECT TESTS ) ");
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}
	
	@Test(description = " User clicks Press, then Clicks 2nd Image")
	public void pressImageSelect() throws Exception {
		
		try {
			press = new Press(driver);
			press.pressNavigation_Test();
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
	}
}
