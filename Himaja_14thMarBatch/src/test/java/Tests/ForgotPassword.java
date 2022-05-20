package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.ForgotPasswordPageMethods;
import Methods.LoginPageMethods;

public class ForgotPassword {

	WebDriver driver;

	LoginPageMethods lpm;

	ForgotPasswordPageMethods fpm;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\Mar14thBatch\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		lpm = new LoginPageMethods(driver);

		fpm = new ForgotPasswordPageMethods(driver);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		System.out.println(driver.getTitle());
	}

	@Test(priority = 1)
	public void clickForgotPassword() {

		lpm.clickForgotPassword();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

	}

	@Test(priority = 2)
	public void enterOrangeHRMUsername() {

		fpm.enterOrangeHRMUsername("Admin");

		fpm.clickResetPassword();

		/*String expectedValue = "Instructions for resetting your password have been sent to paul1@osohrm.com";

		String actualValue = driver.findElement(By.xpath(
				"//p[contains(text(),'Instructions for resetting your password have been sent to paul1@osohrm.com')]"))
				.getText();

		Assert.assertEquals(actualValue, expectedValue, "Both strings are not equal");
	*/
	}

	/*@Test(priority = 2)
	public void cancel() {

		fpm.enterOrangeHRMUsername("Admin");

		fpm.clickCancel();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

	}*/

	@AfterSuite
	public void logout() {

		driver.quit();
	}

}
