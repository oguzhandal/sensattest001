package org.sensat.test.util;

import org.sensat.test.request.advertisement.createVehicleAdvertisementForSale.PropertiesItem;

import java.util.ArrayList;
import java.util.Random;

public class Util {

    public static ArrayList<PropertiesItem> createPropertiesItemForSale() {

        String plaka = "16 VBN ";
        Random random = new Random();
        int x = random.nextInt(900) + 100;

        plaka += x;

        ArrayList<PropertiesItem> propertiesItems = new ArrayList<>();

        PropertiesItem propertiesItem4 = new PropertiesItem();
        propertiesItem4.setPropertyId(10);
        propertiesItem4.setValue("11");
        propertiesItem4.setDisplayName("Türkiye Plakalı");
        propertiesItems.add(propertiesItem4);

        PropertiesItem propertiesItem5 = new PropertiesItem();
        propertiesItem5.setPropertyId(14);
        propertiesItem5.setValue("18");
        propertiesItem5.setDisplayName("Garantisi Var");
        propertiesItems.add(propertiesItem5);

        PropertiesItem propertiesItem6 = new PropertiesItem();
        propertiesItem6.setPropertyId(13);
        propertiesItem6.setValue("17");
        propertiesItem6.setDisplayName("Yetkili Satıcıdan");
        propertiesItems.add(propertiesItem6);

        PropertiesItem propertiesItem7 = new PropertiesItem();
        propertiesItem7.setPropertyId(15);
        propertiesItem7.setValue("21");
        propertiesItem7.setDisplayName("Takasa Uygun Değil");
        propertiesItems.add(propertiesItem7);

        PropertiesItem propertiesItem9 = new PropertiesItem();
        propertiesItem9.setPropertyId(3);
        propertiesItem9.setValue("2022");
        propertiesItem9.setDisplayName("2022");
        propertiesItems.add(propertiesItem9);

        PropertiesItem propertiesItem10 = new PropertiesItem();
        propertiesItem10.setPropertyId(1);
        propertiesItem10.setValue("5");
        propertiesItem10.setDisplayName("ALFA ROMEO");
        propertiesItems.add(propertiesItem10);

        PropertiesItem propertiesItem11 = new PropertiesItem();
        propertiesItem11.setPropertyId(2);
        propertiesItem11.setValue("810");
        propertiesItem11.setDisplayName("GIULIA");
        propertiesItems.add(propertiesItem11);

        PropertiesItem propertiesItem12 = new PropertiesItem();
        propertiesItem12.setPropertyId(6);
        propertiesItem12.setValue("8");
        propertiesItem12.setDisplayName("Benzin");
        propertiesItems.add(propertiesItem12);

        PropertiesItem propertiesItem13 = new PropertiesItem();
        propertiesItem13.setPropertyId(4);
        propertiesItem13.setValue("46");
        propertiesItem13.setDisplayName("Sedan");
        propertiesItems.add(propertiesItem13);

        PropertiesItem propertiesItem14 = new PropertiesItem();
        propertiesItem14.setPropertyId(5);
        propertiesItem14.setValue("7");
        propertiesItem14.setDisplayName("Otomatik");
        propertiesItems.add(propertiesItem14);

        PropertiesItem propertiesItem15 = new PropertiesItem();
        propertiesItem15.setPropertyId(7);
        propertiesItem15.setValue("78139");
        propertiesItem15.setDisplayName("2.0 200HP SPRINT RWD BENZİNLİ OTOMATİK");
        propertiesItems.add(propertiesItem15);

        PropertiesItem propertiesItem16 = new PropertiesItem();
        propertiesItem16.setPropertyId(8);
        propertiesItem16.setValue("15.000");
        propertiesItem16.setDisplayName("15.000");
        propertiesItems.add(propertiesItem16);

        PropertiesItem propertiesItem17 = new PropertiesItem();
        propertiesItem17.setPropertyId(9);
        propertiesItem17.setValue("01/03/2022");
        propertiesItem17.setDisplayName("01/03/2022");
        propertiesItems.add(propertiesItem17);

        PropertiesItem propertiesItem18 = new PropertiesItem();
        propertiesItem18.setPropertyId(11);
        propertiesItem18.setValue(plaka);
        propertiesItem18.setDisplayName(plaka);
        propertiesItems.add(propertiesItem18);

        PropertiesItem propertiesItem20 = new PropertiesItem();
        propertiesItem20.setPropertyId(76);
        propertiesItem20.setValue("0");
        propertiesItem20.setDisplayName("0");
        propertiesItems.add(propertiesItem20);

        PropertiesItem propertiesItem22 = new PropertiesItem();
        propertiesItem22.setPropertyId(32);
        propertiesItem22.setValue("64");
        propertiesItem22.setDisplayName("Siyah");
        propertiesItems.add(propertiesItem22);

        PropertiesItem propertiesItem23 = new PropertiesItem();
        propertiesItem23.setPropertyId(103);
        propertiesItem23.setValue("12312532524523523");
        propertiesItem23.setDisplayName("12312532524523523");
        propertiesItems.add(propertiesItem23);

        PropertiesItem propertiesItem24 = new PropertiesItem();
        propertiesItem24.setPropertyId(102);
        propertiesItem24.setValue("12312532524523523");
        propertiesItem24.setDisplayName("12312532524523523");
        propertiesItems.add(propertiesItem24);

        return propertiesItems;
    }

    public static ArrayList<org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem> createPropertiesItemForRent() {

        ArrayList<org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem> propertiesItems = new ArrayList<>();

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem.setPropertyId(10);
        propertiesItem.setValue("11");
        propertiesItem.setDisplayName("Türkiye Plakalı");
        propertiesItems.add(propertiesItem);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem2 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem2.setPropertyId(3);
        propertiesItem2.setValue("3");
        propertiesItem2.setDisplayName("2022");
        propertiesItems.add(propertiesItem2);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem3 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem3.setPropertyId(1);
        propertiesItem3.setValue("15");
        propertiesItem3.setDisplayName("SKODA");
        propertiesItems.add(propertiesItem3);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem4 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem4.setPropertyId(2);
        propertiesItem4.setValue("330");
        propertiesItem4.setDisplayName("SUPERB");
        propertiesItems.add(propertiesItem4);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem5 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem5.setPropertyId(6);
        propertiesItem5.setValue("8");
        propertiesItem5.setDisplayName("Benzin");
        propertiesItems.add(propertiesItem5);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem6 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem6.setPropertyId(4);
        propertiesItem6.setValue("37");
        propertiesItem6.setDisplayName("Hatchback");
        propertiesItems.add(propertiesItem6);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem7 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem7.setPropertyId(5);
        propertiesItem7.setValue("7");
        propertiesItem7.setDisplayName("Otomatik");
        propertiesItems.add(propertiesItem7);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem8 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem8.setPropertyId(7);
        propertiesItem8.setValue("89414");
        propertiesItem8.setDisplayName("1.5 TSI 150 PS DSG ACT ELITE");
        propertiesItems.add(propertiesItem8);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem9 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem9.setPropertyId(8);
        propertiesItem9.setValue("15.000");
        propertiesItem9.setDisplayName("15.000");
        propertiesItems.add(propertiesItem9);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem10 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem10.setPropertyId(9);
        propertiesItem10.setValue("01/01/2022");
        propertiesItem10.setDisplayName("01/01/2022");
        propertiesItems.add(propertiesItem10);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem11 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem11.setPropertyId(11);
        propertiesItem11.setValue("16 SKO 16");
        propertiesItem11.setDisplayName("16 SKO 16");
        propertiesItems.add(propertiesItem11);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem12 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem12.setPropertyId(32);
        propertiesItem12.setValue("64");
        propertiesItem12.setDisplayName("Siyah");
        propertiesItems.add(propertiesItem12);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem13 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem13.setPropertyId(76);
        propertiesItem13.setValue("0");
        propertiesItem13.setDisplayName("0");
        propertiesItems.add(propertiesItem13);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem14 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem14.setPropertyId(16);
        propertiesItem14.setValue("150");
        propertiesItem14.setDisplayName("150");
        propertiesItems.add(propertiesItem14);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem15 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem15.setPropertyId(73);
        propertiesItem15.setValue("0");
        propertiesItem15.setDisplayName("0");
        propertiesItems.add(propertiesItem15);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem16 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem16.setPropertyId(18);
        propertiesItem16.setValue("2.500");
        propertiesItem16.setDisplayName("2.500");
        propertiesItems.add(propertiesItem16);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem17 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem17.setPropertyId(75);
        propertiesItem17.setValue("0");
        propertiesItem17.setDisplayName("0");
        propertiesItems.add(propertiesItem17);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem18 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem18.setPropertyId(17);
        propertiesItem18.setValue("750");
        propertiesItem18.setDisplayName("750");
        propertiesItems.add(propertiesItem18);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem19 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem19.setPropertyId(74);
        propertiesItem19.setValue("0");
        propertiesItem19.setDisplayName("0");
        propertiesItems.add(propertiesItem19);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem20 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem20.setPropertyId(22);
        propertiesItem20.setValue("1.000");
        propertiesItem20.setDisplayName("1.000");
        propertiesItems.add(propertiesItem20);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem21 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem21.setPropertyId(27);
        propertiesItem21.setValue("18");
        propertiesItem21.setDisplayName("18");
        propertiesItems.add(propertiesItem21);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem22 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem22.setPropertyId(30);
        propertiesItem22.setValue("2");
        propertiesItem22.setDisplayName("2");
        propertiesItems.add(propertiesItem22);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem23 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem23.setPropertyId(19);
        propertiesItem23.setValue("24");
        propertiesItem23.setDisplayName("Galeriden");
        propertiesItems.add(propertiesItem23);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem24 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem24.setPropertyId(20);
        propertiesItem24.setValue("27");
        propertiesItem24.setDisplayName("Fark Etmez");
        propertiesItems.add(propertiesItem24);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem25 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem25.setPropertyId(21);
        propertiesItem25.setValue("28");
        propertiesItem25.setDisplayName("Kredi Kartı");
        propertiesItems.add(propertiesItem25);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem26 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem26.setPropertyId(21);
        propertiesItem26.setValue("29");
        propertiesItem26.setDisplayName("Havale/EFT");
        propertiesItems.add(propertiesItem26);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem27 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem27.setPropertyId(21);
        propertiesItem27.setValue("30");
        propertiesItem27.setDisplayName("Nakit");
        propertiesItems.add(propertiesItem27);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem28 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem28.setPropertyId(24);
        propertiesItem28.setValue("37");
        propertiesItem28.setDisplayName("Sadece Şehiriçi");
        propertiesItems.add(propertiesItem28);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem29 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem29.setPropertyId(28);
        propertiesItem29.setValue("54");
        propertiesItem29.setDisplayName("B");
        propertiesItems.add(propertiesItem29);

        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem propertiesItem30 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem30.setPropertyId(29);
        propertiesItem30.setValue("59");
        propertiesItem30.setDisplayName("TC Sürücü Belgesi");
        propertiesItems.add(propertiesItem30);

        return propertiesItems;

    }

}
