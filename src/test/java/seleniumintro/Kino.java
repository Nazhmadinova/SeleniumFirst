package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kino {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Kto ya smotret online" + Keys.ENTER);
        driver.findElement(By.className("TbwUpd")).click();
        driver.findElement(By.id("oframevideoplayer_284249")).click();
    }
}
