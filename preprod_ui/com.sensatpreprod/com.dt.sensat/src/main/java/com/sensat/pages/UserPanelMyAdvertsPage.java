package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class UserPanelMyAdvertsPage {
    Properties prop;
    private Page page;

    public UserPanelMyAdvertsPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonGünlügüm="text=Günlüğüm";
    private String textIlanlarım="text=İlanlarım";
    private String buttonTumIlanlar="text=Tüm İlanlar";
    private String buttonYayindaOlanlar="text=Yayında Olanlar";
    private String buttonOnayBekleyenler="text=Onay Bekleyenler";
    private String buttonYayindaOlmayanlar="text=Yayında Olmayanlar";
    private String textAudi="text=Audi A3";
    private String textFiyat ="text=123.123 ₺";
    private String textOtomatik ="text=Otomatik";
    private String textBenzin ="text=Benzin";

    private String iconIlanGoruntulenme="(//div[@class='table-vehicle-row__statistics__item'])[3]";

   ;

    /////Methods///

    public void verifyGünlügümText() {
        page.locator(buttonGünlügüm).isVisible();
    }


    public void verifyIlanlarimText() {
        page.waitForTimeout(1000);
        Commands.isVisible(page,textIlanlarım);
    }

    public void verifyContentAlanlarKontrol() {
        Commands.isVisible(page,buttonTumIlanlar);
        Commands.isVisible(page,buttonYayindaOlanlar);
        Commands.isVisible(page,buttonOnayBekleyenler);
        Commands.isVisible(page,buttonYayindaOlmayanlar);
    }

    public void verifyIlanAlanlarKontrol() {
        Commands.isVisible(page,textAudi);
        Commands.isVisible(page, textFiyat);
        Commands.isVisible(page,iconIlanGoruntulenme);
        Commands.isVisible(page,textOtomatik);
        Commands.isVisible(page,textBenzin);

    }
}
