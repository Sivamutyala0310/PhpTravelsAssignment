package com.atmecs.phptravels.tests;
import java.util.Properties;
import org.testng.annotations.Test;
import com.atmecs.phptravels.helpers.LoginPageData;
import com.atmecs.phptravels.pageactions.PageActions;
import com.atmecs.phptravels.testbase.TestBase;
import com.atmecs.phptravels.utils.LogReports;
import com.atmecs.phptravels.utils.TestDataProvider;

public class PhpTravels_signUp extends TestBase {

	LogReports log = new LogReports();
	Properties properties1;
	LoginPageData data = new LoginPageData();

	@Test(dataProvider = "testdata", dataProviderClass = TestDataProvider.class)

	public void signUp(String firstName, String lastName, String mobileNumber, String email, String password,
			String confirmPassword) throws Exception {
		data.getData();
		PageActions.clickElement(driver, data.getclickOnMyAccountXpath());
		log.info("clicking my accunt");
		PageActions.clickElement(driver, data.getSignUpDropDown());
		log.info("selecting sign up");
		PageActions.sendKeys(driver, data.getFirstNameXpath(), firstName);
		log.info("sending first name");
		PageActions.sendKeys(driver, data.getLastNameXpath(), lastName);
		log.info("sending lastname");
		PageActions.sendKeys(driver, data.getMobileNumberXpath(), mobileNumber);
		log.info("sending mobile nbr");
		PageActions.sendKeys(driver, data.getEmailXpath(), email);
		log.info("sending email");
		PageActions.sendKeys(driver, data.getPasswordXpath(), password);
		log.info("sending password");
		PageActions.sendKeys(driver, data.getConfirmPasswordXpath(), confirmPassword);
		log.info("sending confirm password");
		PageActions.clickElement(driver, data.getSignUpXpath());
		log.info("selecting sign in");

	}

}
