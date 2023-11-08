package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;
import qmframework.Load;

import java.util.Properties;

public class UserPanelMyFavoritesPage {
    Properties prop;
    private Page page;

    public UserPanelMyFavoritesPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonGünlügüm="text=Günlüğüm";
    private String textFavoriİlanlar="text=Favori İlanlar";
    private String textTumunuSec="text=Tümünü Seç";
    private String textSirala="text=Sırala";
    private String textVolkswagenPolo="text=Volkswagen Polo";
    private String textIlanFiyat="text=932.000 ₺";


    /////Methods///

    public void verifyGünlügümText() {
        page.locator(buttonGünlügüm).isVisible();
    }

    public void verifyTextFavoriIlanlar() throws InterruptedException {
        page.waitForTimeout(1000);
        Load.waitUntilDomLoaded(page);
        Commands.isVisible(page,textFavoriİlanlar);
    }

    public void verifyContentAlanlarKontrol() throws InterruptedException {
        Load.waitUntilDomLoaded(page);
        Commands.isVisible(page,textTumunuSec);
        Commands.isVisible(page,textSirala);
        Commands.isVisible(page,textVolkswagenPolo);
        Commands.isVisible(page,textIlanFiyat);
    }
}
