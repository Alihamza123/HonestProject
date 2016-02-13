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
		Assert.assertTrue(driver.getTitle().contains(expectedTitle));
		
	}
	
	// METHOD FOR TYPING INSIDE THE SEARCH BOX FROM HOMEPAGE
	public void user_Types_SearchBox() throws Exception{
	
		// wait for searchbox to be visible
		explicitWait(searchBox, 20, driver);
		
		// USER SEARCHES FOR INPUT
		searchBox.sendKeys(TestData.searchData);
		searchBox.clear();
		searchBox.click();
		searchBox.sendKeys(TestData.searchData);
			
	}
	
	// METHOD FOR CLICKING ON SEARCH RESULT FROM DROP DOWN
	public SearchResultsPage select_DynamicSearchResult() throws Exception {
		
		// wait for result to drop
		explicitWait(resultDrop, 20, driver);
		
		// USER CLICKS RESULT DROP BABY & TODDLER MULTI POWDER
		resultDrop.click();
		
		return PageFactory.initElements(driver, SearchResultsPage.class);
		
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

	@CacheLookup@FindBy(xpath = Elements.searchBox)WebElement searchBox;
	@CacheLookup@FindBy(xpath = TestData.searchData)WebElement searchData;
	@CacheLookup@FindBy(xpath = Elements.resultDrop)WebElement resultDrop;
	@CacheLookup@FindBy(xpath = Elements.myAccount)WebElement myAccount;
	@CacheLookup@FindBy(xpath = Elements.input_email)WebElement input_email;
	@CacheLookup@FindBy(xpath = Elements.input_password)WebElement input_password;
	@CacheLookup@FindBy(xpath = Elements.signInButton)WebElement signInButton;
	@CacheLookup@FindBy(xpath = Elements.signOutAccount)WebElement signOutAccount;
	@CacheLookup@FindBy(xpath = Elements.signOutLink)WebElement signOutLink;

}
