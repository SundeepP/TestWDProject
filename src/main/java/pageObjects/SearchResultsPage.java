package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
	
	public WebDriver driver;

	
	By serachBar = By.cssSelector("#twotabsearchtextbox");
	By SerachIcon = By.cssSelector("#nav-search-submit-button");

	//constructor
	public SearchResultsPage(WebDriver driver) {
	
		this.driver = driver;

	}

	public WebElement getSearchBar() {
		return driver.findElement(serachBar);

	}

	public WebElement getSearchIcon() {
		return driver.findElement(SerachIcon);

	}
	
	public void addItemsToCart() {
		
		List<WebElement> searchList = 
		driver.findElements(By.cssSelector("//span[contains(text(),'Apple iPhone 13 Pro Max')]"));

		searchList.get(0).click();

		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			
			
		}
	

}
