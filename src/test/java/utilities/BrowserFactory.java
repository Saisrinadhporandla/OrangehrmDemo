package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory 
{
	public static WebDriver checkBrowser(WebDriver driver)
	{

			System.setProperty("webdriver.chrome.driver","C:\\Users\\saisrinadh.porandla\\Framework\\CucumberFramework\\src\\test\\resources\\chromedriver.exe");

			driver = new ChromeDriver();

		
		return driver;
		
		
	}
	
	
	
}
