package Locators.Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SmartbearSoftware {

    public static void main(String[] args) {

        //TC	#1:	Smartbear	software	link	verification
        // 1.Open	browser
        // 2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // 3.Enter username: “Tester”
        // 4.Enter password: “test”
        // 5.Click to Login button
        // 6.Print out count of all the links on landing page
        // 7.Print out each link text on this page



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();




        loginToSmartBear(driver);

        List<WebElement> links = driver.findElements(By.xpath("//body//a"));

        System.out.println(links.size());
        for(int i = 0; i < links.size(); i++){
            System.out.println(links.get(i).getText());
        }

        // Mini-Task:
        // •Create a method called loginToSmartBear
        // •This method simply logs in to SmartBear when you call it.

    }

    public static void loginToSmartBear(WebDriver driver){

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }


    //PRACTICE	#4:	Method:	verifyOrder
    // •Create	a	method	named	verifyOrder that	takes	WebDriver	object	and	String(name).
    // •This	method	should	verify	if	given	name exists in orders


    public static void verifyOrder(WebDriver driver, String givenName){

        String locatorNAmeXpath = "//table[@class='SampleTable']/tbody/tr/td[2]";

        List<WebElement> allNames = driver.findElements(By.xpath(locatorNAmeXpath));

        for(WebElement name: allNames){
            if(name.getText().equals(givenName)){
                System.out.println(givenName + " exists in the list. Verification Passed");
                return;
            }
        }

        System.out.println(givenName + " does not exist in the list. Verification Failed");

    }

    //Practice	#5:	Method:	printNamesAndCities
    // •Create	a	method	named	printNamesAndCities that	takes	WebDriver	object.
    // •This	method	should	simply	print	all	the	names	in	the	List of all orders


    public static void printNamesAndCities(WebDriver driver){

        String locatorNAmeXpath = "//table[@class='SampleTable']/tbody/tr/td[2]";
        List<WebElement> allNames = driver.findElements(By.xpath(locatorNAmeXpath));

        String locatorCityXpath = "//table[@class='SampleTable']/tbody/tr/td[7]";
        List<WebElement> allCities = driver.findElements(By.xpath(locatorCityXpath));
        List<WebElement> a =driver.findElements(By.xpath("WebElement"));

        for(int i = 0; i < allNames.size(); i++){
            System.out.println(allNames.get(i).getText() + ", " +allCities.get(i).getText());
        }


    }

    //TC #9 : Create a method called removeName()
    // 1.Accepts two parameters: WebDriver, String name
    // 2.Method will remove the given name from the list of Smartbear
    // 3.Create a new TestNG test, and call your method.
    // 4.Assert that your method removed the given name


    public static void removeName(WebDriver driver, String givenName) {

        String locatorNAmeXpath = "//table[@class='SampleTable']/tbody/tr/td[2]";
        List<WebElement> allNames = driver.findElements(By.xpath(locatorNAmeXpath));

        List<WebElement> checkBoxes =driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));

        for(int i = 0; i < allNames.size(); i++){
            if(allNames.get(i).getText().equals(givenName)){
                checkBoxes.get(i).click();
            }
        }

//        or
//        String xpathForCheckboxes = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='"+givenName+"']/../td[1]";
//                WebElement dynamicCheckBox = driver.findElement(By.xpath(xpathForCheckboxes));
//                dynamicCheckBox.click();

        WebElement deleteSelectedButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteSelectedButton.click();


    }

}
