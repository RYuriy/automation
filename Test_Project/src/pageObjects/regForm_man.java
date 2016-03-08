package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class regForm_man extends AbstractPage_man {
	
	public regForm_man(WebDriver driver) {
		super(driver);
		
	}
	public regForm_man fillFormWithData() {
		
		driver.findElement(By.name(property.NameField)).sendKeys(property.mNameValue);
		driver.findElement(By.name(property.EmailField)).sendKeys(property.mEmailValue);
		
		Select dropdown = new Select(driver.findElement(By.name("gender")));
		dropdown.selectByValue("m");
		
		Select dropdownAge = new Select(driver.findElement(By.name("age")));
		dropdownAge.selectByValue("20");
		return new regForm_man(driver);
	}
	
	public UserPage_man submitForm() {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[9]/form/div[4]/button")).click();
		return new UserPage_man(driver);
	}
}
