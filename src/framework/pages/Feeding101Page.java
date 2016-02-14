package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import framework.utils.Wait;

public class Feeding101Page {

	WebDriver driver;
	
	public Feeding101Page(WebDriver driver){
		this.driver=driver;
	}

	public void verifyFeedingImage() throws Exception {

		/*
		 * This method waits for Feeding image to be visible 
		 * Then verifies and validates if its displayed
		 */

		Wait.elementToBeVisible(verifyFeedingImage, 20, driver);

		Assert.assertTrue(verifyFeedingImage.isDisplayed());
	}

	@CacheLookup
	@FindBy(xpath = ".//*[@id='standard']/div/div/div[2]/img")
	WebElement verifyFeedingImage;

}
