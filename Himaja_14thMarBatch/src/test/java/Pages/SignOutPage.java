package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignOutPage {

	WebDriver driver;

	public SignOutPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "aboutDisplayLink")

	public WebElement about_Link;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Support')]")

	public WebElement support_Link;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout')]")

	public WebElement Logout_Link;

	public void clickAbout() {

		about_Link.click();
	}

	public void clickSupport() {

		support_Link.click();
	}

	public void clickLogout() {

		Logout_Link.click();
	}
}
