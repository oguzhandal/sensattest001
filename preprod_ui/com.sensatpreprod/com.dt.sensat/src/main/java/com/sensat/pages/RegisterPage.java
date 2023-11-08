package com.sensat.pages;

import com.microsoft.playwright.Page;
import org.testng.Assert;
import qmframework.Commands;

import java.util.Properties;
import java.util.concurrent.locks.Condition;
public class RegisterPage {
    Properties prop;
    private Page page;

    public RegisterPage(Page page){
        this.page =page;
    }
    //string Locator

    private String firstName="[data-test=\"register-firstname\"]";
    private String lastName="[data-test=\"register-lastname\"]";
    private String eMail="[data-test=\"register-email\"]";

    private String Password="[data-test=\"register-password\"]";

    private String phoneNumber="//div[@class='phone-number-input']";

    private String PasswordConfirm="[data-test=\"register-password-confirm\"]";

    private String üyeOlButton="//button[@class='ant-btn ant-btn-primary ant-btn-lg button-full-width']";

    private String textBaskaKullanıcıBulunmaktadır="Bu telefona ait başka bir kullanıcı bulunmaktadır.";
    private String buttonKvkk="[data-test=\"register-kvkk\"]";
    private String textHesapOlustur="//div[text()='Bireysel sensat.com Hesabını Oluştur!']";
    private String textOtpKontrol="text=Telefon Numaranı Doğrulamalısın";
    private String textKurumsalHesap="//div[@data-test='register-corporate-page']";
    private String textPasswordControlAlanlar1="En az 8, en fazla 16 karakterden oluşmalı";
    private String textPasswordControlAlanlar2="En az 1 adet rakam içermeli";
    private String textPasswordControlAlanlar3="En az 1 adet büyük harf içermeli";
    private String textPasswordControlAlanlar4="En az 1 adet küçük harf içereli";
    private String textReklamcılık="Kişiselleştirilmiş reklamcılık uygulamaları";
    private String buttonGizlilikPolitikası="Gizlilik Politikası";
    private String gizlilikPolitikasıText="Doğuş Otomotiv Servis ve Ticaret A.Ş. Kişisel Verilerin İşlenmesine İlişkin Aydınlatma Metni\n";
    private String buttonKvkkPolitikasıText="KVKK Politikası";
    private String kvkkPolitikasıText="Doğuş Otomotiv Servis ve Ticaret A.Ş. Kişisel Verilerin İşlenmesine İlişkin Aydınlatma Metni\n";
    private String textPopupClose="//button[@aria-label='Close']";
    private String buttonGirisYap="text=giriş yap.";
    private String buttonDevamEt="//button[@data-test='register-submit-first-step']";
    private String inputTicariÜnvan="[data-test=\"register-company\"]";
    private String inputTcknNumber="[data-test=\"register-identification-number\"]";
    private String buttonCity="(//input[@class='ant-select-selection-search-input'])[3]";
    private String buttonDistrict="[data-test=\"register-district\"]";
    private String buttonStreet="[data-test=\"register-street\"]";
    private String inputAdressDetay="[data-test=\"register-address-detail\"]";
    private String buttonReklamcılıkİzinOnay="[data-test=\"register-corporate-permission\"]";
    private String buttonKvkkOnay="//input[@data-test='register-permission']";
    private String buttonÜyelikTalebiOlustur="[data-test=\"register-submit-second-step\"]";
    private String clickVergiDairesi="(//input[@class='ant-select-selection-search-input'])[2]";
    private String sendVergiNumver="[data-test=\"register-tax-number\"]";
    private String buttonLimited="//input[@value='anonim']";
    private String checkboxBireyselSözlesme="//input[@data-test='register-permission']";
    private String vergiDairesiClick="(//div[contains(@class,'ant-select ant-select-lg')])[1]";
    private String clickAgrı="(//div[text()='Ağrı'])[1]";
    private String clickAdana="(//div[text()='Adana'])[1]";
    private String clickAladag="//div[text()='Diyadin']";
    private String clickAkören="//div[text()='14 Nisan Mah']";
    private String ClickVergiDairesiAdi="//div[text()='5 Ocak Vergi Dairesi Müdürlüğü']";
    private String sendKepAdres="(//input[@class='ant-input ant-input-lg'])[3]";
    private String sendFirmaNo="//input[@placeholder='( _ _ _ ) _ _ _ _ _ _ _']";
    private String clickSehirDiv="//div[@data-test='register-city']";
    private String clickSehirAgri="(//div[text()='Ağrı'])[1]";
                                    /////Methods///
    public void Register(){
        page.navigate("http://webtest.sensat.com.tr/register");
        System.out.println("ok");

    }

    public void sendKeysFirstName() {
        page.locator(firstName).fill("Test");
    }

    public void sendKeysLastName() {
        page.locator(lastName).fill("Otomasyon");
    }

    public void sendKeysEmail() {
        page.locator(eMail).fill("test.otomasyon@gmail.com");
    }


    public void sendKeysPhoneNumber() {
        Commands.Click(page,phoneNumber);
        page.getByPlaceholder("( _ _ _ ) _ _ _ _ _ _ _").fill("(511) 111 11 11");

    }

    public void sendKeysPassword() {
        page.locator("[data-test=\"register-password\"]").nth(1).fill("Sensat123");

    }

    public void sendKeysPasswordConfirm() {
        page.locator("[data-test=\"register-password-confirm\"]").nth(1).fill("Sensat123");
    }

    public void clickÜyeOlButton() {
        Commands.Click(page,üyeOlButton);
        page.waitForTimeout(5000);
    }

    public void verifyPopUp() {
        page.locator(textBaskaKullanıcıBulunmaktadır).isVisible();
    }

    public void clickKvkkButton() {
        Commands.Click(page,buttonKvkk);
    }

    public void verifyOtpPopup() {
        Commands.isVisible(page,textOtpKontrol);
        //page.querySelector(textOtpKontrol).isVisible();
    }

    public void verifyTextHesapOlustur() {
        page.locator(textHesapOlustur).isVisible();
    }

    public void verifyKurumsalHesapText() {
        page.locator(textKurumsalHesap).isVisible();
    }

    public void verifyPasswordControlAlanlar() {
        page.getByText(textPasswordControlAlanlar1).isVisible();
        page.getByText(textPasswordControlAlanlar2).isVisible();
        page.getByText(textPasswordControlAlanlar3).isVisible();
        page.getByText(textPasswordControlAlanlar4).isVisible();
    }

    public void verifyReklamcılıkText() {
        page.getByText(textReklamcılık).isVisible();
    }

    public void verifyGizlilikPolitikasıText() {
        page.getByText(buttonGizlilikPolitikası).click();
        page.getByText(gizlilikPolitikasıText).isVisible();
        Commands.Click(page,textPopupClose);
    }

    public void verifyKvkkPolitikasıText() {
        page.getByText(buttonKvkkPolitikasıText).click();
        page.getByText(kvkkPolitikasıText);
        Commands.Click(page,textPopupClose);

    }

    public void verifyGirisYapButton() {
        page.getByText(buttonGirisYap).isVisible();
    }

    public void clickDevamEtButton() {
        Commands.Click(page,buttonDevamEt);
    }

    public void sendTicariÜnvan() {
        page.locator(inputTicariÜnvan).fill("Test Otomasyon");
    }

    public void senTcNumber() {
        page.locator(inputTcknNumber).fill("79213002026");
    }

    public void clickİl() {
        Commands.Click(page,buttonCity);
        Commands.Click(page,clickAgrı);
    }

    public void clickİlce() {
        Commands.Click(page,buttonDistrict);
        Commands.Click(page,clickAladag);
    }

    public void clickMahalle() {
        Commands.Click(page,buttonStreet);
        Commands.Click(page,clickAkören);
    }

    public void sendAdresDetay() {
        page.locator(inputAdressDetay).fill("Test Otomasyon");
    }

    public void clickReklamcılıkButton() {
        Commands.Click(page,buttonReklamcılıkİzinOnay);
    }

    public void clickPolitikaOnayButton() {
        Commands.Click(page,buttonKvkkOnay);
    }

    public void clickÜyelikTalebiButton() {
        Commands.Click(page,buttonÜyelikTalebiOlustur);
        page.waitForTimeout(5000);
    }

    public void sendVergiDairesi() {
        Commands.Click(page,clickVergiDairesi);
        Commands.Click(page,ClickVergiDairesiAdi);
    }

    public void sendVergiNumber() {
        page.locator(sendVergiNumver).fill("1234567891");
    }

    public void clickLimitedFirma() {
        Commands.Click(page,buttonLimited);
    }

    public void clickBireyselUyeMetin() {
        Commands.Click(page,checkboxBireyselSözlesme);
    }

    public void sendVergiDairesiİli() {
        Commands.Click(page,vergiDairesiClick);
        Commands.Click(page,clickAdana);

    }

    public void sendKepAdresi() {
        page.locator(sendKepAdres).fill("ornekkepadresi@hs01.kep.tr");
    }
    public void scroll(){
        page.evaluate("()=>window.scrollBy(0,600)");

    }
    public void sendFirmaPhone() {
        page.locator(sendFirmaNo).fill("346 211 43 64");
        scroll();
    }

    public void clickSeleckAdana() {
        Commands.Click(page,clickAdana);
    }

    public void clickSehirSec() {
        Commands.Click(page,clickSehirDiv);
        page.getByText("Ağrı").nth(1).click();

    }
}
