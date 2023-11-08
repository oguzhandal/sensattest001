package com.sensat.tests.test;

import com.sensat.pages.HomePage;
import com.sensat.pages.LoginPage;
import com.sensat.pages.RegisterPage;
import com.sensat.tests.base.BaseTest;
import org.testng.annotations.Test;
import qmframework.Parameters;

public class RegisterPageTests extends BaseTest {
    protected RegisterPage registerPage;
    protected HomePage  homePage;
    protected LoginPage loginPage;

    @Test(description = "Login ekranından Register ekranına Yönlenip Otp Popup Kontrolü(Bireysel)")
    public void RegisterScenario(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.clickHemenUyeOlButton();
        registerPage.sendKeysFirstName();
        registerPage.sendKeysLastName();
        registerPage.sendKeysEmail();
        registerPage.sendKeysPhoneNumber();
        registerPage.sendKeysPassword();
        registerPage.sendKeysPasswordConfirm();
        registerPage.clickBireyselUyeMetin();
        registerPage.clickKvkkButton();
        registerPage.clickÜyeOlButton();
        registerPage.verifyOtpPopup();
        page.navigate(Parameters.url);
    }

    @Test(description = "Login ekranından Register ekranına Yönlenip Otp Popup Kontrolü(Kurumsal-Sahıs)")
    public void RegisterScenarioKurumsalSahis(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.clickHemenUyeOlButton();
        loginPage.clickKurumsalÜyeButton();
        registerPage.sendKeysFirstName();
        registerPage.sendKeysLastName();
        registerPage.sendKeysEmail();
        registerPage.sendKeysPhoneNumber();
        registerPage.sendKeysPassword();
        registerPage.sendKeysPasswordConfirm();
        registerPage.clickDevamEtButton();
        registerPage.senTcNumber();
        registerPage.sendVergiDairesiİli();
        registerPage.sendVergiDairesi();
        registerPage.sendVergiNumber();
        registerPage.sendKepAdresi();
        registerPage.sendTicariÜnvan();
        registerPage.sendFirmaPhone();
        registerPage.clickSehirSec();
        registerPage.clickİlce();
        registerPage.clickMahalle();
        registerPage.sendAdresDetay();
        registerPage.clickPolitikaOnayButton();
        registerPage.clickÜyelikTalebiButton();
        registerPage.verifyOtpPopup();
        page.navigate(Parameters.url);

    }



}
