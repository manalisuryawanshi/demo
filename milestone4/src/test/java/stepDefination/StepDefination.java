package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusableComponents.Base;
import uistore.Gillettepage;

@RunWith(Cucumber.class)
public class StepDefination extends Base {

	@Given("^Browser initialized$")
	public void browser_initialized() throws Throwable {
		 driver =initializeDriver();
	}

	@And("^Navigate to \"([^\"]*)\" site and click on search$")
	public void navigate_to_something_site_and_click_on_search(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@When("^user search for (.+)$")
	public void user_search_for(String item) throws Throwable {
		Gillettepage gp = new Gillettepage(driver);
		gp.gettext().sendKeys(item);
	}

	@Then("^System seaches for item$")
	public void system_seaches_for_item() throws Throwable {
		 
	}

}