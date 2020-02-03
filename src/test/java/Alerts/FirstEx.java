package Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstEx {

    WebDriver driver;

     @BeforeClass
      public void openingWeb(){
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("http://practice.cybertekschool.com/javascript_alerts");

     }

     @Test
    public void jSAlert(){
         WebElement jSAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));
         jSAlert.click();
         Alert alert = driver.switchTo().alert();
         alert.accept();

         WebElement msg = driver.findElement(By.xpath("//p[@id='result']"));

         Assert.assertTrue(msg.isDisplayed(),"Failed");

        // Assert.assertEquals(msg.getText(),"You successfuly clicked an alert","Failed");
     }

     @Test
     public void jSConfirm(){
         WebElement jSConfirm = driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]"));
         jSConfirm.click();

         Alert alert = driver.switchTo().alert();
         alert.accept();

         WebElement msg = driver.findElement(By.xpath("//p[@id='result']"));

         Assert.assertTrue(msg.isDisplayed(),"Failed");
     }

    @Test
    public void jSPrompt(){
        WebElement jSPrompt = driver.findElement(By.xpath("//button[@class='btn btn-primary'][3]"));
        jSPrompt.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();

        WebElement msg = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(msg.isDisplayed(),"Failed");
    }

}
