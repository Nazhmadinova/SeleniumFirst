package Locators.Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NumberOfElements {

    public static void main(String[] args) {

        //TC	#1:	Checking	the	number	of	links	on	the	page
        // 1.Open	Chrome	browser
        // 2.Go	to	https://www.openxcell.com
        // 3.Count	the	number	of	the	links	on	the	page	and	verify
        // Expected:	188

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.openxcell.com");
        List<WebElement> list = driver.findElements(By.xpath("//body//a"));

        if(list.size() == 188){
            System.out.println("Number of the links as expected and Passed");
        }else{
            System.out.println("Number of the links is different and Failed");
        }
    }
}
