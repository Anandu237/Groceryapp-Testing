
package groceryTestCases;

import org.testng.annotations.BeforeMethod;

import utilities.ScreenShotCapture;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public static Properties properties;

	WebDriver driver;

	public static void readFromProperties() throws IOException {

		properties = new Properties();

		// must change the filepath as per your folder path,as it cud be different for

		// diff systems

		// change happens as we clone another person's code from git

		FileInputStream ip = new FileInputStream(

				System.getProperty("user.dir") + "//src//main//resources//config.properties");

		properties.load(ip);

	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws IOException {
		// driver = new ChromeDriver();
		// driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver = new ChromeDriver();

		readFromProperties();

		driver.get(properties.getProperty("BaseUrl"));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult itestResult) throws IOException {

		if (itestResult.getStatus() == ITestResult.FAILURE) {

			ScreenShotCapture sc = new ScreenShotCapture();

			sc.captureFailureScreenShot(driver, itestResult.getName());

		}

		driver.close();

	}

}
