package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTestNG {

    @Test(priority = 2)
    public  void login(){

        Assert.fail("on purpose fail");
        System.out.println("Logging in");
    }

    @Test (priority = 1, dependsOnMethods = "login")
    public  void makePurchase(){
        System.out.println("Making purchase");

    }

    @Test
    public  void homePage(){
        System.out.println("Homepage is tested");
    }
}
