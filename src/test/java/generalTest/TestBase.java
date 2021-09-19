package generalTest;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.BrowserUtilities;
import utilities.ConfigReader;
import utilities.Driver;




public abstract class TestBase {
	
	
	//Write how to push, update, pull through git request
	/*cd "path of project"
	 * git init
	 * git add . 
	 * git commit -m "First Commit"
	 * git remote add origin "url"
	 * git push -u origin master
	 * 
	 */
	
	protected WebDriver driver;
	protected Actions actions;

	protected static ExtentReports reporter;
	protected static ExtentSparkReporter htmlReporter;
	protected static ExtentTest logger;
	
	
	@BeforeSuite(alwaysRun = true)
	public void setUpSuite() {
	 reporter = new ExtentReports();
	 String path = System.getProperty("user.dir")+"/test-output/ExtentReports/report.html";
	 
	 htmlReporter = new ExtentSparkReporter(path);
	 htmlReporter.config().setReportName("Carmax Automation Test Reports");
	 
	 reporter.attachReporter(htmlReporter);
	 
	 reporter.setSystemInfo("Tester", "Abdukhamid A");
	 reporter.setSystemInfo("ENV", "Staging/Pre-Production");
	 reporter.setSystemInfo("OS", System.getProperty("os.name"));
	 reporter.setSystemInfo("browser", ConfigReader.getProperty("browser"));
	  
	 
	 
	}
	
	
	
	@BeforeMethod (alwaysRun = true)
	public void setUpMethod() {
		

		driver = Driver.getDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(ConfigReader.getProperty("url"));
		
		driver.manage().window().maximize();
	}
	
	
	
	@AfterMethod (alwaysRun = true)
	public void tearDownMethod(ITestResult testResult) throws IOException {
		
		
		if (testResult.isSuccess()) {
			logger.pass("PASSED: " + testResult.getName());
		} else if(testResult.getStatus() == ITestResult.SKIP) {
			logger.skip("SKIPPED: " + testResult.getName());
			logger.skip(testResult.getThrowable());
		} else if(testResult.getStatus() == ITestResult.FAILURE) {			
			logger.fail("FAILED: " + testResult.getName());
			logger.fail(testResult.getThrowable());

			String path = BrowserUtilities.getScreenshot(testResult.getName());
			logger.addScreenCaptureFromPath(path);
		}

		
		
		Driver.quit();
	}
	
	
	
	
	@AfterSuite (alwaysRun = true)
	public void tearDownSuite() {
		reporter.flush();
	}
	
	
	
	
	
	
	
	

}
