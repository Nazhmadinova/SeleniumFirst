package Locators.cssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAmazonCSS {

    public static void main(String[] args) {

        //1. Open browser
        //2. Go to https://amazon.com
        //3. Enter any search term
        //4. Click search button
        //5. Verify title contains the search term
        //USE CSS SELECTOR TO LOCATE WEBELEMENTS

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");

        WebElement amazonSearchBox = driver.findElement(By.cssSelector("input[name='field-keywords']"));
        amazonSearchBox.sendKeys("wooden spoon");

        WebElement amazonSearchButton = driver.findElement(By.cssSelector("input[tabindex='20']"));
        amazonSearchButton.click();

        if(driver.getTitle().contains("wooden spoon")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
