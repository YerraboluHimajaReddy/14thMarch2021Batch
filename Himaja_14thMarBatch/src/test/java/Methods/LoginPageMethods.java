package Methods;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;

public class LoginPageMethods {

	WebDriver driver;

	LoginPage lp = new LoginPage(driver);

	public LoginPageMethods(WebDriver driver) {

		this.driver = driver;
	}

	public void enterUsername() {

		driver.findElement(lp.username_Textbox).sendKeys("Admin");
	}

	public void enterPassword() {

		driver.findElement(lp.password_Textbox).sendKeys("admin123");
	}

	public void clickLogin() {

		driver.findElement(lp.login_Button).click();
	}
	
	public void clickForgotPassword() {

		driver.findElement(lp.forgotPassword_link).click();
	}
}
