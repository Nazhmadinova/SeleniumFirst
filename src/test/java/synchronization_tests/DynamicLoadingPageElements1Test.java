package synchronization_tests;

import org.testng.annotations.Test;
import utilities.Driver;

public class DynamicLoadingPageElementsTest {

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
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
    }

}
