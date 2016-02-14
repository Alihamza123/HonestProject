package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.utils.Wait;

public class HeaderPage {

	WebDriver driver;

	public HeaderPage(WebDriver driver) {
		this.driver = driver;
	}

	public CleaningPage navigateToCleaning() throws Exception {

		/*
		 * This method waits for cleaning on header to be visible 
		 * Then clicks on cleaning on header
		 */

		Wait.elementToBeVisible(cleaning, 20, driver);

		cleaning.click();

		return PageFactory.initElements(driver, CleaningPage.class);
	}

	public FeedingPage navigateToFeeding() throws Exception {

		/*
		 * This method waits for feeding on header to be visible 
		 * Then clicks on feeding on header
		 */

		Wait.elementToBeVisible(feeding, 20, driver);

		feeding.click();

		return PageFactory.initElements(driver, FeedingPage.class);
	}

	public PersonalcarePage navigateToPersonalCare() throws Exception {

		/*
		 * This method waits for Personal Care on header to be visible 
		 * Then clicks on Personal Care on header
		 */

		Wait.elementToBeVisible(personalCare, 20, driver);

		personalCare.click();

		return PageFactory.initElements(driver, PersonalcarePage.class);
	}

	public void navigateToBundlesHeader() throws Exception {

		/*
		 * This method waits for Bundles header to be visible 
		 * Then clicks Bundles 
		 * Then verifies/validates Page Url
		 */

		Wait.elementToBeVisible(bundles, 20, driver);

		bundles.click();

		String expectedUrl = "https://www.honest.com/bundles";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	public void navigateToDiaperingHeader() throws Exception {

		/*
		 * This method waits for Diapering header to be visible 
		 * Then clicks Diapering 
		 * Then verifies/validates Page Url
		 */
		
		Wait.elementToBeVisible(diapering, 20, driver);

		diapering.click();

		String expectedUrl = "https://www.honest.com/baby";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	public void navigateToFeedingHeader() throws Exception {

		/*
		 * This method waits for Feeding header to be visible 
		 * Then clicks Feeding 
		 * Then verifies/validates Page Url
		 */
		
		Wait.elementToBeVisible(feeding, 20, driver);

		feeding.click();

		String expectedUrl = "https://www.honest.com/feeding";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	public void navigateToPersonalCareHeader() throws Exception {

		/*
		 * This method waits for PersonalCare header to be visible 
		 * Then clicks PersonalCare 
		 * Then verifies/validates Page Url
		 */
		
		Wait.elementToBeVisible(personalCare, 20, driver);

		personalCare.click();

		String expectedUrl = "https://www.honest.com/bath-and-body";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	public void navigateToCleaningHeader() throws Exception {

		/*
		 * This method waits for Cleaning header to be visible 
		 * Then clicks Cleaning 
		 * Then verifies/validates Page Url
		 */
		
		Wait.elementToBeVisible(cleaning, 20, driver);

		cleaning.click();

		String expectedUrl = "https://www.honest.com/cleaning";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	public void navigateToVitaminsHeader() throws Exception {

		/*
		 * This method waits for Vitamins header to be visible 
		 * Then clicks Vitamins 
		 * Then verifies/validates Page Url
		 */
		
		Wait.elementToBeVisible(vitamins, 20, driver);

		vitamins.click();

		String expectedUrl = "https://www.honest.com/health-and-wellness";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	public void navigateToGearsHeader() throws Exception {

		/*
		 * This method waits for Gears header to be visible 
		 * Then clicks Gears 
		 * Then verifies/validates Page Url
		 */
		
		Wait.elementToBeVisible(gears, 20, driver);

		gears.click();

		String expectedUrl = "https://www.honest.com/collective";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	public void navigateToGiftsHeader() throws Exception {

		/*
		 * This method waits for Gifts header to be visible 
		 * Then clicks Gifts 
		 * Then verifies/validates Page Url
		 */
		
		Wait.elementToBeVisible(gifts, 20, driver);

		gifts.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/gift/guide";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	public void submenuSwimDiapers() throws Exception {

		/*
		 *  This method waits for Diapering on header
		 *  Hovers over Diapering, Then Clicks New Honest Swim Diapers
		 *  Then Verifies and Validates Page Url
		 */
		
		Wait.elementToBeVisible(diapering, 20, driver);

		Actions diaper = new Actions(driver);
		
		diaper.moveToElement(diapering).build().perform();

		Wait.elementToBeVisible(new_honestSwimDiapers, 20, driver);

		new_honestSwimDiapers.click();

		String expectedUrl = "https://www.honest.com/baby/honest-swim-diapers";
		
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	public void submenuInfantFormula() throws Exception {

		/*
		 *  This method waits for Feeding on header
		 *  Hovers over Feeding, Then Clicks Best Deal Infant Formula
		 *  Then Verifies and Validates Page Url
		 */

		Wait.elementToBeVisible(feeding, 20, driver);

		Actions diaper = new Actions(driver);
		
		diaper.moveToElement(feeding).build().perform();

		Wait.elementToBeVisible(bestDeal_infantFormula, 20, driver);

		bestDeal_infantFormula.click();

		String expectedUrl = "https://www.honest.com/feeding/organic-infant-formula-dha-bundle";
		
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	public void submenuHandSanitizer() throws Exception {

		/*
		 *  This method waits for Personal Care on header
		 *  Hovers over Personal Care, Then Clicks New Orange Hand Sanitizer
		 *  Then Verifies and Validates Page Url
		 */

		Wait.elementToBeVisible(personalCare, 20, driver);

		Actions diaper = new Actions(driver);
		
		diaper.moveToElement(personalCare).build().perform();

		Wait.elementToBeVisible(new_orange_handsanitizer, 20, driver);

		new_orange_handsanitizer.click();

		String expectedUrl = "https://www.honest.com/bath-and-body/orange-scented-hand-sanitizer";
		
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[1]/a")
	WebElement bundles;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[2]/a")
	WebElement diapering;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[3]/a")
	WebElement feeding;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[4]/a")
	WebElement personalCare;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[5]/a")
	WebElement cleaning;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[6]/a")
	WebElement vitamins;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[7]/a")
	WebElement gears;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[8]/a")
	WebElement gifts;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[2]/div/div[1]/div[1]/ul/li[1]/a")
	WebElement bestDeal_diaperWipes;
	@CacheLookup
	@FindBy(xpath = "//a[@class='menu-list-item-link margin-right-sm'][@href='/baby/honest-swim-diapers']")
	WebElement new_honestSwimDiapers;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[4]/div/div[1]/div[2]/ul/li[3]/a")
	WebElement new_orange_handsanitizer;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-navbar-top']/nav/div/ul/li[3]/div/div[1]/div[2]/ul/li[1]/a")
	WebElement bestDeal_infantFormula;

}
