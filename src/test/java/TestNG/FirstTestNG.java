package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNG {



    @Test
    public void firstTest(){
        System.out.println("1st test is running...");

        Assert.assertEquals("fail","faeil","first test is failed");
        Assert.assertEquals(1,2,"Number failed");
        Assert.assertTrue(false,"failed");
        System.out.println("Hi");
    }


    @Test
    public void secondTest(){

        System.out.println("2nd test is running");
        Assert.assertTrue("sentence".contains("e"),"Failed");
    }

    @BeforeClass
    public void setUp(){
        System.out.println("BeforeClass is running...");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod is running...");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod is running...");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass is running...");
    }




}
