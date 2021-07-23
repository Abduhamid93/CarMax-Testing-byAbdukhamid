package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SearchBoxPage {
	
	public SearchBoxPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "header-inventory-search")
	public WebElement searchBox; 
	
	

}
