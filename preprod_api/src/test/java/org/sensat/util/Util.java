package org.sensat.util;

import org.sensat.test.advertisement.payload.createVehicleAdvertisementForSale.PropertiesItem;
import org.sensat.test.search.payload.searchByFilter.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Util {

    public static String generateRandomCode() {
        return String.valueOf(ThreadLocalRandom.current().nextInt()).replace("-", "");
    }

    public static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        while (length > 0) {
            Random rand = new Random();
            result.append(characters.charAt(rand.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }

    public static ArrayList<PropertiesItem> createPropertiesItemForSale() {
        ArrayList<PropertiesItem> propertiesItems = new ArrayList<>();

        PropertiesItem propertiesItem = new PropertiesItem();
        propertiesItem.setPropertyId(31);
        propertiesItem.setValue("80");
        propertiesItem.setDisplayName("  İmmobilizer");
        propertiesItems.add(propertiesItem);

        PropertiesItem propertiesItem2 = new PropertiesItem();
        propertiesItem2.setPropertyId(69);
        propertiesItem2.setValue("145");
        propertiesItem2.setDisplayName("Yedek lastik");
        propertiesItems.add(propertiesItem2);

        PropertiesItem propertiesItem3 = new PropertiesItem();
        propertiesItem3.setPropertyId(70);
        propertiesItem3.setValue("158");
        propertiesItem3.setDisplayName("Android Auto");
        propertiesItems.add(propertiesItem3);

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

        PropertiesItem propertiesItem8 = new PropertiesItem();
        propertiesItem8.setPropertyId(12);
        propertiesItem8.setValue("14");
        propertiesItem8.setDisplayName("İkinci El");
        propertiesItems.add(propertiesItem8);

        PropertiesItem propertiesItem9 = new PropertiesItem();
        propertiesItem9.setPropertyId(3);
        propertiesItem9.setValue("3");
        propertiesItem9.setDisplayName("2022");
        propertiesItems.add(propertiesItem9);

        PropertiesItem propertiesItem10 = new PropertiesItem();
        propertiesItem10.setPropertyId(1);
        propertiesItem10.setValue("15");
        propertiesItem10.setDisplayName("SKODA");
        propertiesItems.add(propertiesItem10);

        PropertiesItem propertiesItem11 = new PropertiesItem();
        propertiesItem11.setPropertyId(2);
        propertiesItem11.setValue("330");
        propertiesItem11.setDisplayName("SUPERB");
        propertiesItems.add(propertiesItem11);

        PropertiesItem propertiesItem12 = new PropertiesItem();
        propertiesItem12.setPropertyId(6);
        propertiesItem12.setValue("8");
        propertiesItem12.setDisplayName("Benzin");
        propertiesItems.add(propertiesItem12);

        PropertiesItem propertiesItem13 = new PropertiesItem();
        propertiesItem13.setPropertyId(4);
        propertiesItem13.setValue("37");
        propertiesItem13.setDisplayName("Hatchback");
        propertiesItems.add(propertiesItem13);

        PropertiesItem propertiesItem14 = new PropertiesItem();
        propertiesItem14.setPropertyId(5);
        propertiesItem14.setValue("7");
        propertiesItem14.setDisplayName("Otomatik");
        propertiesItems.add(propertiesItem14);

        PropertiesItem propertiesItem15 = new PropertiesItem();
        propertiesItem15.setPropertyId(7);
        propertiesItem15.setValue("89414");
        propertiesItem15.setDisplayName("1.5 TSI 150 PS DSG ACT ELITE");
        propertiesItems.add(propertiesItem15);

        PropertiesItem propertiesItem16 = new PropertiesItem();
        propertiesItem16.setPropertyId(8);
        propertiesItem16.setValue("15.000");
        propertiesItem16.setDisplayName("15.000");
        propertiesItems.add(propertiesItem16);

        PropertiesItem propertiesItem17 = new PropertiesItem();
        propertiesItem17.setPropertyId(9);
        propertiesItem17.setValue("01/01/2022");
        propertiesItem17.setDisplayName("01/01/2022");
        propertiesItems.add(propertiesItem17);

        PropertiesItem propertiesItem18 = new PropertiesItem();
        propertiesItem18.setPropertyId(11);
        propertiesItem18.setValue("16 SKO 16");
        propertiesItem18.setDisplayName("16 SKO 16");
        propertiesItems.add(propertiesItem18);

        PropertiesItem propertiesItem19 = new PropertiesItem();
        propertiesItem19.setPropertyId(92);
        propertiesItem19.setValue("B");
        propertiesItem19.setDisplayName("roof");
        propertiesItems.add(propertiesItem19);

        PropertiesItem propertiesItem20 = new PropertiesItem();
        propertiesItem20.setPropertyId(76);
        propertiesItem20.setValue("1000");
        propertiesItem20.setDisplayName("1000");
        propertiesItems.add(propertiesItem20);

        PropertiesItem propertiesItem21 = new PropertiesItem();
        propertiesItem21.setPropertyId(77);
        propertiesItem21.setValue("Komşu silecekleri kopardı.");
        propertiesItem21.setDisplayName("Komşu silecekleri kopardı.");
        propertiesItems.add(propertiesItem21);

        PropertiesItem propertiesItem22 = new PropertiesItem();
        propertiesItem22.setPropertyId(32);
        propertiesItem22.setValue("64");
        propertiesItem22.setDisplayName("Siyah");
        propertiesItems.add(propertiesItem22);

        return propertiesItems;
    }

    public static ArrayList<org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem> createPropertiesItemForRent() {
        ArrayList<org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem> propertiesItems = new ArrayList<>();

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem.setPropertyId(10);
        propertiesItem.setValue("11");
        propertiesItem.setDisplayName("Türkiye Plakalı");
        propertiesItems.add(propertiesItem);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem2 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem2.setPropertyId(3);
        propertiesItem2.setValue("3");
        propertiesItem2.setDisplayName("2022");
        propertiesItems.add(propertiesItem2);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem3 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem3.setPropertyId(1);
        propertiesItem3.setValue("15");
        propertiesItem3.setDisplayName("SKODA");
        propertiesItems.add(propertiesItem3);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem4 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem4.setPropertyId(2);
        propertiesItem4.setValue("330");
        propertiesItem4.setDisplayName("SUPERB");
        propertiesItems.add(propertiesItem4);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem5 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem5.setPropertyId(6);
        propertiesItem5.setValue("8");
        propertiesItem5.setDisplayName("Benzin");
        propertiesItems.add(propertiesItem5);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem6 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem6.setPropertyId(4);
        propertiesItem6.setValue("37");
        propertiesItem6.setDisplayName("Hatchback");
        propertiesItems.add(propertiesItem6);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem7 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem7.setPropertyId(5);
        propertiesItem7.setValue("7");
        propertiesItem7.setDisplayName("Otomatik");
        propertiesItems.add(propertiesItem7);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem8 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem8.setPropertyId(7);
        propertiesItem8.setValue("89414");
        propertiesItem8.setDisplayName("1.5 TSI 150 PS DSG ACT ELITE");
        propertiesItems.add(propertiesItem8);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem9 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem9.setPropertyId(8);
        propertiesItem9.setValue("15.000");
        propertiesItem9.setDisplayName("15.000");
        propertiesItems.add(propertiesItem9);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem10 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem10.setPropertyId(9);
        propertiesItem10.setValue("01/01/2022");
        propertiesItem10.setDisplayName("01/01/2022");
        propertiesItems.add(propertiesItem10);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem11 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem11.setPropertyId(11);
        propertiesItem11.setValue("16 SKO 16");
        propertiesItem11.setDisplayName("16 SKO 16");
        propertiesItems.add(propertiesItem11);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem12 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem12.setPropertyId(32);
        propertiesItem12.setValue("64");
        propertiesItem12.setDisplayName("Siyah");
        propertiesItems.add(propertiesItem12);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem13 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem13.setPropertyId(76);
        propertiesItem13.setValue("0");
        propertiesItem13.setDisplayName("0");
        propertiesItems.add(propertiesItem13);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem14 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem14.setPropertyId(16);
        propertiesItem14.setValue("150");
        propertiesItem14.setDisplayName("150");
        propertiesItems.add(propertiesItem14);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem15 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem15.setPropertyId(73);
        propertiesItem15.setValue("0");
        propertiesItem15.setDisplayName("0");
        propertiesItems.add(propertiesItem15);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem16 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem16.setPropertyId(18);
        propertiesItem16.setValue("2.500");
        propertiesItem16.setDisplayName("2.500");
        propertiesItems.add(propertiesItem16);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem17 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem17.setPropertyId(75);
        propertiesItem17.setValue("0");
        propertiesItem17.setDisplayName("0");
        propertiesItems.add(propertiesItem17);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem18 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem18.setPropertyId(17);
        propertiesItem18.setValue("750");
        propertiesItem18.setDisplayName("750");
        propertiesItems.add(propertiesItem18);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem19 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem19.setPropertyId(74);
        propertiesItem19.setValue("0");
        propertiesItem19.setDisplayName("0");
        propertiesItems.add(propertiesItem19);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem20 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem20.setPropertyId(22);
        propertiesItem20.setValue("1.000");
        propertiesItem20.setDisplayName("1.000");
        propertiesItems.add(propertiesItem20);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem21 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem21.setPropertyId(27);
        propertiesItem21.setValue("18");
        propertiesItem21.setDisplayName("18");
        propertiesItems.add(propertiesItem21);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem22 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem22.setPropertyId(30);
        propertiesItem22.setValue("2");
        propertiesItem22.setDisplayName("2");
        propertiesItems.add(propertiesItem22);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem23 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem23.setPropertyId(19);
        propertiesItem23.setValue("24");
        propertiesItem23.setDisplayName("Galeriden");
        propertiesItems.add(propertiesItem23);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem24 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem24.setPropertyId(20);
        propertiesItem24.setValue("27");
        propertiesItem24.setDisplayName("Fark Etmez");
        propertiesItems.add(propertiesItem24);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem25 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem25.setPropertyId(21);
        propertiesItem25.setValue("28");
        propertiesItem25.setDisplayName("Kredi Kartı");
        propertiesItems.add(propertiesItem25);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem26 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem26.setPropertyId(21);
        propertiesItem26.setValue("29");
        propertiesItem26.setDisplayName("Havale/EFT");
        propertiesItems.add(propertiesItem26);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem27 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem27.setPropertyId(21);
        propertiesItem27.setValue("30");
        propertiesItem27.setDisplayName("Nakit");
        propertiesItems.add(propertiesItem27);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem28 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem28.setPropertyId(24);
        propertiesItem28.setValue("37");
        propertiesItem28.setDisplayName("Sadece Şehiriçi");
        propertiesItems.add(propertiesItem28);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem29 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem29.setPropertyId(28);
        propertiesItem29.setValue("54");
        propertiesItem29.setDisplayName("B");
        propertiesItems.add(propertiesItem29);

        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem propertiesItem30 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem();
        propertiesItem30.setPropertyId(29);
        propertiesItem30.setValue("59");
        propertiesItem30.setDisplayName("TC Sürücü Belgesi");
        propertiesItems.add(propertiesItem30);

        return propertiesItems;
    }

    public static String generateRandomNumber(int length) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < length; i++) {
            number.append((int) (Math.random() * 10));
        }
        return number.toString();
    }

    public static Criterias getCriterias(String categoryId, String brand, int minKm, int maxKm, int minPrice, int maxPrice, int minYear, int maxYear, boolean onlyVideo) {
        Criterias criterias = new Criterias();
        criterias.setAdvertNo("0");
        criterias.setAdvertsNotOptional(false);
        criterias.setBrand(brand);
        criterias.setCategoryId(categoryId);
        criterias.setHasOnlyVideo(onlyVideo);
        criterias.setInner360(false);

        Km km = new Km();
        km.setMin(minKm);
        km.setMax(maxKm);

        criterias.setKm(km);
        criterias.setLastPushlishDate(0);
        criterias.setModel("");

        Price price = new Price();
        price.setMin(minPrice);
        price.setMax(maxPrice);

        criterias.setPrice(price);
        criterias.setProviderId(0);
        criterias.setSalesType(1);
        criterias.setSearchText("");

        SpecsFilter specsFilter = new SpecsFilter();
        specsFilter.setBodyType(new ArrayList<>());
        specsFilter.setBrandList(new ArrayList<>());
        specsFilter.setCities(new ArrayList<>());
        specsFilter.setColor(new ArrayList<>());
        specsFilter.setDriveLine(new ArrayList<>());
        specsFilter.setDriverLicenceClasses(new ArrayList<>());
        specsFilter.setDriverLicenceValidity(new ArrayList<>());
        specsFilter.setEquipmentFilter(new ArrayList<>());
        specsFilter.setFromLease(new ArrayList<>());
        specsFilter.setFuel(new ArrayList<>());
        specsFilter.setGear(new ArrayList<>());
        specsFilter.setGuaranteeStatus(new ArrayList<>());
        specsFilter.setLeasePeriod(new ArrayList<>());
        specsFilter.setLeaseType(new ArrayList<>());
        specsFilter.setMaxPower(new ArrayList<>());
        specsFilter.setMotor(new ArrayList<>());
        specsFilter.setOptions(new ArrayList<>());
        specsFilter.setPaymentType(new ArrayList<>());
        specsFilter.setSellers(new ArrayList<>());

        criterias.setSpecsFilter(specsFilter);
        criterias.setStoreId(0);

        Year year = new Year();
        year.setMax(maxYear);
        year.setMin(minYear);

        criterias.setYear(year);

        return criterias;
    }

}
