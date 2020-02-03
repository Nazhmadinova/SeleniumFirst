package Mafiya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ImeNotAvailableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Mafiya1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://translate.google.com/");
        driver.findElement(By.xpath("//textarea[@id='source']")).sendKeys("The night is coming. Please close your eyes to begin the night cycle");
        driver.findElement(By.xpath("//*[@id='sugg-item-en']")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")).click();
        Thread.sleep(10000);
        driver.close();




    }
}
