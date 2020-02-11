package pages.practiceCybertekPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DynamicLoadingPageElements1 {

    public DynamicLoadingPageElements1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//div[@id = 'finish']")
    public WebElement form;

    @FindBy(xpath = "//div[@id='finish']/h4")
    public WebElement helloWorldText;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "pwd")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//h4[@class='subheader']")
    public WebElement secureAreaText;

}
