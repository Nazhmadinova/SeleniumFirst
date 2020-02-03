package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectingDateVerifying {

    public static void main(String[] args) {

        //TC #1: Selecting date on dropdown and verifying
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Verify “Select your date of birth” dropdowns are selected todays date by default.
        // 4.Select “December 31st, 1921” and verify it is selected.
        // Use all Select options.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement year = driver.findElement(By.id("year"));
        Select selectYear = new Select(year);

        WebElement day = driver.findElement(By.id("day"));
        Select selectDay = new Select(day);

        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);

        if(selectYear.getFirstSelectedOption().getText().equals("2020") && selectMonth.getFirstSelectedOption().getText().equals("January")
        && selectDay.getFirstSelectedOption().getText().equals("26")){
            System.out.println("todays date is passed");
        }else{
            System.out.println("todays date is failed");
        }

        selectYear.selectByVisibleText("1921");
        selectMonth.selectByVisibleText("December");
        selectDay.selectByValue("31");

        if(selectYear.getFirstSelectedOption().getText().equals("1921") && selectMonth.getFirstSelectedOption().getText().equals("December")
                && selectDay.getFirstSelectedOption().getText().equals("31")){
            System.out.println("given date is passed");
        }else{
            System.out.println("given date is failed");
        }

    }
}
