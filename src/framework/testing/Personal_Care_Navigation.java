package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import framework.config.TestCore;
import framework.pages.HeaderPage;
import framework.pages.LandingPage;
import framework.pages.PersonalcarePage;

public class Personal_Care_Navigation extends TestCore {

	@BeforeTest
	public void startUp() {

		Logger log = Logger.getLogger("honest");
		log.info(" STARTING CREATE NEW ACCOUNT FROM LOG IN/REGISTER PAGE TEST ");

		startBrowser();
	}

	public void canUserNavigateToPersonalCare() throws Exception {

		try {
			LandingPage land = PageFactory.initElements(driver, LandingPage.class);

			HeaderPage header = land.closeFreeTrialToHeaderPage();

			PersonalcarePage personal = header.navigateToPersonalCare();

			personal.click_feminineCareImage();

			personal.validatePageTitleUrl();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			log.debug(e.getMessage());
		}

	}

	@AfterTest
	public void shutDown() {

		log.info(" FINISHING CREATE NEW ACCOUNT FROM LOG IN/REGISTER PAGE TEST ");
		closeBrowser();
	}

}
