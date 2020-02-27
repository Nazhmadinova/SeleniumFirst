package Locators.Xpath;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SmartBearOrderPlacing {

    public static void main(String[] args) {

        //TC#2: Smartbear software order placing
        // 1.Open	browser
        // 2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // 3.Enter username: “Tester”
        // 4.Enter password: “test”
        // 5.Click on Login button
        // 6.Click on Order
        // 7.Select familyAlbum from product, set quantity to 2
        // 8.Click to “Calculate”button
        // 9.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
        // 10.Click on “visa” radio button
        // 11.Generate card number using JavaFaker
        // 12.Click on “Process”
        // 13.Verify success message “New order has been successfully added".

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();

        Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
        select.selectByVisibleText("FamilyAlbum");


        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")).sendKeys("2");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //or
//        WebElement inputQuantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
//        //inputQuantity.clear();
//        //Thread.sleep(2000);
//        inputQuantity.sendKeys(Keys.BACK_SPACE);
//        //Thread.sleep(2000);
//        inputQuantity.sendKeys( "2");
//        //inputQuantity.sendKeys( Keys.BACK_SPACE, "2");

        Faker faker = new Faker();
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys(faker.name().fullName());
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")).sendKeys(faker.address().streetName());
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")).sendKeys(faker.address().city());
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")).sendKeys(faker.address().state());

        String zip = faker.address().zipCode();

        for(int i = 0; i < zip.length(); i++){
            if(!Character.isDigit(zip.charAt(i))){
                zip = zip.replace(""+zip.charAt(i), "");
            }
        }

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")).sendKeys(zip);

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")).click();

        String card = faker.finance().creditCard();

        for(int i = 0; i < card.length(); i++){
            if(!Character.isDigit(card.charAt(i))){
                card = card.replace(""+card.charAt(i), "");
            }
        }

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys(card);
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")).sendKeys("01/22");
        driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")).click();

        WebElement msg = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));

        if(msg.getText().equals("New order has been successfully added.")){
            System.out.println("Message is correct and Passed");
        }else{
            System.out.println("Message is not correct Failed");
        }

    }


}
