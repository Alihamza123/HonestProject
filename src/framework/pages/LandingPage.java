package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.TestData;
import framework.utils.Wait;

public class LandingPage extends TestCore {
	
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		TestCore.driver = driver;
	}

	public HomePage closeFreeTrial() throws Exception {

		/*
		 * This method waits for close button to be visible
		 * Verify the button is enabled
		 * Then closes the free trial alert by clicking the close button
		 * System will navigate to honest.com homepage after closing the trial
		 */

		Wait.elementToBeClickable(closeTrial, 20, driver);

		Assert.assertTrue(closeTrial.isEnabled());

		closeTrial.click();

		return PageFactory.initElements(driver, HomePage.class);
	}

	public HomePage joinFreeTrial() throws Exception {

		/* 
		 * This method waits for trial first name input field to be visible
		 * Then sends new user data to register for free trial
		 * Then clicks Create Account button
		 * System navigates to honest.com homepage
		 */

		Wait.elementToBeVisible(trialFirstName, 20, driver);

		trialFirstName.sendKeys(TestData.firstNameTrial);
		trialLastName.sendKeys(TestData.lastNameTrial);
		trialEmail.sendKeys(TestData.emailTrial);
		trialPassword.sendKeys(TestData.passwordTrial);

		trialCreateButton.click();

		return PageFactory.initElements(driver, HomePage.class);
	}

	// Elements used in the honest.com landing page
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-reg-fullscreen-modal']/div[2]/div[1]/button")
	WebElement closeTrial;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='user_first_name']")
	WebElement trialFirstName;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='user_last_name']")
	WebElement trialLastName;
	@CacheLookup
	@FindBy(xpath = "//input[@placeholder='Email Address']")
	WebElement trialEmail;
	@CacheLookup
	@FindBy(xpath = "//input[@id='user_password'][@minlength='6']")
	WebElement trialPassword;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-user-registration-form']/div[6]/input")
	WebElement trialCreateButton;

}
