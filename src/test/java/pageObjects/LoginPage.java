package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestUtil;

public class LoginPage {
    WebDriver pdriver;


    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")

    WebElement password;

    @FindBy(css = "button[type='submit']")
    WebElement logInBtn;



    @FindBy(linkText = "Logout")
    WebElement logOutBtn;


    public LoginPage(WebDriver driver) {
        pdriver = driver;
        PageFactory.initElements(pdriver, this);
    }

    public void sendUsername(String uname) {
        username.clear();
        username.sendKeys(uname);
    }

    public void sendPassword(String pwd) {
        password.clear();
        password.sendKeys(pwd);
    }

    public String getTitleLandingPage() {
        return pdriver.getTitle();
    }

    public void clickLogin() {
        TestUtil.JSClick(pdriver, logInBtn);
    }





    public void loginWithCred(String username1, String pwd) {
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        pdriver.get(url);
        TestUtil.waitForVisibilityofElement(pdriver, 10, username);
        sendUsername(username1);
        sendPassword(pwd);
        TestUtil.waitForVisibilityofElement(pdriver, 10, logInBtn);
        clickLogin();
    }


}
