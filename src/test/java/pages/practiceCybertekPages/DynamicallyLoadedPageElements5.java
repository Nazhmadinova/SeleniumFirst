package pages.practiceCybertekPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DynamicallyLoadedPageElements5 {

    public DynamicallyLoadedPageElements5(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "pwd")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//h4[@class='subheader']")
    public WebElement secureAreaText;

}
