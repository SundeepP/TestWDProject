package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLandingPage {

	public WebDriver driver;

	By serachBar = By.cssSelector("#twotabsearchtextbox");
	By SerachIcon = By.cssSelector("#nav-search-submit-button");

	//constructor
	public AmazonLandingPage(WebDriver driver) {
	
		this.driver = driver;

	}

	public WebElement getSearchBar() {
		return driver.findElement(serachBar);
	}

	public WebElement getSearchIcon() {
		return driver.findElement(SerachIcon);

	}

}
