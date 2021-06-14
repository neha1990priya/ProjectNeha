package com.cyient.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.KholsLoginPage;
import com.cyient.utilities.DataProviderUtils;


public class LoginTest extends WebDriverWrapper {
	
	@Test(dataProvider ="validCredentialTest", dataProviderClass = DataProviderUtils.class)
	
	public void validCredentialTest()
	{
	KholsLoginPage  login = new KholsLoginPage(driver);
	login.search("tuxedos");
	login.clickOnSearch();
	login.sortPrice();
	login.price();
	login.firstItem();
	login.size();
	login.sizeNumber();
	login.add();
	login.addToCart();
	login.total();
	login.shoppingCart();
	login.checkOut();
	//login.firstName();
	//login.lastName();
	}
	
	@Test(dataProvider ="errorMsgTest", dataProviderClass = DataProviderUtils.class)
	
	public void errorMsgTest(String email, String pass) {
		KholsLoginPage login1 = new KholsLoginPage(driver);
		login1.title();
		login1.signIn();
		login1.emailid(email);
		login1.pass(pass);
		login1.profilelogin();
		
		String actualValue = login1.getErrorMessage();
		Assert.assertEquals(actualValue, "Please validate captcha");
		
	}



	
	}

	
	