package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuApp {

    public static void main(String[] args) {

        //1.Open Chrome browser
        // 2.Go to https://the-internet.herokuapp.com/forgot_password
        // 3.Enter any email into input box
        // 4.Click on Retrieve password
        // 5.Verify URL contains:
        // Expected: “email_sent”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("aaaa");
        driver.findElement(By.id("form_submit")).click();
       if(driver.getCurrentUrl().contains("email_sent")){
           System.out.println("Passed");
       }else{
           System.out.println("Failed");
       }
    }
}
