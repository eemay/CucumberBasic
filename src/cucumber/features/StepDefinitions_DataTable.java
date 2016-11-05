package cucumber.features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions_DataTable {

	WebDriver driver = null;
	
	@Given("^I am on the lazada site$")
	public void i_am_on_the_lazada_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "/Users/Eemay/Desktop/SoftwareProjects/geckodriver");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.lazada.com.my/");

	}

	@When("^I navigate to signup$")
	public void i_navigate_to_signup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().frame(driver.findElement(By.id("popup-account-signup-iframe")));

		driver.switchTo().defaultContent();
		
		//WebElement iFrame = driver.findElement(By.tagName("popup-account-signup-iframe"));
		//driver.switchTo().frame(iFrame);
		//switchTo().defaultContent();.

		//driver.switchTo().parentFrame();    // to move back to parent frame
		//driver.switchTo().defaultContent(); // to move back to most parent or main frame
	}

	@When("^I submit the form with valid data$")
	public void i_submit_the_form_with_valid_data(DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformatSion, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		System.out.println(table);
		
		List<List<String>> data = table.raw();
		
		System.out.println(data.get(1).get(1));

		System.out.println(data.get(2).get(1));
		System.out.println(data.get(3).get(1));
		System.out.println(data.get(4).get(1));
		
		//driver.findElement(By.id(id)).click();
	}

	@Then("^I check that the form has been submitted$")
	public void i_check_that_the_form_has_been_submitted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
	
}
