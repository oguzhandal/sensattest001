package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class UserPanelAddresses {
    Properties prop;
    private Page page;

    public UserPanelAddresses(Page page){
        this.page =page;
    }


    //string Locator

    private String textAdresBilgilerim="text=Adres Bilgilerim";
    private String textAdresBaslik="text=İşyerim";
    private String textAdresIlIlce="text=ADANA, ALADAĞ";
    private String textAdresDetay="text=AKPINAR MAH Adress Detayları";



    /////Methods///

    public void verifyAdresBilgilerim() {
        Commands.isVisible(page,textAdresBilgilerim);
    }

    public void verifyCorporateAdres() {
        Commands.isVisible(page,textAdresBaslik);
        Commands.isVisible(page,textAdresIlIlce);
        Commands.isVisible(page,textAdresDetay);
    }
}
