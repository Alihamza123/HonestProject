package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;
import framework.properties.TestData;

public class FreeTrial extends TestCore {

	@FindBy(xpath = Elements.closeTrialAlert)
	WebElement closeTrial;
	@FindBy(xpath = Elements.trialFirstName)
	WebElement trialFirstName;
	@FindBy(xpath = Elements.trialLastName)
	WebElement trialLastName;
	@FindBy(xpath = Elements.trialEmail)
	WebElement trialEmail;
	@FindBy(xpath = Elements.trialPassword)
	WebElement trialPassword;
	@FindBy(xpath = Elements.trialCreateButton)
	WebElement trialCreateButton;

	// MAIN CONSTRUCTOR
	public FreeTrial(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// METHOD FOR JOINING FREE TRIAL FROM POP UP
	public FreeTrial user_JoinsFreeTrial() throws Exception {

		explicitWait(trialFirstName, 20, driver);
		
		// user inputs data 
		trialFirstName.sendKeys(TestData.firstNameTrial);
		log.debug(" First name = " + TestData.firstNameTrial);
		trialLastName.sendKeys(TestData.lastNameTrial);
		log.debug(" Last name = " + TestData.lastNameTrial);
		trialEmail.sendKeys(TestData.emailTrial);
		log.debug(" Email = " + TestData.emailTrial);
		trialPassword.sendKeys(TestData.passwordTrial);
		log.debug(" Password = " + TestData.passwordTrial);

		trialCreateButton.click();
		log.debug(" CREATE TRIAL ACCOUNT BUTTON CLICKED ");

		return new FreeTrial(driver);
	}

	// METHOD FOR USER TO CLOSE THE FREE TRIAL ALERT AND TO CONTINUE TO WEBPAGE
	public FreeTrial close_freeTrialAlert() throws Exception {

		explicitWait(closeTrial, 20, driver);

		// VERIFY IF FREE TRIAL ALERT OPENS . THE CLOSE BUTTON IS ENABLED
		if (closeTrial.isEnabled()) {
			closeTrial.click();
			log.debug(" CLOSED FREE TRIAL ALERT ");
		} else {
			log.debug(" Free Trial Alert NOT PRESENT ");
		}

		return this;
	}
}
