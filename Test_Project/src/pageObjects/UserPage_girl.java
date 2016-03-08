package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage_girl extends AbstractPage_girl {

	public UserPage_girl(WebDriver driver) {
		super(driver);
		
	}
	
	public String getConformation() {
		return driver.findElement(By.className("prof-name")).getText();
		// Возвращаем имя указанное при регистрации
		
	}

}
