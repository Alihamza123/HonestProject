package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import framework.config.TestCore;
import framework.utils.Wait;

public class GiftsCardPage {
	
	WebDriver driver;
	
	public GiftsCardPage(WebDriver driver) {
		this.driver=driver;		
	}
	
	
	public void user_Enters_InvalidAmount(String invalid_Amount) throws Exception {

		/*
		 *  This method waits for Customize amount field to be visible
		 *  Then verifies if its enabled 
		 *  Then enters an invalid amount of 789
		 */
		
		Wait.elementToBeVisible(customizeAmount, 20, driver);

		Assert.assertTrue(customizeAmount.isEnabled());

		customizeAmount.sendKeys("789");

	}

	public void verify_TextPopup() throws Exception {

		/* 
		 *  This method waits for Buy Now Button to be visible
		 *  Then Clicks the buy now button 
		 *  Since the previously entered value is over the $10-$500 limit
		 *  System should show a pop up error message
		 *  Capture that message with a screenshot method created in TestCore class
		 */
		
		Wait.elementToBeVisible(buyNowButton, 20, driver);

		buyNowButton.click();

		Thread.sleep(2000L);

		TestCore.captureScreenshot(driver, "VerifyTextPopUp");

	}
	
	// Elements that are used in the Gift Card Page
	@CacheLookup
	@FindBy(xpath = "//input[@id='customize_amount']")
	WebElement customizeAmount;
	@CacheLookup
	@FindBy(xpath = "//button[@class='btn col-lg-12 btn-default btn-block buy-now-btn'][@data-ng-disabled='submitDisabled()']")
	WebElement buyNowButton;

}
