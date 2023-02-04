package spendinggood.tests;
import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;
import spendinggood.pages.Us01;
import spendinggood.utilities.ConfigReader;
import spendinggood.utilities.Driver;

public class Us_01_Tests {

    @Test
    public void testCase01() {
        Us01 us01 = new Us01();

        //Kullanici https://spendinggood.com/ URL`ine giris yapar
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Kullanici acilan ekranda Register`a (Kayit ol) tiklar
        us01.registerButon.click();

        //Kullanici acilan ekrandaki  Username ye tiklar
        //Kullanici Username alanina valid bir isim girer
        us01.username.click();

        us01.username.sendKeys(ConfigReader.getProperty("userName"));

        us01.email.sendKeys(ConfigReader.getProperty("email"));

        us01.password.sendKeys(ConfigReader.getProperty("password"));

        us01.iagreeKutucuk.click();

        us01.signUp.click();

        Assert.assertTrue(us01.kayitUyariYazisi.isDisplayed());
    }

    @Test
    public void testCase02() {


    }
}
/*
Kullanici https://spendinggood.com/ URL`ine giris yapar
Kullanici acilan ekranda Register`a (Kayit ol) tiklar
Kullanici SIGN IN ve SIGN UP ekranina yonlendirilir
Kullanici acilan ekrandaki  e-mail ye tiklar
Kullanici Username alanina valid bir isim girer
Kullanici Your Email address alanina tiklar
Kullanici Your Email address alanina valid bir deger girer
 */