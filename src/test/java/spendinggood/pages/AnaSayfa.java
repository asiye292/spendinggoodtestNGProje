package spendinggood.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spendinggood.utilities.Driver;

public class AnaSayfa {
    public AnaSayfa() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Sign In ']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement vendorUsername;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement vendorPassword;

    @FindBy(xpath = "//*[@value='Sign In']")
    public WebElement vendorSignIn;

    @FindBy(xpath = "//*[@id='menu-item-1074']")
    public WebElement myAccountButton;
}
