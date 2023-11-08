package com.sensat.pages;

import com.microsoft.playwright.Page;

import java.util.Properties;

public class CreateAdvertsInformationsSpecs {
    Properties prop;
    private Page page;

    public CreateAdvertsInformationsSpecs(Page page){
        this.page=page;
    }



    ///////String Const////////
    private String ilanDetayMarkaModelText="MERCEDES-BENZ S-SERISI";
    private String yearText="//span[text()='2022 ']";
    private String brandText="//span[text()='FIAT ']";
    private String modelText="//span[text()='FIAT EGEA']";
    private String bodyTypesText="//span[text()='Sedan ']";
    private String gearBoxText="//span[text()='Manuel ']";
    private String fuelsTypeText="//span[text()='Benzin ']";
    private String subModelsText="//span[text()='Sedan 1.4 FIRE BZ 95 HP URBAN']";
    private String kmVerify="//span[text()='10.000 km']";

    ///////Methods//////////

    public void verifyIlanAlanlar() {

    }

    public void verifyYear() {
        page.locator(yearText).isVisible();
    }

    public void verifyBrand() {
        page.locator(brandText).isVisible();
    }

    public void verifyModel() {
        page.locator(modelText).isVisible();
    }

    public void verifyBodyTypes() {
        page.locator(bodyTypesText);
    }

    public void verifyGearBox() {
        page.locator(gearBoxText).isVisible();
    }

    public void verifyFuels() {
        page.locator(fuelsTypeText).isVisible();
    }

    public void verifySubModels() {
        page.locator(subModelsText).isVisible();
    }

    public void verifyKm() {
        page.locator(kmVerify).isVisible();
    }
}
