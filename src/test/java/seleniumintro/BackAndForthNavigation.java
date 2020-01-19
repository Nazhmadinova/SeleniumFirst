package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {

    public static void main(String[] args) {

        // //TC#3:	Back	and	forth	navigation
        //        // 1-Open	a	chrome	browser
        //        // 2-Go	to:	https://google.com
        //        // 3-Click	to	Gmail	from	top	right.
        //        // 4-Verify	title	contains:
        //        // Expected:	Gmail
        //        // 5-Go	back	to	Google	by	using	the	.back();
        //        // 6-Verify	title	contains:
        //        // Expected:	Google
        //        // 7-Go	back	to	Gmail	using	the	Forward	button
        //        // 8-Verify	title contains:
        //        // Expected:	Gmail

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();
       // driver.findElement(By.name(""))

        String actual = driver.getTitle();
        String expected = "Gmail";

        if(actual.contains(expected)){
            System.out.println("passed gmail title1");
        }else{
            System.out.println("failed gmail title1");
        }

        driver.navigate().back();
        String actual2 = driver.getTitle();
        String expected2 = "Google";

        if(actual2.contains(expected2)){
            System.out.println("passed google title2");
        }else{
            System.out.println("failed google title2");
        }

        driver.navigate().forward();
        String actual3 = driver.getTitle();
        String expected3 = "Gmail";

        if(actual3.contains(expected3)){
            System.out.println("passed gmail title3");
        }else{
            System.out.println("failed gmail title3");
        }

    }

}
