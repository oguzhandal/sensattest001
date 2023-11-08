package qmframework;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import com.sensat.factory.PlaywrightFactory;

public class Load{
    public static void waitUntilDomLoaded(Page page)throws InterruptedException{
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }

}