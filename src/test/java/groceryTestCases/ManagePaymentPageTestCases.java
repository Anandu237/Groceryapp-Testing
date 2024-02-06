package groceryTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.LoginPage;
import elementRepository.ManagePaymentPage;


public class ManagePaymentPageTestCases extends BaseClass {
	@Test
	public void navigateToManagePaymentMethodsPage() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		ManagePaymentPage mpp = new ManagePaymentPage(driver);
		mpp.clickManagePaymentMethods();
		String actual = mpp.getHeadingOfManagePaymentMethodsPage();
		String expected = "Manage Payment Methods";
		Assert.assertEquals(actual, expected, Constant.errorMessage);
	}

	@Test

	public void verifyStatusOfDebitCardIsActive() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		ManagePaymentPage mpp = new ManagePaymentPage(driver);
		mpp.clickManagePaymentMethods();
		mpp.VerifyDebitCardStatusIsActive();
		Boolean actual = mpp.VerifyDebitCardStatusIsActive();
		Boolean expected = true;
		Assert.assertEquals(actual, expected, Constant.errorMessage);
	}
}
