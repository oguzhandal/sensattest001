package org.sensat.test.tests;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.base.BackOfficeBaseTest;
import org.sensat.constant.Parameters;
import org.sensat.test.request.backoffice.*;
import org.sensat.test.response.backoffice.AdvertisementApprovalResponse;
import org.sensat.test.response.backoffice.AdvertisementChangeShowcaseStatusResponse;
import org.sensat.test.response.backoffice.StoreApprovalResponse;
import org.sensat.test.response.backoffice.UserApprovalResponse;
import org.sensat.test.response.backoffice.getAdvertisementsById.GetAdvertisementsByIdResponse;
import org.sensat.test.response.backoffice.GetAdvertisementsByTypeAndStatus.GetAdvertisementsByTypeAndStatusResponse;
import org.sensat.test.response.backoffice.getAdvertisementsCount.GetAdvertisementsCountResponse;
import org.sensat.test.response.backoffice.getStoreById.GetStoreByIdResponse;
import org.sensat.test.response.backoffice.GetStoresByStatus.GetStoresByStatusResponse;
import org.sensat.test.response.backoffice.getStoresCount.GetStoresCountResponse;
import org.sensat.test.response.backoffice.getUserById.GetUserByIdResponse;
import org.sensat.test.response.backoffice.getUsersByStatus.GetUsersByStatusResponse;
import org.sensat.test.response.backoffice.getUsersCount.GetUsersCountResponse;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class BackofficeTest extends BackOfficeBaseTest {

    private APIRequestContext getApiRequestContextUser() {
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.USER_TEST_URL)
                .setExtraHTTPHeaders(headers));
    }

    private APIRequestContext getApiRequestContextAdvertisement() {
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.ADVERTISEMENT_TEST_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = "Get Advertisement By Type And Status")
    public void getAdvertisementsByTypeAndStatus() {
        apiRequestContext = getApiRequestContextAdvertisement();

        GetAdvertisementsByTypeAndStatusRequest request = new GetAdvertisementsByTypeAndStatusRequest();
        request.setAdvertisementStatus(0);
        request.setSalesType(1);

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERTISEMENTS_BY_TYPE_AND_STATUS, RequestOptions.create().setData(request)).text();

        GetAdvertisementsByTypeAndStatusResponse response = new Gson().fromJson(requestResponse, GetAdvertisementsByTypeAndStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advertisement By Type For Sale")
    public void getAdvertisementsByTypeForSale() {
        apiRequestContext = getApiRequestContextAdvertisement();

        GetAdvertisementsByTypeAndStatusRequest request = new GetAdvertisementsByTypeAndStatusRequest();
        request.setSalesType(1);

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERTISEMENTS_BY_TYPE_AND_STATUS, RequestOptions.create().setData(request)).text();

        GetAdvertisementsByTypeAndStatusResponse response = new Gson().fromJson(requestResponse, GetAdvertisementsByTypeAndStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Advertisement By Type For Rent")
    public void getAdvertisementsByTypeForRent() {
        apiRequestContext = getApiRequestContextAdvertisement();

        GetAdvertisementsByTypeAndStatusForRentRequest request = new GetAdvertisementsByTypeAndStatusForRentRequest();
        request.setSalesType(2);

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERTISEMENTS_BY_TYPE_AND_STATUS, RequestOptions.create().setData(request)).text();

        GetAdvertisementsByTypeAndStatusResponse response = new Gson().fromJson(requestResponse, GetAdvertisementsByTypeAndStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get AdvertisementById")
    public void getAdvertisementsById() {
        apiRequestContext = getApiRequestContextAdvertisement();

        GetAdvertisementsByIdRequest request = new GetAdvertisementsByIdRequest();
        request.setId(2093);

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERTISEMENTS_BY_ID, RequestOptions.create().setData(request)).text();

        GetAdvertisementsByIdResponse response = new Gson().fromJson(requestResponse, GetAdvertisementsByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Users By Status")
    public void getUsersByStatus() {
        apiRequestContext = getApiRequestContextUser();

        GetUsersByStatusRequest request = new GetUsersByStatusRequest();
        request.setNumberOfRecords(10000);
        request.setPageNumber(1);

        String requestResponse = apiRequestContext.post(Parameters.GET_USERS_BY_STATUS, RequestOptions.create().setData(request)).text();

        GetUsersByStatusResponse response = new Gson().fromJson(requestResponse, GetUsersByStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Stores By Status")
    public void getStoresByStatus() {
        apiRequestContext = getApiRequestContextUser();

        GetStoresByStatusRequest request = new GetStoresByStatusRequest();
        request.setNumberOfRecords(10000);
        request.setPageNumber(1);

        String requestResponse = apiRequestContext.post(Parameters.GET_STORES_BY_STATUS, RequestOptions.create().setData(request)).text();

        GetStoresByStatusResponse response = new Gson().fromJson(requestResponse, GetStoresByStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Advertisement Change Showcase Status: False")
    public void advertisementChangeShowcaseStatusFalse() {
        apiRequestContext = getApiRequestContextAdvertisement();

        AdvertisementChangeShowcaseStatusRequest request = new AdvertisementChangeShowcaseStatusRequest();
        request.setAdvertisementId(2093);
        request.setShowcase(false);

        String requestResponse = apiRequestContext.post(Parameters.ADVERTISEMENT_CHANGE_SHOWCASE_STATUS, RequestOptions.create().setData(request)).text();

        AdvertisementChangeShowcaseStatusResponse response = new Gson().fromJson(requestResponse, AdvertisementChangeShowcaseStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 1, description = "Advertisement Change Showcase Status: True")
    public void advertisementChangeShowcaseStatusTrue() {
        apiRequestContext = getApiRequestContextAdvertisement();

        AdvertisementChangeShowcaseStatusRequest request = new AdvertisementChangeShowcaseStatusRequest();
        request.setAdvertisementId(2093);
        request.setShowcase(true);

        String requestResponse = apiRequestContext.post(Parameters.ADVERTISEMENT_CHANGE_SHOWCASE_STATUS, RequestOptions.create().setData(request)).text();

        AdvertisementChangeShowcaseStatusResponse response = new Gson().fromJson(requestResponse, AdvertisementChangeShowcaseStatusResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Advertisement Approval: Unpublish")
    public void advertisementApprovalUnpublish() {
        apiRequestContext = getApiRequestContextAdvertisement();

        AdvertisementApprovalRequest request = new AdvertisementApprovalRequest();
        request.setAdvertisementId(2093);
        request.setApprovalStatus(3);

        String requestResponse = apiRequestContext.post(Parameters.ADVERTISEMENT_APPROVAL, RequestOptions.create().setData(request)).text();

        AdvertisementApprovalResponse response = new Gson().fromJson(requestResponse, AdvertisementApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 1, description = "Advertisement Approval: Sold")
    public void advertisementSold() {
        apiRequestContext = getApiRequestContextAdvertisement();

        AdvertisementApprovalRequest request = new AdvertisementApprovalRequest();
        request.setAdvertisementId(2093);
        request.setApprovalStatus(1);

        String requestResponse = apiRequestContext.post(Parameters.ADVERTISEMENT_APPROVAL, RequestOptions.create().setData(request)).text();

        AdvertisementApprovalResponse response = new Gson().fromJson(requestResponse, AdvertisementApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 2, description = "Advertisement Approval: Reject")
    public void advertisementReject() {
        apiRequestContext = getApiRequestContextAdvertisement();

        AdvertisementApprovalRequest request = new AdvertisementApprovalRequest();
        request.setAdvertisementId(2093);
        request.setApprovalStatus(2);
        request.setReasonForRejection("It was rejected because it was not consistent.");

        String requestResponse = apiRequestContext.post(Parameters.ADVERTISEMENT_APPROVAL, RequestOptions.create().setData(request)).text();

        AdvertisementApprovalResponse response = new Gson().fromJson(requestResponse, AdvertisementApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 3, description = "Advertisement Approval: Pending")
    public void advertisementPending() {
        apiRequestContext = getApiRequestContextAdvertisement();

        AdvertisementApprovalRequest request = new AdvertisementApprovalRequest();
        request.setAdvertisementId(2093);
        request.setApprovalStatus(0);

        String requestResponse = apiRequestContext.post(Parameters.ADVERTISEMENT_APPROVAL, RequestOptions.create().setData(request)).text();

        AdvertisementApprovalResponse response = new Gson().fromJson(requestResponse, AdvertisementApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 4, description = "Advertisement Approval: Expired")
    public void advertisementExpired() {
        apiRequestContext = getApiRequestContextAdvertisement();

        AdvertisementApprovalRequest request = new AdvertisementApprovalRequest();
        request.setAdvertisementId(2093);
        request.setApprovalStatus(5);

        String requestResponse = apiRequestContext.post(Parameters.ADVERTISEMENT_APPROVAL, RequestOptions.create().setData(request)).text();

        AdvertisementApprovalResponse response = new Gson().fromJson(requestResponse, AdvertisementApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 5, description = "Advertisement Approval: Publish")
    public void advertisementPublish() {
        apiRequestContext = getApiRequestContextAdvertisement();

        for (int i = 18275; i<18277; i++) {
            AdvertisementApprovalRequest request = new AdvertisementApprovalRequest();
            request.setAdvertisementId(i);
            request.setApprovalStatus(4);

            String requestResponse = apiRequestContext.post(Parameters.ADVERTISEMENT_APPROVAL, RequestOptions.create().setData(request)).text();

            AdvertisementApprovalResponse response = new Gson().fromJson(requestResponse, AdvertisementApprovalResponse.class);

            System.out.println(response.isSuccess() + "" + i);

        }

    }

    @Test(description = "Get Advertisements Count")
    public void getAdvertisementsCount() {
        apiRequestContext = getApiRequestContextAdvertisement();

        GetCountRequest request = new GetCountRequest();

        String requestResponse = apiRequestContext.post(Parameters.GET_ADVERTISEMENTS_COUNT, RequestOptions.create().setData(request)).text();

        GetAdvertisementsCountResponse response = new Gson().fromJson(requestResponse, GetAdvertisementsCountResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Stores Count")
    public void getUsersCount() {
        apiRequestContext = getApiRequestContextUser();

        GetCountRequest request = new GetCountRequest();

        String requestResponse = apiRequestContext.post(Parameters.GET_USERS_COUNT, RequestOptions.create().setData(request)).text();

        GetUsersCountResponse response = new Gson().fromJson(requestResponse, GetUsersCountResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Stores Count")
    public void getStoresCount() {
        apiRequestContext = getApiRequestContextUser();

        GetCountRequest request = new GetCountRequest();

        String requestResponse = apiRequestContext.post(Parameters.GET_STORES_COUNT, RequestOptions.create().setData(request)).text();

        GetStoresCountResponse response = new Gson().fromJson(requestResponse, GetStoresCountResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Store By Id")
    public void getStoreById() {
        apiRequestContext = getApiRequestContextUser();

        GetStoreByIdRequest request = new GetStoreByIdRequest();
        request.setStoreCode("st0241");
        request.setStoreId(267);

        String requestResponse = apiRequestContext.post(Parameters.GET_STORE_BY_ID, RequestOptions.create().setData(request)).text();

        GetStoreByIdResponse response = new Gson().fromJson(requestResponse, GetStoreByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Store Approval : Delete")
    public void storeApprovalDelete() {
        apiRequestContext = getApiRequestContextUser();

        StoreApprovalRequest request = new StoreApprovalRequest();
        request.setStoreId(267);
        request.setBackofficeApproveStatus(4);

        String requestResponse = apiRequestContext.post(Parameters.STORE_APPROVAL, RequestOptions.create().setData(request)).text();

        StoreApprovalResponse response = new Gson().fromJson(requestResponse, StoreApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 1, description = "Store Approval : Reject")
    public void storeApprovalReject() {
        apiRequestContext = getApiRequestContextUser();

        StoreApprovalRequest request = new StoreApprovalRequest();
        request.setStoreId(267);
        request.setBackofficeApproveStatus(2);
        request.setReasonForRejection("It was rejected because it was not consistent.");

        String requestResponse = apiRequestContext.post(Parameters.STORE_APPROVAL, RequestOptions.create().setData(request)).text();

        StoreApprovalResponse response = new Gson().fromJson(requestResponse, StoreApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 2, description = "Store Approval : Waiting")
    public void storeApprovalWaiting() {
        apiRequestContext = getApiRequestContextUser();

        StoreApprovalRequest request = new StoreApprovalRequest();
        request.setStoreId(267);
        request.setBackofficeApproveStatus(3);

        String requestResponse = apiRequestContext.post(Parameters.STORE_APPROVAL, RequestOptions.create().setData(request)).text();

        StoreApprovalResponse response = new Gson().fromJson(requestResponse, StoreApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 3, description = "Store Approval : Approval")
    public void storeApproval() {
        apiRequestContext = getApiRequestContextUser();

        StoreApprovalRequest request = new StoreApprovalRequest();
        request.setStoreId(267);
        request.setBackofficeApproveStatus(1);

        String requestResponse = apiRequestContext.post(Parameters.STORE_APPROVAL, RequestOptions.create().setData(request)).text();

        StoreApprovalResponse response = new Gson().fromJson(requestResponse, StoreApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get User By Id")
    public void getUserById() {
        apiRequestContext = getApiRequestContextUser();

        GetUserByIdRequest request = new GetUserByIdRequest();
        request.setUserId(228);

        String requestResponse = apiRequestContext.post(Parameters.GET_USER_BY_ID, RequestOptions.create().setData(request)).text();

        GetUserByIdResponse response = new Gson().fromJson(requestResponse, GetUserByIdResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "User Approval : Delete")
    public void userApprovalDelete() {
        apiRequestContext = getApiRequestContextUser();

        UserApprovalRequest request = new UserApprovalRequest();
        request.setUserId(241);
        request.setBackofficeApproveStatus(4);

        String requestResponse = apiRequestContext.post(Parameters.USER_APPROVAL, RequestOptions.create().setData(request)).text();

        UserApprovalResponse response = new Gson().fromJson(requestResponse, UserApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 1, description = "User Approval : Waiting")
    public void userApprovalWaiting() {
        apiRequestContext = getApiRequestContextUser();

        UserApprovalRequest request = new UserApprovalRequest();
        request.setUserId(241);
        request.setBackofficeApproveStatus(3);

        String requestResponse = apiRequestContext.post(Parameters.USER_APPROVAL, RequestOptions.create().setData(request)).text();

        UserApprovalResponse response = new Gson().fromJson(requestResponse, UserApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 2, description = "User Approval : Reject")
    public void userApprovalReject() {
        apiRequestContext = getApiRequestContextUser();

        UserApprovalRequest request = new UserApprovalRequest();
        request.setUserId(241);
        request.setBackofficeApproveStatus(2);
        request.setReasonForRejection("It was rejected because it was not consistent.");

        String requestResponse = apiRequestContext.post(Parameters.USER_APPROVAL, RequestOptions.create().setData(request)).text();

        UserApprovalResponse response = new Gson().fromJson(requestResponse, UserApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(priority = 3, description = "User Approval")
    public void userApprovalApproval() {
        apiRequestContext = getApiRequestContextUser();

        UserApprovalRequest request = new UserApprovalRequest();
        request.setUserId(241);
        request.setBackofficeApproveStatus(1);

        String requestResponse = apiRequestContext.post(Parameters.USER_APPROVAL, RequestOptions.create().setData(request)).text();

        UserApprovalResponse response = new Gson().fromJson(requestResponse, UserApprovalResponse.class);

        assertTrue(response.isSuccess());
    }

}
