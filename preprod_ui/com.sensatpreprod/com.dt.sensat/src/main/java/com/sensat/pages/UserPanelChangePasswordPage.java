package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;
import qmframework.Load;

import java.util.Properties;

public class UserPanelChangePasswordPage {
    Properties prop;
    private Page page;

    public UserPanelChangePasswordPage(Page page){
        this.page =page;
    }


    //string Locator

    private String textSifreIslemlerim="text=Şifre Değişikliği";

    private String textMevcutSifre="text=Mevcut Şifre";
    private String textYeniSifre="text=Yeni Şifre";

    /////Methods///
    public void verifySifreIslemlerimText() {
        page.waitForTimeout(2000);
        Commands.isVisible(page,textSifreIslemlerim);
    }

    public void verifySifreDegisikligiAlanlar() {
        Commands.isVisible(page,textMevcutSifre);
        Commands.isVisible(page,textYeniSifre);

    }
}
