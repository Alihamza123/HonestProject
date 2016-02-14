package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.utils.Wait;

public class FooterPage {
	
	WebDriver driver;

	public FooterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToFeedback() throws Exception {

		/*
		 * This method waits for Feedback Footer to be visible 
		 * Then clicks Feedback
		 * Then verify and validate Url and Page Title
		 */

		Wait.elementToBeVisible(feedBack, 20, driver);

		feedBack.click();

		String expectedUrl = "https://www.honest.com/about-us/feedback";
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

		String expectedTitle = "Feedback - Let Us Know What You Think - The Honest Company";
		Assert.assertEquals(driver.getTitle(), expectedTitle);

	}

	public void navigateToFaq() throws Exception {

		/*
		 * This method waits for Faq Footer to be visible 
		 * Then clicks Faq
		 * Then verify and validate Url and Page Title
		 */

		Wait.elementToBeVisible(faq, 20, driver);

		faq.click();

		String expectedUrl = "https://www.honest.com/faq";
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

		String expectedTitle = "The Honest Company";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}

	public void navigateToWhoWeAre() throws Exception {

		/*
		 * This method waits for Who We Are Footer to be visible 
		 * Then clicks Who We Are
		 * Then verify and validate Url and Page Title
		 */

		Wait.elementToBeVisible(whoWeAre, 20, driver);

		whoWeAre.click();

		String expectedUrl = "https://www.honest.com/about-us/who-we-are";
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

		String expectedTitle = "Who We Are | Meet Our Founders | The Honest Company";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}

	public void navigateToTestimonials() throws Exception {

		/*
		 * This method waits for Testimonials Footer to be visible 
		 * Then clicks Testimonials
		 * Then verify and validate Url and Page Title
		 */

		Wait.elementToBeVisible(testimonials, 20, driver);

		testimonials.click();

		String expectedUrl = "https://www.honest.com/about-us/testimonials";
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

		String expectedTitle = "Honest Company Reviews & Customer Testimonials";
		Assert.assertEquals(driver.getTitle(), expectedTitle);

	}

	public void navigateToWhatsInside() throws Exception {

		/*
		 * This method waits for Whats Inside Footer to be visible 
		 * Then clicks Whats Inside
		 * Then verify and validate Url and Page Title
		 */

		Wait.elementToBeVisible(whatsInside, 20, driver);

		whatsInside.click();

		String expectedUrl = "https://www.honest.com/whats-inside/concentrates";
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

		String expectedTitle = "What's Inside | Spray Refills & Concentrates | The Honest Company";
		Assert.assertEquals(driver.getTitle(), expectedTitle);

	}



	public PressPage click_Press_Footer() throws Exception {

		/*
		 *  This method waits for Press to be visible on footer
		 *  Then clicks the Press on footer, takes user to Press page
		 */
		
		Wait.elementToBeVisible(press, 20, driver);

		press.click();

		return PageFactory.initElements(driver, PressPage.class);
	}

	// Elements that are used in the Footer page 
	@CacheLookup
	@FindBy(xpath = ".//*[@id='footer']/div[3]/ul/li[4]/a")
	WebElement press;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='footer']/div[1]/div[1]/div[1]/ul/li[3]/a")
	WebElement feedBack;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='footer']/div[1]/div[1]/div[1]/ul/li[1]/a")
	WebElement faq;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='footer']/div[1]/div[2]/div[1]/div[1]/ul/li[7]/a")
	WebElement whatsInside;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='footer']/div[3]/ul/li[5]/a")
	WebElement testimonials;
	@CacheLookup
	@FindBy(xpath = ".//*[@href='/about-us/who-we-are']")
	WebElement whoWeAre;


}
