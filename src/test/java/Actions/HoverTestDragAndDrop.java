package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class HoverTestDragAndDrop {

    //TC #16: Hover Test
    //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    // 2. Drag and drop the small circle to bigger circle.
    //3. Assert:
    //-Text in big circle changed to: “You did great!”

    @Test
    public void dragAndDrop()throws InterruptedException{
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        Driver.getDriver().findElement(By.xpath("//button[@title='Accept Cookies']")).click();
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id = 'draggable']"));
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id = 'droptarget']"));

        Actions actions = new Actions(Driver.getDriver());

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.invisibilityOf(Driver.getDriver().findElement(By.xpath("//button[@title='Accept Cookies']"))));
        actions.dragAndDrop(smallCircle,bigCircle).perform();
        String text = bigCircle.getText();

        Assert.assertEquals(text,"You did great!");
    }

}
