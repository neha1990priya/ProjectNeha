package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KholsLoginPage {
	//input[@id='search']
	private By searchLocator = By.id("search");
	private By clickSearchLocator = By.xpath("//input[@name='submit-search']");
	private By sortPrice = By.xpath("//div[@class='sortBy_block fl']//div[@class='sbHolder']//a[@class='sbSelector']");
	private By price = By.xpath("//a[@href='#Price High-Low']");
	private By firstItem = By.xpath("//div[@class='prod_nameBlock']//p[@rel='/product/prd-3814050/mens-billy-london-slim-fit-tuxedo-jacket.jsp?color=Black Houndstooth&prdPV=1']");
	private By size = By.xpath("//a[text()='Please Choose a Size']");
	private By sizeNumber = By.xpath("//a[@rel='40S 33']");
	private By add = By.xpath("//div[@data-qttyoptn='increase']//p");
	private By addToCart = By.xpath("//input[@title='Add To Cart']");
	private By total = By.xpath("//span[@class='subtotal']");
	private By shoppingCart = By.xpath("//a[@title='View Shopping Cart']//i");
	private By checkOut = By.id("button_checkout_sb_top");
	
	//private By firstName = By.xpath("//input[@class='sign-in-form-input sign-in-first-name text-input-name required']");
	//private By lastName = By.xpath("//input[@class='sign-in-form-input sign-in-last-name text-input-name required']");
	private By title = By.xpath("//a[@title='Account']");
	private By signIn= By.xpath("//div[@class='account-signin']");
	private By emailid = By.id("kiosk_loginEmail");
	private By pass = By.id("kiosk_loginPassword");
	private By profilelogin = By.id("Profilelogin");
	private By captcha = By.xpath("//a[normalize-space()='Please validate captcha']");
	
	
	private WebDriver driver; 
	
	public KholsLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void search(String Search) {
		driver.findElement(searchLocator).sendKeys(Search);

   }
	public void clickOnSearch() {
		driver.findElement(clickSearchLocator).click();
		
	}
	public void sortPrice() {
		driver.findElement(sortPrice).click();
	}
	
	public void price() {
		driver.findElement(price).click();
	}
	
	public void firstItem() {
		driver.findElement(firstItem).click();
	}
	public void size() {
		driver.findElement(size).click();
	}
	public void sizeNumber() {
		driver.findElement(sizeNumber).click();
	}
	public void add() {
		driver.findElement(add).click();
	}
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
	public void total() {
		driver.findElement(total).click();
	}
	public void shoppingCart() {
		driver.findElement(shoppingCart).click();
	}
	public void checkOut() {
		driver.findElement(checkOut).click();
	}
	public void title() {
		driver.findElement(title).click();
	}
	public void signIn() {
		driver.findElement(signIn).click();
	}
	public void emailid(String id) {
		driver.findElement(emailid).sendKeys(id);
	}
	public void pass(String password) {
		driver.findElement(pass).sendKeys(password);
	}
    public void profilelogin() {
    	driver.findElement(profilelogin);
    }
    public String getErrorMessage()
	{
		return driver.findElement(captcha).getText().trim();
	}
}

