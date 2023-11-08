package com.sensat.tests.test;

import com.sensat.pages.*;
import com.sensat.tests.base.BaseTest;
import org.testng.annotations.Test;
import qmframework.Parameters;

public class ProfilPageTests extends BaseTest {

    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ProfilPage profilPage;

    protected CPCorporateİnfo cpCorporateİnfo;


    @Test(priority = 0,description = "Corporate-info ad-vergi no güncelleme(Sahis hesap)")
    public void loginSecanerio() throws InterruptedException {
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        cpCorporateİnfo=new CPCorporateİnfo(page);

        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User2_Email,Parameters.User2_Password);
        homePage.verifySectionText();
        homePage.clickAvatar();
       // homePage.clickAvatarÜyelikİslemlerim();
        profilPage.verifyÜyelikİslemlerimTitle();
        cpCorporateİnfo.verifyTextHesapBilgileri();
        cpCorporateİnfo.sendNameUpdate();
        cpCorporateİnfo.clickCorporateRadioButton();
        cpCorporateİnfo.sendVergiNoUpdate();
        cpCorporateİnfo.clickGüncelleButton();
        cpCorporateİnfo.verifySuccesPopup();
        homePage.logoutScenario();
    }
}
