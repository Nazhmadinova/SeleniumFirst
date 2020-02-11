package synchronization_tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practiceCybertekPages.DynamicLoadingPageElements1;
import utilities.Config;
import utilities.Driver;

public class DynamicLoadingPageElements1Test {

    ///TC#23 : Dynamically Loaded Page Elements 1
    //1. Go to http://practice.cybertekschool.com/dynamic_loading/1
    //2. Click to start
    //3. Wait Until Form is Displayed
    //4. Assert “Hello World” text is Displayed
    //5. Enter username: tomsmith
    //6. Enter password: SuperSecretPassword
    //7. Click to Submit button
    //8. Assert “Welcome to the Secure Area” text is displayed.


    @Test
    public void elements1Test(){
        Driver.getDriver().get(Config.getProperties("practiceCybertekElememts1url"));
        DynamicLoadingPageElements1 dynamicLoadingPageElements1 = new DynamicLoadingPageElements1();
        dynamicLoadingPageElements1.startButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(dynamicLoadingPageElements1.form));
        Assert.assertTrue(dynamicLoadingPageElements1.helloWorldText.isDisplayed());

        dynamicLoadingPageElements1.usernameInput.sendKeys(Config.getProperties("username1"));
        dynamicLoadingPageElements1.passwordInput.sendKeys(Config.getProperties("password1"));
        dynamicLoadingPageElements1.submitButton.click();

        Assert.assertTrue(dynamicLoadingPageElements1.secureAreaText.isDisplayed());
    }

}
