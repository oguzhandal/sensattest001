package com.sensat.tests.base;

import com.microsoft.playwright.Page;
import com.sensat.factory.PlaywrightFactory;
import com.sensat.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

import static qmframework.Load.waitUntilDomLoaded;

public class BaseTest {
    PlaywrightFactory pf;
    protected  Properties prop;
    protected Page page;
    protected LoginPage loginPage;

    @BeforeTest
    public void setup(){
        pf=new PlaywrightFactory();
        prop= pf.init_prop();
        page= pf.initBrowser(prop);
    }

    @AfterTest
    public void tearDown(){
        page.context().browser().close();//tarayıcı kapatıldı
    }


}
