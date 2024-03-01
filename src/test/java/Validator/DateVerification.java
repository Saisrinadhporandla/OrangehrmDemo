package Validator;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HolidaysList;

public class DateVerification {


    HolidaysList holidaysList;
    String newYear;
    String PatrickDay;
    String GeorgeDay;
    String VictoriaDay;
    String juneDay;
    String newYearDate;
    String PatrickDayDate;
    String GeorgeDayDate;
    String VictoriaDayDate;
    String juneDayDate;

    public void holidayName(){
        newYear= holidaysList.newYear.getText();
         PatrickDay=  holidaysList.PatrickDay.getText();
         GeorgeDay=   holidaysList.GeorgeDay.getText();
         VictoriaDay=  holidaysList.VictoriaDay.getText();
         juneDay=  holidaysList.juneDay.getText();
    }
    public void holidayDate(){
         newYearDate= holidaysList.newYearDate.getText();
         PatrickDayDate=  holidaysList.PatrickDayDate.getText();
         GeorgeDayDate=   holidaysList.GeorgeDayDate.getText();
         VictoriaDayDate=  holidaysList.VictoriaDayDate.getText();
         juneDayDate=  holidaysList.juneDayDate.getText();
    }
    public void verifyDate() throws InterruptedException {
        Thread.sleep(2000);
        holidayName();
        holidayDate();
        Assert.assertTrue(newYear.equalsIgnoreCase(newYearDate));
        Assert.assertTrue(PatrickDay.equalsIgnoreCase(PatrickDayDate));
        Assert.assertTrue(GeorgeDay.equalsIgnoreCase(GeorgeDayDate));
        Assert.assertTrue(VictoriaDay.equalsIgnoreCase(VictoriaDayDate));
        Assert.assertTrue(juneDay.equalsIgnoreCase(juneDayDate));
    }

}
