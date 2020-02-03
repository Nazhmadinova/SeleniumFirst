package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OrderOfThings {

    @Test(priority = -1 )
    public void firstTest(){
        System.out.println("Test one is running");
    }
    //final int i=0;
    //

    @Ignore
    @Test (priority = 2)
    public void secondTest(){
        System.out.println("Test two is running");
    }
    //....
    @Test
    public void thirdTest(){
        System.out.println("Test three is running");
    }

}
