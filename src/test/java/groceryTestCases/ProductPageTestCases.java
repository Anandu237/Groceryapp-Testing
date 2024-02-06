package groceryTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.LoginPage;
import elementRepository.ProductPage;

public class ProductPageTestCases extends BaseClass {

	@Test
	public void verifyNavigatedToProductPage() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		ProductPage pp = new ProductPage(driver);
		pp.clickManageProduct();
		String actual = pp.getTextOfHeadingOfProductPage();
		String expected = "List Products";
		Assert.assertEquals(actual, expected, Constant.errorMessage);

	}

	@Test
	public void verifyElementDeleted() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		ProductPage pp = new ProductPage(driver);
		pp.clickManageProduct();
		pp.clickDeleteOption();
		
		pp.acceptAlert();
		Boolean actual = pp.isAlertMessageDisplayed();
		Boolean expected = true;
		Assert.assertEquals(actual, expected, Constant.errorMessage);

	}
}
