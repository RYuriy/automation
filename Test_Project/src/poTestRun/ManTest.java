package poTestRun;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.UserPage_man;
import pageObjects.regForm_man;

import pageObjects.startPage_man;

public class ManTest extends AbstractWebDriver {

	@Test
	public void femaleReg() {
		startPage_man OnStartPage = new startPage_man(driver);
		OnStartPage.navigateToWebApp();
		regForm_man OnRegForm = OnStartPage.clickOnSubmit();
		UserPage_man OnUserPage = OnRegForm.fillFormWithData().submitForm();
		
		Assert.assertTrue(OnUserPage.getConformation().contains(property.CheckValue_m));
		// Делаем проверку на имя указанное при регистрации для страницы пользователя
	}

}
