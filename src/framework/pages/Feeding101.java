package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.Elements;

public class Feeding101 extends TestCore {

	// METHOD FOR VERIFYING IMAGE HAS LOADED ON PAGE
	public void verify_PageImage() throws Exception {

		explicitWait(verifyFeedingImage, 20, driver);

		Assert.assertTrue(verifyFeedingImage.isDisplayed());
	}
	
	@CacheLookup@FindBy(xpath = Elements.verifyFeedingImage)WebElement verifyFeedingImage;

}
