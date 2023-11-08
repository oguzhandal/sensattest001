package com.sensat.tests.test;

import com.sensat.pages.*;
import com.sensat.tests.base.BaseTest;
import org.testng.annotations.Test;
import qmframework.Parameters;

public class CreateAdvertsInformationPageTests extends BaseTest {
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ProfilPage profilPage;
    protected CPCorporateİnfo cpCorporateİnfo;
    protected CreateAdvertPage createAdvertPage;
    protected CreateAdvertsInformationsSpecs createAdvertsInformationsSpecs;

        @Test(priority = 0,description = "Bireysel Kullanıcı/İlan Önizleme Alanları Kontrolü")
    public void CreateVehicleSaleInformation(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        cpCorporateİnfo=new CPCorporateİnfo(page);
        createAdvertPage=new CreateAdvertPage(page);
        createAdvertsInformationsSpecs=new CreateAdvertsInformationsSpecs(page);
        page.pause();
        homePage.cerezizinver();
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickİlanVerButton();
        createAdvertPage.clickOtomobilButton();
        createAdvertPage.clickChoiceYear();
        createAdvertPage.clickYear();
        createAdvertsInformationsSpecs.verifyYear();
        createAdvertPage.clickChoiceBrand();
        createAdvertPage.clickBrand();
        createAdvertsInformationsSpecs.verifyBrand();
        createAdvertPage.clickChoiceModel();
        createAdvertPage.clickModels();
        createAdvertsInformationsSpecs.verifyModel();
        createAdvertPage.clickChoiceBodyType();
        createAdvertPage.clickBodyTypes();
        createAdvertsInformationsSpecs.verifyBodyTypes();
        createAdvertPage.clickChoiceGearBox();
        createAdvertPage.clickGearBoxs();
        createAdvertsInformationsSpecs.verifyGearBox();
        createAdvertPage.clickChoiceFuel();
        createAdvertPage.clickFuels();
        createAdvertsInformationsSpecs.verifyFuels();
        createAdvertPage.clickChoiceSubModel();
        createAdvertPage.clickSubModels();
        createAdvertsInformationsSpecs.verifySubModels();
        createAdvertPage.clickButtonDevamEt();
        createAdvertPage.verifyKilometreText();
        createAdvertPage.sendKilometre();
        createAdvertsInformationsSpecs.verifyKm();
        homePage.clickHeaderLogo();
        createAdvertPage.clickIlanTaslakButton();
        homePage.verifyHeaderLogo();
        //homePage.logoutScenario();
    }

        @Test(priority = 0,description = "Kurumsal Kullanıcı/İlan Önizleme Alanları Kontrolü")
    public void CreateVehicleSaleInformation2(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        cpCorporateİnfo=new CPCorporateİnfo(page);
        createAdvertPage=new CreateAdvertPage(page);
        createAdvertsInformationsSpecs=new CreateAdvertsInformationsSpecs(page);
        homePage.cerezizinver();
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickİlanVerButton();
        createAdvertPage.clickMyAdvert();
        createAdvertPage.clickStartAdvert();
        createAdvertPage.clickOtomobilButton();
        createAdvertPage.clickChoiceYear();
        createAdvertPage.clickYear();
        createAdvertsInformationsSpecs.verifyYear();
        createAdvertPage.clickChoiceBrand();
        createAdvertPage.clickBrand();
        createAdvertsInformationsSpecs.verifyBrand();
        createAdvertPage.clickChoiceModel();
        createAdvertPage.clickModels();
        createAdvertsInformationsSpecs.verifyModel();
        createAdvertPage.clickChoiceBodyType();
        createAdvertPage.clickBodyTypes();
        createAdvertsInformationsSpecs.verifyBodyTypes();
        createAdvertPage.clickChoiceGearBox();
        createAdvertPage.clickGearBoxs();
        createAdvertsInformationsSpecs.verifyGearBox();
        createAdvertPage.clickChoiceFuel();
        createAdvertPage.clickFuels();
        createAdvertsInformationsSpecs.verifyFuels();
        createAdvertPage.clickChoiceSubModel();
        createAdvertPage.clickSubModels();
        createAdvertsInformationsSpecs.verifySubModels();
        createAdvertPage.clickButtonDevamEt();
        createAdvertPage.verifyKilometreText();
        createAdvertPage.sendKilometre();
        createAdvertsInformationsSpecs.verifyKm();
        homePage.clickHeaderLogo();
        createAdvertPage.clickIlanTaslakButton();
        homePage.verifyHeaderLogo();
        //homePage.logoutScenario();
    }
}
