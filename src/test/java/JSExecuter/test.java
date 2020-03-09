package JSExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class test {

    @Test
    public void jsex(){

        Driver.getDriver().get("http://practice.cybertekschool.com");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        //this line will create pop up on that site
        javascriptExecutor.executeScript("alert('Welcome to Cybertek');");

    }

    @Test
    public void scroll(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        SeleniumUtils.pause(2);
        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Test
    public void scrollToTheElement(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        WebElement link = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",link);
    }

    @Test
    public void type(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement input = Driver.getDriver().findElement(By.cssSelector("#input-example>input"));
        javascriptExecutor.executeScript("arguments[0].setAttribute('value','hello')",input);

        //or dynamic way
//        String str = "hi";
//        javascriptExecutor.executeScript("arguments[0].setAttribute('value','"+ str +"')",input);
    }

}
