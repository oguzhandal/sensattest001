package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class PersonnelsPage {
    Properties prop;
    private Page page;

    public PersonnelsPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonGünlügüm="text=Günlüğüm";
    private String textDanismanlarim="text=Danışmanlarım";
    private String textDanismanName="text=muhammed yıldırım";
    private String textMagazaName="text=My OTO";
    private String textDanismanRolu="text=Danışman Yöneticisi";
    private String textEklemeTarih="text=01.06.2023";



    /////Methods///

    public void verifyGünlügümText() {
        page.locator(buttonGünlügüm).isVisible();
    }


    public void verifyDanismanlarimText() {
        Commands.isVisible(page,textDanismanlarim);
    }

    public void verifyDanismanContainerAlanlar() {
        Commands.isVisible(page,textDanismanName);
        Commands.isVisible(page,textMagazaName);
        Commands.isVisible(page,textDanismanRolu);
        Commands.isVisible(page,textEklemeTarih);
    }
}
