package generalTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		
		logger.pass("Verified expected Headline");
		
			
	}
	
	
	@Test (groups = "regressionTest")
	public void ShoppingPageSearchBarCheck() {
		
		logger = reporter.createTest("verify ShoppingPageSearchBarCheck");

		logger.info("Shopping Page Search Bar Check");
		
		ShoppingPage shp = new ShoppingPage();
		shp.shoppingButton.click();
		shp.shoppingPageSearchBar.sendKeys("Honda Pilot" + Keys.ENTER);
		
		logger.pass("Verified Search Button");
		
		
	}
	
	
	@Test (groups = "regressionTest")
	public void ShoppingPageShopByType() {
		
		logger = reporter.createTest("verify ShoppingPageShopByType");

		logger.info("Shopping Page Shop By Type Button Check");
		
		
		ShoppingPage shp = new ShoppingPage();
		shp.shoppingButton.click();
		shp.ShoppingPageShopByTypeButton.click();
		
		
		logger.pass("Verified Shopping By Type Button");	
		
		
	}
	
	
	
	
	@Test (groups = "regressionTest")
	public void ShoppingPageShopByPrice() {
		
		logger = reporter.createTest("verify ShoppingPageShopByPrice");

		logger.info("Shopping Page Shop By Price Button Check");
		
		
		ShoppingPage shp = new ShoppingPage();
		shp.shoppingButton.click();
		shp.ShoppingPageShopByPriceButton.click();
		
		
		logger.pass("Verified Shopping By Price Button");
		
			
		
	}
	
	

}
