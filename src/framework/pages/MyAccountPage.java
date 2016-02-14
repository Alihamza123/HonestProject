package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.utils.Wait;

public class MyAccountPage {

	WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validateLoggedInText() {

		/*
		 * This method verifies and validates The Text " My Account " on the
		 * header, when user is on the logged in account page
		 */

		String expectedText = "My Account";
		String actualText = driver.findElement(By.xpath("//a[@class='gray']")).getText();

		Assert.assertEquals(actualText, expectedText);

	}

	public HomePage signOut() throws Exception {

		/*
		 * This method Waits for Sign out link to be visible
		 * Hovers over to my account , then clicks on Sign out
		 * After signing out
		 * User will be navigated back to homepage
		 */

		Wait.elementToBeVisible(signOutAccount, 20, driver);

		Actions hover = new Actions(driver);

		hover.moveToElement(signOutAccount).build().perform();

		Wait.elementToBeClickable(signOutLink, 20, driver);

		signOutLink.click();

		return PageFactory.initElements(driver, HomePage.class);

	}

	@CacheLookup
	@FindBy(xpath = ".//a[contains(@class,'white ng-isolate-scope')]")
	WebElement signOutAccount;
	@CacheLookup
	@FindBy(xpath = "//a[contains(.,'Sign Out')]")
	WebElement signOutLink;

}
