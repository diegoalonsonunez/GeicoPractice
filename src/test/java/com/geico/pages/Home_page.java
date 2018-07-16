package com.geico.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_page {

	private WebDriver driver;

	public Home_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "zip")
	public WebElement zip;

	@FindBy(id = "submitButton")
	public WebElement start_Quote;
	
	@FindBy(xpath= "//a[@class='login header-right-label']")
	public WebElement outside_Login;
	
	@FindBy(xpath = "//button[@id='manageSubmit']")
	public WebElement inner_Login;

	@FindBy(id = "homepage_manage_select")
	public WebElement home_page_select;

	@FindBy(id="manage_select")
	public WebElement innner_home_manage_select;
	
	@FindBy(id="LOGIN_policyNo")
	public WebElement inner_login_policy;
	
	@FindBy(id="LOGIN_password")
	public WebElement inner_password;
	
	
	
	public void getQuote(String zipCode) {
		zip.sendKeys(zipCode);
		start_Quote.click();
	}
	
	public void inner_logIn_Function(String policy_type,String username, String password) {
		
		outside_Login.click();
		Select dropdown =new Select(innner_home_manage_select);
		dropdown.selectByVisibleText(policy_type);
		inner_login_policy.sendKeys(username);
		inner_password.sendKeys(password);
		inner_Login.click();
	}
	
	
	
	
	
	
	
	

}
