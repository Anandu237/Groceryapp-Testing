package groceryTestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import constant.Constant;
import elementRepository.LoginPage;
import elementRepository.ManageLocationPage;


public class ManageLocationPageTestCases extends BaseClass {
	@Test
	public void verifyBackgroundColorOfResetButton() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		ManageLocationPage mp = new ManageLocationPage(driver);
		mp.clickManageOrders();
		String actual = mp.verifyBackGroundColorOfReset();
		String expected = "#ffc107";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected, Constant.errorMessage);
		s.assertAll();

	}
}
