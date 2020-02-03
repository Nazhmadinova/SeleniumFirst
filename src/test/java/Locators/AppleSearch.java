package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleSearch {

    public static void main(String[] args) {

        //TC#4:	Google	search
        // 1-Open	a	chrome	browser
        // 2-Go	to:	https://google.com
        // 3-Write	“apple”	in	search	box
        // 4-Click	google	search	button
        // 5-Verify	title:
        // Expected:	Title	should	start	with	“apple"

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //driver.findElement(By.name("q")).sendKeys("apple");

        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
        //driver.findElement(By.name("btnK")).click();

        if(driver.getTitle().startsWith("apple")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }

}
