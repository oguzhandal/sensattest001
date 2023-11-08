package com.sensat.tests.test;

import com.sensat.pages.*;
import com.sensat.tests.base.BaseTest;
import org.testng.annotations.Test;

import java.util.Base64;

public class HomePageSearchTests extends BaseTest {

    protected HomePage homePage;
    protected ProfilPage profilPage;
    protected IlanPage ilanPage;
    protected VasitaPage vasitaPage;

    @Test(priority = 1,description = "Home Page Arac Arama")
    public void homePage1001() {
        loginPage = new LoginPage(page);
        homePage = new HomePage(page);
        profilPage = new ProfilPage(page);
        ilanPage = new IlanPage(page);
        vasitaPage = new VasitaPage(page);

        homePage.buttonAracArama();
        vasitaPage.headerKontrolu("asefas");
    }
}
