package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;
import java.util.concurrent.ConcurrentMap;

public class UserPanelMyDiaryPage {
    Properties prop;
    private Page page;

    //page constructor:

    public UserPanelMyDiaryPage(Page page){
        this.page =page;
    }

    ////////string Locator///
    private String buttonAra="(//span[contains(text(),'Ara')])[1]";
    private String textMerhaba="text=Merhaba muhammed";
    private String textMerhabaOtomasyon="text=Merhaba Otomasyon";
    private String textİlanlarım="text=İlanlarım";
    private String textMesajKutum="text=Mesaj Kutum";
    private String textFavori="text=Favori İlanlarım";
    private String textYardım="text=Yardıma ihtiyacın var mı?";

    //page actions/methods:
    
    public void verifyİsAnaSyafaAraButton() {
        page.locator(buttonAra).isVisible();
    }


    public void verifyNameText() {
        page.waitForTimeout(2000);
        Commands.isVisible(page,textMerhaba);
    }

    public void verifyContainerFields() {
        Commands.isVisible(page,textİlanlarım);
        Commands.isVisible(page,textMesajKutum);
        Commands.isVisible(page,textFavori);
        Commands.isVisible(page,textYardım);
    }

    public void verifyNameTextCorporate() {
        page.waitForTimeout(3000);
        Commands.isVisible(page,textMerhabaOtomasyon);
    }

    public void verifyContainerFieldsCorporate() {
        Commands.isVisible(page,textİlanlarım);
        Commands.isVisible(page,textMesajKutum);
        Commands.isVisible(page,textFavori);
        Commands.isVisible(page,textYardım);
    }
}
