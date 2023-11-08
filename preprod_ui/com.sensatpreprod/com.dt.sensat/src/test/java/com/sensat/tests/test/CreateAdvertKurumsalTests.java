package com.sensat.tests.test;

import com.sensat.pages.*;
import com.sensat.tests.base.BaseTest;
import org.testng.annotations.Test;
import qmframework.Parameters;

public class CreateAdvertKurumsalTests extends BaseTest {
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ProfilPage profilPage;
    protected CPCorporateİnfo cpCorporateİnfo;
    protected CreateAdvertPage createAdvertPage;

    @Test(description = "Kurumsal Kullanıcı/Satılık/Suv İlan ")
    public void CreateVehicleSaleSuv() {
        loginPage = new LoginPage(page);
        homePage = new HomePage(page);
        profilPage = new ProfilPage(page);
        cpCorporateİnfo = new CPCorporateİnfo(page);
        createAdvertPage = new CreateAdvertPage(page);
        homePage.cerezizinver();
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User3_Email, Parameters.User3_Password);
        homePage.clickİlanVerButton();
        createAdvertPage.clickMyAdvert();
        createAdvertPage.clickStartAdvert();
        createAdvertPage.clickSUVButton();
        createAdvertPage.clickChoiceYear();
        createAdvertPage.clickYear();
        createAdvertPage.clickChoiceBrand();
        createAdvertPage.clickChoiceBrandAudı();
        createAdvertPage.clickChoiceModel();
        createAdvertPage.clickChoiceModelQ8();
        createAdvertPage.clickChoiceBodyType();
        createAdvertPage.clickBodyTypesArazi();
        createAdvertPage.clickChoiceGearBox();
        createAdvertPage.clickGearBoxsOtomatik();
        createAdvertPage.clickChoiceFuel();
        createAdvertPage.clickFuels();
        createAdvertPage.clickButtonDevamEt();
        createAdvertPage.verifyKilometreText();
        createAdvertPage.sendKilometre();
        createAdvertPage.clickDatePicker();
        createAdvertPage.clickPlateType();
        createAdvertPage.sendPlateNumber();
        createAdvertPage.sendFrameNo();
        createAdvertPage.sendMotorNo();
        createAdvertPage.clickİnputFiles();
        createAdvertPage.clickColor();
        createAdvertPage.clickColors();
        createAdvertPage.clickButtonDevamEt2();
        createAdvertPage.sendPrice();
        createAdvertPage.clickGarantisiVar();
        createAdvertPage.clickTakasaUygun();
        createAdvertPage.clickRehinVar();
        createAdvertPage.clickHacizVar();
        createAdvertPage.clickOrjinal();
        createAdvertPage.clickHasarKaydiYok();
        createAdvertPage.clickButtonDevamEt3();
        createAdvertPage.verifyİletisimTercihleri();
        createAdvertPage.clickDevamEtİletisim();
        createAdvertPage.clickKuralOnay();
        createAdvertPage.clickİlanıOnayGönder();
        createAdvertPage.verifyCreatAdvertResult();
        homePage.logoutScenario();
    }

    @Test(description = "Kurumsal Kullanıcı/Satılık/Oto İlan ")
    public void CreateVehicleSaleOto() {
        loginPage = new LoginPage(page);
        homePage = new HomePage(page);
        profilPage = new ProfilPage(page);
        cpCorporateİnfo = new CPCorporateİnfo(page);
        createAdvertPage = new CreateAdvertPage(page);
        homePage.cerezizinver();
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User3_Email, Parameters.User3_Password);
        homePage.clickİlanVerButton();
        createAdvertPage.clickMyAdvert();
        createAdvertPage.clickStartAdvert();
        createAdvertPage.clickOtomobilButton();
        createAdvertPage.clickChoiceYear();
        createAdvertPage.clickYear();
        createAdvertPage.clickChoiceBrand();
        createAdvertPage.clickBrand();
        createAdvertPage.clickChoiceModel();
        createAdvertPage.clickChoiceModelEgea();
        createAdvertPage.clickChoiceBodyType();
        createAdvertPage.clickBodyTypes();
        createAdvertPage.clickChoiceGearBox();
        createAdvertPage.clickGearBoxs();
        createAdvertPage.clickChoiceFuel();
        createAdvertPage.clickFuels();
        createAdvertPage.clickChoiceSubModel();
        createAdvertPage.clickSubModelsUrban();
        createAdvertPage.clickButtonDevamEt();
        createAdvertPage.verifyKilometreText();
        createAdvertPage.sendKilometre();
        createAdvertPage.clickDatePicker();
        createAdvertPage.clickPlateType();
        createAdvertPage.sendPlateNumber();
        createAdvertPage.sendFrameNo();
        createAdvertPage.sendMotorNo();
        createAdvertPage.clickİnputFiles();
        createAdvertPage.clickColor();
        createAdvertPage.clickColors();
        createAdvertPage.clickButtonDevamEt2();
        createAdvertPage.sendPrice();
        createAdvertPage.clickGarantisiVar();
        createAdvertPage.clickTakasaUygun();
        createAdvertPage.clickRehinVar();
        createAdvertPage.clickHacizVar();
        createAdvertPage.clickOrjinal();
        createAdvertPage.clickHasarKaydiYok();
        createAdvertPage.clickButtonDevamEt3();
        createAdvertPage.verifyİletisimTercihleri();
        createAdvertPage.clickDevamEtİletisim();
        createAdvertPage.clickKuralOnay();
        createAdvertPage.clickİlanıOnayGönder();
        createAdvertPage.verifyCreatAdvertResult();
        homePage.logoutScenario();
    }
}
