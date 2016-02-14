package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.properties.TestData;
import framework.utils.Wait;

public class LoginRegisterPage {

	WebDriver driver;

	public LoginRegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public MyAccountPage typeNewUserData() throws Exception {

		/*
		 * Waits for First name text field to be visible
		 * This method inputs New User data inside the text fields. 
		 * Then clicks Register Account Button
		 * System will navigate to Logged in My account page
		 */

		Wait.elementToBeVisible(newFirstName, 20, driver);

		newFirstName.sendKeys(TestData.firstNameAccount);
		newLastName.sendKeys(TestData.lastNameAccount);
		newEmail.sendKeys(TestData.emailAccount);
		newPassword.sendKeys(TestData.passwordAccount);

		Wait.elementToBeClickable(newAccountButton, 20, driver);

		newAccountButton.click();

		return PageFactory.initElements(driver, MyAccountPage.class);

	}

	public MyAccountPage signIntoAccount() throws Exception {

		/*
		 *  Waits for Email text field to be visible
		 *  This method Logs in user with an already registered account
		 *  System navigates to logged in account page
		 */
		
		Wait.elementToBeVisible(oldEmail, 20, driver);

	
		oldEmail.sendKeys(TestData.emailAccount);
		oldPassword.sendKeys(TestData.passwordAccount);

		oldSignInButton.click();

		return PageFactory.initElements(driver, MyAccountPage.class);

	}

	public void validatePageTitle() {
		
		/*
		 *  This method verifies and valides Page title
		 */

		final String expectedTitle = "Log-in to The Honest Company";
		Assert.assertTrue(driver.getTitle().contains(expectedTitle));

	}

	// Elements used in the Login / Register Page 	
	@CacheLookup
	@FindBy(xpath = ".//div[contains(@id, 'sign-in')]//input[@id='user_email']")
	WebElement oldEmail;
	@CacheLookup
	@FindBy(xpath = ".//div[contains(@id, 'sign-in')]//input[@id='user_password']")
	WebElement oldPassword;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='new_user_session']/div[4]/input")
	WebElement oldSignInButton;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='user_first_name']")
	WebElement newFirstName;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='user_last_name']")
	WebElement newLastName;
	@CacheLookup
	@FindBy(xpath = ".//div[contains(@id, 'sign-up')]//*[contains(@id, 'user_email')]")
	WebElement newEmail;
	@CacheLookup
	@FindBy(xpath = ".//div[contains(@id, 'sign-up')]//*[contains(@id, 'user_password')]")
	WebElement newPassword;
	@CacheLookup
	@FindBy(xpath = ".//input[@value='Create Account']")
	WebElement newAccountButton;
}
