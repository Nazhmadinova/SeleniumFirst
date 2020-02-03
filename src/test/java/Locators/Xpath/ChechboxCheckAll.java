package Locators.Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechboxCheckAll {

    public static void main(String[] args) {

        //TC	#3:	SeleniumEasy	Checkbox	Verification	– Section	2
        // 1.Open	Chrome	browser
        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        // 3.Verify	“Check	All”	button	text	is	“Check	All”
        // 4.Click	to	“Check	All”	button
        // 5.Verify	all	check	boxes	are	checked
        // 6.Verify	button	text	changed	to	“Unchecked all"

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAllButton = driver.findElement(By.xpath("//input[@id='check1']"));

        if(checkAllButton.getAttribute("value").equals("Check all")){
            System.out.println("Check all button verification Passed");
        }else{
            System.out.println("Checked all button verification Failed");
        }

        checkAllButton.click();

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
        WebElement checkbox3 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[3]"));
        WebElement checkbox4 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[4]"));

        if(checkbox1.isSelected() && checkbox2.isSelected() && checkbox3.isSelected()
        && checkbox4.isSelected()){
            System.out.println("All checkboxes are selected and verification Passed");
        }else{
            System.out.println("All checkboxes are not selected and verification Failed");
        }

        if(checkAllButton.getAttribute("value").equals("Uncheck All")){
            System.out.println("Button text changed to Uncheck all and verification Passed");
        }else{
            System.out.println("Button text changed to Uncheck all and verification Failed");
        }
    }
}
