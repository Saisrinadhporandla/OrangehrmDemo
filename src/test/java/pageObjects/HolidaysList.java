package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidaysList {
    WebDriver driver;


    public HolidaysList(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[text()=\"New Year's Day\"]/following::div[2]")
   public WebElement newYear;

    @FindBy(xpath = "//div[text()=\"St. Patrick's Day (Canada)\"]/following::div[2]")
    public WebElement PatrickDay;
    @FindBy(xpath = "//div[text()=\"St. George's Day (Canada)\"]/following::div[2]")
    public WebElement GeorgeDay;

    @FindBy(xpath = "//div[contains(text(),'Victoria Day (Canada)')]/following::div[2]")
    public WebElement VictoriaDay;
    @FindBy(xpath = "//div[contains(text(),'June Day (Canada)')]/following::div[2]")
    public WebElement juneDay;
    @FindBy(xpath = "//div[contains(text(),'2024-01-01')]")
    public WebElement newYearDate;

    @FindBy(xpath = "//div[contains(text(),'2024-16-03')]")
    public WebElement PatrickDayDate;
    @FindBy(xpath = "//div[contains(text(),'2024-20-04')]")
    public WebElement GeorgeDayDate;

    @FindBy(xpath = "//div[contains(text(),'2024-18-05')]")
    public WebElement VictoriaDayDate;
    @FindBy(xpath = "//div[contains(text(),'2024-22-06')]")
    public WebElement juneDayDate;
    @FindBy(xpath = "//div[@class='orangehrm-container']")
    public WebElement container;

    String newYear1;
    String PatrickDay1;
    String GeorgeDay1;
    String VictoriaDay1;
    String juneDay1;
    String newYearDate1;
    String PatrickDayDate1;
    String GeorgeDayDate1;
    String VictoriaDayDate1;
    String juneDayDate1;

    public void holidayName(){
        newYear1=newYear.getText();
        PatrickDay1=  PatrickDay.getText();
        GeorgeDay1=   GeorgeDay.getText();
        VictoriaDay1=  VictoriaDay.getText();
        juneDay1=  juneDay.getText();
    }
    public void holidayDate(){
        newYearDate1=newYearDate.getText();
        PatrickDayDate1=PatrickDayDate.getText();
        GeorgeDayDate1=   GeorgeDayDate.getText();
        VictoriaDayDate1=  VictoriaDayDate.getText();
        juneDayDate1= juneDayDate.getText();
    }
    public void verifyDate() throws InterruptedException {
        Thread.sleep(2000);
        holidayName();
        holidayDate();
        System.out.println(PatrickDay1);
        System.out.println(PatrickDayDate1);
        try {
            Assert.assertTrue(newYear1.equalsIgnoreCase(newYearDate1));
            Assert.assertTrue(PatrickDay1.equalsIgnoreCase(PatrickDayDate1));
            Assert.assertTrue(GeorgeDay1.equalsIgnoreCase(GeorgeDayDate1));
            Assert.assertTrue(VictoriaDay1.equalsIgnoreCase(VictoriaDayDate1));
            Assert.assertTrue(juneDay1.equalsIgnoreCase(juneDayDate1));
            System.out.println("All the dates and holidays are verified");
        } catch (Exception e) {
            System.out.println("All the dates and holidays are not verified");
        }

    }
}
