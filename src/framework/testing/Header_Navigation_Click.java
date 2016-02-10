package framework.testing;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FreeTrial;
import framework.pages.Header;

public class Header_Navigation_Click extends TestCore {

	Header header;
	FreeTrial freetrial;

/*	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( USER CLICKS 5 HEADER ELEMENTS NAVIGATION TESTS ) ");
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

	@Test(description = " Header Navigation Test ")
	public void header_Navigation() throws Exception{
		
		try {
			header = new Header(driver);
			header.header_Navigation_Test();
		} catch (Exception e) {
			log.debug(" Header Navigation Exception : " + e);
		}
	}
}
