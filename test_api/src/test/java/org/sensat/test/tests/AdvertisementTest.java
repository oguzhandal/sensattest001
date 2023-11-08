package org.sensat.test.tests;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.apache.commons.io.FileUtils;
import org.sensat.base.BaseTest;
import org.sensat.constant.Parameters;

import org.sensat.test.request.advertisement.*;
import org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.CreateVehicleAdvertisementForRentRequest;
import org.sensat.test.request.advertisement.createVehicleAdvertisementForSale.AdvertisementMediasItem;
import org.sensat.test.request.advertisement.createVehicleAdvertisementForSale.CreateVehicleAdvertisementForSaleRequest;
import org.sensat.test.request.advertisement.createVehicleAdvertisementForSale.PropertiesItem;
import org.sensat.test.request.advertisement.getFavoriteAdvertisements.GetFavoriteAdvertisementsRequest;
import org.sensat.test.request.advertisement.getUserAdvertisementsByUserId.GetUserAdvertisementsByUserIdRequest;
import org.sensat.test.request.advertisement.getUserPendingAdvertisementsByUserId.GetUserPendingAdvertisementsByUserIdRequest;
import org.sensat.test.request.advertisement.getUserPublishedAdvertisementsByUserId.GetUserPublishedAdvertisementsByUserIdRequest;
import org.sensat.test.request.advertisement.getUserPublishedAdvertisementsByUserId.Pagination;
import org.sensat.test.request.advertisement.getUserUnpublishedAdvertisementsByUserId.GetUserUnpublishedAdvertisementsByUserIdRequest;
import org.sensat.test.response.advertisement.*;
import org.sensat.test.response.advertisement.createVehicleAdvertisement.CreateVehicleAdvertisementResponse;
import org.sensat.test.response.advertisement.getAdvertDetailModelForEditById.GetAdvertDetailModelForEditByIdResponse;
import org.sensat.test.response.advertisement.getAdvertVehicleChoiceModelForEditById.GetAdvertVehicleChoiceModelForEditByIdResponse;
import org.sensat.test.response.advertisement.getAdvertVehiclePropertiesModelForEditById.GetAdvertVehiclePropertiesModelForEditByIdResponse;
import org.sensat.test.response.advertisement.getAdvertisementById.GetAdvertisementByIdResponse;
import org.sensat.test.response.advertisement.getAdvertisementDetailsForCreateAdvertisementByCategoryId.GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse;
import org.sensat.test.response.advertisement.getAdvertisementImageById.GetAdvertisementImageByIdResponse;
import org.sensat.test.response.advertisement.getAdvertisementVehicleDetailsById.GetAdvertisementVehicleDetailsByIdResponse;
import org.sensat.test.response.advertisement.getAllProperties.GetAllPropertiesResponse;
import org.sensat.test.response.advertisement.getContactInformationModelForEditById.GetContactInformationModelForEditByIdResponse;
import org.sensat.test.response.advertisement.getDiaryDetailsByUser.GetDiaryDetailsByUserResponse;
import org.sensat.test.response.advertisement.getFavoriteAdvertisements.GetFavoriteAdvertisementsResponse;
import org.sensat.test.response.advertisement.getIsVehicleAdvertisementById.GetIsVehicleAdvertisementByIdResponse;
import org.sensat.test.response.advertisement.getJatoVehiclePropsByJatoVehicleId.GetJatoVehiclePropsByJatoVehicleIdResponse;
import org.sensat.test.response.advertisement.getSearchAdvertisementFromWho.GetSearchAdvertisementFromWhoResponse;
import org.sensat.test.response.advertisement.getSearchAdvertisementPropertiesByCategoryId.GetSearchAdvertisementPropertiesByCategoryIdResponse;
import org.sensat.test.response.advertisement.getUserAdvertisementsByUserId.GetUserAdvertisementsByUserIdResponse;
import org.sensat.test.response.advertisement.getUserPendingAdvertisementsByUserId.GetUserPendingAdvertisementsByUserIdResponse;
import org.sensat.test.response.advertisement.getUserPublishedAdvertisementsByUserId.GetUserPublishedAdvertisementsByUserIdResponse;
import org.sensat.test.response.advertisement.getUserUnpublishedAdvertisementsByUserId.GetUserUnpublishedAdvertisementsByUserIdResponse;
import org.sensat.test.response.advertisement.getVehicleBodyTypes.GetVehicleBodyTypesResponse;
import org.sensat.test.response.advertisement.getVehicleBrands.GetVehicleBrandsResponse;
import org.sensat.test.response.advertisement.getVehicleCategories.GetVehicleCategoriesResponse;
import org.sensat.test.response.advertisement.getVehicleCompare.GetVehicleCompareResponse;
import org.sensat.test.response.advertisement.getVehicleDetailsPropertiesForCreateAdvertisementQuery.GetVehicleDetailPropertiesForCreateAdvertisementQueryResponse;
import org.sensat.test.response.advertisement.GetVehicleJatoIdResponse;
import org.sensat.test.response.advertisement.getVehicleFuelTypes.GetVehicleFuelTypesResponse;
import org.sensat.test.response.advertisement.getVehicleGearTypes.GetVehicleBodyGearTypesResponse;
import org.sensat.test.response.advertisement.getVehicleModelTypes.GetVehicleModelTypesResponse;
import org.sensat.test.response.advertisement.getVehicleModels.GetVehicleModelsResponse;
import org.sensat.test.response.advertisement.getVehicleYears.GetVehicleYearsResponse;
import org.sensat.test.util.Util;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AdvertisementTest extends BaseTest {

    private APIRequestContext getApiRequestContext() {
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.ADVERTISEMENT_TEST_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = "Get Search Advertisement From Who")
    public void getSearchAdvertisementFromWho() {
        apiRequestContext = getApiRequestContext();

        GetSearchAdvertisementFromWhoRequest request = new GetSearchAdvertisementFromWhoRequest();
        request.setFrom("sellers");

        String requestResponse = apiRequestContext.post(Parameters.GET_SEARCH_ADVERTISEMENT_FROM_WHO, RequestOptions.create().setData(request)).text();

        GetSearchAdvertisementFromWhoResponse response = new Gson().fromJson(requestResponse, GetSearchAdvertisementFromWhoResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Search Advertisement Properties By Category Id:1")
    public void getSearchAdvertisementPropertiesByCategoryId1() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(Parameters.GET_SEARCH_ADVERTISEMENT_PROPERTIES_BY_CATEGORY_ID,
                RequestOptions.create().setQueryParam("categoryId", "1")).text();

        GetSearchAdvertisementPropertiesByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetSearchAdvertisementPropertiesByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Search Advertisement Properties By Category Id:2")
    public void getSearchAdvertisementPropertiesByCategoryId2() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(Parameters.GET_SEARCH_ADVERTISEMENT_PROPERTIES_BY_CATEGORY_ID,
                RequestOptions.create().setQueryParam("categoryId", "2")).text();

        GetSearchAdvertisementPropertiesByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetSearchAdvertisementPropertiesByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Search Advertisement Properties By Category Id:1")
    public void getSearchAdvertisementPropertiesByCategoryId3() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(Parameters.GET_SEARCH_ADVERTISEMENT_PROPERTIES_BY_CATEGORY_ID,
                RequestOptions.create().setQueryParam("categoryId", "3")).text();

        GetSearchAdvertisementPropertiesByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetSearchAdvertisementPropertiesByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Years Category Id: 1")
    public void getVehicleYearsCategoryId1() {
        apiRequestContext = getApiRequestContext();

        GetVehicleYearsRequest request = new GetVehicleYearsRequest();
        request.setCategoryId(1);

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_YEARS, RequestOptions.create().setData(request)).text();

        GetVehicleYearsResponse response = new Gson().fromJson(requestResponse, GetVehicleYearsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Years Category Id: 2")
    public void getVehicleYearsCategoryId2() {
        apiRequestContext = getApiRequestContext();

        GetVehicleYearsRequest request = new GetVehicleYearsRequest();
        request.setCategoryId(2);

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_YEARS, RequestOptions.create().setData(request)).text();

        GetVehicleYearsResponse response = new Gson().fromJson(requestResponse, GetVehicleYearsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Years Category Id: 3")
    public void getVehicleYearsCategoryId3() {
        apiRequestContext = getApiRequestContext();

        GetVehicleYearsRequest request = new GetVehicleYearsRequest();
        request.setCategoryId(3);

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_YEARS, RequestOptions.create().setData(request)).text();

        GetVehicleYearsResponse response = new Gson().fromJson(requestResponse, GetVehicleYearsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get All Properties")
    public void getAllProperties() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(Parameters.GET_ALL_PROPERTIES).text();

        GetAllPropertiesResponse response = new Gson().fromJson(requestResponse, GetAllPropertiesResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Brands")
    public void getVehicleBrands() {
        apiRequestContext = getApiRequestContext();

        GetVehicleBrandsRequest request = new GetVehicleBrandsRequest();
        request.setCategoryId(1);
        request.setYear(2022);

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_BRANDS, RequestOptions.create().setData(request)).text();

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

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_MODELS, RequestOptions.create().setData(request)).text();

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

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_BODY_TYPES, RequestOptions.create().setData(request)).text();

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

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_GEAR_TYPES, RequestOptions.create().setData(request)).text();

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

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_FUEL_TYPES, RequestOptions.create().setData(request)).text();

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

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_MODEL_TYPES, RequestOptions.create().setData(request)).text();

        GetVehicleModelTypesResponse response = new Gson().fromJson(requestResponse, GetVehicleModelTypesResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Jato Id")
    public void getVehicleJatoId() {
        apiRequestContext = getApiRequestContext();

        GetVehicleJatoIdRequest request = new GetVehicleJatoIdRequest();
        request.setModelTypeId(89414);

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_JATO_ID, RequestOptions.create().setData(request)).text();

        GetVehicleJatoIdResponse response = new Gson().fromJson(requestResponse, GetVehicleJatoIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Detail Properties For Create Advertisement Query")
    public void getVehicleDetailPropertiesForCreateAdvertisementQuery() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(Parameters.GET_VEHICLE_DETAIL_PROPERTIES_FOR_CREATE_ADVERTISEMENT_QUERY,
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

        String requestResponse = apiRequestContext.post(Parameters.GET_JATO_VEHICLE_PROPS_BY_JATO_VEHICLE_ID, RequestOptions.create().setData(request)).text();

        GetJatoVehiclePropsByJatoVehicleIdResponse response = new Gson().fromJson(requestResponse, GetJatoVehiclePropsByJatoVehicleIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advertisement Details For Create Advertisement By Category Id: 1")
    public void getAdvertisementDetailsForCreateAdvertisementByCategoryId1() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(Parameters.GET_ADVERTISEMENT_DETAILS_FOR_CREATE_ADVERTISEMENT_BY_CATEGORY_ID,
                RequestOptions.create().setQueryParam("categoryId", 1)).text();

        GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advertisement Details For Create Advertisement By Category Id: 2")
    public void getAdvertisementDetailsForCreateAdvertisementByCategoryId2() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(Parameters.GET_ADVERTISEMENT_DETAILS_FOR_CREATE_ADVERTISEMENT_BY_CATEGORY_ID,
                RequestOptions.create().setQueryParam("categoryId", 2)).text();

        GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advertisement Details For Create Advertisement By Category Id: 3")
    public void getAdvertisementDetailsForCreateAdvertisementByCategoryId3() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(Parameters.GET_ADVERTISEMENT_DETAILS_FOR_CREATE_ADVERTISEMENT_BY_CATEGORY_ID,
                RequestOptions.create().setQueryParam("categoryId", 3)).text();

        GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementDetailsForCreateAdvertisementByCategoryIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Create Vehicle Advertisement For Sale", invocationCount = 5)
    public void createVehicleAdvertisementForSale() throws IOException {
        apiRequestContext = getApiRequestContext();

        ArrayList<PropertiesItem> propertiesItems = Util.createPropertiesItemForSale();

        ArrayList<AdvertisementMediasItem> advertisementMediasItems = new ArrayList<>();
        AdvertisementMediasItem advertisementMediasItem1 = new AdvertisementMediasItem();

        byte[] fileContentMedia1 = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/test/image/vehicle_2.jpeg"));
        String encodedStringMedia1 = Base64.getEncoder().encodeToString(fileContentMedia1);

        advertisementMediasItem1.setMediaBase64("data:image/png;base64," + encodedStringMedia1);
        advertisementMediasItem1.setMediaType(1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItems.add(advertisementMediasItem1);

        CreateVehicleAdvertisementForSaleRequest request = new CreateVehicleAdvertisementForSaleRequest();
        request.setAddressId(1872);
        request.setAdvertisementMedias(advertisementMediasItems);
        request.setCategoryId(1);
        request.setCityId(16);
        request.setDescription("Mühendislik öğrencisinden tertemiz.");
        request.setFixedPhoneNumber("2242432240");
        request.setSendMessage(true);
        request.setShowAddress(true);
        request.setShowPhoneNumber(true);
        request.setJatoVehicleId(815523720220303L);
        request.setMobilePhoneNumber("5350830141");
        request.setNeighboorhoodId(1);
        request.setPrice(1000000);
        request.setProperties(propertiesItems);
        request.setSalesType(1);
        request.setSellerUserId(388);
        request.setStoreId("529");
        request.setTitle("");
        request.setTownId(197);
        request.setExpertReportFile(new ArrayList<>());

        String requestResponse = apiRequestContext.post(Parameters.CREATE_VEHICLE_ADVERTISEMENT, RequestOptions.create().setData(request)).text();
        //System.out.println(request);
        CreateVehicleAdvertisementResponse response = new Gson().fromJson(requestResponse, CreateVehicleAdvertisementResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Create Vehicle Advertisement For Rent")
    public void createVehicleAdvertisementForRent() throws IOException {
        apiRequestContext = getApiRequestContext();

        ArrayList<org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.PropertiesItem> propertiesItems = Util.createPropertiesItemForRent();

        ArrayList<org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.AdvertisementMediasItem> advertisementMediasItems = new ArrayList<>();
        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.AdvertisementMediasItem advertisementMediasItem1 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.AdvertisementMediasItem();
        org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.AdvertisementMediasItem advertisementMediasItem2 = new org.sensat.test.request.advertisement.createVehicleAdvertisementForRent.AdvertisementMediasItem();

        byte[] fileContentMedia1 = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/test/image/vehicle_1.jpeg"));
        String encodedStringMedia1 = Base64.getEncoder().encodeToString(fileContentMedia1);
        byte[] fileContentMedia2 = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/test/image/vehicle_2.jpeg"));
        String encodedStringMedia2 = Base64.getEncoder().encodeToString(fileContentMedia2);

        advertisementMediasItem1.setMediaBase64("data:image/png;base64," + encodedStringMedia1);
        advertisementMediasItem1.setMediaType(1);
        advertisementMediasItems.add(advertisementMediasItem1);
        advertisementMediasItem2.setMediaBase64("data:image/png;base64," + encodedStringMedia2);
        advertisementMediasItem2.setMediaType(1);
        advertisementMediasItems.add(advertisementMediasItem2);

        CreateVehicleAdvertisementForRentRequest request = new CreateVehicleAdvertisementForRentRequest();
        request.setTitle("Temiz Kiralık");
        request.setDescription("İş İnsanından tertemiz.");
        request.setSellerUserId(210);
        request.setStoreId("244");
        request.setAddressId(542);
        request.setCategoryId(1);
        request.setSalesType(2);
        request.setPrice(0);
        request.setSendMessage(true);
        request.setShowAddress(true);
        request.setShowPhoneNumber(true);
        request.setCityId(16);
        request.setTownId(212);
        request.setNeighboorhoodId(18464);
        request.setMobilePhoneNumber("5350830145");
        request.setFixedPhoneNumber("5350830145");
        request.setExpertReportFile(Collections.emptyList());
        request.setAdvertisementMedias(advertisementMediasItems);
        request.setJatoVehicleId(814742520220126L);
        request.setProperties(propertiesItems);

        String requestResponse = apiRequestContext.post(Parameters.CREATE_VEHICLE_ADVERTISEMENT, RequestOptions.create().setData(request)).text();
        CreateVehicleAdvertisementResponse response = new Gson().fromJson(requestResponse, CreateVehicleAdvertisementResponse.class);
        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advertisement By Id")
    public void getAdvertisementVehicleDetailsById() {
        apiRequestContext = getApiRequestContext();

        GetAdvertisementVehicleDetailsByIdRequest request = new GetAdvertisementVehicleDetailsByIdRequest();
        request.setAdvertisementId(2097);

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertisementVehicleDetailsByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementVehicleDetailsByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Favorite Advertisements")
    public void getFavoriteAdvertisements() {
        apiRequestContext = getApiRequestContext();

        GetFavoriteAdvertisementsRequest request = new GetFavoriteAdvertisementsRequest();
        request.setPagination(new org.sensat.test.request.advertisement.getFavoriteAdvertisements.Pagination());
        request.getPagination().setCurrentPage(0);
        request.getPagination().setTake(10);

        String requestResponse = apiRequestContext.post(Parameters.GET_FAVORITE_ADVERTISEMENTS, RequestOptions.create().setData(request)).text();

        GetFavoriteAdvertisementsResponse response = new Gson().fromJson(requestResponse, GetFavoriteAdvertisementsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Remove Advertisement From Favorite")
    public void removeAdvertisementFromFavorite() {
        apiRequestContext = getApiRequestContext();

        RemoveAdvertisementFromFavoriteRequest request = new RemoveAdvertisementFromFavoriteRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2200);
        request.setAdvertisementIds(arrayList);

        GetAdvertisementVehicleDetailsByIdRequest request2 = new GetAdvertisementVehicleDetailsByIdRequest();
        request2.setAdvertisementId(2200);

        String requestResponse = apiRequestContext.post(Parameters.REMOVE_ADVERTISEMENT_FROM_FAVORITE, RequestOptions.create().setData(request)).text();
        String requestResponse2 = apiRequestContext.post(Parameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID, RequestOptions.create().setData(request2)).text();

        RemoveAdvertisementFromFavoriteResponse response = new Gson().fromJson(requestResponse, RemoveAdvertisementFromFavoriteResponse.class);
        GetAdvertisementVehicleDetailsByIdResponse response2 = new Gson().fromJson(requestResponse2, GetAdvertisementVehicleDetailsByIdResponse.class);

        assertTrue(response.isSuccess() && !response2.getData().getAdvertisementSummary().isFavorited());
    }

    @Test(priority = 3, description = "Add Advertisement To Favorite")
    public void addAdvertisementToFavorite() {
        apiRequestContext = getApiRequestContext();

        AddAdvertisementToFavoriteRequest request = new AddAdvertisementToFavoriteRequest();
        request.setAdvertisementId(2200);

        GetAdvertisementVehicleDetailsByIdRequest request2 = new GetAdvertisementVehicleDetailsByIdRequest();
        request2.setAdvertisementId(2200);

        String requestResponse = apiRequestContext.post(Parameters.ADD_ADVERTISEMENT_TO_FAVORITE, RequestOptions.create().setData(request)).text();
        String requestResponse2 = apiRequestContext.post(Parameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID, RequestOptions.create().setData(request2)).text();

        AddAdvertisementToFavoriteResponse response = new Gson().fromJson(requestResponse, AddAdvertisementToFavoriteResponse.class);
        GetAdvertisementVehicleDetailsByIdResponse response2 = new Gson().fromJson(requestResponse2, GetAdvertisementVehicleDetailsByIdResponse.class);

        assertTrue(response.isSuccess() && response2.getData().getAdvertisementSummary().isFavorited());
    }

    @Test(description = "Get Vehicle Categories")
    public void getVehicleCategories() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(Parameters.GET_VEHICLE_CATEGORIES).text();

        GetVehicleCategoriesResponse response = new Gson().fromJson(requestResponse, GetVehicleCategoriesResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Vehicle Compare")
    public void getVehicleCompare() {
        apiRequestContext = getApiRequestContext();

        GetVehicleCompareRequest request = new GetVehicleCompareRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2097);
        arrayList.add(2099);
        request.setAdvertisementIds(arrayList);

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_COMPARE, RequestOptions.create().setData(request)).text();

        GetVehicleCompareResponse response = new Gson().fromJson(requestResponse, GetVehicleCompareResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Update Advertisement Optional Status Set False")
    public void updateAdvertisementOptionalStatusSetFalse() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementOptionalStatusRequest request = new UpdateAdvertisementOptionalStatusRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2230);
        request.setAdvertisementId(arrayList);
        request.setOptional(false);

        GetAdvertisementVehicleDetailsByIdRequest request2 = new GetAdvertisementVehicleDetailsByIdRequest();
        request2.setAdvertisementId(2230);

        String requestResponse = apiRequestContext.post(Parameters.UPDATE_ADVERTISEMENT_OPTIONAL_STATUS, RequestOptions.create().setData(request)).text();
        String requestResponse2 = apiRequestContext.post(Parameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID, RequestOptions.create().setData(request2)).text();

        UpdateAdvertisementOptionalStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementOptionalStatusResponse.class);
        GetAdvertisementVehicleDetailsByIdResponse response2 = new Gson().fromJson(requestResponse2, GetAdvertisementVehicleDetailsByIdResponse.class);

        assertTrue(response.isSuccess() && !response2.getData().getAdvertisementSummary().isOptional());
    }

    @Test(priority = 1, description = "Update Advertisement Optional Status Set True")
    public void updateAdvertisementOptionalStatusSetTrue() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementOptionalStatusRequest request = new UpdateAdvertisementOptionalStatusRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2230);
        request.setAdvertisementId(arrayList);
        request.setOptional(true);

        GetAdvertisementVehicleDetailsByIdRequest request2 = new GetAdvertisementVehicleDetailsByIdRequest();
        request2.setAdvertisementId(2230);

        String requestResponse = apiRequestContext.post(Parameters.UPDATE_ADVERTISEMENT_OPTIONAL_STATUS, RequestOptions.create().setData(request)).text();
        String requestResponse2 = apiRequestContext.post(Parameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID, RequestOptions.create().setData(request2)).text();

        UpdateAdvertisementOptionalStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementOptionalStatusResponse.class);
        GetAdvertisementVehicleDetailsByIdResponse response2 = new Gson().fromJson(requestResponse2, GetAdvertisementVehicleDetailsByIdResponse.class);

        assertTrue(response.isSuccess() && response2.getData().getAdvertisementSummary().isOptional());
    }

    @Test(description = "Get Diary Details By User")
    public void getDiaryDetailsByUser() {
        apiRequestContext = getApiRequestContext();

        GetDiaryDetailsByUserRequest request = new GetDiaryDetailsByUserRequest();

        String requestResponse = apiRequestContext.post(Parameters.GET_DIARY_DETAILS_BY_USERS, RequestOptions.create().setData(request)).text();

        GetDiaryDetailsByUserResponse response = new Gson().fromJson(requestResponse, GetDiaryDetailsByUserResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advertisement By Id")
    public void getAdvertisementById() {
        apiRequestContext = getApiRequestContext();

        GetAdvertisementByIdRequest request = new GetAdvertisementByIdRequest();
        request.setAdvertisementId(2097);

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERTISEMENT_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertisementByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Is Vehicle Advertisement By Id")
    public void getIsVehicleAdvertisementById() {
        apiRequestContext = getApiRequestContext();

        GetIsVehicleAdvertisementByIdRequest request = new GetIsVehicleAdvertisementByIdRequest();
        request.setAdvertisementId(2097);

        String requestResponse = apiRequestContext.post(Parameters.GET_IS_VEHICLE_ADVERTISEMENT_BY_ID, RequestOptions.create().setData(request)).text();

        GetIsVehicleAdvertisementByIdResponse response = new Gson().fromJson(requestResponse, GetIsVehicleAdvertisementByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advert Vehicle Choice Model For Edit By Id")
    public void getAdvertVehicleChoiceModelForEditById() {
        apiRequestContext = getApiRequestContext();

        GetAdvertVehicleChoiceModelForEditByIdRequest request = new GetAdvertVehicleChoiceModelForEditByIdRequest();
        request.setAdvertisementId(2097);

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERT_VEHICLE_CHOICE_MODEL_FOR_EDIT_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertVehicleChoiceModelForEditByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertVehicleChoiceModelForEditByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advert Vehicle Properties Model For Edit By Id")
    public void getAdvertVehiclePropertiesModelForEditById() {
        apiRequestContext = getApiRequestContext();

        GetAdvertVehiclepPropertiesModelForEditByIdRequest request = new GetAdvertVehiclepPropertiesModelForEditByIdRequest();
        request.setAdvertisementId(2097);

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERT_VEHICLE_PROPERTIES_MODEL_FOR_EDIT_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertVehiclePropertiesModelForEditByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertVehiclePropertiesModelForEditByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advert Detail Model For Edit By Id")
    public void getAdvertDetailModelForEditById() {
        apiRequestContext = getApiRequestContext();

        GetAdvertDetailModelForEditByIdRequest request = new GetAdvertDetailModelForEditByIdRequest();
        request.setAdvertisementId(2097);

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERT_DETAIL_MODEL_FOR_EDIT_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertDetailModelForEditByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertDetailModelForEditByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Contact Information Model For Edit By Id")
    public void getContactInformationModelForEditById() {
        apiRequestContext = getApiRequestContext();

        GetContactInformationModelForEditByIdRequest request = new GetContactInformationModelForEditByIdRequest();
        request.setAdvertisementId(2097);

        String requestResponse = apiRequestContext.post(Parameters.GET_CONTACT_INFORMATION_MODEL_FOR_EDIT_BY_ID, RequestOptions.create().setData(request)).text();

        GetContactInformationModelForEditByIdResponse response = new Gson().fromJson(requestResponse, GetContactInformationModelForEditByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Update Advertisement Status: Published")
    public void updateAdvertisementStatus4() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementStatusRequest request = new UpdateAdvertisementStatusRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2132);
        request.setAdvertisementId(arrayList);
        request.setStatusId(4);

        String requestResponse = apiRequestContext.post(Parameters.UPDATE_ADVERTISEMENT_STATUS, RequestOptions.create().setData(request)).text();

        UpdateAdvertisementStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 1, description = "Update Advertisement Status: Waiting For Approval")
    public void updateAdvertisementStatus0() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementStatusRequest request = new UpdateAdvertisementStatusRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2132);
        request.setAdvertisementId(arrayList);
        request.setStatusId(0);

        String requestResponse = apiRequestContext.post(Parameters.UPDATE_ADVERTISEMENT_STATUS, RequestOptions.create().setData(request)).text();

        UpdateAdvertisementStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 2, description = "Update Advertisement Status: Approved")
    public void updateAdvertisementStatus1() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementStatusRequest request = new UpdateAdvertisementStatusRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2132);
        request.setAdvertisementId(arrayList);
        request.setStatusId(1);

        String requestResponse = apiRequestContext.post(Parameters.UPDATE_ADVERTISEMENT_STATUS, RequestOptions.create().setData(request)).text();

        UpdateAdvertisementStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 3, description = "Update Advertisement Status: Reject")
    public void updateAdvertisementStatus2() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementStatusRequest request = new UpdateAdvertisementStatusRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2132);
        request.setAdvertisementId(arrayList);
        request.setStatusId(2);

        String requestResponse = apiRequestContext.post(Parameters.UPDATE_ADVERTISEMENT_STATUS, RequestOptions.create().setData(request)).text();

        UpdateAdvertisementStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 4, description = "Update Advertisement Status: Cancel")
    public void updateAdvertisementStatus3() {
        apiRequestContext = getApiRequestContext();

        UpdateAdvertisementStatusRequest request = new UpdateAdvertisementStatusRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2132);
        request.setAdvertisementId(arrayList);
        request.setStatusId(3);

        String requestResponse = apiRequestContext.post(Parameters.UPDATE_ADVERTISEMENT_STATUS, RequestOptions.create().setData(request)).text();

        UpdateAdvertisementStatusResponse response = new Gson().fromJson(requestResponse, UpdateAdvertisementStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advertisement Image By Id")
    public void getAdvertisementImageById() {
        apiRequestContext = getApiRequestContext();

        GetAdvertisementImageByIdRequest request = new GetAdvertisementImageByIdRequest();
        request.setAdvertisementId(2097);

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERTISEMENT_IMAGE_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertisementImageByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementImageByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get User Published Advertisements By User Id")
    public void getUserPublishedAdvertisementsByUserId() {
        apiRequestContext = getApiRequestContext();

        GetUserPublishedAdvertisementsByUserIdRequest request = new GetUserPublishedAdvertisementsByUserIdRequest();
        Pagination pagination = new Pagination();
        pagination.setCurrentPage(1);
        pagination.setTake(5);
        request.setPagination(pagination);

        String requestResponse = apiRequestContext.post(Parameters.GET_USER_PUBLISHED_ADVERTISEMENTS_BY_USER_ID, RequestOptions.create().setData(request)).text();

        GetUserPublishedAdvertisementsByUserIdResponse response = new Gson().fromJson(requestResponse, GetUserPublishedAdvertisementsByUserIdResponse.class);

        assertEquals(response.getData().getPublishedAdverts().size(), 5);
    }

    @Test(description = "Get User Unpublished Advertisements By User Id")
    public void getUserUnpublishedAdvertisementsByUserId() {
        apiRequestContext = getApiRequestContext();

        GetUserUnpublishedAdvertisementsByUserIdRequest request = new GetUserUnpublishedAdvertisementsByUserIdRequest();
        org.sensat.test.request.advertisement.getUserUnpublishedAdvertisementsByUserId.Pagination pagination = new org.sensat.test.request.advertisement.getUserUnpublishedAdvertisementsByUserId.Pagination();
        pagination.setCurrentPage(1);
        pagination.setTake(5);
        request.setPagination(pagination);

        String requestResponse = apiRequestContext.post(Parameters.GET_USER_UNPUBLISHED_ADVERTISEMENTS_BY_USER_ID, RequestOptions.create().setData(request)).text();

        GetUserUnpublishedAdvertisementsByUserIdResponse response = new Gson().fromJson(requestResponse, GetUserUnpublishedAdvertisementsByUserIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get User Pending Advertisements By User Id")
    public void getUserPendingAdvertisementsByUserId() {
        apiRequestContext = getApiRequestContext();

        GetUserPendingAdvertisementsByUserIdRequest request = new GetUserPendingAdvertisementsByUserIdRequest();
        org.sensat.test.request.advertisement.getUserPendingAdvertisementsByUserId.Pagination pagination = new org.sensat.test.request.advertisement.getUserPendingAdvertisementsByUserId.Pagination();
        pagination.setCurrentPage(1);
        pagination.setTake(5);
        request.setPagination(pagination);

        String requestResponse = apiRequestContext.post(Parameters.GET_USER_PENDING_ADVERTISEMENTS_BY_USER_ID, RequestOptions.create().setData(request)).text();

        GetUserPendingAdvertisementsByUserIdResponse response = new Gson().fromJson(requestResponse, GetUserPendingAdvertisementsByUserIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get User Advertisements By User Id")
    public void getUserAdvertisementsByUserId() {
        apiRequestContext = getApiRequestContext();

        GetUserAdvertisementsByUserIdRequest request = new GetUserAdvertisementsByUserIdRequest();
        org.sensat.test.request.advertisement.getUserAdvertisementsByUserId.Pagination pagination = new org.sensat.test.request.advertisement.getUserAdvertisementsByUserId.Pagination();
        pagination.setCurrentPage(1);
        pagination.setTake(5);
        request.setPagination(pagination);

        String requestResponse = apiRequestContext.post(Parameters.GET_USER_ADVERTISEMENTS_BY_USER_ID, RequestOptions.create().setData(request)).text();

        GetUserAdvertisementsByUserIdResponse response = new Gson().fromJson(requestResponse, GetUserAdvertisementsByUserIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Create Test", invocationCount = 10000)
    public void createTest() {
        apiRequestContext = getApiRequestContext();

        int randomNumber = generateRandomNumber(2620, 7000);

        GetVehicleJatoIdRequest request = new GetVehicleJatoIdRequest();
        request.setModelTypeId(randomNumber);

        String requestResponse = apiRequestContext.post(Parameters.GET_VEHICLE_JATO_ID, RequestOptions.create().setData(request)).text();

        GetVehicleJatoIdResponse response = new Gson().fromJson(requestResponse, GetVehicleJatoIdResponse.class);
        System.out.println("response1: " + response.isSuccess());

        long jatoId = response.getData();

        String requestResponse2 = apiRequestContext.get(Parameters.GET_VEHICLE_DETAIL_PROPERTIES_FOR_CREATE_ADVERTISEMENT_QUERY, RequestOptions.create().setQueryParam("categoryId", "1").setQueryParam("jatoVehicleId", String.valueOf(jatoId))).text();

        GetVehicleDetailPropertiesForCreateAdvertisementQueryResponse response2 = new Gson().fromJson(requestResponse2, GetVehicleDetailPropertiesForCreateAdvertisementQueryResponse.class);
        System.out.println("response2: " + response2.isSuccess());

        GetJatoVehiclePropsByJatoVehicleIdRequest request3 = new GetJatoVehiclePropsByJatoVehicleIdRequest();
        request3.setCategoryId(1);
        request3.setJatoVehicleId(jatoId);

        String requestResponse3 = apiRequestContext.post(Parameters.GET_JATO_VEHICLE_PROPS_BY_JATO_VEHICLE_ID, RequestOptions.create().setData(request3)).text();

        GetJatoVehiclePropsByJatoVehicleIdResponse response3 = new Gson().fromJson(requestResponse3, GetJatoVehiclePropsByJatoVehicleIdResponse.class);
        System.out.println("response3: " + response3.isSuccess());

        System.out.println("modelTypeId: " + randomNumber);
        System.out.println("jatoId: " + jatoId);
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}
