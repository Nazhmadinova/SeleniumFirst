package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class NonSelectDropdown {

    public static void main(String[] args) {

        //TC #3: Selecting value from non-select dropdown
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Click to non-select dropdown
        // 4.Select Facebook from dropdown
        // 5.Verify title is “Facebook - Log In or Sign Up”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement nonSelect = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelect.click();

        WebElement facebook = driver.findElement(By.linkText("Facebook"));
        facebook.click();

        if(driver.getTitle().equals("Facebook - Log In or Sign Up")){
            System.out.println("Title passed");
        }else{
            System.out.println("Title failed");
        }



    }
}
