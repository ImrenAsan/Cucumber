package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchPage {
    public SearchPage() {PageFactory.initElements(Driver.getDriver(),  this);}

    @FindBy(id = "gdpr-banner-accept")
    public WebElement acceptAll;

    @FindBy(id ="gh-ac")
    public WebElement searchBox;

    @FindBy(id ="gh-btn")
    public WebElement searchButton;

    @FindBy(xpath ="(//span[@class='checkbox cbx x-refine__multi-select-checkbox '])[4]")
    public WebElement checkboxWindows10;

    @FindBy(xpath = "(//span[@role='heading'])[2]")
    public WebElement productTitle;

}
