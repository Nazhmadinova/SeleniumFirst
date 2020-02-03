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
import java.util.concurrent.TimeUnit;

public class SmartBearRemovingChangingNames {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    //TC #7: SmartBear delete order
    // 1.Open browser and login to SmartBear
    // 2.Delete “Mark Smith” from the list
    // 3.Assert it is deleted from the list

    @Test
    public void deleteOrder(){
        SmartbearSoftware.loginToSmartBear(driver);
        String name = "Mark Smith";

        //SmartbearSoftware.removeName(driver,name);

        //or
        //
        WebElement markSmithCheckBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr/td[.='Mark Smith']/../td[1]"));
        markSmithCheckBox.click();
        WebElement deleteSelectedButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteSelectedButton.click();

        String locatorNAmeXpath = "//table[@class='SampleTable']/tbody/tr/td[2]";
        List<WebElement> allNames = driver.findElements(By.xpath(locatorNAmeXpath));

        for(WebElement nam: allNames){

            Assert.assertFalse(nam.getText().equals("Mark Smith"), "The name is in the list. Test FAILED!!!");

        }
    }


    //TC #8: SmartBear edit order
    // 1.Open browser and login to SmartBear
    // 2.Click to edit button from the right for “Steve Johns”
    // 3.Change name to “Michael Jordan”
    // 4.Click Update5.Assert “Michael Jordan” is in the list
    @Test
    public void editOrderTest(){
        WebElement editButtonSteveJohns = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr/td[.='Steve Johns']/../td[13]"));
        editButtonSteveJohns.click();
        WebElement customerNameInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        customerNameInput.clear();
        customerNameInput.sendKeys("Michael Jordan");
        WebElement updateButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton"));
        updateButton.click();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for(WebElement name : allNames) {
            System.out.println(name.getText());
            if(name.getText().equals("Michael Jordan")) {
                Assert.assertTrue(name.getText().equals("Michael Jordan"), "The name is NOT in the list. Test FAILED!!!");
            }
        }

    }
}
