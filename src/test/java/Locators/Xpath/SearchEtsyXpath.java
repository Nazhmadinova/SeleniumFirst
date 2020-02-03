package Locators.Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchEtsyXpath {

    public static void main(String[] args) {

        //TC#2 Search ETSY
        //1. Open browser
        //2. Go to https://etsy.com
        //3. Enter any search term
        //4. Click search button
        //5. Verify title contains the search term
        //USE XPATH TO LOCATE WEBELEMENTS

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://etsy.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='search_query']"));
        searchBox.sendKeys("wooden spoon");

        WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();

        if(driver.getTitle().contains("Wooden spoon")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
