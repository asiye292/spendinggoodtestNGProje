package spendinggood.tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import spendinggood.pages.AnaSayfa;
import spendinggood.pages.MyAccount2_Vendor;
import spendinggood.pages.StoreManager;
import spendinggood.utilities.ConfigReader;
import spendinggood.utilities.Driver;
import spendinggood.utilities.ReusableMethods;

public class US15 {
    @BeforeMethod
    public void beforeMethod() {
        AnaSayfa anaSayfa = new AnaSayfa();


        //Ana Sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(1);
        //Sign In Butonuna tıkla
        anaSayfa.signInButton.click();

        //Vendor username ve password girilir
        anaSayfa.vendorUsername.sendKeys(ConfigReader.getProperty("vendorUsernameAK"));
        anaSayfa.vendorPassword.sendKeys(ConfigReader.getProperty("vendorPasswordAK"));

        //Sign in e tiklanir
        anaSayfa.vendorSignIn.click();
        ReusableMethods.waitFor(8);

        //My Account a tikla
        anaSayfa.myAccountButton.click();
        ReusableMethods.waitFor(1);

        //Store Manager Linkine tikla
        MyAccount2_Vendor myAccount2_vendor = new MyAccount2_Vendor();
        myAccount2_vendor.storeManagerButton.click();
        ReusableMethods.waitFor(1);

        //Products --> Add New tikla
        StoreManager storeManager = new StoreManager();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);

        actions.moveToElement(storeManager.productsLink).perform();
        ReusableMethods.waitFor(1);
        actions.moveToElement(storeManager.productAddNewButton).click().perform();
        ReusableMethods.waitFor(1);

    }

    @Test
    public void test01() {
        StoreManager storeManager = new StoreManager();
        Actions actions = new Actions(Driver.getDriver());

        //Kullanici inventory alanini gorur ve tiklar.
        ReusableMethods.scrollIntoViewJS(storeManager.inventory);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(storeManager.inventory.isDisplayed());
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(storeManager.inventory);
        ReusableMethods.waitFor(2);

        //Kullanıcı SKU alanını tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.sku);
        ReusableMethods.waitFor(3);
        storeManager.sku.sendKeys("stoklar");
        ReusableMethods.waitFor(3);

        //Kullanıcı manage_stocktik alanına  tıklar
        ReusableMethods.clickByJS(storeManager.manage_stocktik);
        ReusableMethods.waitFor(3);

        //Kullanıcı stock_qty alanına  tıklar  ve doldurur

        ReusableMethods.clickByJS(storeManager.stock_qty);
        ReusableMethods.waitFor(3);
        storeManager.stock_qty.sendKeys("123");
        ReusableMethods.waitFor(3);

        //Kullanıcı allowbackorders alanına tıklar
        ReusableMethods.clickByJS(storeManager.allowbackorders);
        ReusableMethods.waitFor(3);
        storeManager.allowbackorders.sendKeys("Allow");

        //Kullanıcı sold_individually alanına tıklar
        ReusableMethods.clickByJS(storeManager.sold_individuallytik);
        ReusableMethods.waitFor(3);



        //Kullanıcı shipping alanını görür ve tıklar
        ReusableMethods.scrollIntoViewJS(storeManager.shipping);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(storeManager.shipping.isDisplayed());
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(storeManager.shipping);
        ReusableMethods.waitFor(2);

        //Kullanıcı weight alanını tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.weight);
        ReusableMethods.waitFor(2);
        storeManager.weight.sendKeys("345 kg");
        ReusableMethods.waitFor(2);

        //Kullanıcı length  alanını tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.length);
        ReusableMethods.waitFor(2);
        storeManager.length.sendKeys("233 cm");
        ReusableMethods.waitFor(2);

        //Kullanıcı width  alanını tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.width);
        ReusableMethods.waitFor(2);
        storeManager.width.sendKeys("147 cm");
        ReusableMethods.waitFor(2);

        //Kullanıcı height alanını tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.height);
        ReusableMethods.waitFor(2);
        storeManager.height.sendKeys("455 cm");
        ReusableMethods.waitFor(2);

        //Kullanıcı shipping_class  alanını tıklar
        ReusableMethods.clickByJS(storeManager.shipping_class);
        ReusableMethods.waitFor(2);

        //Kullanıcı processingtime alanını tıklar
        ReusableMethods.clickByJS(storeManager.processingtime);
        ReusableMethods.waitFor(2);
        storeManager.processingtime.sendKeys("1 business day");


        ReusableMethods.clickByJS(storeManager.Attributes);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(storeManager.color);
        ReusableMethods.waitFor(3);
        storeManager.color.sendKeys("violeta");
        ReusableMethods.waitFor(3);

        //Kullanıcı SEO linkini görür ve tıklar
        ReusableMethods.scrollIntoViewJS(storeManager.SEO);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(storeManager.SEO.isDisplayed());
        ReusableMethods.clickByJS(storeManager.SEO);
        ReusableMethods.waitFor(3);

        //Kullanıcı enterfocuskeyword alanına tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.enterfocuskeyword);
        ReusableMethods.waitFor(3);
        storeManager.enterfocuskeyword.sendKeys("ürünler");
        ReusableMethods.waitFor(3);

        //Kullanıcı metadescription alanına tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.metadescription);
        ReusableMethods.waitFor(3);
        storeManager.metadescription.sendKeys("ürün satış");


        //Kullanıcı toptan ürün gösterme ayarları linkini görür ve tıklar
        ReusableMethods.scrollIntoViewJS(storeManager.toptanurungöstermeayarları);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(storeManager.toptanurungöstermeayarları.isDisplayed());
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(storeManager.toptanurungöstermeayarları);
        ReusableMethods.waitFor(3);

        //Kullanıcı piecetype alanını tıklar
        ReusableMethods.clickByJS(storeManager.piecetype);
        ReusableMethods.waitFor(3);
        storeManager.piecetype.sendKeys("Carton");

        //Kullanıcı unitsperpiece alanını tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.unitsperpiece);
        ReusableMethods.waitFor(3);
        storeManager.unitsperpiece.sendKeys("265");
        ReusableMethods.waitFor(3);

        //Kullanıcı minorderquantty alanını tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.minorderquantty);
        ReusableMethods.waitFor(3);
        storeManager.minorderquantty.sendKeys("355");
        ReusableMethods.waitFor(3);


        //Kullanıcı advanced linkini görür ve tıklar
        ReusableMethods.scrollIntoViewJS(storeManager.advenced);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(storeManager.advenced.isDisplayed());
        ReusableMethods.clickByJS(storeManager.advenced);
        ReusableMethods.waitFor(3);

        //Kullanıcı enable_reviews alanını  tıklar
        ReusableMethods.clickByJS(storeManager.enable_reviews_tik);
        ReusableMethods.waitFor(3);

        //Kullanıcı menuarder alanını tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.menuorder);
        ReusableMethods.waitFor(3);
        storeManager.menuorder.sendKeys("150");

        //Kullanıcı purchasenote alanını tıklar ve doldurur
        ReusableMethods.clickByJS(storeManager.purchasenote);
        ReusableMethods.waitFor(3);
        storeManager.purchasenote.sendKeys("ürün teslimi");






    }
}