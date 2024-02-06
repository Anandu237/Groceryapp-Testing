package groceryTestCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.LoginPage;
import elementRepository.ManageExpensePage;


public class ManageExpenseTestcases extends BaseClass {
	@Test
	public void verfiyNavigatedtoExpenseCategoryPage() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.signinClick();
		ManageExpensePage mp = new ManageExpensePage(driver);
		mp.clickManageExpense();
		mp.selectExpenseCategory();
		String actual = mp.getHeadingOfExpenseCategoryPage();
		String expected = "Expense Category";
		Assert.assertEquals(actual, expected, Constant.errorMessage);
	}
}
