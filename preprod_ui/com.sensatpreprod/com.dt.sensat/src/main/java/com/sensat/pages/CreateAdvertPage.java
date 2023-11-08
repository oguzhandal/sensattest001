package com.sensat.pages;

import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import qmframework.Commands;
import qmframework.Rand;

import java.awt.event.ComponentAdapter;
import java.nio.file.Paths;
import java.util.Properties;

public class CreateAdvertPage {
    Properties prop;
    private Page page;
    public CreateAdvertPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonGünlügüm="text=Günlüğüm";

    private String textÜyelikİslemlerim="Üyelik İşlemlerim";
    private String buttonOtomobil="text=Otomobil";
    private String buttonSuv="//div[text()='SUV & Pickup']";
    private String buttonYears="[data-test=\"advert-vehicle-choice-year\"] div";
    private String buttonYear="//div[@class='ant-select-item-option-content'][normalize-space()='2022']";
    private String buttonBrand="[data-test=\"advert-vehicle-choice-brand\"] div";
    private String buttonBrands="text=FIAT";
    private String buttonAudı="text=AUDI";
    private String buttonModel="[data-test=\"advert-vehicle-choice-model\"] div";
    private String buttonModels="text=EGEA";
    private String buttonQ8="text=Q8";
    private String buttonBodyType="[data-test=\"advert-vehicle-choice-body-type\"] div";
    private String buttonBodyTypes="text=Sedan";
    private String buttonArazi="text=Arazi Aracı";

    private String buttonGearBox="[data-test=\"advert-vehicle-choice-gear-box\"] div";
    private String buttonGearBoxs="text=Manuel";
    private String buttonOtomatik="text=Otomatik";

    private String buttonFuel="[data-test=\"advert-vehicle-choice-year-fuel\"] div";
    private String buttonFuels="text=Benzin";

    private String buttonSubModel="[data-test=\"advert-vehicle-choice-sub-model\"] div";
    private String buttonSubModels="text=1.4 FIRE BZ 95 HP URBAN";

    private String buttonQtr="4.0 TFSI RS 600 HP TTR QTR";
    private String buttonDevamEt="[data-test=\"create-advert-vehicle-choice-section__action\"]";

    private String textKilometre="text=Kilometre ve Tescil Bilgisi";

    private String inputkilometre="[data-test=\"create-advert-vehicle-properties-section-item-kilometer-input\"]";
    private String clickDate="//div[@class='ant-picker-input']//input";

    private String inputDate="//div[@class='ant-picker-input']//input";
    private String clickDates="(//div[text()='2'])[1]";
    private String clickPlates="text=Türkiye Plakalı";
    private String sendPlateNumbers="[data-test=\"create-advert-vehicle-properties-section-item-plate\"]";
    private String sendFramesNo="[data-test=\"create-advert-vehicle-properties-section-item-frame-no\"]";
    private String sendMotorsNo="[data-test=\"create-advert-vehicle-properties-section-item-motor-no\"]";

    private String inputPhotoClick="//p[contains(text(),'Araç fotoğraflarını yüklemek için sürükle veya')]//span[contains(text(),'tıklayın')]";
    private String clickColors=".ant-select-selector";
    private String clickColorWhite="(//div[@class='ant-select-item-option-content'])[1]";
    private String buttonDevamEtTwo="//div[@data-test='create-advert-vehicle-properties-section-action']";
    private String sendPrices="[data-test=\"create-advert-detail-section-price-input\"]";
    private String buttonGarantisiVar="//span[text()='Garantisi Var']";
    private String buttonTakasaUygun="//span[text()='Takasa Uygun']";
    private String buttonRehinVar="//span[text()='Rehin Var']";
    private String buttonHacizVar="//span[text()='Haciz Var']";
    private String buttonTümParOrjinal="//span[text()='Tüm Parçalar Orijinaldir ']";
    private String buttonHasarYok="//span[text()='Hasar Kaydı Yok']";
    private String buttonDevamEtİlanDetay="[data-test=\"create-advert-detail-section-action\"]";
    private String textİletisimTercihleri="text=İletişim Tercihleri";
    private String buttonİl="(//div[@class='ant-select-selector'])[1]";
    private String sendİl="//div[text()='Adana']";
    private String buttonİlce="(//div[@class='ant-select-selector'])[2]";
    private String sendİlce="//div[text()='Aladağ']";
    private String buttonDevamEtİletisim="(//button[contains(@class,'ant-btn ant-btn-primary')])[3]";
    private String kuralOnayButton="//input[@type='checkbox']";
    private String buttonİlanıOnayGönder="(//button[contains(@class,'ant-btn ant-btn-primary')]//span)[3]";
    private String buttonMahalle="(//div[@class='ant-select-selector'])[3]";
    private String sendsMahalle="//div[text()='Akpınar Mah']";
    private String succesResult="//div[text()='Bireysel kullanıcılar 1 yılda en fazla 3 adet ilan oluşturabilir']";
    private String buttonTicari="//div[text()='Hafif Ticari']";
    private String buttonFord="//div[text()='FORD']";
    private String buttonCourıer="//div[text()='TOURNEO COURIER']";
    private String buttonCityvan="//div[text()='Cityvan']";
    private String buttonTıtanıum="//div[text()='1.0L ECOBOOST 100PS TITANIUM BENZİN']";
    private String buttonİlanTaslakKaydetme="text=İlanı Kaydetmeden Devam Et";
    private String buttonTaslakKayit="//span[text()='İlanı Taslak Olarak Kaydet']";
    private String buttonStoreInput="(//div[@class='ant-form-item-control-input-content']//div)[1]";
    private String buttonSelectStore="//div[text()='Otomasyon Mağaza']";
    private String buttonKendimYonetecegim="(//input[@class='ant-radio-input'])[1]";
    private String buttonIlanOlusturmayaBasla="//span[text()='İlan Oluşturmaya Başla']";
    private String textIlanOlusturmaTalebinAlındı="text=İlan Oluşturma Talebiniz Alındı";
    private String buttonSubModelUrban="text=1.4 FIRE BZ 95 HP URBAN";
    /////Methods///


    public void verifyGünlügümText() {
        page.locator(buttonGünlügüm).isVisible();
    }

    public void scroll(){
        page.evaluate("()=>window.scrollBy(0,600)");

    }

    public void clickOtomobilButton() {
        Commands.Click(page,buttonOtomobil);
        scroll();
    }

    public void clickChoiceYear() {
        Commands.Click(page,buttonYears);
    }

    public void clickYear() {
        Commands.Click(page,buttonYear);
    }

    public void clickChoiceBrand() {
        Commands.Click(page,buttonBrand);
    }

    public void clickBrand() {
        Commands.Click(page,buttonBrands);
    }

    public void clickChoiceModel() {
        Commands.Click(page,buttonModel);
        scroll();
    }

    public void clickModels() {
        Commands.Click(page,buttonModels);
    }

    public void clickChoiceBodyType() {
        Commands.Click(page,buttonBodyType);
    }

    public void clickBodyTypes() {
        Commands.Click(page,buttonBodyTypes);
    }

    public void clickChoiceGearBox() {
        Commands.Click(page,buttonGearBox);
        scroll();
    }

    public void clickGearBoxs() {
        Commands.Click(page,buttonGearBoxs);
    }

    public void clickChoiceFuel() {
        Commands.Click(page,buttonFuel);
    }

    public void clickFuels() {
        Commands.Click(page,buttonFuels);
    }

    public void clickChoiceSubModel() {
        Commands.Click(page,buttonSubModel);
    }

    public void clickSubModels() {
        Commands.Click(page,buttonSubModels);
    }

    public void clickButtonDevamEt() {
        Commands.Click(page,buttonDevamEt);
    }

    public void verifyKilometreText() {
        page.locator(textKilometre).isVisible();
    }

    public void sendKilometre() {
        page.locator(inputkilometre).fill("10000");
    }

    public void clickDatePicker() {
        Commands.Click(page,clickDate);
        page.locator(clickDate).fill("02/10/2022");
        Commands.Click(page,clickDates);
    }
    public void clickPlateType() {
        Commands.Click(page,clickPlates);
    }

    public void sendPlateNumber() {
        //Rand.generateRandomString();
        page.locator(sendPlateNumbers).fill(Rand.generateRandomString());
    }

    public void sendFrameNo() {
        page.locator(sendFramesNo).fill("OTOMASYONTEST2023");
    }

    public void sendMotorNo() {
        page.locator(sendMotorsNo).fill("OTOMASYONTEST2023");
    }

    public void clickİnputFiles() {
        FileChooser fileChooser=page.waitForFileChooser(()->{
            page.locator("(//div[@class='create-advert-vehicle__gallery-upload-infos']//div)[1]").click();
        });
        boolean multiple=fileChooser.isMultiple();
        System.out.println("test");
        for(int i=0;i<5;i++){
            fileChooser.setFiles(Paths.get("src/main/java/com/sensat/file/1.jpg"));
        }
    }

    public void clickColor() {
        Commands.Click(page,clickColors);
    }

    public void clickColors() {
        Commands.Click(page,clickColorWhite);
    }

    public void clickButtonDevamEt2() {
        Commands.Click(page,buttonDevamEtTwo);
    }

    public void sendPrice() {
        page.locator(sendPrices).fill("600000");
    }

    public void clickGarantisiVar() {
        Commands.Click(page,buttonGarantisiVar);
    }

    public void clickTakasaUygun() {
        Commands.Click(page,buttonTakasaUygun);
    }

    public void clickRehinVar() {
        Commands.Click(page,buttonRehinVar);
    }

    public void clickHacizVar() {
        Commands.Click(page,buttonHacizVar);
    }

    public void clickOrjinal() {
        Commands.Click(page,buttonTümParOrjinal);
    }

    public void clickHasarKaydiYok() {
        Commands.Click(page,buttonHasarYok);
    }

    public void clickButtonDevamEt3() {
        Commands.Click(page,buttonDevamEtİlanDetay);
    }

    public void verifyİletisimTercihleri() {
        page.locator(textİletisimTercihleri).isVisible();
    }

    public void clickİl() {
        Commands.Click(page,buttonİl);
    }

    public void sendİl() {
        Commands.Click(page,sendİl);
    }

    public void clickİlce() {
        Commands.Click(page,buttonİlce);
    }

    public void sendsİlce() {
        Commands.Click(page,sendİlce);
    }

    public void clickDevamEtİletisim() {
        Commands.Click(page,buttonDevamEtİletisim);
    }

    public void clickKuralOnay() {
        Commands.Click(page,kuralOnayButton);
    }

    public void clickİlanıOnayGönder() {
        Commands.Click(page,buttonİlanıOnayGönder);
        page.waitForTimeout(3000);
    }

    public void clickMahalle() {
        Commands.Click(page,buttonMahalle);
    }

    public void sendMahalle() {
        Commands.Click(page,sendsMahalle);
    }

    public void verifyNotiText() {
        page.locator(succesResult).isVisible();
    }

    public void clickSUVButton() {
        Commands.Click(page,buttonSuv);
        scroll();
    }

    public void clickChoiceBrandAudı() {
        Commands.Click(page,buttonAudı);
    }

    public void clickChoiceModelQ8() {
        Commands.Click(page,buttonQ8);
    }

    public void clickBodyTypesArazi() {
        Commands.Click(page,buttonArazi);
    }

    public void clickGearBoxsOtomatik() {
        Commands.Click(page,buttonOtomatik);
    }

    public void clickSubModelsQtr() {
        Commands.Click(page,buttonQtr);
    }

    public void clickTicariButton() {
        Commands.Click(page,buttonTicari);
        scroll();
    }

    public void clickChoiceBrandFord() {
        Commands.Click(page,buttonFord);
    }

    public void clickChoiceModelCourıer() {
        Commands.Click(page,buttonCourıer);
    }

    public void clickBodyTypesCityvan() {
        Commands.Click(page,buttonCityvan);
    }

    public void clickSubModelsTıtanıum() {
        Commands.Click(page,buttonTıtanıum);
    }

    public void clickTaslak() {
        Commands.Click(page,buttonİlanTaslakKaydetme);
    }

    public void clickIlanTaslakButton() {
        Commands.Click(page,buttonTaslakKayit);
    }

    public void clickStore() {
        Commands.Click(page,buttonStoreInput);
    }

    public void clickSelectStore() {
        Commands.Click(page,buttonSelectStore);
    }

    public void clickMyAdvert() {
        Commands.Click(page,buttonKendimYonetecegim);
    }

    public void clickStartAdvert() {
        Commands.Click(page,buttonIlanOlusturmayaBasla);
    }

    public void verifyCreatAdvertResult() {
        page.waitForTimeout(2000);
        Commands.isVisible(page,textIlanOlusturmaTalebinAlındı);
        //page.querySelector(textIlanOlusturmaTalebinAlındı).isVisible();
    }


    public void clickChoiceModelEgea() {
        Commands.Click(page,buttonModels);
    }

    public void clickSubModelsUrban() {
        Commands.Click(page,buttonSubModelUrban);
    }
}
