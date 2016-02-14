package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FooterPage;
import framework.pages.LandingPage;
import framework.pages.PressPage;

public class Press_Image_Select extends TestCore {


	@BeforeTest
	public void startUp() {

		Logger log = Logger.getLogger("honest");
		log.info(" STARTING PRESS IMAGE TEST ");

		startBrowser();
	}
	
	@Test(description = " User clicks Press, then Clicks 2nd Image")
	public void canUserNavigateToPress() throws Exception {
		
		try {
			
			LandingPage land = PageFactory.initElements(driver, LandingPage.class);
			
			FooterPage footer = land.closeFreeTrialToFooterPage();
			
			PressPage press = footer.click_Press_Footer();
			
			press.user_Selects_2ndImage();
						
		} catch (Exception e) {
			System.out.println(e.getMessage());
			log.debug(e.getMessage());
		}
	}
	
	@AfterTest
	public void shutDown () {
		
		log.info(" FINISHING PRESS IMAGE TEST ");
		closeBrowser();	
	}

}
