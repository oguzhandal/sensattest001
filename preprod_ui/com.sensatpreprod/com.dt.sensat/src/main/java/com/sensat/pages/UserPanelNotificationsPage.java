package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class UserPanelNotificationsPage {
    Properties prop;
    private Page page;

    public UserPanelNotificationsPage(Page page){
        this.page =page;
    }


    //string Locator

    private String textBildirimlerim="text=Bildirimlerim";

    /////Methods///

    public void verifyTextBildirimlerim() {
        page.waitForTimeout(1000);
        Commands.isVisible(page,textBildirimlerim);
    }
}
