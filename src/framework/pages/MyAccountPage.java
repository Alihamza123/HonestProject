package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.Elements;

public class MyAccountPage extends TestCore {	

	// MAIN CONSTRUCTOR
	public MyAccountPage(WebDriver driver) {
		TestCore.driver = driver;
		
	}

	// Verify Page Title For Account Page
	public void verify_MyAccount_Text() {
		
		String expectedText = "My Account";
		String actualText = driver.findElement(By.xpath("//a[@class='gray']")).getText();
		Assert.assertEquals(actualText, expectedText);
			
	}
	
	// METHOD FOR USER TO LOG OUT OF ACCOUNT ( SIGN OUT )
	public Homepage signOut() throws Exception {

		// explicit wait for sign out link to be visible
		explicitWait(signOutAccount, 20, driver);

		Actions hover = new Actions(driver);
		// USER HOVERS TO ACCOUNT ON HEADER AND CLICKS
		hover.moveToElement(signOutAccount).build().perform();

		explicitWait(signOutLink, 20, driver);
		
		// USER CLICKS SIGN OUT BUTTON 
		signOutLink.click();

		return PageFactory.initElements(driver, Homepage.class);
		
	}

	@CacheLookup @FindBy(xpath = Elements.signOutAccount) WebElement signOutAccount;
	@CacheLookup @FindBy(xpath = Elements.signOutLink) WebElement signOutLink;


}
