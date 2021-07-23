package generalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn extends TestBase {
	
	
	@Test (groups = "regressionTest")
	public void carmaxSignIn() {
		
		logger = reporter.createTest("verify carmaxSignIn");
		
		
		logger.info("Checking Sign In Button");
		driver.findElement(By.id("header-my-profile-button")).click();
		driver.findElement(By.linkText("Sign In")).click();
		
		logger.pass("Sign In Button verified");
			
	}
	
	

}
