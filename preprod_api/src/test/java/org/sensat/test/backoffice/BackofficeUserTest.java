package org.sensat.test.backoffice;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.base.BackofficeAccount;
import org.sensat.constant.SecurityKey;
import org.sensat.constant.UserServiceParameters;
import org.sensat.test.backoffice.payload.*;
import org.sensat.test.backoffice.payload.storeApproval.StoreApprovalPayload;
import org.sensat.test.backoffice.payload.userApproval.RejectItem;
import org.sensat.test.backoffice.payload.userApproval.UserApprovalPayload;
import org.sensat.test.backoffice.response.StoreApprovalResponse;
import org.sensat.test.backoffice.response.UserApprovalResponse;
import org.sensat.test.backoffice.response.getAgreementTextById.GetAgreementTextByIdResponse;
import org.sensat.test.backoffice.response.getCorporateClientDetailsByDate.GetCorporateClientDetailsByDateResponse;
import org.sensat.test.backoffice.response.getRejectionsByRejectionEntityType.GetRejectionsByRejectionEntityTypeResponse;
import org.sensat.test.backoffice.response.getStoreById.GetStoreByIdResponse;
import org.sensat.test.backoffice.response.getStoresByStatus.GetStoresByStatusResponse;
import org.sensat.test.backoffice.response.getStoresCount.GetStoresCountResponse;
import org.sensat.test.backoffice.response.getUserById.GetUserByIdResponse;
import org.sensat.test.backoffice.response.getUserRoles.GetUserRolesResponse;
import org.sensat.test.backoffice.response.getUsersByStatus.GetUsersByStatusResponse;
import org.sensat.test.backoffice.response.getUsersCount.GetUsersCountResponse;
import org.sensat.test.backoffice.response.numberOfUsersByDate.NumberOfUsersByDateResponse;
import org.sensat.test.backoffice.response.totalCountOfMembersByDate.TotalCountOfMembersByDateResponse;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class BackofficeUserTest extends BackofficeAccount {

    private APIRequestContext getApiRequestContext() {
        headers.put("servicesecuritykey", SecurityKey.USER_SECURITY_KEY);
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(UserServiceParameters.USER_PREPROD_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = UserServiceParameters.GET_CORPORATE_CLIENT_DETAILS_BY_DATE + " Method = POST")
    public void getCorporateClientDetailsByDate() {
        GetCorporateClientDetailsByDatePayload getCorporateClientDetailsByDatePayload = new GetCorporateClientDetailsByDatePayload();

        getCorporateClientDetailsByDatePayload.setStartDate("2023-04-01T00:00:00.000Z");
        getCorporateClientDetailsByDatePayload.setEndDate("2023-04-12T00:00:00.000Z");

        String response = getApiRequestContext().post(UserServiceParameters.GET_CORPORATE_CLIENT_DETAILS_BY_DATE, RequestOptions.create().setData(getCorporateClientDetailsByDatePayload)).text();

        GetCorporateClientDetailsByDateResponse getCorporateClientDetailsByDateResponse = new Gson().fromJson(response, GetCorporateClientDetailsByDateResponse.class);

        assertTrue(getCorporateClientDetailsByDateResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_STORES_COUNT + " Method = POST", priority = 2)
    public void getStoresCount() {
        GetStoresCountPayload getStoresCountPayload = new GetStoresCountPayload();

        String response = getApiRequestContext().post(UserServiceParameters.GET_STORES_COUNT, RequestOptions.create().setData(getStoresCountPayload)).text();

        GetStoresCountResponse getStoresCountResponse = new Gson().fromJson(response, GetStoresCountResponse.class);

        assertTrue(getStoresCountResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USER_ROLES + " Method = POST", priority = 3)
    public void getUserRoles() {
        GetUserRolesPayload getUserRolesPayload = new GetUserRolesPayload();

        getUserRolesPayload.setUserNo("3BIK8ORH1WC27GF");

        String response = getApiRequestContext().post(UserServiceParameters.GET_USER_ROLES, RequestOptions.create().setData(getUserRolesPayload)).text();

        GetUserRolesResponse getUserRolesResponse = new Gson().fromJson(response, GetUserRolesResponse.class);

        assertTrue(getUserRolesResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USERS_COUNT + " Method = POST", priority = 4)
    public void getUsersCount() {
        GetUsersCountPayload getUsersCountPayload = new GetUsersCountPayload();

        String response = getApiRequestContext().post(UserServiceParameters.GET_USERS_COUNT, RequestOptions.create().setData(getUsersCountPayload)).text();

        GetUsersCountResponse getUsersCountResponse = new Gson().fromJson(response, GetUsersCountResponse.class);

        assertTrue(getUsersCountResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.TOTAL_COUNT_OF_MEMBERS_BY_DATE + " Method = POST", priority = 5)
    public void totalCountOfMembersByDate() {
        TotalCountOfMembersByDatePayload totalCountOfMembersByDatePayload = new TotalCountOfMembersByDatePayload();

        totalCountOfMembersByDatePayload.setStartDate("2023-04-02T00:00:00.000Z");
        totalCountOfMembersByDatePayload.setEndDate("2023-04-13T00:00:00.000Z");

        String response = getApiRequestContext().post(UserServiceParameters.TOTAL_COUNT_OF_MEMBERS_BY_DATE, RequestOptions.create().setData(totalCountOfMembersByDatePayload)).text();

        TotalCountOfMembersByDateResponse totalCountOfMembersByDateResponse = new Gson().fromJson(response, TotalCountOfMembersByDateResponse.class);

        assertTrue(totalCountOfMembersByDateResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.NUMBER_OF_USERS_BY_DATE + " Method = POST", priority = 6)
    public void numberOfUsersByDate() {
        NumberOfUsersByDatePayload numberOfUsersByDatePayload = new NumberOfUsersByDatePayload();

        numberOfUsersByDatePayload.setStartDate("2023-04-02T00:00:00.000Z");
        numberOfUsersByDatePayload.setEndDate("2023-04-13T00:00:00.000Z");

        String response = getApiRequestContext().post(UserServiceParameters.NUMBER_OF_USERS_BY_DATE, RequestOptions.create().setData(numberOfUsersByDatePayload)).text();

        NumberOfUsersByDateResponse numberOfUsersByDateResponse = new Gson().fromJson(response, NumberOfUsersByDateResponse.class);

        assertTrue(numberOfUsersByDateResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_STORES_BY_STATUS + " Method = POST", priority = 7)
    public void getStoresByStatusWaiting() {
        GetStoresByStatusPayload getStoresByStatusPayload = new GetStoresByStatusPayload();

        getStoresByStatusPayload.setNumberOfRecords(10000);
        getStoresByStatusPayload.setStoreStatus(1);
        getStoresByStatusPayload.setPageNumber(1);

        String response = getApiRequestContext().post(UserServiceParameters.GET_STORES_BY_STATUS, RequestOptions.create().setData(getStoresByStatusPayload)).text();

        GetStoresByStatusResponse getStoresByStatusResponse = new Gson().fromJson(response, GetStoresByStatusResponse.class);

        assertTrue(getStoresByStatusResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_STORES_BY_STATUS + " Method = POST", priority = 8)
    public void getStoresByStatusRejected() {
        GetStoresByStatusPayload getStoresByStatusPayload = new GetStoresByStatusPayload();

        getStoresByStatusPayload.setNumberOfRecords(10000);
        getStoresByStatusPayload.setStoreStatus(3);
        getStoresByStatusPayload.setPageNumber(1);

        String response = getApiRequestContext().post(UserServiceParameters.GET_STORES_BY_STATUS, RequestOptions.create().setData(getStoresByStatusPayload)).text();

        GetStoresByStatusResponse getStoresByStatusResponse = new Gson().fromJson(response, GetStoresByStatusResponse.class);

        assertTrue(getStoresByStatusResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_STORES_BY_STATUS + " Method = POST", priority = 9)
    public void getStoresByStatusPassive() {
        GetStoresByStatusPayload getStoresByStatusPayload = new GetStoresByStatusPayload();

        getStoresByStatusPayload.setNumberOfRecords(10000);
        getStoresByStatusPayload.setStoreStatus(4);
        getStoresByStatusPayload.setPageNumber(1);

        String response = getApiRequestContext().post(UserServiceParameters.GET_STORES_BY_STATUS, RequestOptions.create().setData(getStoresByStatusPayload)).text();

        GetStoresByStatusResponse getStoresByStatusResponse = new Gson().fromJson(response, GetStoresByStatusResponse.class);

        assertTrue(getStoresByStatusResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_STORES_BY_STATUS + " Method = POST", priority = 10)
    public void getStoresByStatusApproved() {
        GetStoresByStatusPayload getStoresByStatusPayload = new GetStoresByStatusPayload();

        getStoresByStatusPayload.setNumberOfRecords(10000);
        getStoresByStatusPayload.setPageNumber(1);

        String response = getApiRequestContext().post(UserServiceParameters.GET_STORES_BY_STATUS, RequestOptions.create().setData(getStoresByStatusPayload)).text();

        GetStoresByStatusResponse getStoresByStatusResponse = new Gson().fromJson(response, GetStoresByStatusResponse.class);

        assertTrue(getStoresByStatusResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_STORE_BY_ID + " Method = POST", priority = 11)
    public void getStoreById() {
        GetStoreByIdPayload getStoreByIdPayload = new GetStoreByIdPayload();

        getStoreByIdPayload.setStoreNo("2023166GEKJNBQ0");

        String response = getApiRequestContext().post(UserServiceParameters.GET_STORE_BY_ID, RequestOptions.create().setData(getStoreByIdPayload)).text();

        GetStoreByIdResponse getStoreByIdResponse = new Gson().fromJson(response, GetStoreByIdResponse.class);

        assertTrue(getStoreByIdResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USERS_BY_STATUS + " Method = POST", priority = 12)
    public void getUsersByStatusCorporateCreatePending() {
        GetUsersByStatusPayload getUsersByStatusPayload = new GetUsersByStatusPayload();

        getUsersByStatusPayload.setAccountType(2);
        getUsersByStatusPayload.setNumberOfRecords(10000);
        getUsersByStatusPayload.setPageNumber(1);
        getUsersByStatusPayload.setAccountType(5);

        String response = getApiRequestContext().post(UserServiceParameters.GET_USERS_BY_STATUS, RequestOptions.create().setData(getUsersByStatusPayload)).text();

        GetUsersByStatusResponse getUsersByStatusResponse = new Gson().fromJson(response, GetUsersByStatusResponse.class);

        assertTrue(getUsersByStatusResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USERS_BY_STATUS + " Method = POST", priority = 13)
    public void getUsersByStatusCorporateUpdatePending() {
        GetUsersByStatusPayload getUsersByStatusPayload = new GetUsersByStatusPayload();

        getUsersByStatusPayload.setAccountType(2);
        getUsersByStatusPayload.setNumberOfRecords(10000);
        getUsersByStatusPayload.setPageNumber(1);
        getUsersByStatusPayload.setAccountType(6);

        String response = getApiRequestContext().post(UserServiceParameters.GET_USERS_BY_STATUS, RequestOptions.create().setData(getUsersByStatusPayload)).text();

        GetUsersByStatusResponse getUsersByStatusResponse = new Gson().fromJson(response, GetUsersByStatusResponse.class);

        assertTrue(getUsersByStatusResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USERS_BY_STATUS + " Method = POST", priority = 14)
    public void getUsersByStatusCorporateApproved() {
        GetUsersByStatusPayload getUsersByStatusPayload = new GetUsersByStatusPayload();

        getUsersByStatusPayload.setAccountType(2);
        getUsersByStatusPayload.setNumberOfRecords(10000);
        getUsersByStatusPayload.setPageNumber(1);
        getUsersByStatusPayload.setAccountType(0);

        String response = getApiRequestContext().post(UserServiceParameters.GET_USERS_BY_STATUS, RequestOptions.create().setData(getUsersByStatusPayload)).text();

        GetUsersByStatusResponse getUsersByStatusResponse = new Gson().fromJson(response, GetUsersByStatusResponse.class);

        assertTrue(getUsersByStatusResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USERS_BY_STATUS + " Method = POST", priority = 15)
    public void getUsersByStatusCorporateRejected() {
        GetUsersByStatusPayload getUsersByStatusPayload = new GetUsersByStatusPayload();

        getUsersByStatusPayload.setAccountType(2);
        getUsersByStatusPayload.setNumberOfRecords(10000);
        getUsersByStatusPayload.setPageNumber(1);
        getUsersByStatusPayload.setAccountType(7);

        String response = getApiRequestContext().post(UserServiceParameters.GET_USERS_BY_STATUS, RequestOptions.create().setData(getUsersByStatusPayload)).text();

        GetUsersByStatusResponse getUsersByStatusResponse = new Gson().fromJson(response, GetUsersByStatusResponse.class);

        assertTrue(getUsersByStatusResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USERS_BY_STATUS + " Method = POST", priority = 16)
    public void getUsersByStatus() {
        GetUsersByStatusPayload getUsersByStatusPayload = new GetUsersByStatusPayload();

        getUsersByStatusPayload.setPageNumber(1);
        getUsersByStatusPayload.setNumberOfRecords(10000);

        String response = getApiRequestContext().post(UserServiceParameters.GET_USERS_BY_STATUS, RequestOptions.create().setData(getUsersByStatusPayload)).text();

        GetUsersByStatusResponse getUsersByStatusResponse = new Gson().fromJson(response, GetUsersByStatusResponse.class);

        assertTrue(getUsersByStatusResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USER_BY_ID + " Method = POST", priority = 17)
    public void getUserById() {
        GetUserByIdPayload getUserByIdPayload = new GetUserByIdPayload();

        getUserByIdPayload.setUserNo("ITVLLSFU3ZX0TBA");

        String response = getApiRequestContext().post(UserServiceParameters.GET_USER_BY_ID, RequestOptions.create().setData(getUserByIdPayload)).text();

        GetUserByIdResponse getUserByIdResponse = new Gson().fromJson(response, GetUserByIdResponse.class);

        assertTrue(getUserByIdResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_AGREEMENT_TEXT_BY_ID + " Method = POST", priority = 18)
    public void getAgreementTextById() {
        GetAgreementTextByIdPayload getAgreementTextByIdPayload = new GetAgreementTextByIdPayload();

        getAgreementTextByIdPayload.setAgreementTextId(5);

        String response = getApiRequestContext().post(UserServiceParameters.GET_AGREEMENT_TEXT_BY_ID, RequestOptions.create().setData(getAgreementTextByIdPayload)).text();

        GetAgreementTextByIdResponse getAgreementTextByIdResponse = new Gson().fromJson(response, GetAgreementTextByIdResponse.class);

        assertTrue(getAgreementTextByIdResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.USER_APPROVAL + " Method = POST", priority = 19)
    public void userApprovalReset() {
        UserApprovalPayload userApprovalPayload = new UserApprovalPayload();

        userApprovalPayload.setUserNo("LP1JWIWYRZ3FU9M");
        userApprovalPayload.setBackofficeApproveStatus(3);

        String response = getApiRequestContext().post(UserServiceParameters.USER_APPROVAL, RequestOptions.create().setData(userApprovalPayload)).text();

        UserApprovalResponse userApprovalResponse = new Gson().fromJson(response, UserApprovalResponse.class);

        assertTrue(userApprovalResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.USER_APPROVAL + " Method = POST", priority = 20)
    public void userApprovalApprove() {
        UserApprovalPayload userApprovalPayload = new UserApprovalPayload();

        userApprovalPayload.setUserNo("LP1JWIWYRZ3FU9M");
        userApprovalPayload.setBackofficeApproveStatus(1);

        String response = getApiRequestContext().post(UserServiceParameters.USER_APPROVAL, RequestOptions.create().setData(userApprovalPayload)).text();

        UserApprovalResponse userApprovalResponse = new Gson().fromJson(response, UserApprovalResponse.class);

        assertTrue(userApprovalResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.USER_APPROVAL + " Method = POST", priority = 21)
    public void userApprovalReject() {
        UserApprovalPayload userApprovalPayload = new UserApprovalPayload();

        userApprovalPayload.setUserNo("LP1JWIWYRZ3FU9M");
        userApprovalPayload.setBackofficeApproveStatus(2);

        RejectItem rejectItem = new RejectItem();
        List<Integer> rejectionActionId = new ArrayList<>();
        rejectionActionId.add(14);
        rejectionActionId.add(17);
        rejectionActionId.add(16);
        rejectItem.setRejectionActionId(rejectionActionId);
        rejectItem.setOtherAction("Red ediyorum");

        userApprovalPayload.setRejectItem(rejectItem);

        String response = getApiRequestContext().post(UserServiceParameters.USER_APPROVAL, RequestOptions.create().setData(userApprovalPayload)).text();

        UserApprovalResponse userApprovalResponse = new Gson().fromJson(response, UserApprovalResponse.class);

        assertTrue(userApprovalResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_REJECTIONS_BY_REJECTION_ENTITY_TYPE + " Method = POST", priority = 22)
    public void getRejectionsByRejectionEntityTypeUser() {
        GetRejectionsByRejectionEntityTypePayload getRejectionsByRejectionEntityTypePayload = new GetRejectionsByRejectionEntityTypePayload();

        getRejectionsByRejectionEntityTypePayload.setRejectionEntityType(2);

        String response = getApiRequestContext().post(UserServiceParameters.GET_REJECTIONS_BY_REJECTION_ENTITY_TYPE, RequestOptions.create().setData(getRejectionsByRejectionEntityTypePayload)).text();

        GetRejectionsByRejectionEntityTypeResponse getRejectionsByRejectionEntityTypeResponse = new Gson().fromJson(response, GetRejectionsByRejectionEntityTypeResponse.class);

        assertTrue(getRejectionsByRejectionEntityTypeResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_REJECTIONS_BY_REJECTION_ENTITY_TYPE + " Method = POST", priority = 23)
    public void getRejectionsByRejectionEntityTypeStore() {
        GetRejectionsByRejectionEntityTypePayload getRejectionsByRejectionEntityTypePayload = new GetRejectionsByRejectionEntityTypePayload();

        getRejectionsByRejectionEntityTypePayload.setRejectionEntityType(3);

        String response = getApiRequestContext().post(UserServiceParameters.GET_REJECTIONS_BY_REJECTION_ENTITY_TYPE, RequestOptions.create().setData(getRejectionsByRejectionEntityTypePayload)).text();

        GetRejectionsByRejectionEntityTypeResponse getRejectionsByRejectionEntityTypeResponse = new Gson().fromJson(response, GetRejectionsByRejectionEntityTypeResponse.class);

        assertTrue(getRejectionsByRejectionEntityTypeResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.STORE_APPROVAL + " Method = POST", priority = 24)
    public void storeApprovalReset() {
        StoreApprovalPayload storeApprovalPayload = new StoreApprovalPayload();

        storeApprovalPayload.setStoreNo("202316TALXCC43E");
        storeApprovalPayload.setBackofficeApproveStatus(3);

        String response = getApiRequestContext().post(UserServiceParameters.STORE_APPROVAL, RequestOptions.create().setData(storeApprovalPayload)).text();

        StoreApprovalResponse storeApprovalResponse = new Gson().fromJson(response, StoreApprovalResponse.class);

        assertTrue(storeApprovalResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.STORE_APPROVAL + " Method = POST", priority = 25)
    public void storeApprovalApprove() {
        StoreApprovalPayload storeApprovalPayload = new StoreApprovalPayload();

        storeApprovalPayload.setStoreNo("202316TALXCC43E");
        storeApprovalPayload.setBackofficeApproveStatus(1);

        String response = getApiRequestContext().post(UserServiceParameters.STORE_APPROVAL, RequestOptions.create().setData(storeApprovalPayload)).text();

        StoreApprovalResponse storeApprovalResponse = new Gson().fromJson(response, StoreApprovalResponse.class);

        assertTrue(storeApprovalResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.STORE_APPROVAL + " Method = POST", priority = 26)
    public void StoreApprovalReject() {
        StoreApprovalPayload storeApprovalPayload = new StoreApprovalPayload();

        storeApprovalPayload.setStoreNo("202316TALXCC43E");
        storeApprovalPayload.setBackofficeApproveStatus(2);

        org.sensat.test.backoffice.payload.storeApproval.RejectItem rejectItem = new org.sensat.test.backoffice.payload.storeApproval.RejectItem();
        List<Integer> rejectionActionId = new ArrayList<>();
        rejectionActionId.add(3);
        rejectionActionId.add(10);
        rejectItem.setRejectionActionId(rejectionActionId);
        rejectItem.setOtherAction("Red ediyorum");

        storeApprovalPayload.setRejectItem(rejectItem);

        String response = getApiRequestContext().post(UserServiceParameters.STORE_APPROVAL, RequestOptions.create().setData(storeApprovalPayload)).text();

        StoreApprovalResponse storeApprovalResponse = new Gson().fromJson(response, StoreApprovalResponse.class);

        assertTrue(storeApprovalResponse.isSuccess());
    }

}
