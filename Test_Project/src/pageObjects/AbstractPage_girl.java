package pageObjects;

import org.openqa.selenium.WebDriver;

import util.PropertyManager;

public class AbstractPage_girl {
	
	protected WebDriver driver;
	protected PropertyManager property;
	
	public AbstractPage_girl (WebDriver driver) {
		property = new PropertyManager();
		property.generateProperty();
		this.driver = driver;
	}
	
	public  WebDriver getDriver() {
		return driver;
	}
	
	public startPage_girl navigateToWebApp() {
		driver.navigate().to("https://flirchi.com/landing/inter?fr=1&p=1232");
		return new startPage_girl(driver);
	}
}
