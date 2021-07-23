package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	
	
	private static WebDriver driver;
	
	private Driver() {};
	
	
	public static WebDriver getDriver() {
		if(driver == null) {
			
			switch(ConfigReader.getProperty("browser")) {
			case "GoogleChrome":
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			}
		}
		
		return driver;
	}
	
	
	
	public static void quit() {
		if(driver !=null) {
			driver.quit();
			driver=null;
		}
	}
	
}


