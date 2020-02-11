package Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class ContextRightClick {

    //TC #17: Context Click – HOMEWORK
    //1. Go to https://the-internet.herokuapp.com/context_menu
    // 2. Right click to the box.
    //3. Alert will open.
    //4. Accept alert
    //No assertion needed for this practice.

    @Test
    public void clickAlert(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.id("hot-spot"));
        actions.contextClick(element).perform();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

}
