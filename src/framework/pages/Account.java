package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;
import framework.properties.TestData;

public class Account extends TestCore {
	
	@FindBy(xpath = Elements.newFirstName)
	WebElement newFirstName;
	@FindBy(xpath = Elements.newLastName)
	WebElement newLastName;
	@FindBy(xpath = Elements.newEmail)
	WebElement newEmail;
	@FindBy(xpath = Elements.newPassword)
	WebElement newPassword;
	@FindBy(xpath = Elements.newAccountButton)
	WebElement newAccountButton;
	@FindBy(xpath = Elements.oldEmail)
	WebElement oldEmail;
	@FindBy(xpath = Elements.oldPassword)
	WebElement oldPassword;
	@FindBy(xpath = Elements.oldSignInButton)
	WebElement oldSignInButton;
	@FindBy(xpath = Elements.footerMyAccount)
	WebElement footerMyAccount;

	// MAIN CONSTRUCTOR
	public Account(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// METHOD FOR CREATING NEW USER FROM MY ACCOUNT PAGE
	public Homepage user_CreatesNewAccount()
			throws Exception {
		
		explicitWait(footerMyAccount, 20, driver);

		footerMyAccount.click();
		log.debug(" MY ACCOUNT FOOTER CLICKED ");
		
		explicitWait(newFirstName, 20, driver);

		newFirstName.sendKeys(TestData.firstNameAccount);
		log.debug(" First name = " + TestData.firstNameAccount);
		newLastName.sendKeys(TestData.lastNameAccount);
		log.debug(" Last name = " + TestData.lastNameAccount);
		newEmail.sendKeys(TestData.emailAccount);
		log.debug(" New Email = " + TestData.emailAccount);
		newPassword.sendKeys(TestData.passwordAccount);
		log.debug(" New Password = " + TestData.passwordAccount);

		newAccountButton.click();
		log.debug(" CREATE NEW ACCOUNT BUTTON CLICKED ");

		return new Homepage(driver);
	}

	// METHOD FOR VALID LOG IN FROM MY ACCOUNT PAGE
	public Homepage user_SignsIn_FromMyAccount() throws Exception {
		
		explicitWait(footerMyAccount, 20, driver);

		footerMyAccount.click();
		log.debug(" MY ACCOUNT FOOTER CLICKED ");

		explicitWait(oldEmail, 20, driver);

		oldEmail.sendKeys(TestData.emailAccount);
		log.debug(" VALID EMAIL = " + TestData.emailAccount);
		oldPassword.sendKeys(TestData.passwordAccount);
		log.debug(" VALID PASSWORD = " + TestData.passwordAccount);
		oldSignInButton.click();
		log.debug(" SIGN IN BUTTON CLICKED ");

		return new Homepage(driver);
	}
}
