package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99BankLogin {
     WebDriver driver= null;
	
	public Guru99BankLogin (WebDriver passWebDriver) {
		this.driver = passWebDriver ;
	}

	@FindBy (xpath="//input[@name='uid']")
	WebElement UserID;
	
	@ FindBy (xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy (xpath = "//input[@name='btnLogin']")
	WebElement LoginButton;
	
	public WebDriver getDriver () {
		return driver;
	}
	public WebElement UserID () {
		return UserID;
	}
	public WebElement Password () {
		return Password;
	}
	public WebElement LoginButton () {
		return LoginButton ;
	}
	
}
