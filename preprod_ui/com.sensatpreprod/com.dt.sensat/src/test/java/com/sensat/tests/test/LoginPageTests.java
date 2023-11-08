package com.sensat.tests.test;

import com.sensat.pages.*;
import com.sensat.tests.base.BaseTest;
import org.testng.annotations.Test;
import qmframework.Parameters;

public class LoginPageTests extends BaseTest {

    protected LoginPage loginPage;
    protected HomePage  homePage;
    protected ProfilPage profilPage;
    protected RegisterPage registerPage;
    protected SearchPage searchPage;
    protected VehicleDetailPage vehicleDetailPage;


    @Test(testName = "C001 Login - Başarılı Giriş")
    public void C001()  {
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.verifyLogo();
        loginPage.verifyLoginBeniHatırlıButton();
        loginPage.verifySifremiUnuttumButton();
        loginPage.verifyHemenÜyeOlButton();
        loginPage.doLogin(Parameters.User1_Email, Parameters.User1_Password);
        homePage.verifySectionText();
        homePage.logoutScenario();
    }

    @Test(description = "Login sayfası alanlar kontrolü(giriş yap text,logo,beni hatırla,sifremi unuttum,hemen uye ol)")
    public void S5001()  {
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.verifyLogo();
        loginPage.verifyLoginBeniHatırlıButton();
        loginPage.verifySifremiUnuttumButton();
        loginPage.verifyHemenÜyeOlButton();
        loginPage.doLogin(Parameters.User1_Email, Parameters.User1_Password);
        homePage.verifySectionText();
        homePage.logoutScenario();
    }

    @Test(description = "Login sayfası alanlar kontrolü(Slider text,kulllanım kosulları gizlilik , cerez politikası ,aydınlatma metni alanları)")
    public void S5003() throws InterruptedException {
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.verifySliderText();
        loginPage.verifyKullanımKosullarıVeGizlilikButton();
        loginPage.verifyCerezPolitikasıButton();
        loginPage.verifyAydınlatmaMetni();
        loginPage.doLogin(Parameters.User1_Email, Parameters.User1_Password);
        homePage.verifySectionText();
        homePage.logoutScenario();
    }


    @Test(description = "Bireysel kullanıcı login ana sayfa text kontrolü")
    public void S5002() throws InterruptedException {
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.Fail_User_Email, Parameters.Fail_User_Password);
        loginPage.verifyFailPopup();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.verifySectionText();
        homePage.verifyİnputSearch();
        homePage.verifyİsAnaSyafaAraButton();
        homePage.verifySearchSelectDropdown();
        homePage.logoutScenario();

    }
    @Test(description = "Kurumsal kullanıcı login ana sayfa text kontrolü")
    public void S5010() throws InterruptedException {
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.Fail_User_Email, Parameters.Fail_User_Password);
        loginPage.verifyFailPopup();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.verifySectionText();
        homePage.verifyİnputSearch();
        homePage.verifyİsAnaSyafaAraButton();
        homePage.verifySearchSelectDropdown();
        homePage.logoutScenario();

    }

    @Test(description = "Bireysel kullanıcı Header İlan ver buton login kontrolü")
    public void S5004(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickİlanVerButton();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.verifySectionText();
        homePage.verifyİnputSearch();
        homePage.verifyİsAnaSyafaAraButton();
        homePage.verifySearchSelectDropdown();
        homePage.logoutScenario();

    }
    @Test(description = "Kurumsal kullanıcı Header İlan ver buton login kontrolü")
    public void S5011() {
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickİlanVerButton();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.verifySectionText();
        homePage.verifyİnputSearch();
        homePage.verifyİsAnaSyafaAraButton();
        homePage.verifySearchSelectDropdown();
        homePage.logoutScenario();

    }
    @Test(description = "Bireysel kullanıcı Header Favorilerim button login kontrolü")
    public void S5005(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickFavorilerimButton();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.verifySectionText();
        homePage.verifyİnputSearch();
        homePage.verifyİsAnaSyafaAraButton();
        homePage.verifySearchSelectDropdown();
        homePage.logoutScenario();

    }
    @Test(description = "Kurumsal kullanıcı Header Favorilerim button login kontrolü")
    public void S5012(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickFavorilerimButton();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.verifySectionText();
        homePage.verifyİnputSearch();
        homePage.verifyİsAnaSyafaAraButton();
        homePage.verifySearchSelectDropdown();
        homePage.logoutScenario();

    }
    @Test(description = "Bireysel kullanıcı Footer İlan Ver button login kontrolü")
    public void S5006(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickNavbarButtom();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.verifySectionText();
        homePage.verifyİnputSearch();
        homePage.verifyİsAnaSyafaAraButton();
        homePage.verifySearchSelectDropdown();
        homePage.logoutScenario();

    }
    @Test(description = "Kurumsal kullanıcı Footer İlan Ver button login kontrolü")
    public void S5013(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        homePage.clickNavbarButtom();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.verifySectionText();
        homePage.verifyİnputSearch();
        homePage.verifyİsAnaSyafaAraButton();
        homePage.verifySearchSelectDropdown();
        homePage.logoutScenario();

    }

    @Test(description = "Bireysel kullanıcı Register Sayfasına Yönlenip Tekrar Login Sayfasına Gelip Login olması")
    public void S5007(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        registerPage=new RegisterPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginGirisYapinText();
        loginPage.clickHemenUyeOlButton();
        page.navigate("https://webpreprod.sensat.com/giris-yap");
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.verifySectionText();
        homePage.verifyİnputSearch();
        homePage.verifyİsAnaSyafaAraButton();
        homePage.verifySearchSelectDropdown();
        homePage.logoutScenario();

    }

    @Test(description = "Kurumsal kullanıcı Register Sayfasına Yönlenip Tekrar Login Sayfasına Gelip Login olması")
    public void S5014(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        registerPage=new RegisterPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginGirisYapinText();
        loginPage.clickHemenUyeOlButton();
        page.navigate("https://webpreprod.sensat.com/giris-yap");
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.verifySectionText();
        homePage.verifyİnputSearch();
        homePage.verifyİsAnaSyafaAraButton();
        homePage.verifySearchSelectDropdown();
        homePage.logoutScenario();

    }
    @Test(description = "Bireysel kullanıcı İlan detay favoriye ekleme login kontrolü")
    public void S5008(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        searchPage=new SearchPage(page);
        vehicleDetailPage=new VehicleDetailPage(page);
        homePage.clickSearchAraButton();
        searchPage.clickAdvertsOne();
        vehicleDetailPage.clickFavoriAdd();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        vehicleDetailPage.verifyNotificationSucces();
        homePage.logoutScenario();

    }
    @Test(description = "Kurumsal kullanıcı İlan detay favoriye ekleme login kontrolü")
    public void S5015(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        searchPage=new SearchPage(page);
        vehicleDetailPage=new VehicleDetailPage(page);
        homePage.clickSearchAraButton();
        searchPage.clickAdvertsOne();
        vehicleDetailPage.clickFavoriAdd();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        vehicleDetailPage.verifyNotificationSucces();
        homePage.logoutScenario();

    }

    @Test(description = "Bireysel kullanıcı İlan detay Mesaj Gönder  login kontrolü")
    public void S5009(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        searchPage=new SearchPage(page);
        vehicleDetailPage=new VehicleDetailPage(page);
        homePage.clickSearchAraButton();
        searchPage.clickAdvertsOne();
        vehicleDetailPage.clickMessageButton();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        vehicleDetailPage.verifyNotificationSucces();
        homePage.logoutScenario();

    }
    @Test(description = "Kurumsal kullanıcı İlan detay Mesaj Gönder  login kontrolü")
    public void S5016(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        searchPage=new SearchPage(page);
        vehicleDetailPage=new VehicleDetailPage(page);
        homePage.clickSearchAraButton();
        searchPage.clickAdvertsOne();
        vehicleDetailPage.clickMessageButton();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        vehicleDetailPage.verifyNotificationSucces();
        homePage.logoutScenario();

    }



}
