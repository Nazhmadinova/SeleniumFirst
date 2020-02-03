package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleSelectDropdown {

    public static void main(String[] args) {

        //TC #2: Selecting value from multiple select dropdown
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Select all the options from multiple select dropdown.
        // 4.Print out all selected values.
        // 5.Deselect all values.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement multiple = driver.findElement(By.name("Languages"));
        Select select = new Select(multiple);

        for(int i = 0; i < 6; i++){
            select.selectByIndex(i);
        }

        //or
        // Select multipleSelectDropdown = new Select(driver.findElement(By.name("Languages")));
        //        List<WebElement> options = multipleSelectDropdown.getOptions();
        //        for(WebElement option: options){
        //            Thread.sleep(500);
        //            //option.click();
        //            multipleSelectDropdown.selectByVisibleText(option.getText());
        //        }

        List<WebElement> selected = select.getAllSelectedOptions();

        for(WebElement element: selected){
            System.out.println(element.getText());
        }

        select.deselectAll();
    }
}
