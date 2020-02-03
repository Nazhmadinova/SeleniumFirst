package Locators.Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingSmartBearPrintNameCity {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        SmartbearSoftware.loginToSmartBear(driver);
        SmartbearSoftware.printNamesAndCities(driver);
    }
}
