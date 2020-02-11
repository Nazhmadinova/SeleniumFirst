package Actions;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AmazonePages.AmazonLandingPage;
import utilities.Driver;

public class AmazonTests {

    @Test
    public void signInLinkHoverTest(){

        Driver.getDriver().get("https://www.amazon.com/");
        AmazonLandingPage amazonLandingPage = new AmazonLandingPage();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(amazonLandingPage.singInLink).perform();

    }

}
