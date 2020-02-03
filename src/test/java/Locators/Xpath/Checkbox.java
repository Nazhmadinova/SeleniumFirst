package Locators.Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

    public static void main(String[] args) {
        //Practice:	Cybertek	Checkboxes
        // 1.Go	to	http://practice.cybertekschool.com/checkboxes
        // 2.Confirm	checkbox	#1	is	NOT	selected	by	default
        // 3.Confirm	checkbox	#2	is	SELECTED	by	default.
        // 4.Click	checkbox	#1	to	select	it.
        // 5.Click	checkbox	#2	to	deselect	it.
        // 6.Confirm	checkbox	#1	is	SELECTED.
        // 7.Confirm	checkbox	#2	is	NOT

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        // or "//input[@type='checkbox'][1]"

        if(checkBox.isSelected()){
            System.out.println("first is selected");
        }else{
            System.out.println("fist is not selected");
        }

        WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        // or "//input[@type='checkbox'][2]"
        if(checkBox2.isSelected()){
            System.out.println("second selected");
        }else{
            System.out.println("second does not selected");
        }

        checkBox.click();
        checkBox2.click();

        if(checkBox.isSelected()){
            System.out.println("first is selected");
        }else{
            System.out.println("fist is not selected");
        }

        if(checkBox2.isSelected()){
            System.out.println("second selected");
        }else{
            System.out.println("second does not selected");
        }


    }
}
