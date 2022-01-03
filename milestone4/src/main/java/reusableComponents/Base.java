package reusableComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public Properties pro;
	public WebDriver initilizeDriver() throws IOException {
		
		pro=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\SyedRafi\\eclipse-workspace\\E2E_Project\\src\\main\\java\\resources\\data.properties");
		pro.load(fis);
		String browserName=pro.getProperty("browser");
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium-Programs\\milestone4\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-Programs\\milestone4\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver", "D:\\Selenium\\Selenium-Programs\\milestone4\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void getScreenshot(String result) throws IOException
	{
		java.io.File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Selenium\\Cucumber\\E2EProject\\ScreenShots//"+result+"screenshot.png"));
		
	}
}
