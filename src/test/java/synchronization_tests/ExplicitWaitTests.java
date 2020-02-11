package synchronization_tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.practiceCybertekPages.DynamicLoading1Page;
import utilities.Driver;

public class ExplicitWaitTests {


    @Test
    public void waitForInputBoxTest(){
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        DynamicLoading1Page dynamicLoading1Page = new DynamicLoading1Page();
        dynamicLoading1Page.startButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(dynamicLoading1Page.usernameInput));

        dynamicLoading1Page.usernameInput.sendKeys("tomsmith");
    }

}
