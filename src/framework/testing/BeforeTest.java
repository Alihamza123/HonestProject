package framework.testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import framework.config.TestCore;
import framework.pages.FreeTrial;

public class BeforeTest extends TestCore {

	FreeTrial freetrial ;
	
	@BeforeSuite	
	public void startUp () throws Exception {
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}
	
	@AfterSuite
	public void shutDown () {
		closeBrowser();
	}
}
