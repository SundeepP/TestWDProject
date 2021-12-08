package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.AmazonLandingPage;
import resources.BrowserBaseFile;

@RunWith(Cucumber.class)
public class StepDefinitions extends BrowserBaseFile{
	
	
    @Given("^user naviagates to amazon \"([^\"]*)\"$")
    public void user_naviagates_to_amazon_something(String url) throws Throwable {
    	
    	System.setProperty("webdriver.chrome.driver",
				"/Users/sundeeppamulapati/Documents/Professional/Technology/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
        
    }

    @When("^user search for \"([^\"]*)\"$")
    public void user_search_for_something(String searchItem) throws Throwable {
    	
    	AmazonLandingPage ap = new AmazonLandingPage(driver);
    	ap.getSearchBar().sendKeys(searchItem);
    	ap.getSearchIcon().click();
    }
    
    @And("^Select all \"([^\"]*)\" with \"([^\"]*)\" star rating$")
    public void select_all_something_with_something_star_rating(String strArg1, String strArg2) throws Throwable {
        
    	
    }

    @When("^proceeds to check out$")
    public void proceeds_to_check_out() throws Throwable {
        
    }

    @Then("^Verify user gets navigated to SignIn page $")
    public void verify_user_gets_navigated_to_signin_page() throws Throwable {
       
    }
    @And("^Select \"([^\"]*)\" with the lowest price$")
    public void select_something_with_the_lowest_price(String strArg1) throws Throwable {
        
    }

    @And("^add to trolly$")
    public void add_to_trolly() throws Throwable {
        
    }

    @And("^verify the product price$")
    public void verify_the_product_price() throws Throwable {
       
    }

}
