package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.Elements;

public class Gifts extends TestCore {

	public Gifts(WebDriver driver) {
		TestCore.driver = driver;
	}
	
	@CacheLookup@FindBy(xpath = Elements.giftCardImage)WebElement giftCardImage;
	@CacheLookup@FindBy(xpath = Elements.customizeAmount)WebElement customizeAmount;
	@CacheLookup@FindBy(xpath = Elements.buyNowButton)WebElement buyNowButton;
	@CacheLookup@FindBy(xpath = Elements.scrollDown)WebElement scrollDown;
	

	// METHOD FOR USER ( CLICKS GIFTS ON HEADER, WAIT FOR GIFT CARD IMAGE TO LOAD THEN CLICK IT )
	public void click_GiftCardImage() throws Exception {

		// wait for gift card image to be visible
		explicitWait(giftCardImage, 20, driver);
		
		// USER CLICKS GIFT CARD IMAGE
		giftCardImage.click();

	}

	// METHOD FOR USER ( ENTERS INVALID AMOUNT )
	public void user_Enters_InvalidAmount(String invalid_Amount) throws Exception {

		// wait for customize amount input box to be visible
		explicitWait(customizeAmount, 20, driver);

		// USER TYPES AN INVALID CUSTOMIZED AMOUNT
		Assert.assertTrue(customizeAmount.isEnabled());
		
		customizeAmount.sendKeys(invalid_Amount);
		
	}
	
	// METHOD FOR USER ( CLICKS BUY NOW BUTTON BUTTON , CAPTURE THE INVALID AMOUNT ALERT ) 
	public void verify_TextPopup() throws Exception {

		// wait for buy now button to be visible
		explicitWait(buyNowButton, 20, driver);

		// USER CLICKS BUY NOW BUTTON
		buyNowButton.click();

		Thread.sleep(2000L);

		// SYSTEM CAPTURES SCREENSHOT OF INVALID AMOUNT AND POP UP MESSAGE
		TestCore.captureScreenshot(driver, "VerifyTextPopUp");
	
	}
}
