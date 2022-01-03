package pageObjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusableComponents.Base;
import uistore.brands;

public class Product  extends Base{
	public static Logger log=Logger.getLogger(Base.class.getName());

	


	@BeforeTest
	public void init( ) throws IOException {
		driver=initilizeDriver();
		log.info("Driver is initialised");
		driver.get(pro.getProperty("url"));

		System.out.println(pro.getProperty("url"));
		log.info("navigation to url");		
			
		
	}
	
	@Test
	public void learn() throws InterruptedException {
		
		brands b=new brands(driver);
		b.getbrands().click();
		if(driver.getPageSource().contains("“Gillette MACH3 Turb"))
		{
			System.out.println("“Gillette MACH3 Turb'");
		}
		else
		{
			System.out.println("“Gillette MACH3 Turb is not present");
		}
		
		Assert.assertEquals(b.getbrands().getText(), "Gillette MACH3 Turb");
		log.info("Assertion completed");
		
		
		
	}
	@AfterTest
	public void close() {
		
		driver.quit();
		
	}

}
