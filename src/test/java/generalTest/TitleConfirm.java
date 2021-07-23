package generalTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleConfirm extends TestBase {
	
	
	
	
	
	@Test (priority = 0)
	public void carmaxTitleConfirm() {
		
		
		logger = reporter.createTest("verify carmaxTitle");

		
		assertEquals("CarMax - Browse used cars and new cars online", driver.getTitle());
		
		
	}

}
