package ReviewOfUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReviewFile {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("test.properties");

        properties.load(fileInputStream);
        String str = properties.getProperty("day");
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys(properties.getProperty("item")+ Keys.ENTER);
        System.out.println(Driver.getDriver().getTitle());
        Driver.quitDriver();
    }

}
