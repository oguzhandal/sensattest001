package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class MyStoresPage {
    Properties prop;
    private Page page;

    public MyStoresPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonGünlügüm="text=Günlüğüm";
    private String textMagazalarim="text=Mağazalarım";

    private String buttonMagazaEkle="text=Mağaza Ekle";
    private String textMagazaName="text=My OTO";
    private String textMagazaSorunlusu="text=Mağaza Sorumlusu";


    /////Methods///

    public void verifyGünlügümText() {
        page.locator(buttonGünlügüm).isVisible();
    }


    public void verifyMagazalarimText() {
        Commands.isVisible(page,textMagazalarim);
        Commands.isVisible(page,buttonMagazaEkle);
    }

    public void verifyMyOtoAlanlarKontrol() {
        Commands.isVisible(page,textMagazaName);
        Commands.isVisible(page,textMagazaSorunlusu);
    }
}
