package spendinggood.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spendinggood.utilities.Driver;

public class Us01 {
    public Us01() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButon;


    @FindBy(xpath = "//*[@id='reg_username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='reg_email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='reg_password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"register-policy\"]")
    public WebElement iagreeKutucuk;

    @FindBy(xpath = "//*[@name=\"register\"]")
    public WebElement signUp;

    @FindBy(xpath = "//a[.='Sign Up']")
    public WebElement gorunur;

}

