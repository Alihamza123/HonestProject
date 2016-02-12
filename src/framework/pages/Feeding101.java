package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import framework.config.TestCore;
import framework.properties.Elements;

public class Feeding101 extends TestCore {

	@CacheLookup @FindBy(xpath = Elements.verifyFeedingImage) WebElement verifyFeedingImage;

	// METHOD FOR VERIFYING IMAGE HAS LOADED ON PAGE
	public void verify_PageImage() throws Exception {

		explicitWait(verifyFeedingImage, 20, driver);

		if (verifyFeedingImage.isDisplayed()) {
			log.info(" FEEDING IMAGE [ VERIFICATION  PASSED ] ");
		} else {
			log.info(" FEEDING IMAGE [ VERIFICATION FAILED ] ");
		}
	}

}
