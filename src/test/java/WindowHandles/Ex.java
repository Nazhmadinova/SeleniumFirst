package WindowHandles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ex {

    //TC	#	:	Window	Handlepractice
    // 1.Create	a	new	class	called:	WindowHandlePractice
    // 2.Create	new	test	and	make	set	ups
    // 3.Go	to	:	http://practice.cybertekschool.com/windows
    // 4.Assert:	Title	is	“Practice”
    // 5.Click	to:	“Click	Here”text
    // 6.Switch	to	new	Window.
    // 7.Assert:	Title	is	“New	Window”

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void windowHandlingTest(){
        String mainHandle = driver.getWindowHandle();

        Assert.assertEquals(driver.getTitle(),"Practice", "First title failed");

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();


        for(String handle: driver.getWindowHandles()){
            if(!handle.equals(mainHandle)){
                driver.switchTo().window(handle);
            }
        }

        Assert.assertEquals(driver.getTitle(),"New Window", "Second title failed");
    }
}
