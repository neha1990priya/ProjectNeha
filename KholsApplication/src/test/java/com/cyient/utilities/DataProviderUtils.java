package com.cyient.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
	
	@DataProvider
	public Object[][] errorMsgTest()throws IOException {
		Object [][] main = ExcelUtils.getsheetIntoObjectArray("src/test/resources/testdata/TestData.xlsx","errorMsgTest");
	return main;
	}
	@DataProvider
	public Object[][] validCredentialExcelData()throws IOException {
		Object [][] main = ExcelUtils.getsheetIntoObjectArray("src/test/resources/testdata/TestData.xlsx","ValidCredentialTest");
	return main;
	}
}
