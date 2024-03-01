package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {

    WebDriver driver;

    public LeavePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='Leave']")
    public WebElement  leavePageBtn;

    @FindBy(xpath = "//span[normalize-space()='Configure']")
    public WebElement Configure;

    @FindBy(xpath ="//a[text()='Holidays']")
    public WebElement HolidaysPage;

}
