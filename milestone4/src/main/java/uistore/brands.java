package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class brands {
	public WebDriver driver;
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.xpath("//*[@id=\'headerMenu\']/div/nav/div/div[2]/button/span"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	By mybrand=By.xpath("//*[@id=\'headerMenu\']/div/nav/div/div[2]/div/div/div/div/div[1]/div[1]/a[3]");
	public brands(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getbrands() {

		return driver.findElement(mybrand);

	}
 
}
