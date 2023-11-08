package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class UserPanelMessagesPage {
    Properties prop;
    private Page page;

    public UserPanelMessagesPage(Page page){
        this.page =page;
    }


    //string Locator

    private String textMesajKutunBos="text=Mesaj Kutun Boş";
    private String textYeniMesajOneri="text=İlgilendiğin ilanlar için sensat.com üyeleri ile mesajlaşabilirsin.";



    /////Methods///
    public void verifyAlanlarKontrol() {
        page.waitForTimeout(1000);
        Commands.isVisible(page,textMesajKutunBos);
        Commands.isVisible(page,textYeniMesajOneri);
    }
}
