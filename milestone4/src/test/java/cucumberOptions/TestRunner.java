package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/features"},
		glue={"D:\\Selenium\\Selenium-Programs\\milestone4\\src\\test\\java\\stepDefination"}
		)

public class TestRunner {

}
