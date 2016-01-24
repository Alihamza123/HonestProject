package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;
import framework.properties.TestData;

public class Homepage extends TestCore {

	// MAIN CONSTRUCTOR
	public Homepage(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Elements.myAccount)
	WebElement myAccount;
	@FindBy(xpath = Elements.input_email)
	WebElement input_email;
	@FindBy(xpath = Elements.input_password)
	WebElement input_password;
	@FindBy(xpath = Elements.signInButton)
	WebElement signInButton;
	@FindBy(xpath = Elements.signOutAccount)
	WebElement signOutAccount;
	@FindBy(xpath = Elements.signOutLink)
	WebElement signOutLink;

	// METHOD FOR VALID LOG IN FROM HEADER SIGN IN
	public Account user_SignsIn_FromHeader() throws Exception {

		explicitWait(myAccount, 20, driver);

		// USER CLICKS SIGN IN FROM HEADER
		myAccount.click();
		log.debug(" SIGN IN HEADER CLICKED ");

		explicitWait(input_email, 20, driver);
		
		input_email.click();
		input_email.sendKeys(TestData.emailTrial);
		log.debug(" Valid Username = " + TestData.emailTrial);

		input_password.click();
		input_password.sendKeys(TestData.passwordTrial);
		log.debug(" Valid Password = " + TestData.passwordTrial);

		// USER CLICKS LOG IN BUTTON
		signInButton.click();
		log.debug(" SIGN IN BUTTON CLICKED ");

		return new Account(driver);
	}

	// METHOD FOR USER TO LOG OUT OF ACCOUNT ( SIGN OUT )
	public Homepage user_SignsOutOfAccount() throws Exception {

		explicitWait(signOutAccount, 20, driver);

		Actions hover = new Actions(driver);
		// USER HOVERS TO ACCOUNT ON HEADER AND CLICKS
		hover.moveToElement(signOutAccount).build().perform();
		log.debug(" HOVERED TO MY ACCOUNT HEADER ");

		explicitWait(signOutLink, 20, driver);
		
		// USER CLICKS SIGN OUT BUTTON 
		signOutLink.click();
		log.debug(" SIGN OUT LINK CLICKED ");

		return this;
	}
}
