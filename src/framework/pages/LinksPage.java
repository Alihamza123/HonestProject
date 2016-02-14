package framework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.config.TestCore;

public class LinksPage extends TestCore {
	
	// MAIN CONSTRUCTOR
	public LinksPage(WebDriver driver) {
		TestCore.driver = driver;
	}

	// METHOD FOR PRINTING ALL LINKS	
	public void print_AllLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 1; i <= links.size(); i++) {
			System.out.println(" Name of Link #" + i + links.get(i).getText());
			System.out.println(" URL of Link #" + i + links.get(i).getAttribute("href"));
		}
	}
	
	// METHOD FOR PRINTING A SPECIFIC LINK NUMBER
	public void print_SpecificLink(int LinkNumber) {
		List<WebElement> links = driver.findElements(By.tagName("a"));

		String specificLink = links.get(LinkNumber).getAttribute("href");
		System.out.println(" THE LINK NUMBER [ " + LinkNumber + " ] : " + specificLink);
	}
}
