package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.Elements;

public class HomepageFooter extends TestCore {
	
	public HomepageFooter(WebDriver driver) {
		TestCore.driver=driver;
	}
	
	// METHOD FOR CLICKING FEEDBACK FROM FOOTER
	public void click_footer_feedBack() throws Exception, InterruptedException {

		// wait for Feedback on Footer to be visible
		explicitWait(feedBack, 20, driver);

		// USER CLICKS ( FEED BACK ) ON FOOTER
		feedBack.click();

		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/about-us/feedback";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);

		String expectedTitle = "Feedback - Let Us Know What You Think - The Honest Company";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

	// METHOD FOR CLICKING FAQ FROM FOOTER
	public void click_Footer_faq() throws Exception, InterruptedException {

		// wait for Faq on Footer to be visible
		explicitWait(faq, 20, driver);

		// USER CLICKS (FAQ) ON FOOTER
		faq.click();

		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/faq";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
			
		String expectedTitle = "The Honest Company";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	// METHOD FOR CLICKING WHO WE ARE FROM FOOTER
	public void click_Footer_WhoWeAre() throws Exception {

		// wait for Who we are on Footer to be visible
		explicitWait(whoWeAre, 20, driver);

		// USER CLICKS ( WHO WE ARE ) ON FOOTER
		whoWeAre.click();

		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/about-us/who-we-are";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
		String expectedTitle = "Who We Are | Meet Our Founders | The Honest Company";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);	
	}

	// METHOD FOR CLICKING HONEST TESTIMONIALS FROM FOOTER
	public void click_Footer_Testimonials() throws Exception {

		// wait for honest testimonials link to be visible
		explicitWait(testimonials, 20, driver);

		// USER CLICKS ( HEALTH AND SUSTAINABILITY ) ON FOOTER
		testimonials.click();
		
		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/about-us/testimonials";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
		String expectedTitle = "Honest Company Reviews & Customer Testimonials";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}
	
	// METHOD FOR CLICKING ON WHATS INSIDE FROM FOOTER
	public void click_Footer_WhatsInside() throws Exception {

		// wait for Whats inside on Footer to be visible
		explicitWait(whatsInside, 20, driver);

		// USER CLICKS FOOTER ( WHATS INSIDE )
		whatsInside.click();

		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/whats-inside/concentrates";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);

		String expectedTitle = "What's Inside | Spray Refills & Concentrates | The Honest Company";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	// METHOD FOR CLICKING ON MY ACCOUNT FROM FOOTER
	public Account click_MyAccount_Footer() throws Exception {

		// explcicit wait for My Account link in Footer to be visible
		explicitWait(footerMyAccount, 20, driver);

		// user clicks MY ACCOUNT from FOOTER
		footerMyAccount.click();

		return PageFactory.initElements(driver, Account.class);
	}
	
	// METHOD FOR USER ( CLICKS PRESS FOOTER )
	public Press click_Press_Footer() throws Exception {

		// wait for press link to be visible
		explicitWait(press, 20, driver);

		// USER CLICKS PRESS ON FOOTER
		press.click();

		return PageFactory.initElements(driver, Press.class);
	}
	
	@CacheLookup@FindBy(xpath = Elements.press)WebElement press;
	@CacheLookup@FindBy(xpath = Elements.feedBack)WebElement feedBack;
	@CacheLookup@FindBy(xpath = Elements.faq)WebElement faq;
	@CacheLookup@FindBy(xpath = Elements.whatsInside)WebElement whatsInside;
	@CacheLookup@FindBy(xpath = Elements.testimonials)WebElement testimonials;
	@CacheLookup@FindBy(xpath = Elements.whoWeAre)WebElement whoWeAre;
	@CacheLookup@FindBy(xpath = Elements.footerMyAccount)WebElement footerMyAccount;
	

}
