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

public class Account extends TestCore {

	public Account(WebDriver driver) {
		TestCore.driver = driver;
	}

	public MyAccountPage user_Inputs_NewUserData() throws Exception {

		// user inputs valid data
		newFirstName.sendKeys(TestData.firstNameAccount);
		newLastName.sendKeys(TestData.lastNameAccount);
		newEmail.sendKeys(TestData.emailAccount);
		newPassword.sendKeys(TestData.passwordAccount);
		
		// user clicks register account button
		newAccountButton.click();
		
		return PageFactory.initElements(driver, MyAccountPage.class);

	}


	public MyAccountPage enters_RegisteredData() throws Exception {

		// wait for email input field to be visible
		explicitWait(oldEmail, 20, driver);

		// user inputs valid data
		oldEmail.sendKeys(TestData.emailAccount);
		oldPassword.sendKeys(TestData.passwordAccount);
		
		// user clicks Sign In Button
		oldSignInButton.click();

		return PageFactory.initElements(driver, MyAccountPage.class);

	}

	public void verify_AccountPageTitle() {

		String expectedTitle = "Log-in to The Honest Company";
		Assert.assertTrue(driver.getTitle().contains(expectedTitle));

	}

	@CacheLookup@FindBy(xpath = Elements.oldEmail)WebElement oldEmail;
	@CacheLookup@FindBy(xpath = Elements.oldPassword)WebElement oldPassword;
	@CacheLookup@FindBy(xpath = Elements.oldSignInButton)WebElement oldSignInButton;
	@CacheLookup@FindBy(xpath = Elements.newFirstName)WebElement newFirstName;
	@CacheLookup@FindBy(xpath = Elements.newLastName)WebElement newLastName;
	@CacheLookup@FindBy(xpath = Elements.newEmail)WebElement newEmail;
	@CacheLookup@FindBy(xpath = Elements.newPassword)WebElement newPassword;
	@CacheLookup@FindBy(xpath = Elements.newAccountButton)WebElement newAccountButton;
}
