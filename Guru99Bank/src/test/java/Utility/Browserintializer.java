package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.IIOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserintializer {
	public WebDriver driver;
	
	public WebDriver intializDriver () throws IOException {
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream ("C:\\Users\\robert\\eclipse-workspace\\Guru99Bank\\src\\test\\java\\Utility\\DataDriven.properties");
		prop.load(fis);
		
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\robert\\Documents\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver ();
		}
		else if (BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (BrowserName.equalsIgnoreCase("IE")) {
			
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

}
