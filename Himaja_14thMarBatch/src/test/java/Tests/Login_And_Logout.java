package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.ForgotPasswordPageMethods;
import Methods.LoginPageMethods;
import Pages.Homepage;
import Pages.SignOutPage;

public class Login_And_Logout {

	WebDriver driver;

	LoginPageMethods lpm;

	SignOutPage sp;

	Homepage hp;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\Mar14thBatch\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		lpm = new LoginPageMethods(driver);

		sp =PageFactory.initElements(driver, SignOutPage.class);
		
		hp =PageFactory.initElements(driver, Homepage.class);


		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		System.out.println(driver.getTitle());
	}


	@Test(priority = 1)
	public void enterCredentials() {
		
		lpm.enterUsername();
		lpm.enterPassword();
		lpm.clickLogin();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

	}
	
	@Test(priority = 2)
	public void logoutApplication() {
		
		hp.clickWelcome();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		sp.clickLogout();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
	}

	@AfterSuite
	public void logout() {

		driver.quit();
	}

}
