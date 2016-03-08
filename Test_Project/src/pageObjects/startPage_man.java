package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class startPage_man extends AbstractPage_man {
	
	public startPage_man(WebDriver driver) {
		super(driver);
		
	}
	public regForm_man clickOnSubmit() {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return new regForm_man(driver);
	}
}
