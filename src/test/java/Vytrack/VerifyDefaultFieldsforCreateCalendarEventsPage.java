package Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.SeleniumUtils;
import utilities.VytrackUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VerifyDefaultFieldsforCreateCalendarEventsPage {

    public static void main(String[] args) {

        String createCalendarBtnLocatorCss = "a[title = 'Create Calendar event']";
        String ownerFieldXpath = "//span[@class='select2-chosen']";


        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MMM d, yyy"));
        String currentTime = LocalTime.now().minusHours(2).format(DateTimeFormatter.ofPattern("h:mm a"));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");


        VytrackUtils.login(driver,"storemanager85", "UserUser123");

        VytrackUtils.navigateToModule(driver, "Activities", "Calendar Events");

        driver.findElement(By.cssSelector(createCalendarBtnLocatorCss)).click();

        String usernameCurrent =  driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).getText();

        SeleniumUtils.pause(2);

        String ownerFieldDefault = driver.findElement(By.xpath("//span[@class='select2-chosen']")).getText();

        if(ownerFieldDefault.contains(usernameCurrent)){
            System.out.println("Owner name field Passed");
        }else{
            System.out.println("Owner name field Failed");
        }

        SeleniumUtils.pause(2);
         String defaultTitleField = driver.findElement(By.xpath("(//div[@class='controls']/input)[1]")).getText();

            if(defaultTitleField.isEmpty()){
                System.out.println("Title passed");
            }else{
                System.out.println("Title failed");
            }

        SeleniumUtils.pause(2);
         String defaultStartDateField = driver.findElement(By.xpath("//input[@class='input-small datepicker-input start hasDatepicker']")).getAttribute("value");
        System.out.println(defaultStartDateField);
         if(defaultStartDateField.equals(currentDate)){
             System.out.println("Start date field passed");
         }else{
             System.out.println("Start date field failed");
         }

        SeleniumUtils.pause(2);
         String defaultStartTimeField = driver.findElement(By.xpath("(//input[@placeholder='time'])[1]")).getAttribute("value");

        System.out.println(defaultStartTimeField);

         if(defaultStartTimeField.equals(currentTime)){
             System.out.println("Start time passed");
         }else{
             System.out.println("Start time failed");
         }
    }
}
