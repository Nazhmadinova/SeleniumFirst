package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertions {

    SoftAssert softAssert;

    @Test
    public void test1(){
        System.out.println("Test1 is starting");
        Assert.assertEquals(7,8);

        System.out.println("Test1 middle");
        Assert.assertTrue(false);

        System.out.println("Test1 is ending");
    }


    @Test
    public void test2(){
        System.out.println("Test2 is starting");
    }

    @Test
    public void test3(){
        softAssert = new SoftAssert();

        System.out.println("Test3 is starting");
        softAssert.assertEquals(4,5,"SoftAssert");

        Assert.assertTrue(false,"HardAssert");

        System.out.println("Test3 middle");
        softAssert.assertFalse(true,"second softAssert");

        System.out.println("Test3 is ending");


    }

    @AfterMethod
    public void tearDown(){
        softAssert.assertAll();
    }
}
