package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ShoppingPage {
	
	public ShoppingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "header-mobile-drawer-focus-start")
	public WebElement shoppingButton;
	
	@FindBy (id = "header-inventory-search")
	public WebElement shoppingPageSearchBar; 
	
	@FindBy (id = "shop-by-type__slides-item0")
	public WebElement ShoppingPageShopByTypeButton; 
	
	@FindBy (xpath = "//*[@id=\"shop-by-price\"]/div[1]/div[1]/div[2]")
	public WebElement ShoppingPageShopByPriceButton;
	
	
	

}
