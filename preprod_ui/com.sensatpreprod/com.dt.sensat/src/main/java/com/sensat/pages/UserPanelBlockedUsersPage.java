package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class UserPanelBlockedUsersPage {
    Properties prop;
    private Page page;

    public UserPanelBlockedUsersPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonGünlügüm="text=Günlüğüm";
    private String textBireyselÜyeler="text=Bireysel Üyeler";
    private String textKurumsalÜyeler="text=Kurumsal Üyeler";
    private String textUyeAdı="text=Üye Adı";
    private String textEngellemeTarihi="text=Engelleme Tarihi";
    private String textEngellediginUyeYok="text=Engellediğin bireysel üye yok";
    private String textFirma="text=Firma";
    private String textEngellediginKurumsalUyeYok="text=Engellediğin kurumsal üye yok";


    /////Methods///

    public void verifyGünlügümText() {
        page.locator(buttonGünlügüm).isVisible();
    }


    public void verifyEngelledigimUyelerAlanlar() {
        page.waitForTimeout(1000);
        Commands.isVisible(page,textBireyselÜyeler);
        Commands.isVisible(page,textKurumsalÜyeler);
        Commands.isVisible(page,textUyeAdı);
        Commands.isVisible(page,textEngellemeTarihi);
        Commands.isVisible(page,textEngellediginUyeYok);
    }

    public void verifyEngelledigimUyelerAlanlarKurumsal() {
        page.waitForTimeout(2000);
        Commands.Click(page,textKurumsalÜyeler);
       // Commands.isVisible(page,textUyeAdı);
//        Commands.isVisible(page,textFirma);
//        Commands.isVisible(page,textUyeAdı);
       // Commands.isVisible(page,textEngellediginKurumsalUyeYok);
    }
}
