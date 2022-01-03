package pageObjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusableComponents.Base;
import uistore.Gillettepage;
 

public class Gillettehome extends Base {
public static Logger log = Logger.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initilizeDriver();
		log.info("Driver is initialised");
		driver.get(pro.getProperty("url"));

		log.info("navigation to url");

	}
	
	@Test
	public void navigateToShop() throws InterruptedException {
		
		Gillettepage gp = new Gillettepage(driver);
		driver.manage().window().maximize();
		gp.getsearch().click(); 
		Thread.sleep(5000);
		gp.gettext().sendKeys("Razor"+Keys.ENTER);
		
		if(driver.getPageSource().contains("Results For 'razor'"))
		{
			System.out.println("Results For 'razor'");
		}
		else
		{
			System.out.println("Results For 'razor' is not present");
		}
	}
	
	
	  @AfterTest public void close() {
	  
	  driver.quit(); 
	  driver=null;
	  
	  }
}
