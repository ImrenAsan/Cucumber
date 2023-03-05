package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TargetWordPage {
    public TargetWordPage() {PageFactory.initElements(Driver.getDriver(),  this);}


    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement acceptAndClose;

    @FindBy(xpath = "//a[@id='js-tlrk-nav-search-link']")
    public WebElement searchLink;

    @FindBy(xpath = "//input[@class='TK-Tag-Input']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='TK-Tag-Input-Button']")
    public WebElement searchButton;

   @FindAll({
           @FindBy(partialLinkText = "https://www.telerik.com/forums/keyword-driven-automation"),
           @FindBy(partialLinkText = "https://docs.telerik.com/teststudio/automated-tests/data-drive-test/what-is-ddt?_ga=2.154693949.449636626.1677453640-1278318116.1677453640&_gl=1*1mh67kk*_ga*MTI3ODMxODExNi4xNjc3NDUzNjQw*_ga_9JSNBCSF54*MTY3NzU5NzQ4Ny45LjEuMTY3NzYwMDU4NC41Mi4wLjA."),
   })
    public List<WebElement> partialLinksAll;

}
