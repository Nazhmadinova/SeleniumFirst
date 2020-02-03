package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationZeroBank {

    public static void main(String[] args) throws InterruptedException{

        //1.Open Chrome browser
        // 2.Go to http://zero.webappsecurity.com/login.html
        // 3.Enter username: username
        // 4.Enter password: password
        // 5.Click sign in button
        // 6.Verify username is displayed on the page
        // 7.Verify the title Zero – Account Summary
        // 8.Verify the link Account Summary’s href value contains: “account-summary”
        // Print out results in validation formats

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.name("user_login")).sendKeys("username");
        Thread.sleep(2000);
        driver.findElement(By.name("user_password")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.name("submit"));

        WebElement username = driver.findElement(By.linkText("username"));

        if(driver.findElement(By.linkText("username")).isDisplayed()){
            System.out.println("username passed");
        }else{
            System.out.println("username failed");
        }

        if(driver.getTitle().equals("Zero – Account Summary")){
            System.out.println("title passed");
        }else{
            System.out.println("title failed");
        }


        if(driver.findElement(By.linkText("Account Summary")).getAttribute("href").contains("account-summary")){
            System.out.println("account-summary passed");
        }else{
            System.out.println("account-summary failed");
        }


    }
}
