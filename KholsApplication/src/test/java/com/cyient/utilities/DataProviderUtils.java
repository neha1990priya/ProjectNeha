package com.cyient.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
	
	@DataProvider
	public Object[][] checkCartExcel()throws IOException {
		Object [][] main = ExcelUtils.getsheetIntoObjectArray("src/test/resources/testdata/TestData.xlsx","CheckCartExcel");
	return main;
	}
	@DataProvider
	public Object[][] searchProductExcel()throws IOException {
		Object [][] main = ExcelUtils.getsheetIntoObjectArray("src/test/resources/testdata/TestData.xlsx","SearchProductExcel");
	return main;
	}
}
