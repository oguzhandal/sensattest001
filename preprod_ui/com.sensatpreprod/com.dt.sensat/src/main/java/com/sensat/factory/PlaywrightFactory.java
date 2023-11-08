package com.sensat.factory;

import com.microsoft.playwright.*;
import qmframework.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Properties;

public class PlaywrightFactory {

        Playwright playwright;
        Browser browser;
        BrowserContext browserContext;
        Page page;
        Properties prop;

    private static ThreadLocal<Browser> tlBrowser = new ThreadLocal<>();
    private static ThreadLocal<BrowserContext> tlBrowserContext = new ThreadLocal<>();
    private static ThreadLocal<Page> tlPage = new ThreadLocal<>();
    private static ThreadLocal<Playwright> tlPlaywright = new ThreadLocal<>();

    public static Playwright getPlaywright() {
        return tlPlaywright.get();
    }

    public static Browser getBrowser() {
        return tlBrowser.get();
    }

    public static BrowserContext getBrowserContext() {
        return tlBrowserContext.get();
    }

    public static Page getPage() {
        return tlPage.get();
    }
        public Page initBrowser(Properties prop){
            String browserName =  prop.getProperty("browser").trim();
            System.out.println("Browser:"+ browserName);
           // playwright =Playwright.create();
            tlPlaywright.set(Playwright.create());
            //tarayıcı ismini kücük harfe cevir

            switch (browserName.toLowerCase()){
                case "chromium":
                  //  browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                    tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
                    break;
                case "firefox":
                    tlBrowser.set(getPlaywright().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false)));
                    break;
                case "safari":
                    tlBrowser.set(getPlaywright().webkit().launch(new BrowserType.LaunchOptions().setHeadless(false)));
                    break;
                case "chrome":
                    tlBrowser.set(
                            getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setSlowMo(100)));
                    break;
                default:
                    System.out.println("Tarayıcı İsmi Tanımlanamadı...");
                    break;
            }
            tlBrowserContext.set(getBrowser().newContext(new Browser.NewContextOptions().setViewportSize(1500,900)));
            tlPage.set(getBrowserContext().newPage());
            getPage().navigate(Parameters.url);

            return getPage();
        }
        /*
        * this method is used to initialize the properties from config file*/

    public Properties init_prop(){
        try {
            FileInputStream ip =new FileInputStream("src/main/java/qmframework/Parameters.properties");
            prop = new Properties();
            prop.load(ip);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }
    public static String takeScreenshot() {
        String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
        //getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));

        byte[] buffer = getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
        String base64Path = Base64.getEncoder().encodeToString(buffer);

        return base64Path;
    }

}
