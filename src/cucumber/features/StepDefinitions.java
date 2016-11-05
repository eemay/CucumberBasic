package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	WebDriver driver = null;
	
	@Given("^I am at YouTube webpage$")
	public void i_am_at_YouTube_webpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "/Users/Eemay/Desktop/SoftwareProjects/geckodriver");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.youtube.com/");
	}

	@When("^I input search item$")
	public void i_input_search_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("search_query")).sendKeys("Cucumber");
	}
	
	@And("^click on \"(.*?)\" button$")
	public void click_on_button(String btn) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id(btn)).click();
	}

	@Then("^I validate the \"(.*?)\" page is correct$")
	public void i_validate_the_page_is_correct(String pgTitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals(pgTitle + " - Youtube"), "Not on cucumber page");
		driver.quit();
	}
	
}
