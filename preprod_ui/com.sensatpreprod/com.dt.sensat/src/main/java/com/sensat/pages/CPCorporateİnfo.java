package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class CPCorporateİnfo {
    Properties prop;
    private Page page;

    //page constructor:

    public  CPCorporateİnfo(Page page){
        this.page =page;
    }

    ////////string Locator///
    private String buttonAra="(//span[contains(text(),'Ara')])[1]";

    private String textHesapBilgileri="text:Hesap Bilgileri";

    private String inputName="(//input[@type='text'])[2]";

    private String radioButtonSahisSirketi="(//span[@class='ant-radio'])[1]";

    private String radioButtonLimitedSirketi="Anonim & Limited Şirketi";

    private String inputVergiNo="//div[@class='customer-panel-corporate-info-edit__split']//div[@class='ant-row ant-form-item ant-form-item-with-help']//input[@type='text']";

    private String buttonGüncelle="//button[@class='ant-btn ant-btn-primary ant-btn-lg customer-panel-corporate-info-edit__button']";

    private String popupUpdateVerify="//div[@class='ant-notification-notice-message']";
    //page actions/methods:

    public void verifyİsAnaSyafaAraButton() {
        page.locator(buttonAra).isVisible();
    }

    public void verifyTextHesapBilgileri() {
        page.locator(textHesapBilgileri).isVisible();
    }

    public void sendNameUpdate() {
        for(int i=0;i<3;i++){
            Commands.Click(page,inputName);
        }
        page.fill(inputName,"Sahis");
    }

    public void clickCorporateRadioButton() {
        Commands.Click(page,radioButtonSahisSirketi);
        page.getByLabel(radioButtonLimitedSirketi);
        Commands.Click(page,radioButtonSahisSirketi);
    }

    public void sendVergiNoUpdate() {
        for(int i=0;i<3;i++){
            Commands.Click(page,inputVergiNo);
        }
        page.fill(inputVergiNo,"1233211232");
    }

    public void clickGüncelleButton() {
        Commands.Click(page,buttonGüncelle);
    }

    public void verifySuccesPopup() {
        page.locator(popupUpdateVerify).isVisible();
    }
}
