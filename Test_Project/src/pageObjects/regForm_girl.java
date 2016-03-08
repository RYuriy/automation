package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class regForm_girl extends AbstractPage_girl {
	
	public regForm_girl(WebDriver driver) {
		super(driver);
		
	}
	public regForm_girl fillFormWithData() {
		
		driver.findElement(By.name(property.NameField)).sendKeys(property.fNameValue);
		driver.findElement(By.name(property.EmailField)).sendKeys(property.fEmailValue);
		
		Select dropdown = new Select(driver.findElement(By.name("gender")));
		dropdown.selectByValue("f");
		
		Select dropdownAge = new Select(driver.findElement(By.name("age")));
		dropdownAge.selectByValue("20");
		return new regForm_girl(driver);
	}
	
	public UserPage_girl submitForm() {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[9]/form/div[4]/button")).click();
		return new UserPage_girl(driver);
	}
}
