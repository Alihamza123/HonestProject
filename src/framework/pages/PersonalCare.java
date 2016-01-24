package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;

public class PersonalCare extends TestCore {
	
	// MAIN CONSTRUCTOR
	public PersonalCare(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Elements.personalCare)
	WebElement personalCare;
	@FindBy(xpath = Elements.feminineImage)
	WebElement feminineImage;
	
	// METHOD FOR USER ( CLICKS PERSONAL CARE ON HEADER, CLICK ON FEMININE IMAGE, VERIFY URL/PAGE TITLE )
	public PersonalCare click_feminineCareImage() throws Exception {

		explicitWait(personalCare, 20, driver);

		// USER CLICKS ( PERSONAL CARE ) ON HEADER
		personalCare.click();

		explicitWait(feminineImage, 20, driver);

		// VERIFY FEIMINE IMAGE IS DISPLAYED
		feminineImage.click();

		// VERIFY ACTUAL / EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/feminine-care";
		String actualUrl = driver.getCurrentUrl();
		String expectedTitle = "Feminine Care | Feminine Hygiene | The Honest Company";
		String actualTitle = driver.getTitle();
		if (actualUrl.contains(expectedUrl) && actualTitle.contains(expectedTitle)) {
			log.debug(" FEMININE CARE IMAGE | EXPECTED & ACTUAL URL/TITLE | VERIFICATION [PASSED] ");
		} else {
			log.debug(" FEMININE CARE IMAGE | EXPECTED & ACTUAL URL/TITLE | VERIFICATION [FAILED] ");
		}

		return new PersonalCare(driver);
	}

}
