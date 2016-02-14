package framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;
import framework.utils.Wait;

public class FeedingPage  {
	
	WebDriver driver;

	public FeedingPage(WebDriver driver) {
		this.driver = driver;
	}

	public Feeding101Page click_OurCommitment() throws Exception {

		/*
		 *  This method waits for our commitment image to be visible
		 *  Validates image is diplayed
		 *  Captures screenshot 
		 *  Click our commitment image  
		 */
		
		Wait.elementToBeVisible(ourCommitment, 20, driver);
		
		Assert.assertTrue(ourCommitment.isDisplayed());
		TestCore.captureScreenshot(driver, "OurCommitment");
				
		ourCommitment.click();
		
		return PageFactory.initElements(driver, Feeding101Page.class);
	}

	@CacheLookup 
	@FindBy(xpath = Elements.ourCommitment) 
	WebElement ourCommitment;	
}
