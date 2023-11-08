package com.sensat.pages;

import com.microsoft.playwright.JSHandle;
import com.microsoft.playwright.Mouse;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import qmframework.Commands;
import qmframework.Load;
import qmframework.MouseController;
import qmframework.Parameters;


import java.awt.*;
import java.util.Properties;
import java.util.concurrent.locks.Condition;

public class LoginPage {
    Properties prop;
    private Page page;
    //string Locator
    MouseController mouseController = new MouseController();
    HomePage homePage=new HomePage(page);
    private String emailId = "[data-test=\"login-email-input\"]";

    private String textGrisYapın="text= sensat.com Hesabına Giriş Yap ";
    private String textLoginForm="text=sensat.com Hesabına Giriş Yap";
    private String forgotPassword = "[data-test=\"login-forgot-password\"]";


    private String password = "//input[@type='password']";
    private String loginButton ="[data-test=\"login-submit\"]";

    private String loginlink ="//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-input-search-button']";

    private String text ="//div[normalize-space()='Sahibinden']";
    private String searchIcon ="div#search button";
    private String searchPageHeader ="div#content h1"; //div id=content arama sonucu h1 tag

    private String myaccount="//span[normalize-space()='My Account']"; //a[title='My Account'];

    private String hataliepostasifrepopup=".ant-notification-notice"; //a[title='My Account'];

    private String sensatLogoLogin="//img[@alt='Sensat']";

    private String loginBeniHatırlaButton="Beni Hatırla";

    private String loginHemenÜyeOlButton="Hemen üye olun";

    private String loginSliderText="‘den fazla araç Sensat’ta seni bekliyor.";

    private String loginKullanımKosullarıVeGizliliButton="Kullanım Koşulları ve Gizlilik";

    private String loginCerezPolitikasıButton="Çerez Politikası";

    private String loginAydınlatmaMetniButton="Aydınlatma Metni";
    private String buttonHemenUyeOl="//a[contains(text(),'Hemen üye olun.')]";
    private String buttonKurumsalÜyeOl="//div[@data-test='register-corporate-page']//a[1]";


    //page constructor:

    public  LoginPage(Page page){
        this.page =page;
    }
    //page actions/methods:
    public void doLogin(String appUserName, String appPassword) {

//        int x = 100;
//        int y = 100;
//        mouseController.moveMouse(x, y);
        page.waitForTimeout(2000);
        System.out.println("Username :" + appUserName + "Password:" + appPassword);
        page.fill(emailId, appUserName);
        page.fill(password, appPassword);
        for (int i = 0; i < 3 ; i++) {
            Commands.Click(page, loginButton);
        }
    }




    public void verifyLoginGirisYapinText() {
        //page.querySelector(textLoginForm).isVisible();
        Commands.isVisible(page,textLoginForm);
    }

    public void verifyFailPopup() {
        page.locator(hataliepostasifrepopup).isVisible();
    }

    public void verifyLogo() {
        page.locator(sensatLogoLogin).isVisible();
    }

    public void verifyLoginBeniHatırlıButton() {
        page.getByText(loginBeniHatırlaButton).isVisible();

    }

    public void verifySifremiUnuttumButton() {
        page.locator(forgotPassword).isVisible();
    }

    public void verifyHemenÜyeOlButton() {
        page.getByText(loginHemenÜyeOlButton).isVisible();
    }

    public void verifySliderText() {
        page.getByText(loginSliderText).nth(1).isVisible();
    }

    public void verifyKullanımKosullarıVeGizlilikButton() {
        page.getByText(loginKullanımKosullarıVeGizliliButton).isVisible();

    }

    public void verifyCerezPolitikasıButton() {
        page.getByText(loginCerezPolitikasıButton).isVisible();

    }

    public void verifyAydınlatmaMetni() {
        page.getByText(loginAydınlatmaMetniButton).isVisible();
    }

    public void clickHemenUyeOlButton() {
        Commands.Click(page,buttonHemenUyeOl);
    }

    public void clickKurumsalÜyeButton() {
        Commands.Click(page,buttonKurumsalÜyeOl);
    }

    public void verifyLoginTextDeneme() {
        page.waitForTimeout(2000);
        //Load.waitUntilDomLoaded(page);
        Commands.isVisible(page,textLoginForm);

    }
}
