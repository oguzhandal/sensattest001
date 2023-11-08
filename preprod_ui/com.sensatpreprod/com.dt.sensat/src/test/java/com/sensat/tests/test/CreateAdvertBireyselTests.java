package com.sensat.tests.test;

import com.sensat.pages.*;
import com.sensat.tests.base.BaseTest;
import org.testng.annotations.Test;
import qmframework.Load;
import qmframework.Parameters;

public class CreateAdvertBireyselTests extends BaseTest{
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ProfilPage profilPage;
    protected CPCorporateİnfo cpCorporateİnfo;
    protected CreateAdvertPage createAdvertPage;

    @Test(description = "Bireysel Kullanıcı/Satılık/Otomobil İlan ")
    public void CreateVehicleSale() throws InterruptedException {
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        cpCorporateİnfo=new CPCorporateİnfo(page);
        createAdvertPage=new CreateAdvertPage(page);
        homePage.cerezizinver();
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User4_Email,Parameters.User4_Password);
        homePage.clickİlanVerButton();
        homePage.clickIlanVerButton();
        createAdvertPage.clickOtomobilButton();
        createAdvertPage.clickChoiceYear();
        createAdvertPage.clickYear();
        createAdvertPage.clickChoiceBrand();
        createAdvertPage.clickBrand();
        createAdvertPage.clickChoiceModel();
        createAdvertPage.clickModels();
        createAdvertPage.clickChoiceBodyType();
        createAdvertPage.clickBodyTypes();
        createAdvertPage.clickChoiceGearBox();
        createAdvertPage.clickGearBoxs();
        createAdvertPage.clickChoiceFuel();
        createAdvertPage.clickFuels();
        createAdvertPage.clickChoiceSubModel();
        createAdvertPage.clickSubModels();
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
        createAdvertPage.clickİl();
        createAdvertPage.sendİl();
        createAdvertPage.clickİlce();
        createAdvertPage.sendsİlce();
        createAdvertPage.clickMahalle();
        createAdvertPage.sendMahalle();
        createAdvertPage.clickDevamEtİletisim();
        createAdvertPage.clickKuralOnay();
        createAdvertPage.clickİlanıOnayGönder();
        createAdvertPage.verifyNotiText();
        homePage.logoutScenario();
    }

    @Test(description = "Bireysel Kullanıcı/Satılık/Suv İlan ")
    public void CreateVehicleSaleSuv() throws InterruptedException {
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        cpCorporateİnfo=new CPCorporateİnfo(page);
        createAdvertPage=new CreateAdvertPage(page);
        homePage.cerezizinver();
        homePage.clickLoginButton();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
//        homePage.clickHeaderLogo();
//        createAdvertPage.clickTaslak();
        homePage.clickİlanVerButton();
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
        createAdvertPage.clickChoiceSubModel();
        createAdvertPage.clickSubModelsQtr();
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
        createAdvertPage.clickİl();
        createAdvertPage.sendİl();
        createAdvertPage.clickİlce();
        createAdvertPage.sendsİlce();
        createAdvertPage.clickMahalle();
        createAdvertPage.sendMahalle();
        createAdvertPage.clickDevamEtİletisim();
        createAdvertPage.clickKuralOnay();
        createAdvertPage.clickİlanıOnayGönder();
        //createAdvertPage.verifyNotiText();
       // homePage.logoutScenario();
    }
    @Test(description = "Bireysel Kullanıcı/Satılık/Ticari İlan ")
    public void CreateVehicleSaleTicari(){
        loginPage =new LoginPage(page);
        homePage =new HomePage(page);
        profilPage=new ProfilPage(page);
        cpCorporateİnfo=new CPCorporateİnfo(page);
        createAdvertPage=new CreateAdvertPage(page);
        //homePage.cerezizinver();
        //homePage.clickLoginButton();
        //loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickHeaderLogo();
        createAdvertPage.clickTaslak();
        homePage.clickİlanVerButton();
        createAdvertPage.clickTicariButton();
        createAdvertPage.clickChoiceYear();
        createAdvertPage.clickYear();
        createAdvertPage.clickChoiceBrand();
        createAdvertPage.clickChoiceBrandFord();
        createAdvertPage.clickChoiceModel();
        createAdvertPage.clickChoiceModelCourıer();
        createAdvertPage.clickChoiceBodyType();
        createAdvertPage.clickBodyTypesCityvan();
        createAdvertPage.clickChoiceGearBox();
        createAdvertPage.clickGearBoxs();
        createAdvertPage.clickChoiceFuel();
        createAdvertPage.clickFuels();
        createAdvertPage.clickChoiceSubModel();
        createAdvertPage.clickSubModelsTıtanıum();
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
        createAdvertPage.clickİl();
        createAdvertPage.sendİl();
        createAdvertPage.clickİlce();
        createAdvertPage.sendsİlce();
        createAdvertPage.clickMahalle();
        createAdvertPage.sendMahalle();
        createAdvertPage.clickDevamEtİletisim();
        createAdvertPage.clickKuralOnay();
        createAdvertPage.clickİlanıOnayGönder();
        //createAdvertPage.verifyNotiText();
        //homePage.logoutScenario();
    }
}