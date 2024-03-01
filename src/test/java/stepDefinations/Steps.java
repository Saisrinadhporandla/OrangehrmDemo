package stepDefinations;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import pageObjects.HolidaysList;
import pageObjects.LeavePage;
import pageObjects.LoginPage;
import utilities.TestUtil;

import java.time.Duration;
import java.util.logging.Logger;

public class Steps extends TestBase
{	

	HolidaysList holidaysList;
	LeavePage leavePage;

	
	@Before
	public void setUp()
	{
		logger = Logger.getLogger("untitled");

		driver = utilities.BrowserFactory.checkBrowser(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	
	@Given("User logs in to Client home page with valid credentials using {string} and {string}")
	public void user_enters_username_as_and_password_as(String username, String pwd) 
	{
		loginPage = new LoginPage(driver);
		logger.info("User lanuchs chrome browser");
		loginPage.loginWithCred(username,pwd);
		logger.info("Login successfull");
	}

	@Then("User navigates to {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		leavePage=new LeavePage(driver);
		Thread.sleep(2000);
		leavePage.leavePageBtn.click();
		TestUtil.waitForVisibilityofElement(driver,10,leavePage.Configure);
		leavePage.Configure.click();
		TestUtil.waitForVisibilityofElement(driver,10,leavePage.HolidaysPage);
		leavePage.HolidaysPage.click();
	}
	@Then("user verifies given date of holiday")
	public void userVerifiesGivenDateOfHoliday() throws InterruptedException {
		holidaysList=new HolidaysList(driver);
		TestUtil.waitForVisibilityofElement(driver,20,holidaysList.container);
		holidaysList.verifyDate();

	}
	@After
	public void Quit(){
		driver.quit();
	}
}
