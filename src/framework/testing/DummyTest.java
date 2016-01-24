package framework.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import framework.config.TestCore;

public class DummyTest  extends TestCore {

	public static void main(String[] args) throws Exception {
		
		driver = new FirefoxDriver();
		driver.get("https://www.honest.com/about-us/press");
		
		
		WebElement ThirdImage = driver.findElement(By.xpath(".//*[@id='accordion-1']/dl/dd[3]/hc-vimeo/a"));
		
		explicitWait(ThirdImage, 20, driver);		
		
		ThirdImage.click();
	}
}
