package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {

    public static void main(String[] args) {

        //1.Open Chrome browser
        // 2.Go to https://www.etsy.com
        // 3.Search for “wooden spoon”
        // 4.Verify title: Expected: “Wooden spoon | Etsy”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" + Keys.ENTER);

        if(driver.getTitle().equals("Wooden spoon | Etsy")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }

}
