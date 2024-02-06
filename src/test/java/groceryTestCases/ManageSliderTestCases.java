package groceryTestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import constant.Constant;
import elementRepository.LoginPage;
import elementRepository.ManageSliderPage;


public class ManageSliderTestCases extends BaseClass {
	@Test

	public void verifyStatusOfFirstElementIsActive() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		ManageSliderPage ms = new ManageSliderPage(driver);
		ms.clickManageSlider();
		Boolean actual = ms.verifyFirstElementStatusIsActive();
		Boolean expected = true;
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected, Constant.errorMessage);
		s.assertAll();

	}

}
