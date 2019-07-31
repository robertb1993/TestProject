package StepDef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModel.Guru99BankLogin;
import Utility.Browserintializer;

public class Guru99Bank extends Browserintializer {
	WebDriver driver = null;
	Properties prop;
	FileInputStream fis;
	String src = "C:\\Users\\robert\\eclipse-workspace\\Guru99Bank\\src\\test\\java\\Utility\\DataDriven.properties";

	@Test
	public void GuruBank() throws IOException {
    prop = new Properties ();
    fis = new FileInputStream (src);
    prop.load(fis);
    driver= intializDriver();
    String url = prop.getProperty("url");
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    driver.manage().window().maximize();
    
    
    Guru99BankLogin a = PageFactory.initElements(driver,  Guru99BankLogin.class);
    a.UserID().sendKeys(prop.getProperty("userID"));
    a.Password().sendKeys(prop.getProperty("password"));
    a.LoginButton().click();
    
    System.out.println();
	}

}
