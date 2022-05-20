package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGExamplek {
	
	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\Mar14thBatch\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void waitSometime() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void login() {

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 2)
	public void enterUsername() {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

	}

	@Test(priority = 3)
	public void enterPassword() {

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

	}

	@AfterMethod
	public void waitSometime1() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("btnLogin")).click();

	}

	@AfterSuite
	public void logout() {

		driver.quit();
	}
}



