package org.sensat.test.advertisement;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.apache.commons.io.FileUtils;
import org.sensat.base.AdvertisementAccount;
import org.sensat.constant.AdvertisementServiceParameters;
import org.sensat.test.advertisement.payload.*;
import org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.CreateVehicleAdvertisementForRentRequest;
import org.sensat.test.advertisement.payload.createVehicleAdvertisementForSale.AdvertisementMediasItem;
import org.sensat.test.advertisement.payload.createVehicleAdvertisementForSale.CreateVehicleAdvertisementForSaleRequest;
import org.sensat.test.advertisement.payload.createVehicleAdvertisementForSale.ExpertReportFileItem;
import org.sensat.test.advertisement.payload.createVehicleAdvertisementForSale.PropertiesItem;
import org.sensat.test.advertisement.payload.getFavoriteAdvertisements.GetFavoriteAdvertisementsRequest;
import org.sensat.test.advertisement.payload.getUserAdvertisementsByUserId.GetUserAdvertisementsByUserIdRequest;
import org.sensat.test.advertisement.payload.getUserPendingAdvertisementsByUserId.GetUserPendingAdvertisementsByUserIdRequest;
import org.sensat.test.advertisement.payload.getUserPublishedAdvertisementsByUserId.GetUserPublishedAdvertisementsByUserIdRequest;
import org.sensat.test.advertisement.payload.getUserPublishedAdvertisementsByUserId.Pagination;
import org.sensat.test.advertisement.payload.getUserUnpublishedAdvertisementsByUserId.GetUserUnpublishedAdvertisementsByUserIdRequest;
import org.sensat.test.advertisement.response.CheckDuplicatePlates.CheckDuplicatePlateResponse;
import org.sensat.test.advertisement.response.GetVehicleJatoIdResponse;
import org.sensat.test.advertisement.response.StoreSummaryReportResponse.StoreSummaryReportResponses;
import org.sensat.test.advertisement.response.checkAdvertisementOwnerById.CheckAdvertisementOwnerByIdResponse;
import org.sensat.test.advertisement.response.createVehicleAdvertisement.CreateVehicleAdvertisementResponse;
import org.sensat.test.advertisement.response.getAdvertDetailModelForEditById.GetAdvertDetailModelForEditByIdResponse;
import org.sensat.test.advertisement.response.getAdvertVehicleChoiceModelForEditById.GetAdvertVehicleChoiceModelForEditByIdResponse;
import org.sensat.test.advertisement.response.getAdvertVehiclePropertiesModelForEditById.GetAdvertVehiclePropertiesModelForEditByIdResponse;
import org.sensat.test.advertisement.response.getAdvertisementVehicleDetailsById.GetAdvertisementVehicleDetailsByIdResponse;
import org.sensat.test.advertisement.response.getAllAdvertisementFilesResponse.GetAllAdvertisementFilesResponse;
import org.sensat.test.advertisement.response.getAllProperties.GetAllPropertiesResponse;
import org.sensat.test.advertisement.response.getContactInformationModelForEditById.GetContactInformationModelForEditByIdResponse;
import org.sensat.test.advertisement.response.getDiaryDetailsByUser.GetDiaryDetailsByUserResponse;
import org.sensat.test.advertisement.response.getFavoriteAdvertisements.GetFavoriteAdvertisementsResponse;
import org.sensat.test.advertisement.response.getIsVehicleAdvertisementById.GetIsVehicleAdvertisementByIdResponse;
import org.sensat.test.advertisement.response.getJatoVehiclePropsByJatoVehicleId.GetJatoVehiclePropsByJatoVehicleIdResponse;
import org.sensat.test.advertisement.response.getSearchAdvertisementFromWho.GetSearchAdvertisementFromWhoResponse;
import org.sensat.test.advertisement.response.getSearchAdvertisementPropertiesByCategoryId.GetSearchAdvertisementPropertiesByCategoryIdResponse;
import org.sensat.test.advertisement.response.getStoreFavoriteAdvertisementGraph.GetStoreFavoriteAdvertisementGraphResponse;
import org.sensat.test.advertisement.response.getUserAdvertisementsByUserId.GetUserAdvertisementsByUserIdResponse;
import org.sensat.test.advertisement.response.getUserPendingAdvertisementsByUserId.GetUserPendingAdvertisementsByUserIdResponse;
import org.sensat.test.advertisement.response.getUserPublishedAdvertisementsByUserId.GetUserPublishedAdvertisementsByUserIdResponse;
import org.sensat.test.advertisement.response.getUserUnpublishedAdvertisementsByUserId.GetUserUnpublishedAdvertisementsByUserIdResponse;
import org.sensat.test.advertisement.response.getVehicleBodyTypes.GetVehicleBodyTypesResponse;
import org.sensat.test.advertisement.response.getVehicleBrands.GetVehicleBrandsResponse;
import org.sensat.test.advertisement.response.getVehicleCategories.GetVehicleCategoriesResponse;
import org.sensat.test.advertisement.response.getVehicleCompare.GetVehicleCompareResponse;
import org.sensat.test.advertisement.response.getVehicleDetailsPropertiesForCreateAdvertisementQuery.GetVehicleDetailPropertiesForCreateAdvertisementQueryResponse;
import org.sensat.test.advertisement.response.getVehicleFuelTypes.GetVehicleFuelTypesResponse;
import org.sensat.test.advertisement.response.getVehicleGearTypes.GetVehicleBodyGearTypesResponse;
import org.sensat.test.advertisement.response.getVehicleModelTypes.GetVehicleModelTypesResponse;
import org.sensat.test.advertisement.response.getVehicleModels.GetVehicleModelsResponse;
import org.sensat.test.advertisement.response.getVehicleYears.GetVehicleYearsResponse;
import org.sensat.test.advertisement.response.AddAdvertisementToFavoriteResponse;
import org.sensat.test.advertisement.response.RemoveAdvertisementFromFavoriteResponse;
import org.sensat.test.advertisement.response.UpdateAdvertisementOptionalStatusResponse;
import org.sensat.test.advertisement.response.UpdateAdvertisementStatusResponse;
import org.sensat.util.Util;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class AdvertisementTest extends AdvertisementAccount {

    private APIRequestContext getApiRequestContext() {
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(AdvertisementServiceParameters.ADVERTISEMENT_PREPROD_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = "Get Search Advertisement From Who")
    public void getSearchAdvertisementFromWho() {
        apiRequestContext = getApiRequestContext();

        GetSearchAdvertisementFromWhoRequest request = new GetSearchAdvertisementFromWhoRequest();
        request.setFrom("sellers");

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_SEARCH_ADVERTISEMENT_FROM_WHO, RequestOptions.create().setData(request)).text();

        GetSearchAdvertisementFromWhoResponse response = new Gson().fromJson(requestResponse, GetSearchAdvertisementFromWhoResponse.class);

        assertTrue(response.isSuccess());

        System.out.println(response);
    }

    @Test(description = "Get Search Advertisement Properties By Category Id:1")
    public void getSearchAdvertisementPropertiesByCategoryId1() {
        apiRequestContext = getApiRequestContext();

        GetSearchAdvertisementPropertiesByCategoryIdRequest request = new GetSearchAdvertisementPropertiesByCategoryIdRequest();
        request.setCategoryId("1");
        request.setSalesType(1);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_SEARCH_ADVERTISEMENT_PROPERTIES_BY_CATEGORY_ID,
                RequestOptions.create().setData(request)).text();

        GetSearchAdvertisementPropertiesByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetSearchAdvertisementPropertiesByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Search Advertisement Properties By Category Id:2")
    public void getSearchAdvertisementPropertiesByCategoryId2() {
        apiRequestContext = getApiRequestContext();

        GetSearchAdvertisementPropertiesByCategoryIdRequest request = new GetSearchAdvertisementPropertiesByCategoryIdRequest();
        request.setCategoryId("2");
        request.setSalesType(1);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_SEARCH_ADVERTISEMENT_PROPERTIES_BY_CATEGORY_ID,
                RequestOptions.create().setData(request)).text();

        GetSearchAdvertisementPropertiesByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetSearchAdvertisementPropertiesByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Search Advertisement Properties By Category Id:1")
    public void getSearchAdvertisementPropertiesByCategoryId3() {
        apiRequestContext = getApiRequestContext();

        GetSearchAdvertisementPropertiesByCategoryIdRequest request = new GetSearchAdvertisementPropertiesByCategoryIdRequest();
        request.setCategoryId("1");
        request.setSalesType(1);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_SEARCH_ADVERTISEMENT_PROPERTIES_BY_CATEGORY_ID, RequestOptions.create().setData(request)).text();

        GetSearchAdvertisementPropertiesByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetSearchAdvertisementPropertiesByCategoryIdResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Years Category Id: 1")
    public void getVehicleYearsCategoryId1() {
        apiRequestContext = getApiRequestContext();

        GetVehicleYearsRequest request = new GetVehicleYearsRequest();
        request.setCategoryId(1);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_YEARS, RequestOptions.create().setData(request)).text();

        GetVehicleYearsResponse response = new Gson().fromJson(requestResponse, GetVehicleYearsResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Years Category Id: 2")
    public void getVehicleYearsCategoryId2() {
        apiRequestContext = getApiRequestContext();

        GetVehicleYearsRequest request = new GetVehicleYearsRequest();
        request.setCategoryId(2);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_YEARS, RequestOptions.create().setData(request)).text();

        GetVehicleYearsResponse response = new Gson().fromJson(requestResponse, GetVehicleYearsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Years Category Id: 3")
    public void getVehicleYearsCategoryId3() {
        apiRequestContext = getApiRequestContext();

        GetVehicleYearsRequest request = new GetVehicleYearsRequest();
        request.setCategoryId(3);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_YEARS, RequestOptions.create().setData(request)).text();

        GetVehicleYearsResponse response = new Gson().fromJson(requestResponse, GetVehicleYearsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get All Properties")
    public void getAllProperties() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(AdvertisementServiceParameters.GET_ALL_PROPERTIES).text();

        GetAllPropertiesResponse response = new Gson().fromJson(requestResponse, GetAllPropertiesResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Brands")
    public void getVehicleBrandsCategoryId1() {
        apiRequestContext = getApiRequestContext();

        GetVehicleBrandsRequest request = new GetVehicleBrandsRequest();
        request.setCategoryId(1);
        request.setYear(2022);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_BRANDS, RequestOptions.create().setData(request)).text();

        GetVehicleBrandsResponse response = new Gson().fromJson(requestResponse, GetVehicleBrandsResponse.class);
        System.out.println(response);
        assertTrue(response.isSuccess());

    }

    @Test(description = "Get Vehicle Brands")
    public void getVehicleBrandsCategoryId2() {
        apiRequestContext = getApiRequestContext();

        GetVehicleBrandsRequest request = new GetVehicleBrandsRequest();
        request.setCategoryId(2);
        request.setYear(2022);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_BRANDS, RequestOptions.create().setData(request)).text();

        GetVehicleBrandsResponse response = new Gson().fromJson(requestResponse, GetVehicleBrandsResponse.class);
        System.out.println(response);
        assertTrue(response.isSuccess());

    }

    @Test(description = "Get Vehicle Brands")
    public void getVehicleBrandsCategoryId3() {
        apiRequestContext = getApiRequestContext();

        GetVehicleBrandsRequest request = new GetVehicleBrandsRequest();
        request.setCategoryId(3);
        request.setYear(2022);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_BRANDS, RequestOptions.create().setData(request)).text();

        GetVehicleBrandsResponse response = new Gson().fromJson(requestResponse, GetVehicleBrandsResponse.class);
        assertTrue(response.isSuccess());

    }

    @Test(description = "Get Vehicle Models")
    public void getVehicleModels() {
        apiRequestContext = getApiRequestContext();

        GetVehicleModelsRequest request = new GetVehicleModelsRequest();
        request.setCategoryId(1);
        request.setYear(2022);
        request.setBrandId(15);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_MODELS, RequestOptions.create().setData(request)).text();

        GetVehicleModelsResponse response = new Gson().fromJson(requestResponse, GetVehicleModelsResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Body Types")
    public void getVehicleBodyTypes() {
        apiRequestContext = getApiRequestContext();

        GetVehicleBodyTypesRequest request = new GetVehicleBodyTypesRequest();
        request.setCategoryId(1);
        request.setYear(2022);
        request.setModelId(330);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_BODY_TYPES, RequestOptions.create().setData(request)).text();

        GetVehicleBodyTypesResponse response = new Gson().fromJson(requestResponse, GetVehicleBodyTypesResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Gear Types")
    public void getVehicleGearTypes() {
        apiRequestContext = getApiRequestContext();

        GetVehicleBodyGearTypesRequest request = new GetVehicleBodyGearTypesRequest();
        request.setCategoryId(1);
        request.setYear(2022);
        request.setModelId(330);
        request.setBodyTypeId(37);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_GEAR_TYPES, RequestOptions.create().setData(request)).text();

        GetVehicleBodyGearTypesResponse response = new Gson().fromJson(requestResponse, GetVehicleBodyGearTypesResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Fuel Types")
    public void getVehicleFuelTypes() {
        apiRequestContext = getApiRequestContext();

        GetVehicleFuelTypesRequest request = new GetVehicleFuelTypesRequest();
        request.setCategoryId(1);
        request.setYear(2022);
        request.setModelId(330);
        request.setBodyTypeId(37);
        request.setGearTypeId(2);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_FUEL_TYPES, RequestOptions.create().setData(request)).text();

        GetVehicleFuelTypesResponse response = new Gson().fromJson(requestResponse, GetVehicleFuelTypesResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Model Types")
    public void getVehicleModelTypes() {
        apiRequestContext = getApiRequestContext();

        GetVehicleModelTypesRequest request = new GetVehicleModelTypesRequest();
        request.setCategoryId(1);
        request.setYear(2022);
        request.setModelId(330);
        request.setBodyTypeId(37);
        request.setGearTypeId(2);
        request.setFuelTypeId(2);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_MODEL_TYPES, RequestOptions.create().setData(request)).text();

        GetVehicleModelTypesResponse response = new Gson().fromJson(requestResponse, GetVehicleModelTypesResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Jato Id")
    public void getVehicleJatoId() {
        apiRequestContext = getApiRequestContext();

        GetVehicleJatoIdRequest request = new GetVehicleJatoIdRequest();
        request.setModelTypeId(77622);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_JATO_ID, RequestOptions.create().setData(request)).text();

        GetVehicleJatoIdResponse response = new Gson().fromJson(requestResponse, GetVehicleJatoIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Detail Properties For Create Advertisement Query")
    public void getVehicleDetailPropertiesForCreateAdvertisementQuery() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(AdvertisementServiceParameters.GET_VEHICLE_DETAIL_PROPERTIES_FOR_CREATE_ADVERTISEMENT_QUERY,
                RequestOptions.create().setQueryParam("categoryId", "1").setQueryParam("jatoVehicleId", "814742520220126")).text();

        GetVehicleDetailPropertiesForCreateAdvertisementQueryResponse response = new Gson().fromJson(requestResponse, GetVehicleDetailPropertiesForCreateAdvertisementQueryResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Jato Vehicle Props By Jato Vehicle Id")
    public void getJatoVehiclePropsByJatoVehicleId() {
        apiRequestContext = getApiRequestContext();

        GetJatoVehiclePropsByJatoVehicleIdRequest request = new GetJatoVehiclePropsByJatoVehicleIdRequest();
        request.setCategoryId(1);
        request.setJatoVehicleId(814742520220126L);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_JATO_VEHICLE_PROPS_BY_JATO_VEHICLE_ID, RequestOptions.create().setData(request)).text();

        GetJatoVehiclePropsByJatoVehicleIdResponse response = new Gson().fromJson(requestResponse, GetJatoVehiclePropsByJatoVehicleIdResponse.class);
        System.out.println(response);
        assertTrue(response.isSuccess());
    }

  /*  @Test(description = "Get Advertisement Details For Create Advertisement By Category Id: 1")
    public void getAdvertisementDetailsForCreateAdvertisementByCategoryId1() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(AdvertisementServiceParameters.GET_ADVERTISEMENT_DETAILS_FOR_CREATE_ADVERTISEMENT_BY_CATEGORY_ID,
                RequestOptions.create().setQueryParam("categoryId", 1)).text();

        GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }*/

 /*   @Test(description = "Get Advertisement Details For Create Advertisement By Category Id: 2")
    public void getAdvertisementDetailsForCreateAdvertisementByCategoryId2() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(AdvertisementServiceParameters.GET_ADVERTISEMENT_DETAILS_FOR_CREATE_ADVERTISEMENT_BY_CATEGORY_ID,
                RequestOptions.create().setQueryParam("categoryId", 2)).text();

        GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }*/

 /*   @Test(description = "Get Advertisement Details For Create Advertisement By Category Id: 3")
    public void getAdvertisementDetailsForCreateAdvertisementByCategoryId3() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(AdvertisementServiceParameters.GET_ADVERTISEMENT_DETAILS_FOR_CREATE_ADVERTISEMENT_BY_CATEGORY_ID,
                RequestOptions.create().setQueryParam("categoryId", 3)).text();

        GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }*/

    @Test(description = "Create Vehicle Advertisement For Sale")
    public void createVehicleAdvertisementForSale() throws IOException {
        apiRequestContext = getApiRequestContext();

        ArrayList<PropertiesItem> propertiesItems = Util.createPropertiesItemForSale();

        ArrayList<ExpertReportFileItem> expertReportFileItems = new ArrayList<>();
        ExpertReportFileItem expertReportFileItem = new ExpertReportFileItem();

        byte[] fileContentExpert = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/data/document/sample_document.pdf"));
        String encodedStringExpert = Base64.getEncoder().encodeToString(fileContentExpert);

        expertReportFileItem.setSrc("data:application/pdf;base64," + encodedStringExpert);
        expertReportFileItem.setMediaType(1);
        expertReportFileItems.add(expertReportFileItem);

        ArrayList<AdvertisementMediasItem> advertisementMediasItems = new ArrayList<>();
        AdvertisementMediasItem advertisementMediasItem1 = new AdvertisementMediasItem();

        byte[] fileContentMedia1 = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/data/image/sample_egea_1.jpg"));
        String encodedStringMedia1 = Base64.getEncoder().encodeToString(fileContentMedia1);

        advertisementMediasItem1.setMediaBase64("data:image/png;base64," + encodedStringMedia1);
        advertisementMediasItem1.setMediaType(1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);

        CreateVehicleAdvertisementForSaleRequest request = new CreateVehicleAdvertisementForSaleRequest();
        request.setAddressId(15694);
        request.setAdvertisementMedias(advertisementMediasItems);
        request.setCategoryId(1);
        request.setCityId(16);
        request.setDescription("Mühendislik öğrencisinden tertemiz.");
        request.setExpertReportFile(expertReportFileItems);
        request.setFixedPhoneNumber("5350830145");
        request.setSendMessage(true);
        request.setShowAddress(true);
        request.setShowPhoneNumber(true);
        request.setJatoVehicleId(814742520220126L);
        request.setMobilePhoneNumber("5350830145");
        request.setNeighboorhoodId(18464);
        request.setPrice(5000000);
        request.setProperties(propertiesItems);
        request.setSalesType(1);
        request.setSellerUserId(360);
        request.setStoreId("572");
        request.setTitle("Öğrenciden");
        request.setTownId(212);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.CREATE_VEHICLE_ADVERTISEMENT, RequestOptions.create().setData(request)).text();
        CreateVehicleAdvertisementResponse response = new Gson().fromJson(requestResponse, CreateVehicleAdvertisementResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Create Vehicle Advertisement For Rent")
    public void createVehicleAdvertisementForRent() throws IOException {
        apiRequestContext = getApiRequestContext();

        ArrayList<org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.PropertiesItem> propertiesItems = Util.createPropertiesItemForRent();

        ArrayList<org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.AdvertisementMediasItem> advertisementMediasItems = new ArrayList<>();
        org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.AdvertisementMediasItem advertisementMediasItem1 = new org.sensat.test.advertisement.payload.createVehicleAdvertisementForRent.AdvertisementMediasItem();

        byte[] fileContentMedia1 = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/data/image/sample_egea_1.jpg"));
        String encodedStringMedia1 = Base64.getEncoder().encodeToString(fileContentMedia1);

        advertisementMediasItem1.setMediaBase64("data:image/png;base64," + encodedStringMedia1);
        advertisementMediasItem1.setMediaType(1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);

        CreateVehicleAdvertisementForRentRequest request = new CreateVehicleAdvertisementForRentRequest();
        request.setTitle("Temiz Kiralık");
        request.setDescription("İş İnsanından tertemiz.");
        request.setSellerUserId(360);
        request.setStoreId("572");
        request.setAddressId(15694);
        request.setCategoryId(1);
        request.setSalesType(2);
        request.setPrice(0);
        request.setSendMessage(true);
        request.setShowAddress(true);
        request.setShowPhoneNumber(true);
        request.setCityId(16);
        request.setTownId(197);
        request.setNeighboorhoodId(1);
        request.setMobilePhoneNumber("5350830145");
        request.setFixedPhoneNumber("5350830145");
        request.setExpertReportFile(Collections.emptyList());
        request.setAdvertisementMedias(advertisementMediasItems);
        request.setJatoVehicleId(814742520220126L);
        request.setProperties(propertiesItems);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.CREATE_VEHICLE_ADVERTISEMENT, RequestOptions.create().setData(request)).text();
        CreateVehicleAdvertisementResponse response = new Gson().fromJson(requestResponse, CreateVehicleAdvertisementResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advertisement By Id")
    public void getAdvertisementVehicleDetailsById() {
        apiRequestContext = getApiRequestContext();

        GetAdvertisementVehicleDetailsByIdRequest request = new GetAdvertisementVehicleDetailsByIdRequest();
        request.setAdvertNo("2023011NE6UTF26");

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertisementVehicleDetailsByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementVehicleDetailsByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Favorite Advertisements")
    public void getFavoriteAdvertisements() {
        apiRequestContext = getApiRequestContext();

        GetFavoriteAdvertisementsRequest request = new GetFavoriteAdvertisementsRequest();
        request.setPagination(new org.sensat.test.advertisement.payload.getFavoriteAdvertisements.Pagination());
        request.getPagination().setCurrentPage(0);
        request.getPagination().setTake(10);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_FAVORITE_ADVERTISEMENTS, RequestOptions.create().setData(request)).text();

        GetFavoriteAdvertisementsResponse response = new Gson().fromJson(requestResponse, GetFavoriteAdvertisementsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Remove Advertisement From Favorite")
    public void removeAdvertisementFromFavorite() {
        apiRequestContext = getApiRequestContext();

        RemoveAdvertisementFromFavoriteRequest request = new RemoveAdvertisementFromFavoriteRequest();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("2023011NE6UTF26");
        request.setAdvertNos(arrayList);

        /*GetAdvertisementVehicleDetailsByIdRequest request2 = new GetAdvertisementVehicleDetailsByIdRequest();
        request2.setAdvertNo("2023586AP0PEAUW");*/

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.REMOVE_ADVERTISEMENT_FROM_FAVORITE, RequestOptions.create().setData(request)).text();
        //String requestResponse2 = apiRequestContext.post(AdvertisementServiceParameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID, RequestOptions.create().setData(request2)).text();

        RemoveAdvertisementFromFavoriteResponse response = new Gson().fromJson(requestResponse, RemoveAdvertisementFromFavoriteResponse.class);
        //GetAdvertisementVehicleDetailsByIdResponse response2 = new Gson().fromJson(requestResponse2, GetAdvertisementVehicleDetailsByIdResponse.class);

        //assertTrue(response.isSuccess() && !response2.getData().getAdvertisementSummary().isFavorited());
        assertTrue(response.isSuccess());
    }

    @Test(priority = 1, description = "Add Advertisement To Favorite")
    public void addAdvertisementToFavorite() {
        apiRequestContext = getApiRequestContext();

        AddAdvertisementToFavoriteRequest request = new AddAdvertisementToFavoriteRequest();
        request.setAdvertNo("2023011NE6UTF26");

        /*GetAdvertisementVehicleDetailsByIdRequest request2 = new GetAdvertisementVehicleDetailsByIdRequest();
        request2.setAdvertNo("2023586AP0PEAUW");*/

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.ADD_ADVERTISEMENT_TO_FAVORITE, RequestOptions.create().setData(request)).text();
        // String requestResponse2 = apiRequestContext.post(AdvertisementServiceParameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID, RequestOptions.create().setData(request2)).text();

        AddAdvertisementToFavoriteResponse response = new Gson().fromJson(requestResponse, AddAdvertisementToFavoriteResponse.class);
        // GetAdvertisementVehicleDetailsByIdResponse response2 = new Gson().fromJson(requestResponse2, GetAdvertisementVehicleDetailsByIdResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Categories")
    public void getVehicleCategories() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(AdvertisementServiceParameters.GET_VEHICLE_CATEGORIES).text();

        GetVehicleCategoriesResponse response = new Gson().fromJson(requestResponse, GetVehicleCategoriesResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Compare")
    public void getVehicleCompare() {
        apiRequestContext = getApiRequestContext();

        GetVehicleCompareRequest request = new GetVehicleCompareRequest();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("2023586AP0PEAUW");
        arrayList.add("20233493IA2MN0S");
        request.setAdvertNo(arrayList);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_VEHICLE_COMPARE, RequestOptions.create().setData(request)).text();

        GetVehicleCompareResponse response = new Gson().fromJson(requestResponse, GetVehicleCompareResponse.class);
        System.out.println(response);
        assertTrue(response.isSuccess());
    }

    /*@Test(description = "Update Advertisement Optional Status Set False")
    public void updateAdvertisementOptionalStatusSetFalse() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementOptionalStatusRequest request = new UpdateAdvertisementOptionalStatusRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1045);
        request.setAdvertisementId(arrayList);
        request.setOptional(false);

        GetAdvertisementVehicleDetailsByIdRequest request2 = new GetAdvertisementVehicleDetailsByIdRequest();
        request2.setAdvertNo("202316GGN5XSWK7");

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.UPDATE_ADVERTISEMENT_OPTIONAL_STATUS, RequestOptions.create().setData(request)).text();
        String requestResponse2 = apiRequestContext.post(AdvertisementServiceParameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID, RequestOptions.create().setData(request2)).text();

        UpdateAdvertisementOptionalStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementOptionalStatusResponse.class);
        GetAdvertisementVehicleDetailsByIdResponse response2 = new Gson().fromJson(requestResponse2, GetAdvertisementVehicleDetailsByIdResponse.class);

        assertTrue(response.isSuccess() && !response2.getData().getAdvertisementSummary().isOptional());
    }*/

    @Test(description = "Get Diary Details By User")
    public void getDiaryDetailsByUser() {
        apiRequestContext = getApiRequestContext();

        GetDiaryDetailsByUserRequest request = new GetDiaryDetailsByUserRequest();

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_DIARY_DETAILS_BY_USERS, RequestOptions.create().setData(request)).text();

        GetDiaryDetailsByUserResponse response = new Gson().fromJson(requestResponse, GetDiaryDetailsByUserResponse.class);

        assertTrue(response.isSuccess());
    }

//    @Test(description = "Get Advertisement By Id")
//    public void getAdvertisementById() {
//        apiRequestContext = getApiRequestContext();
//
//        GetAdvertisementByIdRequest request = new GetAdvertisementByIdRequest();
//        request.setAdvertisementId(1045);
//
//        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_ADVERTISEMENT_BY_ID, RequestOptions.create().setData(request)).text();
//
//        GetAdvertisementByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementByIdResponse.class);
//
//        assertTrue(response.isSuccess());
//    }

    @Test(description = "Get Is Vehicle Advertisement By Id")
    public void getIsVehicleAdvertisementById() {
        apiRequestContext = getApiRequestContext();

        GetIsVehicleAdvertisementByIdRequest request = new GetIsVehicleAdvertisementByIdRequest();
        request.setAdvertNo("2023589NFNFL2HM");

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_IS_VEHICLE_ADVERTISEMENT_BY_ID, RequestOptions.create().setData(request)).text();

        GetIsVehicleAdvertisementByIdResponse response = new Gson().fromJson(requestResponse, GetIsVehicleAdvertisementByIdResponse.class);

        assertTrue(response.isSuccess());
        System.out.println(response);
    }

    @Test(description = "Get Advert Vehicle Choice Model For Edit By Id")
    public void getAdvertVehicleChoiceModelForEditById() {
        apiRequestContext = getApiRequestContext();

        GetAdvertVehicleChoiceModelForEditByIdRequest request = new GetAdvertVehicleChoiceModelForEditByIdRequest();
        request.setAdvertNo("2023586AP0PEAUW");

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_ADVERT_VEHICLE_CHOICE_MODEL_FOR_EDIT_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertVehicleChoiceModelForEditByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertVehicleChoiceModelForEditByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advert Vehicle Properties Model For Edit By Id")
    public void getAdvertVehiclePropertiesModelForEditById() {
        apiRequestContext = getApiRequestContext();

        GetAdvertVehiclepPropertiesModelForEditByIdRequest request = new GetAdvertVehiclepPropertiesModelForEditByIdRequest();
        request.setAdvertNo("2023586AP0PEAUW");

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_ADVERT_VEHICLE_PROPERTIES_MODEL_FOR_EDIT_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertVehiclePropertiesModelForEditByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertVehiclePropertiesModelForEditByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advert Detail Model For Edit By Id")
    public void getAdvertDetailModelForEditById() {
        apiRequestContext = getApiRequestContext();

        GetAdvertDetailModelForEditByIdRequest request = new GetAdvertDetailModelForEditByIdRequest();
        request.setAdvertNo("2023586AP0PEAUW");
        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_ADVERT_DETAIL_MODEL_FOR_EDIT_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertDetailModelForEditByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertDetailModelForEditByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Contact Information Model For Edit By Id")
    public void getContactInformationModelForEditById() {
        apiRequestContext = getApiRequestContext();

        GetContactInformationModelForEditByIdRequest request = new GetContactInformationModelForEditByIdRequest();
        request.setAdvertNo("2023586AP0PEAUW");

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_CONTACT_INFORMATION_MODEL_FOR_EDIT_BY_ID, RequestOptions.create().setData(request)).text();

        GetContactInformationModelForEditByIdResponse response = new Gson().fromJson(requestResponse, GetContactInformationModelForEditByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Update Advertisement Status: Published")
    public void updateAdvertisementStatus4() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementStatusRequest request = new UpdateAdvertisementStatusRequest();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("202316I6BA1CP85");
        request.setAdvertNo(arrayList);
        request.setStatusId(4);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.UPDATE_ADVERTISEMENT_STATUS, RequestOptions.create().setData(request)).text();

        UpdateAdvertisementStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementStatusResponse.class);
        System.out.println(response);
        assertTrue(response.isSuccess());
    }

    @Test(priority = 1, description = "Update Advertisement Status: Waiting For Approval")
    public void updateAdvertisementStatus0() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementStatusRequest request = new UpdateAdvertisementStatusRequest();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("202316I6BA1CP85");
        request.setAdvertNo(arrayList);
        request.setStatusId(0);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.UPDATE_ADVERTISEMENT_STATUS, RequestOptions.create().setData(request)).text();

        UpdateAdvertisementStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 2, description = "Update Advertisement Status: Approved")
    public void updateAdvertisementStatus1() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementStatusRequest request = new UpdateAdvertisementStatusRequest();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("202316I6BA1CP85");
        request.setAdvertNo(arrayList);
        request.setStatusId(1);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.UPDATE_ADVERTISEMENT_STATUS, RequestOptions.create().setData(request)).text();

        UpdateAdvertisementStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 3, description = "Update Advertisement Status: Reject")
    public void updateAdvertisementStatus2() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementStatusRequest request = new UpdateAdvertisementStatusRequest();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("202316I6BA1CP85");
        request.setAdvertNo(arrayList);
        request.setStatusId(2);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.UPDATE_ADVERTISEMENT_STATUS, RequestOptions.create().setData(request)).text();

        UpdateAdvertisementStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 4, description = "Update Advertisement Status: Cancel")
    public void updateAdvertisementStatus3() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementStatusRequest request = new UpdateAdvertisementStatusRequest();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("202316I6BA1CP85");
        request.setAdvertNo(arrayList);
        request.setStatusId(3);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.UPDATE_ADVERTISEMENT_STATUS, RequestOptions.create().setData(request)).text();

        UpdateAdvertisementStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementStatusResponse.class);

        assertTrue(response.isSuccess());
    }

//    @Test(description = "Get Advertisement Image By Id")
//    public void getAdvertisementImageById() {
//        apiRequestContext = getApiRequestContext();
//
//        GetAdvertisementImageByIdRequest request = new GetAdvertisementImageByIdRequest();
//        request.setAdvertisementId(1045);
//
//        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_ADVERTISEMENT_IMAGE_BY_ID, RequestOptions.create().setData(request)).text();
//
//        GetAdvertisementImageByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementImageByIdResponse.class);
//
//        assertTrue(response.isSuccess());
//    }

    @Test(description = "Get User Published Advertisements By User Id")
    public void getUserPublishedAdvertisementsByUserId() {
        apiRequestContext = getApiRequestContext();

        GetUserPublishedAdvertisementsByUserIdRequest request = new GetUserPublishedAdvertisementsByUserIdRequest();
        Pagination pagination = new Pagination();
        pagination.setCurrentPage(0);
        pagination.setTake(10);
        request.setPagination(pagination);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_USER_PUBLISHED_ADVERTISEMENTS_BY_USER_ID, RequestOptions.create().setData(request)).text();

        GetUserPublishedAdvertisementsByUserIdResponse response = new Gson().fromJson(requestResponse, GetUserPublishedAdvertisementsByUserIdResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get User Unpublished Advertisements By User Id")
    public void getUserUnpublishedAdvertisementsByUserId() {
        apiRequestContext = getApiRequestContext();

        GetUserUnpublishedAdvertisementsByUserIdRequest request = new GetUserUnpublishedAdvertisementsByUserIdRequest();
        org.sensat.test.advertisement.payload.getUserUnpublishedAdvertisementsByUserId.Pagination pagination = new org.sensat.test.advertisement.payload.getUserUnpublishedAdvertisementsByUserId.Pagination();
        pagination.setCurrentPage(0);
        pagination.setTake(10);
        request.setPagination(pagination);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_USER_UNPUBLISHED_ADVERTISEMENTS_BY_USER_ID, RequestOptions.create().setData(request)).text();

        GetUserUnpublishedAdvertisementsByUserIdResponse response = new Gson().fromJson(requestResponse, GetUserUnpublishedAdvertisementsByUserIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get User Pending Advertisements By User Id")
    public void getUserPendingAdvertisementsByUserId() {
        apiRequestContext = getApiRequestContext();

        GetUserPendingAdvertisementsByUserIdRequest request = new GetUserPendingAdvertisementsByUserIdRequest();
        org.sensat.test.advertisement.payload.getUserPendingAdvertisementsByUserId.Pagination pagination = new org.sensat.test.advertisement.payload.getUserPendingAdvertisementsByUserId.Pagination();
        pagination.setCurrentPage(1);
        pagination.setTake(5);
        request.setPagination(pagination);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_USER_PENDING_ADVERTISEMENTS_BY_USER_ID, RequestOptions.create().setData(request)).text();

        GetUserPendingAdvertisementsByUserIdResponse response = new Gson().fromJson(requestResponse, GetUserPendingAdvertisementsByUserIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get User Advertisements By User Id")
    public void getUserAdvertisementsByUserId() {
        apiRequestContext = getApiRequestContext();

        GetUserAdvertisementsByUserIdRequest request = new GetUserAdvertisementsByUserIdRequest();
        org.sensat.test.advertisement.payload.getUserAdvertisementsByUserId.Pagination pagination = new org.sensat.test.advertisement.payload.getUserAdvertisementsByUserId.Pagination();
        pagination.setCurrentPage(1);
        pagination.setTake(5);
        request.setPagination(pagination);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GET_USER_ADVERTISEMENTS_BY_USER_ID, RequestOptions.create().setData(request)).text();

        GetUserAdvertisementsByUserIdResponse response = new Gson().fromJson(requestResponse, GetUserAdvertisementsByUserIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advert Vehicle Choice Model For Edit By Id")
    public void CheckDuplicatePlate() {
        apiRequestContext = getApiRequestContext();

        CheckDuplicatePlateRequest request = new CheckDuplicatePlateRequest();
        request.setAdvertNo("202357D28B0YAN3");
        request.setUpdate(true);
        request.setPlate("57ABE734");
        request.setSalesType(1);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.CheckDuplicatePlate, RequestOptions.create().setData(request)).text();

        CheckDuplicatePlateResponse response = new Gson().fromJson(requestResponse, CheckDuplicatePlateResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advert Vehicle Choice Model For Edit By Id")
    public void storeSummaryReport() {
        apiRequestContext = getApiRequestContext();
        storeSummaryReportRequest request = new storeSummaryReportRequest();
        request.setStoreNo("2023161XDIF7EXO");

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.StoreSummaryReport, RequestOptions.create().setData(request)).text();

        StoreSummaryReportResponses response = new Gson().fromJson(requestResponse, StoreSummaryReportResponses.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advert Vehicle Choice Model For Edit By Id")
    public void getStoreFavoriteAdvertisementGraph() {
        apiRequestContext = getApiRequestContext();
        getStoreFavoriteAdvertisementGraphRequest request = new getStoreFavoriteAdvertisementGraphRequest();
        request.setStoreNo("2023161XDIF7EXO");
        request.setIntervalTime(1);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GetStoreFavoriteAdvertisementGraph, RequestOptions.create().setData(request)).text();

        GetStoreFavoriteAdvertisementGraphResponse response = new Gson().fromJson(requestResponse, GetStoreFavoriteAdvertisementGraphResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advert Vehicle Choice Model For Edit By Id")
    public void getStoreVisitGraph() {
        apiRequestContext = getApiRequestContext();

        getStoreFavoriteAdvertisementGraphRequest request = new getStoreFavoriteAdvertisementGraphRequest();
        request.setStoreNo("2023161XDIF7EXO");
        request.setIntervalTime(1);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GetStoreVisitGraph, RequestOptions.create().setData(request)).text();

        GetStoreFavoriteAdvertisementGraphResponse response = new Gson().fromJson(requestResponse, GetStoreFavoriteAdvertisementGraphResponse.class);
        assertTrue(response.isSuccess());
        System.out.println(response);
    }

    @Test(description = "Get Advert Vehicle Choice Model For Edit By Id")
    public void getStoreAdvertisementViewGraph() {
        apiRequestContext = getApiRequestContext();

        getStoreFavoriteAdvertisementGraphRequest request = new getStoreFavoriteAdvertisementGraphRequest();
        request.setStoreNo("2023161XDIF7EXO");
        request.setIntervalTime(1);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GetStoreAdvertisementViewGraph, RequestOptions.create().setData(request)).text();

        GetStoreFavoriteAdvertisementGraphResponse response = new Gson().fromJson(requestResponse, GetStoreFavoriteAdvertisementGraphResponse.class);
        assertTrue(response.isSuccess());
        System.out.println(response);
    }

    @Test(description = "Get Advert Vehicle Choice Model For Edit By Id")
    public void getStoreAdvertisementMessageGraph() {
        apiRequestContext = getApiRequestContext();

        getStoreFavoriteAdvertisementGraphRequest request = new getStoreFavoriteAdvertisementGraphRequest();
        request.setStoreNo("2023161XDIF7EXO");
        request.setIntervalTime(1);

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GetStoreAdvertisementMessageGraph, RequestOptions.create().setData(request)).text();

        GetStoreFavoriteAdvertisementGraphResponse response = new Gson().fromJson(requestResponse, GetStoreFavoriteAdvertisementGraphResponse.class);
        assertTrue(response.isSuccess());
        System.out.println(response);
    }

    @Test(description = "Get Advert Vehicle Choice Model For Edit By Id")
    public void checkAdvertisementOwnerById() {
        apiRequestContext = getApiRequestContext();

        CheckAdvertisementOwnerByIdRequest request = new CheckAdvertisementOwnerByIdRequest();
        request.setAdvertNo("2023589NFNFL2HM");

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.CheckAdvertisementOwnerById, RequestOptions.create().setData(request)).text();

        CheckAdvertisementOwnerByIdResponse response = new Gson().fromJson(requestResponse, CheckAdvertisementOwnerByIdResponse.class);
        System.out.println(response);
        assertFalse(response.isSuccess());
    }

    @Test(description = "Get Advert Vehicle Choice Model For Edit By Id")
    public void getAllAdvertisementFiles() {
        apiRequestContext = getApiRequestContext();

        GetAllAdvertisementFilesRequest request = new GetAllAdvertisementFilesRequest();
        request.setAdvertNo("2023589NFNFL2HM");

        String requestResponse = apiRequestContext.post(AdvertisementServiceParameters.GetAllAdvertisementFiles, RequestOptions.create().setData(request)).text();

        GetAllAdvertisementFilesResponse response = new Gson().fromJson(requestResponse, GetAllAdvertisementFilesResponse.class);
        assertTrue(response.isSuccess());
    }

}
