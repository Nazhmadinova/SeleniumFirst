package Locators.Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

    public static void main(String[] args) {

        //TC #1: PracticeCybertek.com_ForgotPasswordWebElement verification
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        // 3.Locate all the WebElements on the page using XPATH locator only (total of 6)
        // a.“Home”link
        // b.“Forgot password”header
        // c.“E-mail”text
        // d.E-mail input box
        // e.“Retrieve password”button
        // f.“Powered by Cybertek School”text
        // 4.Verify allWebElements are displayed.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        System.out.println(driver.findElement(By.xpath("//a[@class='nav-link']")).isDisplayed());
        //or "//a[.='Home']"

        System.out.println(driver.findElement(By.xpath("/html/body/div/div/div/div/h2")).isDisplayed());
        // or "//div[@class='example']/h2"
        System.out.println(driver.findElement(By.xpath("//label[@for='email']")).isDisplayed());

        System.out.println(driver.findElement(By.xpath("//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$']")).isDisplayed());
        // or "//input[@name='email']"

        System.out.println(driver.findElement(By.xpath("//button[@id='form_submit']")).isDisplayed());
        // or "//button[.='Retrieve password']"
        // or "//button[@id='form_submit']"

        System.out.println(driver.findElement(By.xpath("//div[@style='text-align: center;']")).isDisplayed());
        // or "//a[.='Cybertek School']/.."



    }
}
