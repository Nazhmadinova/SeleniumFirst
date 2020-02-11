package synchronization_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practiceCybertekPages.DynamicallyLoadedPageElements5;
import utilities.Config;
import utilities.Driver;

public class DynamicallyLoadedPageElements5Test {

    //TC#23 : Dynamically Loaded Page Elements 5
    //Go to http://practice.cybertekschool.com/dynamic_loading/5
    //Wait Until loading overlay is not displayed
    //Enter username: tomsmith
    //Enter password: SuperSecretPassword
    //Click to Submit button
    //Assert “Welcome to the Secure Area” text is displayed.

    @Test
    public void elements5() throws InterruptedException{

        Driver.getDriver().get(Config.getProperties("practiceCybertekElememts5url"));

        DynamicallyLoadedPageElements5 dynamicallyLoadedPageElements5 = new DynamicallyLoadedPageElements5();

        Thread.sleep(5000);

        dynamicallyLoadedPageElements5.usernameInput.sendKeys(Config.getProperties("username1"));
        dynamicallyLoadedPageElements5.passwordInput.sendKeys(Config.getProperties("password1"));

        dynamicallyLoadedPageElements5.submitButton.click();

        Assert.assertTrue(dynamicallyLoadedPageElements5.secureAreaText.isDisplayed());
    }

}
