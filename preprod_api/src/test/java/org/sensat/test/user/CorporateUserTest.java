package org.sensat.test.user;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.apache.commons.io.FileUtils;
import org.sensat.base.CorporateAccount;
import org.sensat.constant.SecurityKey;
import org.sensat.constant.UserServiceParameters;
import org.sensat.test.backoffice.response.StoreApprovalResponse;
import org.sensat.test.user.payload.*;
import org.sensat.test.user.payload.getConsultants.GetConsultantsPayload;
import org.sensat.test.user.payload.getConsultantsByStore.GetConsultantsByStorePayload;
import org.sensat.test.user.payload.getConsultantsByStore.Pagination;
import org.sensat.test.user.response.CreateAddressResponse;
import org.sensat.test.user.response.DeleteConsultantInvitationResponse;
import org.sensat.test.user.response.InviteConsultantResponse;
import org.sensat.test.user.response.getConsultants.GetConsultantsResponse;
import org.sensat.test.user.response.getConsultantsByStore.GetConsultantsByStoreResponse;
import org.sensat.test.user.response.getInvitationRoles.GetInvitationRolesResponse;
import org.sensat.test.user.response.getSelectedConsultantRoles.GetSelectedConsultantRolesResponse;
import org.sensat.test.user.response.getSellerInfo.GetSellerInfoResponse;
import org.sensat.test.user.response.getStoreConsultantsByStoreId.GetStoreConsultantsByStoreIdaResponse;
import org.sensat.test.user.response.getStoreWithDetails.GetStoreWithDetailsResponse;
import org.sensat.test.user.response.getStoresByUser.GetStoresByUserResponse;
import org.sensat.test.user.response.getUserStores.GetUserStoresResponse;
import org.sensat.test.user.response.getWaitingForConsultantsByStoreId.GetWaitingForConsultantsByStoreIdResponse;
import org.sensat.util.Util;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;

import static org.testng.AssertJUnit.assertTrue;

public class CorporateUserTest extends CorporateAccount {

    private final String testStoreNo = "2023166GEKJNBQ0";
    private String deletedStoreNo;
    private String updatedStoreNo;
    private String deletedInviteConsultantId;

    private APIRequestContext getApiRequestContext() {
        headers.put("servicesecuritykey", SecurityKey.USER_SECURITY_KEY);
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(UserServiceParameters.USER_PREPROD_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = UserServiceParameters.CREATE_STORE + " Method = POST")
    public void createStoreType1() throws IOException {
        CreateStorePayload createStorePayload = new CreateStorePayload();

        createStorePayload.setAbout(Util.generateRandomString(20));
        createStorePayload.setAddressDetail(Util.generateRandomString(20));
        createStorePayload.setCertificateNo(Util.generateRandomNumber(15));
        createStorePayload.setCityId(16);
        createStorePayload.setDocumentIssueDate("01/04/2022");
        createStorePayload.setPhone("5350830145");
        createStorePayload.setSaturdayBusinessTime("09:00 - 13:00");
        createStorePayload.setStoreType(1);
        createStorePayload.setSundayBusinessTime("13:00 - 18:00");
        createStorePayload.setTitle("Otomasyon " + Util.generateRandomString(10));
        createStorePayload.setTownId(202);
        createStorePayload.setWorkDaysBusinessTime("09:00 - 18:00");
        createStorePayload.setWorkPhone("2242419970");

        byte[] storeLogo = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/data/image/sample_logo.jpg"));
        String encodedStoreLogo = Base64.getEncoder().encodeToString(storeLogo);

        createStorePayload.setLogo("data:image/png;base64," + encodedStoreLogo);

        byte[] vehicleTradeAuthorizationCertificate = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/data/document/sample_document.pdf"));
        String encodedVehicleTradeAuthorizationCertificate = Base64.getEncoder().encodeToString(vehicleTradeAuthorizationCertificate);

        createStorePayload.setVehicleTradeAuthorizationCertificate("data:application/pdf;base64," + encodedVehicleTradeAuthorizationCertificate);

        ArrayList<String> authorizedDealerCertificates = new ArrayList<>();
        byte[] authorizedDealerCertificate = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/data/document/sample_document.pdf"));
        String encodedAuthorizedDealerCertificate = Base64.getEncoder().encodeToString(authorizedDealerCertificate);
        authorizedDealerCertificates.add("data:application/pdf;base64," + encodedAuthorizedDealerCertificate);

        createStorePayload.setAuthorizedDealerCertificates(authorizedDealerCertificates);

        String response = getApiRequestContext().post(UserServiceParameters.CREATE_STORE, RequestOptions.create().setData(createStorePayload)).text();

        CreateAddressResponse createAddressResponse = new Gson().fromJson(response, CreateAddressResponse.class);

        assertTrue(createAddressResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_STORES_BY_USER + " Method = GET", priority = 1)
    public void getStoresByUser() {
        String response = getApiRequestContext().get(UserServiceParameters.GET_STORES_BY_USER).text();

        GetStoresByUserResponse getStoresByUserResponse = new Gson().fromJson(response, GetStoresByUserResponse.class);

        deletedStoreNo = getStoresByUserResponse.getData().get(getStoresByUserResponse.getData().size() - 1).getStoreNo();
        updatedStoreNo = getStoresByUserResponse.getData().get(getStoresByUserResponse.getData().size() - 2).getStoreNo();

        assertTrue(getStoresByUserResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.DELETE_STORE + " Method = POST", priority = 2)
    public void deleteStore() {
        DeleteStorePayload deleteStorePayload = new DeleteStorePayload();

        deleteStorePayload.setStoreNo(deletedStoreNo);

        String response = getApiRequestContext().post(UserServiceParameters.DELETE_STORE, RequestOptions.create().setData(deleteStorePayload)).text();

        StoreApprovalResponse storeApprovalResponse = new Gson().fromJson(response, StoreApprovalResponse.class);

        assertTrue(storeApprovalResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_STORE_WITH_DETAILS + " Method = POST", priority = 3)
    public void getStoreWithDetails() {
        GetStoreWithDetailsPayload getStoreWithDetailsPayload = new GetStoreWithDetailsPayload();

        getStoreWithDetailsPayload.setStoreNo(testStoreNo);

        String response = getApiRequestContext().post(UserServiceParameters.GET_STORE_WITH_DETAILS, RequestOptions.create().setData(getStoreWithDetailsPayload)).text();

        GetStoreWithDetailsResponse getStoreWithDetailsResponse = new Gson().fromJson(response, GetStoreWithDetailsResponse.class);

        assertTrue(getStoreWithDetailsResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_INVITATION_ROLES + " Method = GET", priority = 4)
    public void getInvitationRoles() {
        String response = getApiRequestContext().get(UserServiceParameters.GET_INVITATION_ROLES).text();

        GetInvitationRolesResponse getInvitationRolesResponse = new Gson().fromJson(response, GetInvitationRolesResponse.class);

        assertTrue(getInvitationRolesResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.INVITE_CONSULTANT + " Method = POST", priority = 5)
    public void inviteConsultant() {
        InviteConsultantPayload inviteConsultantPayload = new InviteConsultantPayload();

        inviteConsultantPayload.setStoreNo(testStoreNo);
        inviteConsultantPayload.setToEmail(Util.generateRandomString(10) + "@sensat.com");

        ArrayList<Integer> roles = new ArrayList<>();
        roles.add(3);
        roles.add(7);
        roles.add(8);

        inviteConsultantPayload.setConsultantTypes(roles);

        String response = getApiRequestContext().post(UserServiceParameters.INVITE_CONSULTANT, RequestOptions.create().setData(inviteConsultantPayload)).text();

        InviteConsultantResponse inviteConsultantResponse = new Gson().fromJson(response, InviteConsultantResponse.class);

        assertTrue(inviteConsultantResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_WAITING_FOR_CONSULTANTS_BY_STORE_ID + " Method = POST", priority = 6)
    public void getWaitingForConsultantsByStoreId() {
        GetWaitingForConsultantsByStoreIdPayload getWaitingForConsultantsByStoreIdPayload = new GetWaitingForConsultantsByStoreIdPayload();

        getWaitingForConsultantsByStoreIdPayload.setStoreNo(testStoreNo);

        String response = getApiRequestContext().post(UserServiceParameters.GET_WAITING_FOR_CONSULTANTS_BY_STORE_ID, RequestOptions.create().setData(getWaitingForConsultantsByStoreIdPayload)).text();

        GetWaitingForConsultantsByStoreIdResponse getWaitingForConsultantsByStoreIdResponse = new Gson().fromJson(response, GetWaitingForConsultantsByStoreIdResponse.class);

        deletedInviteConsultantId = getWaitingForConsultantsByStoreIdResponse.getData().get(getWaitingForConsultantsByStoreIdResponse.getData().size() - 1).getId();

        assertTrue(getWaitingForConsultantsByStoreIdResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.DELETE_CONSULTANT_INVITATION + " Method = POST", priority = 7)
    public void deleteConsultantInvitation() {
        DeleteConsultantInvitationPayload deleteConsultantInvitationPayload = new DeleteConsultantInvitationPayload();

        deleteConsultantInvitationPayload.setInvitationId(Integer.parseInt(deletedInviteConsultantId));
        deleteConsultantInvitationPayload.setStoreNo(testStoreNo);

        String response = getApiRequestContext().post(UserServiceParameters.DELETE_CONSULTANT_INVITATION, RequestOptions.create().setData(deleteConsultantInvitationPayload)).text();

        DeleteConsultantInvitationResponse deleteConsultantInvitationResponse = new Gson().fromJson(response, DeleteConsultantInvitationResponse.class);

        assertTrue(deleteConsultantInvitationResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_CONSULTANTS_BY_STORE + " Method = POST", priority = 8)
    public void getConsultantsByStore() {
        GetConsultantsByStorePayload getConsultantsByStorePayload = new GetConsultantsByStorePayload();

        getConsultantsByStorePayload.setStoreNo(testStoreNo);

        Pagination pagination = new Pagination();
        pagination.setCurrentPage(1);
        pagination.setTake(10);

        getConsultantsByStorePayload.setPagination(pagination);

        String response = getApiRequestContext().post(UserServiceParameters.GET_CONSULTANTS_BY_STORE, RequestOptions.create().setData(getConsultantsByStorePayload)).text();

        GetConsultantsByStoreResponse getConsultantsByStoreResponse = new Gson().fromJson(response, GetConsultantsByStoreResponse.class);

        assertTrue(getConsultantsByStoreResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_SELECTED_CONSULTANT_ROLES + " Method = POST", priority = 9)
    public void getSelectedConsultantRoles() {
        GetSelectedConsultantRolesPayload getSelectedConsultantRolesPayload = new GetSelectedConsultantRolesPayload();

        getSelectedConsultantRolesPayload.setStoreNo("202316RH78HPXYS");
        getSelectedConsultantRolesPayload.setConsultantNo("3BIK8ORH1WC27GF");

        String response = getApiRequestContext().post(UserServiceParameters.GET_SELECTED_CONSULTANT_ROLES, RequestOptions.create().setData(getSelectedConsultantRolesPayload)).text();

        GetSelectedConsultantRolesResponse getSelectedConsultantRolesResponse = new Gson().fromJson(response, GetSelectedConsultantRolesResponse.class);

        assertTrue(getSelectedConsultantRolesResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_CONSULTANTS + " Method = POST", priority = 10)
    public void getConsultants() {
        GetConsultantsPayload getConsultantsPayload = new GetConsultantsPayload();

        org.sensat.test.user.payload.getConsultants.Pagination pagination = new org.sensat.test.user.payload.getConsultants.Pagination();
        pagination.setCurrentPage(1);
        pagination.setTake(10);

        getConsultantsPayload.setPagination(pagination);

        String response = getApiRequestContext().post(UserServiceParameters.GET_CONSULTANTS, RequestOptions.create().setData(getConsultantsPayload)).text();

        GetConsultantsResponse getConsultantsResponse = new Gson().fromJson(response, GetConsultantsResponse.class);

        assertTrue(getConsultantsResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USER_STORES + " Method = GET", priority = 11)
    public void getUserStores() {
        String response = getApiRequestContext().get(UserServiceParameters.GET_USER_STORES).text();

        GetUserStoresResponse getUserStoresResponse = new Gson().fromJson(response, GetUserStoresResponse.class);

        assertTrue(getUserStoresResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_STORE_CONSULTANTS_BY_STORES_ID + " Method = GET", priority = 12)
    public void getStoreConsultantsByStoresId() {
        String response = getApiRequestContext().get(UserServiceParameters.GET_STORE_CONSULTANTS_BY_STORES_ID, RequestOptions.create().setQueryParam("storeId", 556)).text();

        GetStoreConsultantsByStoreIdaResponse getStoreConsultantsByStoresIdResponse = new Gson().fromJson(response, GetStoreConsultantsByStoreIdaResponse.class);

        assertTrue(getStoreConsultantsByStoresIdResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_SELLER_INFO + " Method = GET", priority = 13)
    public void getSellerInfo() {
        String response = getApiRequestContext().get(UserServiceParameters.GET_SELLER_INFO, RequestOptions.create().setQueryParam("storeId", 564).setQueryParam("sellerId", 360)).text();

        GetSellerInfoResponse getSellerInfoResponse = new Gson().fromJson(response, GetSellerInfoResponse.class);

        assertTrue(getSellerInfoResponse.isSuccess());
    }

}
