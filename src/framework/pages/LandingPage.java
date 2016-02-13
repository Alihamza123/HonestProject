package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.Elements;
import framework.properties.TestData;

public class LandingPage extends TestCore {

	// MAIN CONSTRUCTOR
	public LandingPage(WebDriver driver) {
		TestCore.driver = driver;
	}
	
	// METHOD FOR USER TO CLOSE THE FREE TRIAL ALERT AND TO CONTINUE TO WEBPAGE
	public Homepage close_freeTrialAlert() throws Exception {

		explicitWait(closeTrial, 20, driver);

		Assert.assertTrue(closeTrial.isEnabled());
		
		closeTrial.click();

		return PageFactory.initElements(driver, Homepage.class);
	}
	// METHOD FOR JOINING FREE TRIAL FROM POP UP
	public Homepage user_JoinsFreeTrial() throws Exception {

		explicitWait(trialFirstName, 20, driver);
		
		// user inputs data 
		trialFirstName.sendKeys(TestData.firstNameTrial);
		trialLastName.sendKeys(TestData.lastNameTrial);
		trialEmail.sendKeys(TestData.emailTrial);
		trialPassword.sendKeys(TestData.passwordTrial);

		trialCreateButton.click();

		return PageFactory.initElements(driver, Homepage.class);
	}

	@CacheLookup @FindBy(xpath = Elements.closeTrialAlert)WebElement closeTrial;
	@CacheLookup @FindBy(xpath = Elements.trialFirstName)WebElement trialFirstName;
	@CacheLookup @FindBy(xpath = Elements.trialLastName)WebElement trialLastName;
	@CacheLookup @FindBy(xpath = Elements.trialEmail)WebElement trialEmail;
	@CacheLookup @FindBy(xpath = Elements.trialPassword)WebElement trialPassword;
	@CacheLookup @FindBy(xpath = Elements.trialCreateButton)WebElement trialCreateButton;

}
