package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class NavigationUserPage {
    Properties prop;
    private Page page;

    public NavigationUserPage(Page page){
        this.page =page;
    }


    //string Locator


    private String buttonAddresses="[data-menu-id=adres-bilgilerim]";
    private String buttonSifreİslemlerim="[data-menu-id=sifre-islemlerim]";
    private String buttonIletisimIzinleri="[data-menu-id=iletisim-izinlerim]";
    private String buttonEngelledigimUyeler="[data-menu-id=engelledigim-uyeler]";

    private String buttonUyelikIptal="[data-menu-id=uyelik-iptali]";

    private String buttonFavorilerim="[data-menu-id=favorilerim]";
    private String buttonIlanlarim="[data-menu-id=ilanlarim]";
    private String buttonMesajlarim="[data-menu-id=mesajlarim]";
    private String buttonBildirimlerim="[data-menu-id=bildirimlerim]";
    private String buttonMagazalarim="[data-menu-id=magazalarim]";
    private String buttonDanismanlarim="[data-menu-id=danismanlarim]";




    /////Methods///
    public void clickAddresses() {
        Commands.Click(page,buttonAddresses);

    }

    public void clickSifreİslemlerim() {
        Commands.Click(page,buttonSifreİslemlerim);
    }
    public void clickIletisimIzinleriButton() {
        Commands.Click(page,buttonIletisimIzinleri);
    }

    public void clickEngelledigimUyeler() {
        page.waitForTimeout(1000);
        Commands.Click(page,buttonEngelledigimUyeler);
    }

    public void clickUyelikIptal() {
        Commands.Click(page,buttonUyelikIptal);
    }

    public void clickFavorites() {
        Commands.Click(page,buttonFavorilerim);
    }

    public void clickIlanlarim() {
        Commands.Click(page,buttonIlanlarim);
        page.waitForTimeout(3000);
    }
    public void clickMesajlarim() {
        Commands.Click(page,buttonMesajlarim);
        page.waitForTimeout(1000);
    }

    public void clickBildirimlerim() {
        Commands.Click(page,buttonBildirimlerim);
        page.waitForTimeout(1000);
    }

    public void clickMagazalarim() {
        Commands.Click(page,buttonMagazalarim);
        page.waitForTimeout(3000);
    }

    public void clickDanismanlarim() {
        Commands.Click(page,buttonDanismanlarim);
        page.waitForTimeout(3000);

    }
}
