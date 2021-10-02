package SeleniumTestLearn.SeleniumTestLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

	WebDriver driver;
	String linkName= null;
		
	By ElementsLink = By.xpath("//h5[contains(text(),'Elements')]");
	By FormsLink = By.xpath("//h5[contains(text(),'Forms')]");
	By AlertsLink = By.xpath("//h5[contains(text(),'Alerts')]");
	By WidgetsLink = By.xpath("//h5[contains(text(),'Widgets')]");
	By InteractionsLink = By.xpath("//h5[contains(text(),'Interactions')]");
	By BookStoreApplicationLink = By.xpath("//h5[contains(text(),'Book Store Application')]");

	public HomePage(WebDriver driver) {
		
		this.driver= driver;
		
	}

	public void verifylinksonHomePage() {
		System.out.println();
		linkName= driver.findElement(ElementsLink).getText();
		if (linkName.equalsIgnoreCase("Elements"))
			System.out.println("Elements link is present");		
		else
			System.out.println("Elements link is not present");
		linkName= driver.findElement(AlertsLink).getText();
		if (linkName.equalsIgnoreCase("Alerts, Frame & Windows"))
			System.out.println("Alerts link is present");		
		else
			System.out.println("Alerts link is not present");
		/*
		 * Assert.assertTrue(linkName.equalsIgnoreCase("Forms"),
		 * "Elements link is not present"); linkName=
		 * driver.findElement(AlertsLink).getText();
		 * Assert.assertTrue(linkName.equalsIgnoreCase("Alerts, Frame & Windows"),
		 * "Elements link is not present"); linkName=
		 * driver.findElement(WidgetsLink).getText();
		 * Assert.assertTrue(linkName.equalsIgnoreCase("Widgets"),
		 * "Elements link is not present"); linkName=
		 * driver.findElement(InteractionsLink).getText();
		 * Assert.assertTrue(linkName.equalsIgnoreCase("Interactions"),
		 * "Elements link is not present"); linkName=
		 * driver.findElement(BookStoreApplicationLink).getText();
		 * Assert.assertTrue(linkName.equalsIgnoreCase("Book Store Application"),
		 * "Elements link is not present");
		 */
		
	}
}
