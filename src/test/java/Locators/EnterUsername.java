package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUsername {

    public static void main(String[] args) {

        //TC#5:	Basic	login	authentication
        // 1-Open	a	chrome	browser
        // 2-Go	to:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // 3-Verify	title	equals:
        // Expected:	Web	Orders	Login
        // 4-Enter	username:	Tester
        // 5-Enter	password:	test
        // 6-Click	“Sign	In”	button
        // 7-Verify	title equals:
        // Expected:	Web	Orders

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        if(driver.getTitle().equals("Web Orders Login")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test"); //  "+ Keys.ENTER" we can use it here, but we need to follow the test case
       driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        if(driver.getTitle().equals("Web Orders")){
            System.out.println("Login passed");
        }else{
            System.out.println("Login failed");
        }



    }

}
