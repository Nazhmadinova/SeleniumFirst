package synchronization_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practiceCybertekPages.DynamicLoading2Page;
import utilities.Driver;

public class ImplicitWaitTests {

    @Test
    public void testText(){

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");
        DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();
        dynamicLoading2Page.startButton.click();


        Assert.assertTrue(dynamicLoading2Page.helloWorldText.isDisplayed(), "Text is not displayed");


    }

}
