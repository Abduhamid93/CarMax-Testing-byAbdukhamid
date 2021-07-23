package generalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SearchBoxPage;

public class SearchBox extends TestBase {
	
	
	
	
	@Test (groups = "smokeTest")
	public void carmaxSearchParticularBrand1() {
		
		
		
		logger = reporter.createTest("verify carmaxSearchBoxBrand1");
		

		logger.info("Searching a particular brand1");
		SearchBoxPage sb = new SearchBoxPage();
		sb.searchBox.sendKeys("Honda Accord" + Keys.ENTER);
		
		
		logger.pass("Verified a particular brand1");
		
		
	}
	
	
	@Test (groups = "smokeTest")
	public void carmaxSearchParticularBrand2() {
		
		
		
		logger = reporter.createTest("verify carmaxSearchBoxBrand2");
		

		logger.info("Searching a particular brand2");
		SearchBoxPage sb = new SearchBoxPage();
		sb.searchBox.sendKeys("Hyundai Sonata" + Keys.ENTER);
		
		
		logger.pass("Verified a particular brand2");
		
		
	}
	
	
	
	@Test (groups = "smokeTest")
	public void carmaxSearchParticularBrand3() {
		
		
		
		logger = reporter.createTest("verify carmaxSearchBoxBrand3");
		

		logger.info("Searching a particular brand3");
		SearchBoxPage sb = new SearchBoxPage();
		sb.searchBox.sendKeys("Toyota Camry" + Keys.ENTER);
		
		
		logger.pass("Verified a particular brand3");
		
		
	}
	
	

}
