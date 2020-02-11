package pageObjectModelTests.smartBearTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.smartBearSoftwarePages.LoginPage;
import utilities.Config;
import utilities.Driver;

public class LoginTest {

    //TC #20: Wrong username
    // 1. Go to website https://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx(Linkstoanexternalsite.)
    // 2. Try to login with wrong username
    // 3. Verify error message Invalid Login or Password.


    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void gotoSite(){
        Driver.getDriver().get(Config.getProperties("smartbearUrl"));
    }

    @Test
    public void wrongUsername(){

        //Driver.getDriver().get(Config.getProperties("smartbearUrl"));
        loginPage.usernameInput.sendKeys(Config.getProperties("wrongUsername"));
        loginPage.passwordInput.sendKeys(Config.getProperties("smartbearPassword"));
        loginPage.loginButton.click();

        Assert.assertEquals(loginPage.status.getText(),"Invalid Login or Password.");

    }


    //TC #21: Wrong password
    // 1. Go toSmartbearlogin page
    // 2. Try to login with wrong password
    // 3. Verify error messageInvalid Login or Password.
    @Test
    public void wrongPassword(){

       // Driver.getDriver().get(Config.getProperties("smartbearUrl"));
        loginPage.usernameInput.sendKeys(Config.getProperties("smartbearUsename"));
        loginPage.passwordInput.sendKeys(Config.getProperties("wrongPassword"));
        loginPage.loginButton.click();

        Assert.assertEquals(loginPage.status.getText(),"Invalid Login or Password.");
        Assert.assertTrue(loginPage.status.isDisplayed());

    }


    //TC #22: No username
    // 1. Go to Smartbearlogin page
    // 2. Try to login no username
    // 3. Verify error messageInvalid Login or Password.
    @Test
    public void noUsername(){

       // Driver.getDriver().get(Config.getProperties("smartbearUrl"));
       //loginPage.usernameInput.sendKeys(Config.getProperties("smartbearUsename"));
        loginPage.passwordInput.sendKeys(Config.getProperties("smartbearPassword"));
        loginPage.loginButton.click();

        Assert.assertEquals(loginPage.status.getText(),"Invalid Login or Password.");
        Assert.assertTrue(loginPage.status.isDisplayed());

    }

    //TC #23: No password
    // 1. Go to Smartbearlogin page
    // 2. Try to login with no password
    // 3. Verify error messageInvalid Login or Password.

    @Test
    public void noPassword(){

       // Driver.getDriver().get(Config.getProperties("smartbearUrl"));
        loginPage.usernameInput.sendKeys(Config.getProperties("smartbearUsename"));
        //loginPage.passwordInput.sendKeys(Config.getProperties("smartbearPassword"));
        loginPage.loginButton.click();

        Assert.assertEquals(loginPage.status.getText(),"Invalid Login or Password.");
        Assert.assertTrue(loginPage.status.isDisplayed());

    }

}
