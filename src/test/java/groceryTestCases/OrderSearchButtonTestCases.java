package groceryTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.LoginPage;
import elementRepository.ManageOrdersPage;


public class OrderSearchButtonTestCases extends BaseClass {

	@Test(retryAnalyzer =listener.Retry.class)
	public void verifyTextOfManageOrderSearchButton() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		ManageOrdersPage mp = new ManageOrdersPage(driver);
		mp.clickManageOrders();
		String actual = mp.getTextOfSearchButtonOfManageOrders();
		String expected = "Search";
		Assert.assertEquals(actual, expected, Constant.errorMessage);

	}
}
