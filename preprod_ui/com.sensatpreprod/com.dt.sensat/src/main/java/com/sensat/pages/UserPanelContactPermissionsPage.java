package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class UserPanelContactPermissionsPage {
    Properties prop;
    private Page page;

    public UserPanelContactPermissionsPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonSearchIlkIlan="(//div[@data-index='0'])[1]";
    private String textKampanyaBilgilendirmeleri="text=Kampanya bilgilendirmeleri";
    private String textBildirimAyarları="text=Bildirim Ayarları";
    private String IlanlarText="text=İlanlar";
    private String IlanlarFavorilerText="text=Favoriler";
    private String textSms="text=SMS";

    private String textTelefon="text=Telefon";

    private String textEposta="text=E-Posta";


    /////Methods///


    public void clickAdvertsOne() {
        Commands.Click(page,buttonSearchIlkIlan);
    }

    public void verifyKampanyaText() {
        page.waitForTimeout(2000);
        Commands.isVisible(page,textKampanyaBilgilendirmeleri);
        Commands.isVisible(page,textSms);
        Commands.isVisible(page,textTelefon);
        Commands.isVisible(page,textEposta);
    }

    public void verifyBildirimText() {
        Commands.isVisible(page,textBildirimAyarları);
        Commands.isVisible(page,IlanlarText);
        Commands.isVisible(page,IlanlarFavorilerText);
    }
}
