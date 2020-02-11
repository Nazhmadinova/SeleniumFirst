package pageObjectModelTests.vytrack;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.vytrack_pages.VytrackLoginPage;
import utilities.Config;
import utilities.Driver;

public class LoginTests {

    @Test
    public void positiveLoginScenario(){

        String username = Config.getProperties("storeManagerUsername");
        String password = Config.getProperties("storeManagerPassword");
        Driver.getDriver().get(Config.getProperties("vytrackUrl"));

        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        WebElement button = vytrackLoginPage.loginButton;
        vytrackLoginPage.usernameInput.sendKeys(username);
        vytrackLoginPage.passwordInput.sendKeys(password);
        button.click();
    }
}
