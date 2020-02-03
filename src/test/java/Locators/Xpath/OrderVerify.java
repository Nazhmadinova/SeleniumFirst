package Locators.Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrderVerify {

    public static void main(String[] args) {

        //TC#3: Smartbear software order verification
        // 1.Open browser and login to Smartbear software
        // 2.Click on View all orders
        // 3.Verify Susan McLaren has order on date “01/05/2010”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        SmartbearSoftware.loginToSmartBear(driver);

        driver.findElement(By.linkText("View all orders")).click();

        WebElement susan = driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[5]"));

        if(susan.getText().equals("01/05/2010")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
