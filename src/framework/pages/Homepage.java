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

public class Homepage extends TestCore {

	// MAIN CONSTRUCTOR
	public Homepage(WebDriver driver) {
		TestCore.driver = driver;
	}

	// METHOD FOR VERIFYING HOMEPAGE TITLE
	public void verifyHomePageTitle() {

		String expectedTitle = "Diapers, Bath & Body Products, Non-Toxic Cleaners | The Honest Company";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}

	// METHOD FOR CLICKING FEEDBACK FROM FOOTER
	public Footer_Feedback click_footer_feedBack() throws Exception, InterruptedException {

		explicitWait(feedBack, 20, driver);

		// USER CLICKS ( FEED BACK ) ON FOOTER
		feedBack.click();

		return PageFactory.initElements(driver, Footer_Feedback.class);
	}

	// METHOD FOR CLICKING FAQ FROM FOOTER
	public Footer_Faq click_Footer_faq() throws Exception, InterruptedException {

		explicitWait(faq, 20, driver);

		// USER CLICKS (FAQ) ON FOOTER
		faq.click();

		return PageFactory.initElements(driver, Footer_Faq.class);
	}

	// METHOD FOR CLICKING WHO WE ARE FROM FOOTER
	public Footer_WhoWeAre click_Footer_WhoWeAre() throws Exception {

		explicitWait(whoWeAre, 20, driver);

		// USER CLICKS ( WHO WE ARE ) ON FOOTER
		whoWeAre.click();

		return PageFactory.initElements(driver, Footer_WhoWeAre.class);
	}

	// METHOD FOR CLICKING HONEST TESTIMONIALS FROM FOOTER
	public Footer_Testimonials click_Footer_Testimonials() throws Exception {

		explicitWait(testimonials, 20, driver);

		// USER CLICKS ( HEALTH AND SUSTAINABILITY ) ON FOOTER
		testimonials.click();

		return PageFactory.initElements(driver, Footer_Testimonials.class);
	}

	// METHOD FOR CLICKING ON WHATS INSIDE FROM FOOTER
	public Footer_WhatsInside click_Footer_WhatsInside() throws Exception {

		explicitWait(whatsInside, 20, driver);

		// USER CLICKS FOOTER ( WHATS INSIDE )
		whatsInside.click();

		return PageFactory.initElements(driver, Footer_WhatsInside.class);
	}

	// METHOD FOR CLICKING CLEANING FROM HEADER
	public Cleaning click_Header_Cleaning() {

		// click on cleaning from header
		cleaning.click();

		return PageFactory.initElements(driver, Cleaning.class);
	}

	// METHOD FOR CLICKING FEEDING FROM HEADER
	public Feeding click_Header_Feeding() {

		// click on feeding from header
		feeding.click();

		return PageFactory.initElements(driver, Feeding.class);
	}

	// METHOD FOR VALID LOG IN FROM MY ACCOUNT PAGE
	public Account user_Clicks_MyAccountFooter() throws Exception {

		// wait for My Account in Footer to be visible
		explicitWait(footerMyAccount, 20, driver);

		// user clicks My Account in Footer
		footerMyAccount.click();

		return PageFactory.initElements(driver, Account.class);
	}

	// METHOD FOR CLICKING ON MY ACCOUNT FROM FOOTER
	public Account click_MyAccount_Footer() throws Exception {

		// explcicit wait for My Account link in Footer to be visible
		explicitWait(footerMyAccount, 20, driver);

		// user clicks MY ACCOUNT from FOOTER
		footerMyAccount.click();

		return PageFactory.initElements(driver, Account.class);
	}

	// METHOD FOR VALID LOG IN FROM HEADER SIGN IN
	public MyAccountPage logIn_From_Header() throws Exception {

		// explicitly wait for My Account link from HEADER
		explicitWait(myAccount, 20, driver);

		// USER CLICKS SIGN IN FROM HEADER
		myAccount.click();

		// explicitly wait for input field to be visible
		explicitWait(input_email, 20, driver);

		// user inputs valid data
		input_email.click();
		input_email.sendKeys(TestData.emailTrial);

		input_password.click();
		input_password.sendKeys(TestData.passwordTrial);

		// USER CLICKS LOG IN BUTTON
		signInButton.click();

		return PageFactory.initElements(driver, MyAccountPage.class);
	}

	@CacheLookup
	@FindBy(xpath = Elements.feedBack)
	WebElement feedBack;
	@CacheLookup
	@FindBy(xpath = Elements.faq)
	WebElement faq;
	@CacheLookup
	@FindBy(xpath = Elements.whatsInside)
	WebElement whatsInside;
	@CacheLookup
	@FindBy(xpath = Elements.testimonials)
	WebElement testimonials;
	@CacheLookup
	@FindBy(xpath = Elements.whoWeAre)
	WebElement whoWeAre;
	@CacheLookup
	@FindBy(xpath = Elements.myAccount)
	WebElement myAccount;
	@CacheLookup
	@FindBy(xpath = Elements.input_email)
	WebElement input_email;
	@CacheLookup
	@FindBy(xpath = Elements.input_password)
	WebElement input_password;
	@CacheLookup
	@FindBy(xpath = Elements.signInButton)
	WebElement signInButton;
	@CacheLookup
	@FindBy(xpath = Elements.signOutAccount)
	WebElement signOutAccount;
	@CacheLookup
	@FindBy(xpath = Elements.signOutLink)
	WebElement signOutLink;
	@CacheLookup
	@FindBy(xpath = Elements.footerMyAccount)
	WebElement footerMyAccount;
	@CacheLookup
	@FindBy(xpath = Elements.cleaning)
	WebElement cleaning;
	@CacheLookup
	@FindBy(xpath = Elements.feeding)
	WebElement feeding;
}
