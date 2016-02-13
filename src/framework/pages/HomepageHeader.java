package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.Elements;

public class HomepageHeader extends TestCore {

	public HomepageHeader(WebDriver driver) {
		TestCore.driver = driver;
	}

	// METHOD FOR CLICKING GIFTS FROM HEADER
	public Gifts click_Header_Gifts() throws Exception {

		explicitWait(gifts, 20, driver);

		// USER CLICKS (GIFTS) ON HEADER
		gifts.click();

		return PageFactory.initElements(driver, Gifts.class);
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

	// METHOD FOR CLICKING ON PERSONAL CARE FROM HEADER
	public PersonalCare click_Header_PersonalCare() throws Exception {

		// wait for personal care on header to be visible
		explicitWait(personalCare, 20, driver);

		// USER CLICKS ( PERSONAL CARE ) ON HEADER
		personalCare.click();

		return PageFactory.initElements(driver, PersonalCare.class);
	}

	// METHOD FOR USER ( CLICKS HEADER - BUNDLES , AND VERIFY URL/PAGE TITLE )
	public void click_Bundles() throws Exception {

		explicitWait(bundles, 20, driver);

		// USER CLICKS ( BUNDLES) ON HEADER
		bundles.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/bundles";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	// METHOD FOR USER ( CLICKS HEADER - DIAPERING, AND VERIFY URL/PAGE TITLE )
	public void click_Diapering() throws Exception {

		explicitWait(diapering, 20, driver);

		// USER CLICKS (DIAPERING) ON HEADER
		diapering.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/baby";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	// METHOD FOR USER ( CLICKS HEADER - FEEDING, AND VERIFY URL/PAGE TITLE )
	public void click_Feeding() throws Exception {

		explicitWait(feeding, 20, driver);

		// USER CLICKS (FEEDING) ON HEADER
		feeding.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/feeding";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	// METHOD FOR USER ( CLICKS HEADER - PERSONAL CARE, AND VERIFY URL/PAGE
	// TITLE )
	public void click_PersonalCare() throws Exception {

		explicitWait(personalCare, 20, driver);

		// USER CLICKS (PERSONAL CARE) ON HEADER
		personalCare.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/bath-and-body";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	// METHOD FOR USER ( CLICKS HEADER - CLEANING, AND VERIFY URL/PAGE TITLE )
	public void click_Cleaning() throws Exception {

		explicitWait(cleaning, 20, driver);

		// USER CLICKS (CLEANING) ON HEADER
		cleaning.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/cleaning";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));
		
	}

	// METHOD FOR USER ( CLICKS HEADER - VITAMINS, AND VERIFY URL/PAGE TITLE )
	public void click_Vitamins() throws Exception {

		explicitWait(vitamins, 20, driver);

		// USER CLICKS (VITAMINS) ON HEADER
		vitamins.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/health-and-wellness";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	// METHOD FOR USER ( CLICKS HEADER - GEARS, AND VERIFY URL/PAGE TITLE )
	public void click_Gears() throws Exception {

		// wait for gears to be visible
		explicitWait(gears, 20, driver);

		// USER CLICKS (GEARS) ON HEADER
		gears.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/collective";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	// METHOD FOR USER ( CLICKS HEADER - GIFTS, AND VERIFY URL/PAGE TITLE )
	public void click_Gifts() throws Exception {

		// wait for gifts to be visible
		explicitWait(gifts, 20, driver);

		// USER CLICKS (GIFTS) FROM HEADER
		gifts.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/gift/guide";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	// METHOD FOR USER ( CLICKS SUB MENU - NEW HONEST SWIM DIAPERS, AND VERIFY
	// URL/PAGE TITLE )
	public void click_Diapering_SwimDiapers() throws Exception {

		// wait for diapering to be visible
		explicitWait(diapering, 20, driver);

		// USER HOVERS TO (DIAPERING) ON HEADER
		Actions diaper = new Actions(driver);
		diaper.moveToElement(diapering).build().perform();

		explicitWait(new_honestSwimDiapers, 20, driver);

		// USER CLICKS (DIAPERING CAKES new) FROM SUB MENU
		new_honestSwimDiapers.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/baby/honest-swim-diapers";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	// METHOD FOR USER ( CLICKS SUB MENU - BEST DEAL INFANT FORMULA, AND VERIFY
	// URL/PAGE TITLE )
	public void click_Feeding_InfantFormula() throws Exception {

		// wait for feeding to be visible 
		explicitWait(feeding, 20, driver);

		// USER HOVERS OVER (FEEDING) ON HEADER
		Actions diaper = new Actions(driver);
		diaper.moveToElement(feeding).build().perform();

		// wait for best deal infant formula to be visible
		explicitWait(bestDeal_infantFormula, 20, driver);

		// USER CLICKS (INFANT FORMULA best deal) FROM SUB MENU
		bestDeal_infantFormula.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/feeding/organic-infant-formula-dha-bundle";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

	}

	// METHOD FOR USER ( CLICKS SUB MENU - NEW ORANGE HAND SANITIZER, AND VERIFY
	// URL/PAGE TITLE )
	public void click_PersonalCare_HandSanitizer() throws Exception {

		// wait for personal care to be visible
		explicitWait(personalCare, 20, driver);

		// USER HOVERS OVER (PERSONAL CARE) ON HEADER
		Actions diaper = new Actions(driver);
		diaper.moveToElement(personalCare).build().perform();

		// wait for orange hand sanitizier to be visible
		explicitWait(new_orange_handsanitizer, 20, driver);

		// USER CLICKS (ORANGE HANDSANITIZER new) FROM SUB MENU
		new_orange_handsanitizer.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/bath-and-body/orange-scented-hand-sanitizer";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));
		
	}

	@CacheLookup@FindBy(xpath = Elements.bundles)WebElement bundles;
	@CacheLookup@FindBy(xpath = Elements.diapering)WebElement diapering;
	@CacheLookup@FindBy(xpath = Elements.feeding)WebElement feeding;
	@CacheLookup@FindBy(xpath = Elements.personalCare)WebElement personalCare;
	@CacheLookup@FindBy(xpath = Elements.cleaning)WebElement cleaning;
	@CacheLookup@FindBy(xpath = Elements.vitamins)WebElement vitamins;
	@CacheLookup@FindBy(xpath = Elements.gears)WebElement gears;
	@CacheLookup@FindBy(xpath = Elements.gifts)WebElement gifts;
	@CacheLookup@FindBy(xpath = Elements.bestDeal_diaperWipes)WebElement bestDeal_diaperWipes;
	@CacheLookup@FindBy(xpath = Elements.new_honestEverythingTote)WebElement new_honestEverythingTote;
	@CacheLookup@FindBy(xpath = Elements.new_honestSwimDiapers)WebElement new_honestSwimDiapers;
	@CacheLookup@FindBy(xpath = Elements.new_mini_DiaperCakes)WebElement new_mini_DiaperCakes;
	@CacheLookup@FindBy(xpath = Elements.new_orange_handsanitizer)WebElement new_orange_handsanitizer;
	@CacheLookup@FindBy(xpath = Elements.bestDeal_infantFormula)WebElement bestDeal_infantFormula;

}
