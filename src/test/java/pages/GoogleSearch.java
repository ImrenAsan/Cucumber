package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleSearch {
    public GoogleSearch() {PageFactory.initElements(Driver.getDriver(),  this);}

    @FindBy(xpath = "(//div[@class='QS5gu sy4vM'])[2]")
    public WebElement acceptCookiesButton;

    @FindBy(xpath = "//input[@class='gLFyf']")
    public WebElement searchBox;


    @FindBy(xpath = "(//div[@class='yuRUbf'])[1]")
    public WebElement firstRow;

}
