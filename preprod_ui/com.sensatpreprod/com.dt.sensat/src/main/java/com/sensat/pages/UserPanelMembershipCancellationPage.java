package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;
import qmframework.Load;

import java.util.Properties;

public class UserPanelMembershipCancellationPage {
    Properties prop;
    private Page page;

    public UserPanelMembershipCancellationPage(Page page){
        this.page =page;
    }


    //string Locator

    private String textUyelikIptal="text=Üyelik İptali";
    private String textUyelikiptalsoru="text=Üyeliğini iptal etmek istediğine emin misin?";
    private String textBilgilendirme="text=Bu işlem sonucunda üyelik bilgilerin silinecek.";
    private String buttonUyelikIptal="text=Üyeliğimi iptal et ve tüm bilgileri sil";




    /////Methods///

    public void verifyUyelikIptaliText() {
        Commands.isVisible(page,textUyelikIptal);

    }

    public void verifyDialogAlanlarKontrol() throws InterruptedException {
        Load.waitUntilDomLoaded(page);
        Commands.isVisible(page,textUyelikiptalsoru);
        Commands.isVisible(page,textBilgilendirme);
        Commands.isVisible(page,buttonUyelikIptal);
    }
}
