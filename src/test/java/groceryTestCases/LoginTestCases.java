package groceryTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.HomePage;
import elementRepository.LoginPage;

public class LoginTestCases extends BaseClass {
	@Test
	public void verifyLoginWithValidUser() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		HomePage hp = new HomePage(driver);
		String expected = "Admin";
		String actual = hp.getLoggedInUserName();
		Assert.assertEquals(actual, expected, Constant.errorMessage);

	}

	@Test(dataProvider = "verifyInvalidLoginCredentials",dataProviderClass=DataProviders.class)

	public void verifyLoginWithInvalidCredentials(String data1, String data2) {
		LoginPage lp = new LoginPage(driver);
		lp.enterInvalidUserNameAndPassword(data1, data2);
		lp.signinClick();
		Boolean expected = true;
		Boolean actual = lp.isAlertMessageDisplayed();
		Assert.assertEquals(actual, expected, Constant.errorMessage);

	}
}
