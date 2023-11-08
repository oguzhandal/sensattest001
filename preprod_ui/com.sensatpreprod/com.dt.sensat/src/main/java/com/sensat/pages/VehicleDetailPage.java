package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class VehicleDetailPage {
    Properties prop;
    private Page page;

    public VehicleDetailPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonGünlügüm="text=Günlüğüm";
    private String textÜyelikİslemlerim="Üyelik İşlemlerim";
    private String buttonSearchIlkIlan="(//div[@data-index='0'])[1]";
    private String buttonAddFavori="(//div[@data-test='vehicle-detail-primary-info-actions-item'])[1]";
    private String textNotificationSeccusLogin="//div[text()='Başarılı bir şekilde giriş yaptınız.']";
    private String buttonMesajGonder="//button[@data-test='vehicle-detail-store-info-profile-button']";

    /////Methods///

    public void verifyGünlügümText() {
        page.locator(buttonGünlügüm).isVisible();
    }

    public void verifyÜyelikİslemlerimTitle() {
        page.locator(textÜyelikİslemlerim).isVisible();
    }

    public void clickAdvertsOne() {
        Commands.Click(page,buttonSearchIlkIlan);
    }

    public void clickFavoriAdd() {
        Commands.Click(page,buttonAddFavori);
    }

    public void verifyNotificationSucces() {
        page.locator(textNotificationSeccusLogin).isVisible();
    }

    public void clickMessageButton() {
        Commands.Click(page,buttonMesajGonder);
    }
}
