package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//*[contains(text(),'Welcome') and contains(@id,'welcome')]")

	public WebElement welcomelink;
	
	public void clickWelcome() {
		
		welcomelink.click();
	}
}
