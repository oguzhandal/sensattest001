package com.sensat.tests.test;

import com.sensat.pages.HomePage;
import com.sensat.pages.IlanPage;
import com.sensat.pages.LoginPage;
import com.sensat.pages.ProfilPage;
import com.sensat.tests.base.BaseTest;
import org.testng.annotations.Test;
import qmframework.Commands;
import qmframework.Parameters;

public class HomePageTests extends BaseTest {

    protected HomePage homePage;
    protected ProfilPage profilPage;
    protected IlanPage ilanPage;

   @Test(priority = 0,description = "Home page header alanlar kontrolü(Non-secure)")
    public void homePageHeaderControl(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.verifySensatLogo();
        homePage.verifySeacrhTab();
        homePage.verifySearchAraButtonFilter();
        homePage.verifyIlanVerButton();
        homePage.verifyKarsilastirButton();
        homePage.verifyFavorilerimButton();
        homePage.verifyLoginRegisterAvatar();
        homePage.verifyOtomobilIcon();
        homePage.verifySuvPickUpIcon();
        homePage.verifyHaifTicariIcon();
        homePage.verifyBannerText();
        homePage.verifySearchCategoryButton();
        homePage.verifySearchYearButton();
        homePage.verifySearchBrandButton();
        homePage.verifySearchModelButton();
        homePage.verifySearchAraButton();
    }

    @Test(priority = 0,description = "Home page Öne çıkan-Editörün Secimler-Sensat Tanitim Alanlar kontrolü(Non-secure)")
    public void homePageShowCaseListeleme(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.verifySensatLogo();
        homePage.verifyShowCaseText();
        homePage.verifyTumAraclariInceleButton();
        homePage.verifyEditorunSecimleriText();
        homePage.verifyEditorunSecimleriAlanlar();
        homePage.verifyTanitimSensatText();
        homePage.verifyTanitimAlanlar();
    }

    @Test(priority = 0,description = "Home page Markalar alanlar Kontrolü(Non-secure)")
    public void homePageMarkaAlanlarKontrolü(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.verifySensatLogo();
        homePage.verifyFooterBrandsText();
        homePage.verifyFooterOtomobilBrand();
        homePage.clickFooterBrandSuvPickup();
        homePage.verifyFooterBrandSucPickup();
        homePage.clickFooterBrandHafifTicari();
        homePage.verifyFooterBrandHafifTicari();
    }

    @Test(priority = 0,description = "Home page Markalar alanlar Kontrolü(Non-secure)")
    public void homePageFooterAlanlarKontrolu(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.verifySensatLogo();
        homePage.verifyFooterIlanVerButton();
        homePage.verifyFooterTopMenuItem();
        homePage.verifyBlockMenuItem();
        homePage.verifyFooterBlockInfoText();
        homePage.verifyFooterSupportButton();

    }
    @Test(priority = 0,description = "Home page header alanlar kontrolü(Bireysel Hesap)")
    public void homePageHeaderControlBireyselKullanici(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.verifySensatLogo();
        homePage.verifySeacrhTab();
        homePage.verifySearchAraButtonFilter();
        homePage.verifyIlanVerButton();
        homePage.verifyKarsilastirButton();
        homePage.verifyFavorilerimButton();
        homePage.verifyLoginRegisterAvatar();
        homePage.verifyOtomobilIcon();
        homePage.verifySuvPickUpIcon();
        homePage.verifyHaifTicariIcon();
        homePage.verifyBannerText();
        homePage.verifySearchCategoryButton();
        homePage.verifySearchYearButton();
        homePage.verifySearchBrandButton();
        homePage.verifySearchModelButton();
        homePage.verifySearchAraButton();
        homePage.logoutScenario();
    }
    @Test(priority = 0,description = "Home page Öne çıkan-Editörün Secimler-Sensat Tanitim Alanlar kontrolü(Bireysel Kullanıcı)")
    public void homePageShowCaseListelemeBireyselKullanici(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.verifySensatLogo();
        homePage.verifyShowCaseText();
        homePage.verifyAdverMercedes();
        homePage.verifyTumAraclariInceleButton();
        homePage.verifyEditorunSecimleriText();
        homePage.verifyEditorunSecimleriAlanlar();
        homePage.verifyTanitimSensatText();
        homePage.verifyTanitimAlanlar();
        homePage.logoutScenario();
    }

  /*  @Test(priority = 0,description = "Home page Markalar alanlar Kontrolü(Bireysel Hesap)")
    public void homePageMarkaAlanlarKontroluBireyselHesap(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.verifySensatLogo();
        homePage.verifyFooterBrandsText();
        homePage.verifyFooterOtomobilBrand();
        homePage.clickFooterBrandSuvPickup();
        homePage.verifyFooterBrandSucPickup();
        homePage.clickFooterBrandHafifTicari();
        homePage.verifyFooterBrandHafifTicari();
        homePage.logoutScenario();

    }*/

    @Test(priority = 0,description = "Home page Markalar alanlar Kontrolü(Bireysel Kullanıcı)")
    public void homePageFooterAlanlarKontroluBiresyelKullanici(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.verifySensatLogo();
        homePage.verifyFooterIlanVerButton();
        homePage.verifyFooterTopMenuItem();
        homePage.verifyBlockMenuItem();
        homePage.verifyFooterBlockInfoText();
        homePage.verifyFooterSupportButton();
        homePage.logoutScenario();
    }
    @Test(priority = 0,description = "Home page header alanlar kontrolü(Kurumsal Sahis Hesap)")
    public void homePageHeaderControlKurumsalKullanici(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User2_Email,Parameters.User2_Password);
        homePage.verifySensatLogo();
        homePage.verifySeacrhTab();
        homePage.verifySearchAraButtonFilter();
        homePage.verifyIlanVerButton();
        homePage.verifyKarsilastirButton();
        homePage.verifyFavorilerimButton();
        homePage.verifyLoginRegisterAvatar();
        homePage.verifyOtomobilIcon();
        homePage.verifySuvPickUpIcon();
        homePage.verifyHaifTicariIcon();
        homePage.verifyBannerText();
        homePage.verifySearchCategoryButton();
        homePage.verifySearchYearButton();
        homePage.verifySearchBrandButton();
        homePage.verifySearchModelButton();
        homePage.verifySearchAraButton();
        homePage.logoutScenario();
    }
    @Test(priority = 0,description = "Home page Öne çıkan-Editörün Secimler-Sensat Tanitim Alanlar kontrolü(Kurumsal Sahis Hesap)")
    public void homePageShowCaseListelemeKurumsalKullanici(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User2_Email,Parameters.User2_Password);
        homePage.verifySensatLogo();
        homePage.verifyShowCaseText();
        homePage.verifyAdverMercedes();
        homePage.verifyTumAraclariInceleButton();
        homePage.verifyEditorunSecimleriText();
        homePage.verifyEditorunSecimleriAlanlar();
        homePage.verifyTanitimSensatText();
        homePage.verifyTanitimAlanlar();
        homePage.logoutScenario();
    }
 /*   @Test(priority = 0,description = "Home page Markalar alanlar Kontrolü(Kurumsal Sahis Hesap)")
    public void homePageMarkaAlanlarKontroluKurumsalHesap(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User2_Email,Parameters.User2_Password);
        homePage.verifySensatLogo();
        homePage.verifyFooterBrandsText();
        homePage.verifyFooterOtomobilBrand();
        homePage.clickFooterBrandSuvPickup();
        homePage.verifyFooterBrandSucPickup();
        homePage.clickFooterBrandHafifTicari();
        homePage.verifyFooterBrandHafifTicari();
        homePage.logoutScenario();

    }*/

    @Test(priority = 0,description = "Home page Markalar alanlar Kontrolü(Kurumsal Sahis Hesap)")
    public void homePageFooterAlanlarKontroluKurumsalKullanici(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        ilanPage = new IlanPage(page);

        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User2_Email,Parameters.User2_Password);
        homePage.verifySensatLogo();
        homePage.verifyFooterIlanVerButton();
        homePage.verifyFooterTopMenuItem();
        homePage.verifyBlockMenuItem();
        homePage.verifyFooterBlockInfoText();
        homePage.verifyFooterSupportButton();
        homePage.logoutScenario();
    }




}
