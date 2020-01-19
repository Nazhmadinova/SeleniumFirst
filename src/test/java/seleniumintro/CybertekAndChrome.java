package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekAndChrome {

    public static void main(String[] args) {

        //TC	#1:	Google	Title	Verification
        // 1.Open	Chrome	browser
        // 2.Go	to	https://www.google.com
        // 3.Verify	title:	Expected:	Google

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        if("Google".equals(driver.getTitle())){
            System.out.println("right title");
        }else{
            System.out.println("Incorrect title");
        }

        //TC	#2:	Cybertek	verifications
        // 1.Open	Chrome	browser
        // 2.Go	to	https://www.cybertekschool.com
        // 3.Verify	URL	containsExpected:	cybertekschool
        // 4.Verify	title:	Expected:	Cybertek

        driver.get("https://www.cybertekschool.com");

        if(driver.getCurrentUrl().contains("cybertekschool")){
            System.out.println("Right url");
        }else{
            System.out.println("INCORRECT URL");
        }

        if("Cybertek".equals(driver.getTitle())){
            System.out.println("Right title");
        }else{
            System.out.println("Incorrect title");
        }



    }

}
