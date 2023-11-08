package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class UserPanelPersonelInfoPage {
    Properties prop;
    private Page page;

    public UserPanelPersonelInfoPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonGünlügüm="text=Günlüğüm";
    private String textName="text=muhammed";
    private String textNameCorporate="text=Otomasyon";
    private String textSurname="text=bireysel";
    private String textSurnameCorporate="text=Hesabı";
    private String textEmail="text=E-Posta Adresi";
    private String textGSM="text=GSM No";
    private String textTc="text=T.C. Kimlik Numarası";
    private String textDogumTarihi="text=Doğum Tarihi";
    private String textCinsiyetBelirtmekIstemiyorum="text=Belirtmek İstemiyorum";
    private String textGizlilik="text=Gizlilik";
    private String buttonGoster="text=Göster";
    private String buttonGizle="text=Gizle";
    private String textTicariUnvan="text=Ticari Ünvan";
    private String buttonSahisOrtaklik="text=Şahıs ve Adi Ortaklık";
    private String buttonSermayeSirketi="text=Sermaye Şirketi";
    private String textVergiIli="text=Gaziantep";
    private String textVergiDairesi="text=Oğuzeli Malmüdürlüğü";
    private String textVergiNumarasi="[data-test=\"customer-panel-corporate-info-edit-tax-number\"]";;
    private String textKEPAdresi="text=KEP Adresi";
    private String textFirmaTelefon="text=Firma Telefonu";
    private String textIl="text=İl";
    private String textIlce="text=İlçe";
    private String textMahalle="text=Mahalle";
    private String textAdresDetayı="text=Adres Detayı";


    /////Methods///



    public void verifyHesapBilgileriAlanlar() {
        page.waitForTimeout(1000);
        Commands.isVisible(page,textName);
        Commands.isVisible(page,textSurname);
        Commands.isVisible(page,textEmail);
        Commands.isVisible(page,textGSM);

    }


    public void verifyKisiselBilgilerAlanlar() {
        Commands.isVisible(page,textTc);
        Commands.isVisible(page,textDogumTarihi);
        Commands.isVisible(page,textCinsiyetBelirtmekIstemiyorum);
    }

    public void verifyHesapBilgileriAlanlarCorporate() {
        page.waitForTimeout(2000);
        Commands.isVisible(page,textNameCorporate);
        Commands.isVisible(page,textSurnameCorporate);
        Commands.isVisible(page,textEmail);
        Commands.isVisible(page,textGSM);
        Commands.isVisible(page,textGizlilik);
        Commands.isVisible(page,buttonGoster);
        Commands.isVisible(page,buttonGizle);
    }
    public void scroll(){
        page.evaluate("()=>window.scrollBy(0,600)");

    }
    public void verifyFirmaBilgileriAlanlar() {
        scroll();
        Commands.isVisible(page,textTicariUnvan);
        Commands.isVisible(page,buttonSahisOrtaklik);
        Commands.isVisible(page,buttonSermayeSirketi);
        Commands.isVisible(page,textVergiIli);
        Commands.isVisible(page,textVergiDairesi);
        Commands.isVisible(page,textVergiNumarasi);
        Commands.isVisible(page,textKEPAdresi);
        Commands.isVisible(page,textFirmaTelefon);
        Commands.isVisible(page,textIl);
        Commands.isVisible(page,textIlce);
        Commands.isVisible(page,textMahalle);
        Commands.isVisible(page,textAdresDetayı);

    }
}
