package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;

public class Footer extends TestCore {

	@FindBy(xpath = Elements.whoWeAre)
	WebElement whoWeAre;
	@FindBy(xpath = Elements.testimonials)
	WebElement testimonials;
	@FindBy(xpath = Elements.feedBack)
	WebElement feedBack;
	@FindBy(xpath = Elements.faq)
	WebElement faq;
	@FindBy(xpath = Elements.whatsInside)
	WebElement whatsInside;
	
	// MAIN CONSTRUCTOR
	public Footer(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// METHOD FOR FOOTER NAVIGATION CLICK TEST
	public Footer footer_Navigation_Click_Test() throws Exception {
		
		try {
			click_footer_honestTestimonials();
			click_footer_faq();
			click_footer_feedBack();
			click_footer_whatsInside();
			click_footer_whoWeAre();
		} catch (Exception e) {
			log.debug(e);
		}
		
		return new Footer(driver);
	
	}
	
	// METHOD FOR USER ( CLCIKS WHO WE ARE ON FOOTER, THEN VERIFY URL/PAGE TITLE )
	public Footer click_footer_whoWeAre() throws Exception, InterruptedException {
		
		explicitWait(whoWeAre, 20, driver);
		
		// USER CLICKS ( WHO WE ARE ) ON FOOTER
		whoWeAre.click();
		
		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/about-us/who-we-are";
		String actualUrl = driver.getCurrentUrl();
		String expectedTitle = "Who We Are | Meet Our Founders | The Honest Company";
		String actualTitle = driver.getTitle();
		if (expectedUrl.contains(actualUrl) && expectedTitle.contains(actualTitle)) {
			log.debug("FOOTER WHO WE ARE | URL AND TITLE VERIFICATION [PASSED]");
		} else {
			log.debug("FOOTER WHO WE ARE | URL AND TITLE VERIFICATION [FAILED]");
		}
		
		return new Footer(driver);
	}
	
	// METHOD FOR USER ( CLCIKS HONEST TESTIMONIALS ON FOOTER, THEN VERIFY URL/PAGE TITLE )
	public Footer click_footer_honestTestimonials() throws Exception, InterruptedException {
	
		explicitWait(testimonials, 20, driver);
		
		// USER CLICKS ( HEALTH AND SUSTAINABILITY ) ON FOOTER
		testimonials.click();
			
		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/about-us/testimonials";
		String actualUrl = driver.getCurrentUrl();
		String expectedTitle = "Honest Company Reviews & Customer Testimonials";
		String actualTitle = driver.getTitle();
		if (expectedUrl.contains(actualUrl) && expectedTitle.contains(actualTitle)) {
			log.debug("FOOTER HONEST TESTIMONIALS | URL AND TITLE VERIFICATION [PASSED]");
		} else {
			log.debug("FOOTER HONEST TESTIMONIALS | URL AND TITLE VERIFICATION [FAILED]");
		}
		
		return new Footer(driver);
	}

	// METHOD FOR USER ( CLCIKS FEEDBACK ON FOOTER, THEN VERIFY URL/PAGE TITLE )
	public Footer click_footer_feedBack() throws Exception, InterruptedException {

		explicitWait(feedBack, 20, driver);
		
		// USER CLICKS ( FEED BACK ) ON FOOTER
		feedBack.click();
		
		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/about-us/feedback";
		String actualUrl = driver.getCurrentUrl();
		String expectedTitle = "Feedback - Let Us Know What You Think - The Honest Company";
		String actualTitle = driver.getTitle();
		if (expectedUrl.contains(actualUrl) && expectedTitle.contains(actualTitle)) {
			log.debug("FOOTER FEEDBACK | URL AND TITLE VERIFICATION [PASSED]");
		} else {
			log.debug("FOOTER FEEDBACK | URL AND TITLE VERIFICATION [FAILED]");
		}
		
		return new Footer(driver);
	}

	// METHOD FOR USER ( CLCIKS FAQ ON FOOTER, THEN VERIFY URL/PAGE TITLE )
	public Footer click_footer_faq() throws Exception, InterruptedException {

		explicitWait(faq, 20, driver);
		
		// USER CLICKS (FAQ) ON FOOTER
		faq.click();
				
		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/faq";
		String actualUrl = driver.getCurrentUrl();
		String expectedTitle = "The Honest Company";
		String actualTitle = driver.getTitle();
		if (expectedUrl.contains(actualUrl) && expectedTitle.contains(actualTitle)) {
			log.debug("FOOTER FAQ | URL AND TITLE VERIFICATION [PASSED]");
		} else {
			log.debug("FOOTER FAQ | URL AND TITLE VERIFICATION [FAILED]");
		}
		
		return new Footer(driver);
	}
	
	// METHOD FOR USER ( CLCIKS WHATS INSIDE ON FOOTER, THEN VERIFY URL/PAGE TITLE )
	public Footer click_footer_whatsInside() throws Exception, InterruptedException {
		
		explicitWait(whatsInside, 20, driver);
		
		// USER CLICKS FOOTER ( WHATS INSIDE )
		whatsInside.click();
				
		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/whats-inside/concentrates";
		String actualUrl = driver.getCurrentUrl();
		String expectedTitle = "What's Inside | Spray Refills & Concentrates | The Honest Company";
		String actualTitle = driver.getTitle();
		if (expectedUrl.contains(actualUrl) && expectedTitle.contains(actualTitle)) {
			log.debug("FOOTER WHATS INSIDE | URL AND TITLE VERIFICATION [PASSED]");
		} else {
			log.debug("FOOTER WHATS INSIDE | URL AND TITLE VERIFICATION [FAILED]");
		}
		
		return new Footer(driver);
	}
}
