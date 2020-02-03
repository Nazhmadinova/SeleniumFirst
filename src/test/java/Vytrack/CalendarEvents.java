package Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.SeleniumUtils;
import utilities.VytrackUtils;

public class CalendarEvents {

    public static void main(String[] args) {

        String createCalendarBtnLocatorCss = "a[title = 'Create Calendar event']";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        VytrackUtils.login(driver, "storemanager85", "UserUser123");

        VytrackUtils.navigateToModule(driver, "Activities", "Calendar Events");


        if(driver.findElement(By.cssSelector(createCalendarBtnLocatorCss)).isDisplayed()){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
