package frameworkEx;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.VytrackUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {


    @Test
    public void test1() throws IOException {

        // 1 - Create the path of the file
        String path = "test.properties";

        // 2 - Properties object
        Properties properties = new Properties();

        // 3 - Open the file using FileInputStream
        FileInputStream file = new FileInputStream(path);

        //4 - Load the properties file into the properties object
        properties.load(file);

        //5 - Read the values using getProperty() method
        System.out.println(properties.getProperty("name"));
        System.out.println("username");
        System.out.println("password");

    }

    @Test
    public void testWithUtil(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(Config.getProperties("vytrackUrl"));

        VytrackUtils.login(driver, Config.getProperties("storeManagerUsername"), Config.getProperties("storeManagerPassword"));
    }

}
