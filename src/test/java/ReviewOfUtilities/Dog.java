package ReviewOfUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class Dog {

    public static void main(String[] args) {
       // System.out.println(Config.getProperties("browser"));

        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
    }

}
