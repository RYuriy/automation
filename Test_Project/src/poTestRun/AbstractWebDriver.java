package poTestRun;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.PropertyManager;

public class AbstractWebDriver {
	
	protected WebDriver driver;
	protected PropertyManager property;
	
	@Before
	public void setUp() {
		property = new PropertyManager();
		property.generateProperty();
		driver = new FirefoxDriver();

	}
	
	@After
	public void testOff() {
		driver.close();
	}
	
}
