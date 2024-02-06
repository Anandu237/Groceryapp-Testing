package groceryTestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@Test

	@DataProvider(name = "verifyInvalidLoginCredentials")
	public Object[][] userCredentialsData() {
		return new Object[][] { { "admin", "1234" }, { "admin", "3456" } };
	}
}