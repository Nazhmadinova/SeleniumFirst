package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();  // sets up the driver for us

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  // makes bigger the screen

        driver.get("https://www.google.com");

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();


        driver.navigate().refresh();


        driver.navigate().to("https://www.etsy.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        driver.close(); // after running it closes the browser

            
    }

}
