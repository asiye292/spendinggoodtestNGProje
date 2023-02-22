package spendinggood.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spendinggood.utilities.Driver;

public class produckt_dachboard {
    public produckt_dachboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='wcfm_product_title'])[1]")
    public WebElement productTitle;

}

