package TestNG;

import Locators.Xpath.SmartbearSoftware;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearRemoveName {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        SmartbearSoftware.loginToSmartBear(driver);
    }


    //TC #9 : Create a method called removeName()
    // 1.Accepts two parameters: WebDriver, String name
    // 2.Method will remove the given name from the list of Smartbear
    // 3.Create a new TestNG test, and call your method.
    // 4.Assert that your method removed the given name

    @Test
    public void testingRemoveName(){


        SmartbearSoftware.removeName(driver,"Bob Feather");

        String locatorNAmeXpath = "//table[@class='SampleTable']/tbody/tr/td[2]";
        List<WebElement> allNames = driver.findElements(By.xpath(locatorNAmeXpath));

        for(WebElement nam: allNames){

            Assert.assertFalse(nam.getText().equals("Bob Feather"), "The name is in the list. Test FAILED!!!");

        }


    }

}
