package groceryTestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import constant.Constant;
import elementRepository.LoginPage;

import elementRepository.PushNotificationsPage;
import utilities.FakerUtility;

public class PushNotificationTestCases extends BaseClass {

	@Test(groups = { "critical" })
	public void verifyNavigatedToPushNotificationPage() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		PushNotificationsPage pg = new PushNotificationsPage(driver);
		pg.clickPushNotification();
		String expected = "Push Notifications";
		String actual = pg.getTextOfHeadingOfPushNotificationPage();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected, Constant.errorMessage);
		s.assertAll();

	}

	@Test(groups = { "critical" })
	public void VerifySendButtonText() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		PushNotificationsPage pg = new PushNotificationsPage(driver);
		pg.clickPushNotification();
		String Expected = "Send";
		String actual = pg.getTextOfSendButton();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, Expected, Constant.errorMessage);
		s.assertAll();

	}

	@Test
	public void verifyBackGroundColorOfReset() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		PushNotificationsPage pg = new PushNotificationsPage(driver);
		pg.clickPushNotification();
		String Expected = "rgba(248, 249, 250, 1)";
		String actual = pg.verifyBackGroundColorOfReset();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, Expected, Constant.errorMessage);
		s.assertAll();

	}

	@Test
	public void verifyPushNotificationSend() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		PushNotificationsPage pg = new PushNotificationsPage(driver);
		pg.clickPushNotification();
		pg.enterTitle(FakerUtility.getFakeFirstName());
		pg.enterDescription(FakerUtility.getFakeLastName());
		pg.clickSendButton();
		Boolean actual = pg.isAlertPresent();
		Boolean expected = true;

		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected, Constant.errorMessage);
		s.assertAll();

	}

}
