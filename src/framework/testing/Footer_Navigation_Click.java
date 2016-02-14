package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FooterPage;
import framework.pages.HomePage;
import framework.pages.LandingPage;

public class Footer_Navigation_Click extends TestCore {

	@BeforeTest
	public void startUp() {
		
		Logger log = Logger.getLogger("honest");
		log.info(" STARTING ALL FOOTER NAVIGATION TEST ");
		
		startBrowser();
	}

	@Test(description = "All Footer Navigation ")
	public void footer_Navigation_Click() throws Exception {

		try {
			
			LandingPage land = PageFactory.initElements(driver, LandingPage.class);
			
			HomePage home = land.closeFreeTrial();
			
			home.verifyHomePageTitle();
			
			FooterPage footer = PageFactory.initElements(driver, FooterPage.class);
			
			footer.navigateToFaq();
			
			driver.get(webpage);
			
			footer.navigateToFeedback();
			
			driver.get(webpage);
			
			footer.navigateToTestimonials();
			
			driver.get(webpage);
			
			footer.navigateToWhatsInside();
			
			driver.get(webpage);
			
			footer.navigateToWhoWeAre();
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@AfterTest(enabled = false)
	public void shutDown () {
		
		log.info(" FINISHING ALL FOOTER NAVIGATION TEST ");
		closeBrowser();	
	}

}
