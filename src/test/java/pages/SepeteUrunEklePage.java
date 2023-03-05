package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SepeteUrunEklePage {
    public SepeteUrunEklePage() {PageFactory.initElements(Driver.getDriver(),  this);}

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookiesAcceptButton;

    @FindBy(xpath = "(//a[@class='TK-Menu-Item-Link'])[5]")
    public WebElement pricingPage;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[1]/div/div/div[1]/table/thead/tr[5]/th[2]/div/a")
    public WebElement buyNowButton;

    @FindBy(xpath = "(//a[@class='Btn Btn--prim4 u-db'])[1]")
    public WebElement secondProductAdd;

    @FindBy(xpath = "//a[@aria-label='Go to Homepage']")
    public WebElement goToHomePage;

    @FindBy(xpath = "//a[@class='referrer-link']")
    public WebElement continueShopping;

    @FindBy(xpath = "//span[@class='TK-Counter TK-Counter--SC TK-Counter--Visible']")
    public WebElement goToCart;

    @FindBy(xpath = "//a[@class='e2e-delete-item btn-delete-item ng-star-inserted']")
    public WebElement deleteLink;


}
