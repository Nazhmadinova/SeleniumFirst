package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class DoubleClickChangingColor {

    //TC #16: Hover Test
    //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    //2. Switch to iframe.
    //3. Double click on the text “Double-click me to change my text color.”
    //4. Assert: Text’s “style” attribute value contains “red”.

    @Test
    public void colorTest(){

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().switchTo().frame("iframeResult");

        WebElement element = Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(element).perform();
        String value = element.getAttribute("style");
        Assert.assertTrue(value.contains("red"));

    }

}
