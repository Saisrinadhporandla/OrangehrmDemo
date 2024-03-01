package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class TestUtil {



	public static void waitForVisibilityofElement(WebDriver driver, int waitTime, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public static void JSClick(WebDriver driver, WebElement ele) {
		TestUtil.waitForVisibilityofElement(driver, 10, ele);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", ele);

	}

}
