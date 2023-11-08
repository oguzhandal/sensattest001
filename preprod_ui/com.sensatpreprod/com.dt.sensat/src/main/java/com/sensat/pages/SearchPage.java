package com.sensat.pages;

import com.microsoft.playwright.Page;
import qmframework.Commands;

import java.util.Properties;

public class SearchPage {
    Properties prop;
    private Page page;

    public SearchPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonGünlügüm="text=Günlüğüm";

    private String textÜyelikİslemlerim="Üyelik İşlemlerim";
    private String buttonSearchIlkIlan="(//div[@data-index='0'])[1]";

    /////Methods///

    public void verifyGünlügümText() {
        page.locator(buttonGünlügüm).isVisible();
    }

    public void verifyÜyelikİslemlerimTitle() {
        page.locator(textÜyelikİslemlerim).isVisible();
    }

    public void clickAdvertsOne() {
        Commands.Click(page,buttonSearchIlkIlan);
    }
}
