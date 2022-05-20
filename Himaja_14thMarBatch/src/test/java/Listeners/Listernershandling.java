package Listeners;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Listernershandling extends EventCapture {
	
    public WebDriver driver;
    
	@BeforeSuite
	public void launchBrowser() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\Mar14thBatch\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("https://testautomationpractice.blogspot.com/");
		

	}
	@Test(priority =1 )
	public void verifyTitle() throws IOException {
		
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		
		beforeAlertAccept(driver);
		
		driver.switchTo().alert().accept();
		
		afterAlertAccept(driver);
	}

	@AfterSuite
	public void logout() {

		driver.quit();
	}

}
