package poTestRun;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.UserPage_girl;
import pageObjects.regForm_girl;
import pageObjects.startPage_girl;

public class GirlTest extends AbstractWebDriver {

	
	@Test
	public void femaleReg() {
		startPage_girl OnStartPage = new startPage_girl(driver);
		OnStartPage.navigateToWebApp();
		regForm_girl OnRegForm = OnStartPage.clickOnSubmit();
		UserPage_girl OnUserPage = OnRegForm.fillFormWithData().submitForm();
		
		Assert.assertTrue(OnUserPage.getConformation().contains(property.CheckValue_f));
		// Делаем проверку на имя указанное при регистрации для страницы пользователя
	}

}
