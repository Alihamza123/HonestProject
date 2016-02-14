package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.HeaderPage;
import framework.pages.LandingPage;

public class Header_Navigation extends TestCore {

	@BeforeTest
	public void startUp() {

		Logger log = Logger.getLogger("honest");
		log.info(" STARTING HEADER NAVIGATION TEST ");

		startBrowser();
	}

	@Test(description = " Header Navigation Test ")
	public void click_5_HeaderElements() throws Exception{
		
		try {

			LandingPage home = PageFactory.initElements(driver, LandingPage.class);
			
			HeaderPage header = home.closeFreeTrialToHeaderPage();
			
			header.navigateToBundlesHeader();
			
			driver.get(webpage);
			
			header.navigateToCleaningHeader();
		
			driver.get(webpage);
			
			header.navigateToDiaperingHeader();
			
			driver.get(webpage);
			
			header.navigateToFeedingHeader();
			
			driver.get(webpage);
			
			header.navigateToGearsHeader();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			log.debug(e.getMessage());
		}
	}
	
	@AfterTest
	public void shutDown () {
		
		log.info(" SHUTTING HEADER NAVIGATION TEST ");
		closeBrowser();	
	}
	
}
