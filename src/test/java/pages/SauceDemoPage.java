package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {
    public SauceDemoPage() {PageFactory.initElements(Driver.getDriver(),  this);}

    @FindBy(id ="user-name")
    public WebElement username;

    @FindBy(id ="password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(className = "title")
    public WebElement title;

    @FindBy(xpath = "//button[@class='error-button']")
    public WebElement errorMessage;
}
