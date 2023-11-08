package qmframework;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Commands {
    private Page page;
    String text = "";
    public static void Click(Page element, String selector) {
        try {
            element.click(selector);
        } catch (Exception e) {
            System.err.println("Hata:"+e.getMessage());
            e.printStackTrace();
           // System.exit(0);
        }
    }

    public static boolean isVisible(Page element, String selector) {

        try {
            element.querySelector(selector).isVisible();
        } catch (Exception e) {
            System.err.println("Hata:"+e.getMessage());
            e.printStackTrace();


        }
        return true;
    }
    public static void equals(Page element, String selector) {

        try {
            element.querySelector(selector).equals(element);
        } catch (Exception e) {
            System.err.println("Hata:" + e.getMessage());
            e.printStackTrace();


        }
    }

    public static String FetchAllDataAsList(Page page ,String listSelector) {
        String output = " ";
        List<String> elementTexts = new ArrayList<>();
        List<ElementHandle> elements = page.querySelectorAll(listSelector);

        if (elements.size() > 0) {
            for (ElementHandle e : elements) {
                e.isVisible();
                if (e.innerText().length() > 0 && !e.innerText().equals(" ")) {
                    output += e.innerText() + ",";
                    output = output.trim();
                }
            }
        }
        return output;
    }
}
