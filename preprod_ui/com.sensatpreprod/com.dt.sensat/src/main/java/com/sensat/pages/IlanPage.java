package com.sensat.pages;

import com.microsoft.playwright.Page;

import java.util.Properties;

public class IlanPage {

    Properties prop;
    private Page page;

    public IlanPage(Page page){
        this.page=page;
    }



    ///////String Const////////
    private String ilanDetayMarkaModelText="MERCEDES-BENZ S-SERISI";

    private String ilanDetaySanzımanTipiText="Otomatik";
    private String ilanDetayFiyatText=".vehicle-detail-primary-info__price-info__for-sale__left";
    private String ilanDetayMesajButton="Mesaj Gönder";
    private String ilanDetayBegenButton="//div[@class='vehicle-detail-primary-info__actions']//div[1]";
    ///////Methods//////////

    public void verifyIlanAlanlar() {
        page.locator(ilanDetayMarkaModelText).isVisible();
        page.locator(ilanDetaySanzımanTipiText).isVisible();
        page.locator(ilanDetayFiyatText).isVisible();
        page.locator(ilanDetayMesajButton).isVisible();
        page.locator(ilanDetayBegenButton).isVisible();
    }
}
