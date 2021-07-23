package generalTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ShoppingPage;

public class ShoppingButton extends TestBase {
	
	
	@Test (groups = "regressionTest")
	public void carmaxShoppinButton() {
		
		
		logger = reporter.createTest("verify carmaxShoppingButton");

		logger.info("Shopping Button check");
		ShoppingPage shp = new ShoppingPage();
		shp.shoppingButton.click();
		
		logger.pass("Verified Shopping Button");
		
		
	
		
	}
	
	
	@Test (groups = "regressionTest")
	public void textConfirm() {
		
		logger = reporter.createTest("verify carmaxShoppingPageHeadline");

		logger.info("Headline check");
		
		ShoppingPage shp = new ShoppingPage();
		shp.shoppingButton.click();
		
		String expectedText = "Then buy online or at a CarMax near you";
		
		WebElement actual = driver.findElement(By.xpath("//*[@id=\"main-content-heading\"]/span[2]"));
		
		assertEquals(expectedText, actual.getText());
		
			
	}

}
