package Iframes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstEx {

    //1.Create	a	new	class	called:	IframePractice
    // 2.Create	new	test	and	make	set	ups
    // 3.Go	to	:http://practice.cybertekschool.com/iframe
    // 4.Assert:“Your	content	goes	here.”Text	is	displayed.
    // 5.Assert:“An	iFrame	containingthe	TinyMCE	WYSIWYG	Editor"


    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");


    }

    @Test
    public void textAssert(){

        driver.switchTo().frame(0);
        //driver.switchTo().frame("mce_0_ifr"); // iframe id value
        WebElement innerFrameParagraph = driver.findElement(By.xpath("//body[@id='tinymce']/p"));

        Assert.assertEquals(innerFrameParagraph.getText(),"Your content goes here.","msg different and Failed");

        driver.switchTo().parentFrame();
        WebElement parentFrameHeader = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(parentFrameHeader.isDisplayed());
    }
}
