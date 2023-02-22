package spendinggood.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spendinggood.utilities.Driver;

public class MyAccount2_Vendor {
    public MyAccount2_Vendor() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButton;
}
