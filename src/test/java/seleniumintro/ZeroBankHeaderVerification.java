package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {

    public static void main(String[] args) {

        //1.Open Chrome browser
        // 2.Go to http://zero.webappsecurity.com/login.html
        // 3.Verify header text
        // Expected: “Log in to ZeroBank”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

//        if(driver.findElement(By.tagName("h3")).getText().equals("Log in to ZeroBank")){ //
//            System.out.println("Passed");
//        }else{
//            System.out.println("Failed");
//        }

        // 4.Get attribute value of href from the “forgot your password” link
        // 5.Verify attribute value containsExpected: “/forgot-password.html”

        if(driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href").contains("/forgot-password.html")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }





    }
}
