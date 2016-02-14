package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.GiftsCardPage;
import framework.pages.GiftsPage;
import framework.pages.HomePage;
import framework.pages.LandingPage;

public class Gifts_Navigation extends TestCore {

	@BeforeTest
	public void startUp() {

		Logger log = Logger.getLogger("honest");
		log.info(" STARTING GIFTS NAVIGATION TEST ");

		startBrowser();
	}
	
	@Test(description = "GIFTS NAVIGATION TEST ")
	public void canUserGetGiftCard() throws Exception {

		try {

			LandingPage land = PageFactory.initElements(driver, LandingPage.class);
			
			HomePage home = land.closeFreeTrial();
			
			GiftsPage gifts = home.navigateToGifts();
			
			GiftsCardPage card = gifts.clickGiftCard();
			
			card.user_Enters_InvalidAmount();
			
			card.verify_TextPopup();			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@AfterTest
	public void shutDown () {
		
		log.info(" SHUTTING DOWN GIFTS NAVIGATION TEST ");
		closeBrowser();	
	}

}
