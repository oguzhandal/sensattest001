package com.sensat.pages;

import com.microsoft.playwright.Page;
import org.testng.Assert;
import qmframework.Commands;

import java.util.Properties;
import java.util.concurrent.locks.Condition;
public class ProfilPage {
    Properties prop;
    private Page page;

    public ProfilPage(Page page){
        this.page =page;
    }


    //string Locator

    private String buttonGünlügüm="text=Günlüğüm";

    private String textÜyelikİslemlerim="Üyelik İşlemlerim";

    /////Methods///

    public void verifyGünlügümText() {
        page.locator(buttonGünlügüm).isVisible();
    }

    public void verifyÜyelikİslemlerimTitle() {
        page.locator(textÜyelikİslemlerim).isVisible();
    }
}
