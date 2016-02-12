package framework.pages;

import org.testng.Assert;

import framework.config.TestCore;

public class Footer_WhoWeAre extends TestCore {

	// METHOD FOR USER ( CLCIKS WHO WE ARE ON FOOTER, THEN VERIFY URL/PAGE TITLE)
	public void footer_WhoWeAre() throws Exception, InterruptedException {

		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/about-us/who-we-are";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
		String expectedTitle = "Who We Are | Meet Our Founders | The Honest Company";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.navigate().back();
	}
}
