package com.cyient.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.KholsLoginPage;

import com.cyient.utilities.DataProviderUtils;


public class LoginTest extends WebDriverWrapper {
	
	@Test(dataProvider="SearchProductExcel", dataProviderClass= DataProviderUtils.class)
	public void validCredentialTest(String Search)
	{
	KholsLoginPage  login = new KholsLoginPage(driver);
	login.search(Search);
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
	
	@Test(dataProvider="checkCartExcel", dataProviderClass= DataProviderUtils.class)
	
	public void errorMsgTest(String email, String pass, String expectedValue ) throws InterruptedException {
		KholsLoginPage login1 = new KholsLoginPage(driver);
		login1.title();
		login1.signIn();
		Thread.sleep(1500);
		login1.emailid(email);
		login1.pass(pass);
		Thread.sleep(1500);
		login1.profilelogin();
		Thread.sleep(1500);
		login1.profilelogin();
		String actualValue = login1.getErrorMessage();
		Assert.assertEquals(actualValue, expectedValue);
		
	}



	
	}

	
	