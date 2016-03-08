import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PageCapture {
	
	WebDriver driver;
	
	public PageCapture(WebDriver driver) {
		this.driver = driver;
	}
	
	public void takeScreenShot(String screenShotName) throws IOException {
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("c:\\test_screens\\" + screenShotName + ".png"));
		// Функционал не успел добавить к тесту. Можно использовать как доп.инфо в виде скриншотов после тестов
	}
}
