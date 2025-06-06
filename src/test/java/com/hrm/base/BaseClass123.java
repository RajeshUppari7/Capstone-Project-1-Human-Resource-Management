package com.hrm.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.hrm.scenario2.Pages.AdminPage;
import com.hrm.scenario2.Pages.LoginPage;

public class BaseClass123 {

	public WebDriver driver;
	public LoginPage loginPage;
	public AdminPage adminPage;

	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		PageFactory.initElements(driver, this);
		loginPage = new LoginPage(driver);
		adminPage = new AdminPage(driver);
		loginPage.login();

	}
//	@BeforeTest()
//	public void validLogin() {
//		loginPage.login();
//	}

//	@BeforeMethod
//	public void objects() {
//		loginPage = new LoginPage(driver);
//		adminPage = new AdminPage(driver);
//		loginPage.login();
//	}

//	@AfterClass
//	public void close() {
//		driver.quit();
//	}

}
