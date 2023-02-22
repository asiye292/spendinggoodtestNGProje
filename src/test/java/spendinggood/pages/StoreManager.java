package spendinggood.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spendinggood.utilities.Driver;

public class StoreManager {
    public StoreManager() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='wcfm_menu']//div[5]")
    public WebElement productsLink;

    @FindBy(xpath = "//*[@id='wcfm_menu']//div[5]//span//a")
    public WebElement productAddNewButton;

    @FindBy(id= "wcfm_products_manage_form_inventory_head")
    public WebElement inventory;
    @FindBy(id = "sku")
    public WebElement sku;
    @FindBy(id = "manage_stock")
    public WebElement manage_stocktik;
    @FindBy(id = "stock_qty")
    public WebElement stock_qty;
    @FindBy(id = "backorders")
    public WebElement allowbackorders;
    @FindBy(id = "sold_individually")
    public WebElement sold_individuallytik;



    @FindBy(id= "wcfm_products_manage_form_shipping_head")
    public WebElement shipping;
    @FindBy(id= "weight")
    public WebElement weight;
    @FindBy(id= "length")
    public WebElement length;
    @FindBy(id= "width")
    public WebElement width;
    @FindBy(id= "height")
    public WebElement height;
    @FindBy(id= "shipping_class")
    public WebElement shipping_class;
    @FindBy(id= "_wcfmmp_processing_time")
    public WebElement processingtime;



    @FindBy(id= "wcfm_products_manage_form_attribute_head")
    public WebElement Attributes;
    @FindBy(id= "attributes_tax_name_1")
    public WebElement color;
    @FindBy(id= "attributes_is_visible_1")
    public WebElement sizetik;
    @FindBy(id= "attributes_value_2")
    public WebElement size;
    @FindBy(id= "attributes_is_visible_2")
    public WebElement visibleontheproductpagetik;
    @FindBy(id= "wcfm_products_simple_submit")
    public WebElement addattribute;


    @FindBy(id=" wcfm_products_manage_form_linked_head")
    public WebElement linked;

    @FindBy(id=" upsell_ids")
    public WebElement upsells;

    @FindBy(id=" crosssell_ids")
    public WebElement crosssells;


    @FindBy(id= "wcfm_products_manage_form_yoast_head")
    public WebElement SEO;
    @FindBy(id= "yoast_wpseo_focuskw_text_input")
    public WebElement enterfocuskeyword;
    @FindBy(id= "yoast_wpseo_metadesc")
    public WebElement metadescription;



    @FindBy(id="wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head")
    public WebElement toptanurungöstermeayarları;
    @FindBy(id= "piecetype")
    public WebElement piecetype;
    @FindBy(id= "unitpercart")
    public WebElement unitsperpiece;
    @FindBy(id= "minorderqtytr")
    public WebElement minorderquantty ;


    @FindBy(id= "wcfm_products_manage_form_advanced_head")
    public WebElement advenced;
    @FindBy(id= "enable_reviews")
    public WebElement enable_reviews_tik;
    @FindBy(id= "menu_order")
    public WebElement menuorder ;
    @FindBy(id= "purchase_note")
    public WebElement purchasenote ;



}
