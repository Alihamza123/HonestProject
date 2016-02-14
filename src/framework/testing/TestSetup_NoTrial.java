package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import framework.config.TestCore;
import framework.pages.HomePage;
import framework.pages.LandingPage;

public class TestSetup_NoTrial extends TestCore {

	
	@BeforeSuite	
	public void startUp () throws Exception {
		startBrowser();
		
		LandingPage land = PageFactory.initElements(driver, LandingPage.class);
		land.close_freeTrialAlert();
	}
	
	@AfterSuite
	public void shutDown () {
		closeBrowser();
	}
}
