package generalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Warranty extends TestBase {
	
	
	@Test (groups = "regressionTest")
	public void carmaxWarranty() {
		
		
		logger = reporter.createTest("verify carmaxWarrantyPage");
		
		
		logger.info("Warranty Page check");
		driver.findElement(By.xpath("//span[.='More']")).click();
		driver.findElement(By.xpath("//a[@href='/car-buying-process/maxcare-service-plans']")).click();
		
		
		logger.pass("Verified the Warranty page");
			
	}

}
