package com.sensat.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import org.testng.Assert;
import org.testng.annotations.Test;
import qmframework.Commands;
import qmframework.Load;

import java.util.Properties;
import java.util.concurrent.locks.Condition;

import static qmframework.Commands.isVisible;

public class HomePage {
    Properties prop;
    private Page page;



    //page constructor:

    public  HomePage(Page page){
        this.page =page;
    }
    ////////string Locator///
    private String buttonAra="(//span[contains(text(),'Ara')])[1]";
    private String buttonAracAra="//button[@data-test='search-button']";
    private String buttonProfil="//span[@data-test='header-user-context-menu-avatar-with-image']";
    private String sectionText="//h1[contains(text(),'Hayalinizdeki aracı kolayca alın, hızla ve ücretsi')]";
    private String searchText="Marka, model adı ile araç ya da mağaza arayın";
    private String dropdownCategory="[data-test=\"vehicle-search-category\"]";
    private String dropdownYear="[data-test=\"vehicle-search-year\"]";
    private String dropdownBrand="[data-test=\"vehicle-search-brand\"]";
    private String dropdownModel="[data-test=\"vehicle-search-model\"]";
    private String ilanTextMerdeces="[data-test=\"showcase-item-5\"]";
    private String buttonLogin="[data-test=\"header-login-button\"]";
    private String avatarÜyelikİslemlerim="(//li[@class='user-context-menu__list-item'])[1]";
    private String buttonLogout="//span[@class='anticon anticon-logout']";
    private String logoSensat="(//img[@alt='Sensat'])[1]";
    private String searchTabInput="[data-test=\"header-search-input\"]";
    private String searchAraButton="[data-test=\"header-search-submit-button\"]";
    private String headerCreateAdvertButton="[data-test=\"header-create-advert-button\"]";
    private String headerKarsilastirButton="[data-test=\"header-compare-button\"]";
    private String headerFavorilerimButton="[data-test=\"header-favorite-button\"]";
    private String headerLoginRegisterButton="[data-test=\"header-login-button\"]";
    private String headerOtomobilIcon="[data-test=\"vehicle-type-selection-item-1\"]";
    private String headerSuvIcon="[data-test=\"vehicle-type-selection-item-2\"]";
    private String headerTicariIcon="[data-test=\"vehicle-type-selection-item-3\"]";
    private String filterSearchButton="//button[@class='ant-btn ant-btn-primary ant-btn-lg']";
    private String showCaseText="//h2[@class='showcase-section-inner-title']";
    private String showCaseAdverdMercedes="(//a[contains(text(),'MERCEDES-BENZ S-SERISI')])[2]";
    private String buttonTumAraclariIncele="[data-test=\"showcase-all-vehicles-path\"]";
    private String textEditorunSecimleri="//h3[@class='editor-choices-section-inner-title']";
    private String editorunSecimleriAlan1="[data-test=\"editor-choice-item-0\"]";
    private String editorunSecimleriAlan2="[data-test=\"editor-choice-item-1\"]";
    private String editorunSecimleriAlan3="[data-test=\"editor-choice-item-2\"]";
    private String editorunSecimleriAlan4="[data-test=\"editor-choice-item-3\"]";
    private String sensatTanitimText="(//h4[normalize-space()='Sensat ile araç almak ve satmak çok kolay'])[1]";
    private String sensatTanitimAlanlar1="[data-test=\"slantwise-item-0\"]";
    private String sensatTanitimAlanlar2="[data-test=\"slantwise-item-1\"]";
    private String sensatTanitimAlanlar3="[data-test=\"slantwise-item-2\"]";
    private String footerBrandsText="//h4[normalize-space()='Markalar']";
    private String footerOtomobilBrandsAudi="[data-test=\"seo-section-item-3\"]";
    private String footerBrandSuvPickUp="(//div[@id='rc-tabs-0-tab-2'])[1]";
    private String footerBrandsHafifTicari="(//div[@id='rc-tabs-0-tab-3'])[1]";
    private String footerBrandsSuvPickUpFord="(//div[@class='seo-section__content__desktop__item__label'][normalize-space()='FORD'])[2]";
    private String footerBrandsHafifTicariDesoto="(//div[contains(text(),'DESOTO')])[1]";
    private String footerIlanVerButton="(//a[@data-test='bottom-navbar-create-advert-button-path']//button)[2]";
    private String footerTopMenuHakkimizdaButton="[data-test=\"footer-menu-item-0\"]";
    private String footerTopMenuYardimMerkeziButton="[data-test=\"footer-menu-item-1\"]";
    private String footerTopMenuGenelMüdürlükButton="[data-test=\"footer-menu-item-2\"]";
    private String footerTopMenuSiziDinliyoruzButton="[data-test=\"footer-menu-item-3\"]";

    private String footerBlockMenuCerezPolitikasiButton="[data-test=\"footer-legal-item-1\"]";
    private String footerBlockMenuKullanimKosullariButton="[data-test=\"footer-legal-item-0\"]";
    private String footerBlockMenuAydinlatmaMetniButton="[data-test=\"footer-legal-item-2\"]";
    private String footerInfoText="//div[@class='footer__inner-bottom__block-info']";
    private String footerSupportButton="[data-test=\"footer-support\"]";
    private String ButtonİlanVer="[data-test=\"header-create-advert-button\"]";
    private String cerezizinverbutton="text=Tüm Çerezlere İzin Ver";
    private String buttonHeaderLogo="[data-test=\"header-logo-button-path\"]";
    private String footerİlanVerButton="(//button[@data-test='bottom-navbar-submit'])[2]";
    private String headerAraButton="//button[@data-test='header-search-submit-button']";
    private String headerIlanButton="(//button[@type='button']//span)[2]";
    private String buttonPersonelInfo="text=Üyelik İşlemlerim";
    private String buttonAddresses="text=Üyelik İşlemlerim";



    //page actions/methods:
    public void cerezizinver(){
        Commands.Click(page,cerezizinverbutton);
    }
    public void verifyİsAnaSyafaAraButton() {
        page.locator(buttonAra).isVisible();
    }

    public void buttonAracArama(){
        Commands.Click(page, buttonAracAra);
    }

    public void clickProfilButton(){
        Commands.Click(page,buttonProfil);
    }

    public void verifySectionText() {
        page.locator(sectionText).isVisible();

    }

    public void verifyİnputSearch() {
        page.getByPlaceholder(searchText).isVisible();
    }

    public void verifySearchSelectDropdown() {
        page.locator(dropdownCategory).isVisible();
        page.locator(dropdownYear).isVisible();
        page.locator(dropdownBrand).isVisible();
        page.locator(dropdownModel).isVisible();
    }

    public void clickIlanMercedes() {
        Commands.Click(page,ilanTextMerdeces);

    }

    public void clickAvatar() {
        Commands.Click(page,buttonProfil);
    }

    public void clickAvatarMyDairy() {
        Commands.Click(page,avatarÜyelikİslemlerim);
    }

    public void clickLogoutButton() {
        Commands.Click(page,buttonLogout);
    }


    public void logoutScenario() {
//            if (page.querySelector(buttonProfil).isVisible()) {
//                page.click(buttonProfil);
//                page.click(buttonLogout);
//                page.navigate("https://webpreprod.sensat.com/");
//                System.out.println("test2");
//                page.waitForTimeout(2000);
//            } else {
//                page.waitForTimeout(2000);
//                System.out.println("test1");
//            }
//        while(page.querySelector(buttonProfil).isVisible()){
//            page.click(buttonProfil);
//            page.click(buttonLogout);
//            page.navigate("https://webpreprod.sensat.com/");
//            System.out.println("test2");
//            page.waitForTimeout(2000);
//        }
        page.click(buttonProfil);
        page.click(buttonLogout);
        page.navigate("https://webpreprod.sensat.com/");
        System.out.println("test2");
        page.waitForTimeout(2000);

        }



    public void clickLoginButton() {
        Commands.Click(page,buttonLogin);
    }

    public void verifySensatLogo() {
        page.locator(logoSensat).isVisible();
    }

    public void verifySeacrhTab() {
        page.locator(searchTabInput).isVisible();
    }

    public void verifySearchAraButtonFilter() {
        page.locator(searchAraButton).isVisible();
    }

    public void verifyIlanVerButton() {
        page.locator(headerCreateAdvertButton).isVisible();
    }

    public void verifyKarsilastirButton() {
        page.locator(headerKarsilastirButton).isVisible();
    }

    public void verifyFavorilerimButton() {
        page.locator(headerFavorilerimButton).isVisible();
    }

    public void verifyLoginRegisterAvatar() {
        page.locator(headerLoginRegisterButton);
    }

    public void verifyOtomobilIcon() {
        page.locator(headerOtomobilIcon);
    }

    public void verifySuvPickUpIcon() {
        page.locator(headerSuvIcon).isVisible();
    }


    public void verifyHaifTicariIcon() {
        page.locator(headerTicariIcon).isVisible();
    }

    public void verifyBannerText() {
        page.locator(sectionText).isVisible();
    }

    public void verifySearchCategoryButton() {
        page.locator(dropdownCategory).isVisible();
    }

    public void verifySearchYearButton() {
        page.locator(dropdownYear).isVisible();
    }

    public void verifySearchBrandButton() {
        page.locator(dropdownBrand).isVisible();
    }

    public void verifySearchModelButton() {
        page.locator(dropdownModel).isVisible();
    }

    public void verifySearchAraButton() {
        page.locator(filterSearchButton).isVisible();
    }

    public void verifyShowCaseText() {
        page.locator(showCaseText).isVisible();
    }

    public void verifyAdverMercedes() {
        page.locator(showCaseAdverdMercedes).isVisible();
    }

    public void verifyTumAraclariInceleButton() {
        page.locator(buttonTumAraclariIncele).isVisible();
    }

    public void verifyEditorunSecimleriText() {
        page.locator(textEditorunSecimleri).isVisible();
    }

    public void verifyEditorunSecimleriAlanlar() {
        page.locator(editorunSecimleriAlan1).isVisible();
        page.locator(editorunSecimleriAlan2).isVisible();
        page.locator(editorunSecimleriAlan3).isVisible();
        page.locator(editorunSecimleriAlan4).isVisible();
    }

    public void verifyTanitimSensatText() {
        page.locator(sensatTanitimText).isVisible();
    }

    public void verifyTanitimAlanlar() {
        page.locator(sensatTanitimAlanlar1).isVisible();
        page.locator(sensatTanitimAlanlar2).isVisible();
        page.locator(sensatTanitimAlanlar3).isVisible();
    }

    public void verifyFooterBrandsText() {
        page.locator(footerBrandsText).isVisible();
    }

    public void verifyFooterOtomobilBrand() {
        page.locator(footerOtomobilBrandsAudi).isVisible();


    }

    public void clickFooterBrandSuvPickup() {
        Commands.Click(page,footerBrandSuvPickUp);
    }

    public void clickFooterBrandHafifTicari() {
        Commands.Click(page,footerBrandsHafifTicari);
    }

    public void verifyFooterBrandSucPickup() {
        page.locator(footerBrandsSuvPickUpFord).isVisible();

    }

    public void verifyFooterBrandHafifTicari() {
        page.locator(footerBrandsHafifTicariDesoto).isVisible();

    }

    public void verifyFooterIlanVerButton() {
        page.locator(footerIlanVerButton).isVisible();
    }

    public void verifyFooterTopMenuItem() {
        page.locator(footerTopMenuHakkimizdaButton).isVisible();
        page.locator(footerTopMenuYardimMerkeziButton).isVisible();
        page.locator(footerTopMenuGenelMüdürlükButton).isVisible();
        page.locator(footerTopMenuSiziDinliyoruzButton).isVisible();

    }

    public void verifyBlockMenuItem() {
        page.locator(footerBlockMenuCerezPolitikasiButton).isVisible();
        page.locator(footerBlockMenuKullanimKosullariButton).isVisible();
        page.locator(footerBlockMenuAydinlatmaMetniButton).isVisible();


    }

    public void verifyFooterBlockInfoText() {
        page.locator(footerInfoText).isVisible();
    }

    public void verifyFooterSupportButton() {
        page.locator(footerSupportButton).isVisible();
    }

    public void clickİlanVerButton() {
        Commands.Click(page,ButtonİlanVer);
    }

    public void clickHeaderLogo() {
        Commands.Click(page,buttonHeaderLogo);
    }
    public void scroll(){
        page.evaluate("()=>window.scrollBy(0,600)");

    }
    public void verifyHeaderLogo() {
        page.locator(buttonHeaderLogo).isVisible();
    }

    public void clickFavorilerimButton() {
        Commands.Click(page,headerFavorilerimButton);
    }

    public void clickNavbarButtom() {
        Commands.Click(page,footerİlanVerButton);
    }

    public void clickSearchAraButton() {
        Commands.Click(page,headerAraButton);
    }

    public void clickIlanVerButton(){
        Commands.Click(page,headerIlanButton);
    }
    public void isVisibleFooterİlanVerButton() {
        scroll();
        isVisible(page,footerİlanVerButton);
    }

    public void clickPersonelInfoButton() {
        Commands.Click(page,buttonPersonelInfo);
        page.waitForTimeout(2000);
    }


    public void clickAddressesButton() {
        Commands.Click(page,buttonAddresses);
    }
}
