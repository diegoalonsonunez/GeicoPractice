package com.geico.stepDefinitions;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import com.geico.pages.Home_page;
import com.geico.utilities.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	WebDriver driver;

	@BeforeClass
	public static void setUpClass() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(Configuration.getProperty("url"));
	}

	@Test
	public void quoteTest() throws InterruptedException {
		Home_page homepage = new Home_page(driver);
		homepage.getQuote("20176");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	
	@Test
	public void loginTest() throws InterruptedException {
		Home_page homepage = new Home_page(driver);
		homepage.inner_logIn_Function("ATV",Configuration.getProperty("username"), Configuration.getProperty("password"));
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tear_down() {
		driver.close();
	}

	
}
