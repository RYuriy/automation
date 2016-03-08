package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class startPage_girl extends AbstractPage_man {
	
	public startPage_girl(WebDriver driver) {
		super(driver);
		
	}
	public regForm_girl clickOnSubmit() {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return new regForm_girl(driver);
	}
}
