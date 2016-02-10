package framework.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FreeTrial;
import framework.pages.Header;

public class Navigation_Hover extends TestCore {

	FreeTrial freetrial;
	Header header;
/*
	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( USER HOVERS OVER 5 SUB MENU ELEMENTS TESTS ) ");
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}*/
	
	@BeforeClass
	public void navigate_To_Homepage() {
		driver.navigate().to(webpage);
	}

	@Test(description = "HOVER NAVIGATION TEST")
	public void hover_Navigation() throws Exception {
		
		try {
			header = new Header(driver);
			header.hover_Navigation_Test();
		} catch (Exception e) {
			log.debug(" Hover Navigation Exception : " + e);
		}		
	}

}
