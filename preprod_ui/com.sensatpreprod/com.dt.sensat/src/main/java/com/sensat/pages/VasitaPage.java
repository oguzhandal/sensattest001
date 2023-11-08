package com.sensat.pages;

import com.microsoft.playwright.Page;
import org.testng.Assert;
import qmframework.Commands;

import java.util.Properties;

public class VasitaPage {
    Page page;
    Properties properties;

    private String headerText = "//div[@class='vehicle-type-selection__container']//span";

    public VasitaPage(Page page) {
        this.page = page;
    }

    public void headerKontrolu(String expectedText){
        String actualResult = Commands.FetchAllDataAsList(page, headerText);
        System.out.println("actualResult = " + actualResult);
        Assert.assertEquals(actualResult, expectedText);
    }

}
