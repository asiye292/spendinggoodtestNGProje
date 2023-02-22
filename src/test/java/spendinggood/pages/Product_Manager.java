package spendinggood.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spendinggood.utilities.Driver;

public class Product_Manager {
    public Product_Manager() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='product_type']/option[1]")
    public WebElement productsDropDown;

    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtualRadioButton;

    @FindBy(xpath = "//*[@id='is_downloadable']")
    public WebElement downloadableRadioButton;

    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement priceAlani;

    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement productTitle;
}
