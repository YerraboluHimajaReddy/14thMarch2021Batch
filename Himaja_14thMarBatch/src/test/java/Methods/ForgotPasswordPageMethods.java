package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotPasswordPage;
import Pages.LoginPage;

public class ForgotPasswordPageMethods {

	WebDriver driver;

	ForgotPasswordPage fp = new ForgotPasswordPage(driver);

	public ForgotPasswordPageMethods(WebDriver driver) {

		this.driver = driver;
	}

	public void enterOrangeHRMUsername(String username) {

		driver.findElement(fp.orangeHRMusername_Textbox).sendKeys(username);
	}

	public void clickResetPassword() {

		driver.findElement(fp.resertPassword_Button).click();
	}
	
	public void clickCancel() {

		driver.findElement(fp.cancel_Button).click();
	}
}
