package pageObjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusableComponents.Base;
import uistore.Styling;
 

public class Stylingpg extends Base {
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
		
		Styling st = new Styling(driver);
		driver.manage().window().maximize();
		st.getstyle().click();
		st.gettext().getText();
		if(driver.getPageSource().contains("FACIAL HAIR STYLES"))
		{
			System.out.println("FACIAL HAIR STYLES");
		}
		else
		{
			System.out.println("FACIAL HAIR STYLES is not present");
		}
	}
	
	
	  @AfterTest public void close() {
	  
	  driver.quit(); 
	  driver=null;
	  
	  }
}
