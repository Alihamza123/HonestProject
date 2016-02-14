package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.properties.TestData;
import framework.utils.Wait;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyHomePageTitle() {
		
		/*
		 *  This method verifies and validates Homepage title
		 */

		String expectedTitle = "Diapers, Bath & Body Products, Non-Toxic Cleaners | The Honest Company";
		Assert.assertTrue(driver.getTitle().contains(expectedTitle));
		
	}
	
	public LoginRegisterPage clickMyAccountFooter() throws Exception {

		/*
		 *  This method waits for My Account to be visible on footer
		 *  Then clicks it , takes user to Login/Register page
		 */
		
		Wait.elementToBeVisible(footerMyAccount, 20, driver);

		footerMyAccount.click();

		return PageFactory.initElements(driver, LoginRegisterPage.class);
		
	}

	public void typeInSearchBox() throws Exception {
		
		/*
		 *  This method waits for Search box to be visible
		 *  Then searches for : Baby 
		 *  Expecting the search result to have 1 result of : Baby & Toddler Multi powder
		 */

		Wait.elementToBeVisible(searchBox, 20, driver);

	
		searchBox.sendKeys(TestData.searchData);
		searchBox.clear();
		searchBox.click();
		searchBox.sendKeys(TestData.searchData);

	}

	public SearchResultsPage resultDrop() throws Exception {
		
		/*
		 *  This method waits for searched result drop to be visible
		 *  Then clicks the Result " Baby & Toddler Multi Powder "
		 */

		Wait.elementToBeVisible(resultDrop, 20, driver);

		resultDrop.click();

		return PageFactory.initElements(driver, SearchResultsPage.class);

	}

	public MyAccountPage logInFromHeader() throws Exception {

		/*
		 *  This method waits for SignIn link to be visible on header
		 *  Then clicks on Signin 
		 *  Then inputs Registered account data 
		 *  Then clicks SIGN IN button
		 *  Then system will navigate to Logged in account page
		 */
		
		Wait.elementToBeVisible(myAccount, 20, driver);

		myAccount.click();

		Wait.elementToBeVisible(input_email, 20, driver);

		input_email.click();
		input_email.sendKeys(TestData.emailTrial);

		input_password.click();
		input_password.sendKeys(TestData.passwordTrial);

		signInButton.click();

		return PageFactory.initElements(driver, MyAccountPage.class);
		
	}

	
	public StainRemoverPage orderStainRemover() {

		/*
		 *  This method waits for cleaning on header to be visible
		 *  Then hovers over cleaning and waits for stain remover to be visible
		 *  Then clicks Stain remover  
		 */
		
		Wait.elementToBeClickable(cleaning, 15, driver);

		Actions mouse = new Actions(driver);
		
		mouse.moveToElement(cleaning).build().perform();
			
		Wait.elementToBeClickable(stainRemover, 15, driver);
		
		stainRemover.click();

		return PageFactory.initElements(driver, StainRemoverPage.class);
		
	}

	public GiftsPage navigateToGifts() throws Exception {
		
		/*
		 *  This method waits for Gifts to be visible on header
		 *  Then clicks on Gifts
		 *  System will navigate to Gifts page
		 */

		Wait.elementToBeVisible(gifts, 20, driver);

		gifts.click();

		return PageFactory.initElements(driver, GiftsPage.class);
		
	}
	
	// Elements in the homepage that are used in this class
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[5]/div/div[1]/div[2]/ul/li[4]/a")
	WebElement stainRemover;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[5]/a")
	WebElement cleaning;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='q']")
	WebElement searchBox;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/div[1]/div/ul/li[7]/form/div[2]/button")
	WebElement searchData;
	@CacheLookup
	@FindBy(xpath = ".//*[contains(@id,'option-2')]")
	WebElement resultDrop;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/div[1]/div/ul/li[4]/a")
	WebElement myAccount;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/div[1]/div/ul/li[4]/div//*[@id='user_email']")
	WebElement input_email;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/div[1]/div/ul/li[4]/div//*[@id='user_password']")
	WebElement input_password;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='new_user']/div[5]/input")
	WebElement signInButton;
	@CacheLookup
	@FindBy(xpath = ".//a[contains(@class,'white ng-isolate-scope')]")
	WebElement signOutAccount;
	@CacheLookup
	@FindBy(xpath = "//a[contains(.,'Sign Out')]")
	WebElement signOutLink;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='footer']/div[1]/div[1]/div[2]/ul/li[1]/a")
	WebElement footerMyAccount;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[8]/a")
	WebElement gifts;

}
