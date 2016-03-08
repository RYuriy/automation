package pageObjects;

import org.openqa.selenium.WebDriver;

import util.PropertyManager;

public class AbstractPage_man {
	
	protected WebDriver driver;
	protected PropertyManager property;
	
	public AbstractPage_man (WebDriver driver) {
		property = new PropertyManager();
		property.generateProperty();
		this.driver = driver;
	}
	
	public  WebDriver getDriver() {
		return driver;
	}
	
	public startPage_man navigateToWebApp() {
		driver.navigate().to("https://flirchi.com/landing/inter?fr=1&p=1232");
		return new startPage_man(driver);
	}
}
