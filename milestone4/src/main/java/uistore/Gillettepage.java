package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gillettepage {
public WebDriver driver;
	
	By search = By.xpath("//*[@id=\'searchIconId\']");
	
	By text = By.xpath("//*[@id=\'search-box-input\']");
	
	public Gillettepage(WebDriver driver) {

		this.driver = driver;
	}
	
	public WebElement getsearch() {

		return driver.findElement(search);
	}
	public WebElement gettext() {

		return driver.findElement(text);
	}

}
