package Locators.Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintingTextsOfElements {

    public static void main(String[] args) {

        //TC	#2:	Printing	out	the	texts	of	the	links	on	the	page
        // 1.Open	Chrome	browser
        // 2.Go	to	https://www.openxcell.com
        // 3.Print	out	all	of	the	texts	of	the	lin

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.openxcell.com");
        List<WebElement> list = driver.findElements(By.xpath("//body//a"));

        int count = 0;
        for(int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i).getText());
        }

        // 4.Count	the	number	of	links	that	does	not	have	text	and	verify
        // Expected:	109

        for(WebElement l: list){
            if(l.getText().isEmpty()){
                count++;
            }
        }

        if(count == 109){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        System.out.println(count);

    }
}
