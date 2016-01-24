package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;

public class Header extends TestCore {

	// MAIN CONSTRUCTOR
	public Header(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Elements.bundles)
	WebElement bundles;
	@FindBy(xpath = Elements.diapering)
	WebElement diapering;
	@FindBy(xpath = Elements.feeding)
	WebElement feeding;
	@FindBy(xpath = Elements.personalCare)
	WebElement personalCare;
	@FindBy(xpath = Elements.cleaning)
	WebElement cleaning;
	@FindBy(xpath = Elements.vitamins)
	WebElement vitamins;
	@FindBy(xpath = Elements.gears)
	WebElement gears;
	@FindBy(xpath = Elements.gifts)
	WebElement gifts;
	@FindBy(xpath = Elements.bestDeal_diaperWipes)
	WebElement bestDeal_diaperWipes;
	@FindBy(xpath = Elements.new_honestEverythingTote)
	WebElement new_honestEverythingTote;
	@FindBy(xpath = Elements.new_honestSwimDiapers)
	WebElement new_honestSwimDiapers;
	@FindBy(xpath = Elements.new_mini_DiaperCakes)
	WebElement new_mini_DiaperCakes;
	@FindBy(xpath = Elements.new_orange_handsanitizer)
	WebElement new_orange_handsanitizer;
	@FindBy(xpath = Elements.bestDeal_infantFormula)
	WebElement bestDeal_infantFormula;

	// METHOD FOR HEADER NAVIGATION TEST
	public Header header_Navigation_Test() throws Exception {

		try {
			click_header_bundles();
			click_header_cleaning();
			click_header_diapering();
			click_header_feeding();
			click_header_gears();
			click_header_gifts();
			click_header_personalCare();
			click_header_vitamins();
		} catch (Exception e) {
			log.debug(e.getMessage());
		}

		return new Header(driver);
	}

	// METHOD FOR SUB MENU HEADER HOVER NAVIGATION TEST
	public Header hover_Navigation_Test() throws Exception {

		try {
			click_submenu_bestDeal_infantFormula();
			click_submenu_new_HonestSwimDiapers();
			click_submenu_new_orangeHandSanitizer();
		} catch (Exception e) {
			log.debug(e.getMessage());
		}

		return new Header(driver);
	}
	
	// METHOD FOR USER ( CLICKS HEADER - BUNDLES , AND VERIFY URL/PAGE TITLE )
	public Header click_header_bundles() throws Exception {

		explicitWait(bundles, 20, driver);

		// USER CLICKS ( BUNDLES) ON HEADER
		bundles.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/bundles";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("HEADER BUNDLES | URL VERIFICATION [PASSED]");
		} else {
			log.debug("HEADER BUNDLES | URL VERIFICATION [FAILED]");
		}

		return this;
	}

	// METHOD FOR USER ( CLICKS HEADER - DIAPERING, AND VERIFY URL/PAGE TITLE )
	public Header click_header_diapering() throws Exception {

		explicitWait(diapering, 20, driver);

		// USER CLICKS (DIAPERING) ON HEADER
		diapering.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/baby";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("HEADER DIAPERING | URL VERIFICATION [PASSED]");
		} else {
			log.debug("HEADER DIAPERING | URL VERIFICATION [FAILED]");
		}

		return this;
	}

	// METHOD FOR USER ( CLICKS HEADER - FEEDING, AND VERIFY URL/PAGE TITLE )
	public Header click_header_feeding() throws Exception {

		explicitWait(feeding, 20, driver);

		// USER CLICKS (FEEDING) ON HEADER
		feeding.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/feeding";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("HEADER FEEDING | URL VERIFICATION [PASSED]");
		} else {
			log.debug("HEADER FEEDING | URL VERIFICATION [FAILED]");
		}

		return this;
	}

	// METHOD FOR USER ( CLICKS HEADER - PERSONAL CARE, AND VERIFY URL/PAGE TITLE )
	public Header click_header_personalCare() throws Exception {

		explicitWait(personalCare, 20, driver);

		// USER CLICKS (PERSONAL CARE) ON HEADER
		personalCare.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/bath-and-body";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("HEADER PERSONAL CARE | URL VERIFICATION [PASSED]");
		} else {
			log.debug("HEADER PERSONAL CARE | URL VERIFICATION [FAILED]");
		}

		return this;
	}

	// METHOD FOR USER ( CLICKS HEADER - CLEANING, AND VERIFY URL/PAGE TITLE )
	public Header click_header_cleaning() throws Exception {

		explicitWait(cleaning, 20, driver);

		// USER CLICKS (CLEANING) ON HEADER
		cleaning.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/cleaning";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("HEADER CLEANING | URL VERIFICATION [PASSED]");
		} else {
			log.debug("HEADER CLEANING | URL VERIFICATION [FAILED]");
		}

		return this;
	}
	
	// METHOD FOR USER ( CLICKS HEADER - VITAMINS, AND VERIFY URL/PAGE TITLE )
	public Header click_header_vitamins() throws Exception {

		explicitWait(vitamins, 20, driver);

		// USER CLICKS (VITAMINS) ON HEADER
		vitamins.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/health-and-wellness";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("HEADER VTIAMINS | URL VERIFICATION [PASSED]");
		} else {
			log.debug("HEADER VITAMINS | URL VERIFICATION [FAILED]");
		}

		return this;
	}

	// METHOD FOR USER ( CLICKS HEADER - GEARS, AND VERIFY URL/PAGE TITLE )
	public Header click_header_gears() throws Exception {

		explicitWait(gears, 20, driver);

		// USER CLICKS (GEARS) ON HEADER
		gears.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/collective";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("HEADER Gears and More | URL VERIFICATION [PASSED]");
		} else {
			log.debug("HEADER Gears and More | URL VERIFICATION [FAILED]");
		}

		return this;
	}

	// METHOD FOR USER ( CLICKS HEADER - GIFTS, AND VERIFY URL/PAGE TITLE )
	public Header click_header_gifts() throws Exception {

		explicitWait(gifts, 20, driver);

		// USER CLICKS (GIFTS) FROM HEADER
		gifts.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/gift/guide";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("HEADER Gifts | URL VERIFICATION [PASSED]");
		} else {
			log.debug("HEADER Gifts | URL VERIFICATION [FAILED]");
		}

		return this;
	}

	// METHOD FOR USER ( CLICKS SUB MENU - NEW HONEST SWIM DIAPERS, AND VERIFY URL/PAGE TITLE )
	public Header click_submenu_new_HonestSwimDiapers() throws Exception {

		explicitWait(diapering, 20, driver);

		// USER HOVERS TO (DIAPERING) ON HEADER
		Actions diaper = new Actions(driver);
		diaper.moveToElement(diapering).build().perform();

		explicitWait(new_honestSwimDiapers, 20, driver);

		// USER CLICKS (DIAPERING CAKES new) FROM SUB MENU
		new_honestSwimDiapers.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/baby/honest-swim-diapers";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("SUB MENU new HONEST SWIM DIAPERS | URL VERIFICATION [PASSED]");
		} else {
			log.debug("SUB MENU new HONEST SWIM DIAPERS| URL VERIFICATION [FAILED]");
		}

		return this;
	}

	// METHOD FOR USER ( CLICKS SUB MENU - BEST DEAL INFANT FORMULA, AND VERIFY URL/PAGE TITLE )
	public Header click_submenu_bestDeal_infantFormula() throws Exception {

		explicitWait(feeding, 20, driver);

		// USER HOVERS OVER (FEEDING) ON HEADER
		Actions diaper = new Actions(driver);
		diaper.moveToElement(feeding).build().perform();

		explicitWait(bestDeal_infantFormula, 20, driver);

		// USER CLICKS (INFANT FORMULA best deal) FROM SUB MENU
		bestDeal_infantFormula.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/feeding/organic-infant-formula-dha-bundle";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("SUB MENU best deal infant formula | URL VERIFICATION [PASSED]");
		} else {
			log.debug("SUB MENU best deal infant formula | URL VERIFICATION [FAILED]");
		}

		return this;
	}

	// METHOD FOR USER ( CLICKS SUB MENU - NEW ORANGE HAND SANITIZER, AND VERIFY URL/PAGE TITLE )
	public Header click_submenu_new_orangeHandSanitizer() throws Exception {

		explicitWait(personalCare, 20, driver);

		// USER HOVERS OVER (PERSONAL CARE) ON HEADER
		Actions diaper = new Actions(driver);
		diaper.moveToElement(personalCare).build().perform();

		explicitWait(new_orange_handsanitizer, 20, driver);

		// USER CLICKS (ORANGE HANDSANITIZER new) FROM SUB MENU
		new_orange_handsanitizer.click();

		// VERIFY ACTUAL/EXPECTED URL
		String expectedUrl = "https://www.honest.com/bath-and-body/orange-scented-hand-sanitizer";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			log.debug("SUB MENU new orange hand sanitizer | URL VERIFICATION [PASSED]");
		} else {
			log.debug("SUB MENU new orange hand sanitizer | URL VERIFICATION [FAILED]");
		}

		return this;
	}

}
