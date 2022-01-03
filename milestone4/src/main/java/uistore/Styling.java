package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Styling {
public WebDriver driver;
	
	By style = By.xpath("//*[@id=\'footerContent\']/div/div[1]/div[1]/ul/li[2]/a");
	
	By text = By.xpath("//*[@id=\'tabItem_1\']");
	
	public Styling(WebDriver driver) {

		this.driver = driver;
	}
	
	public WebElement getstyle() {

		return driver.findElement(style);
	}
	public WebElement gettext() {

		return driver.findElement(text);
	}

}
