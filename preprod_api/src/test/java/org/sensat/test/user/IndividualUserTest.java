package org.sensat.test.user;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.base.IndividualAccount;
import org.sensat.constant.SecurityKey;
import org.sensat.constant.UserServiceParameters;
import org.sensat.test.user.payload.GetIsStoreExistPayload;
import org.sensat.test.user.response.checkIfUserCanCreateAdvertisement.CheckIfUserCanCreateAdvertisementResponse;
import org.sensat.test.user.response.getIsStoreExist.GetIsStoreExistResponse;
import org.sensat.test.user.payload.*;
import org.sensat.test.user.response.*;
import org.sensat.test.user.response.getStoreByStoreId.GetStoreByStoreIdResponse;
import org.sensat.test.user.response.getUserAgreementTexts.GetUserAgreementTextsResponse;
import org.sensat.test.user.response.getUserBlocks.GetUserBlocksResponse;
import org.sensat.test.user.response.getAllCities.GetAllCitiesResponse;
import org.sensat.test.user.response.getAuthorizedUserInfo.GetAuthorizedUserInfoResponse;
import org.sensat.test.user.response.getContactPermissions.GetContactPermissionsResponse;
import org.sensat.test.user.response.getNeighborhoodsByTownIdResponse.GetNeighborhoodsByTownIdResponse;
import org.sensat.test.user.response.getNotificationPermission.GetNotificationPermissionResponse;
import org.sensat.test.user.response.getTaxAdministrationsByCityResponse.GetTaxAdministrationsByCityResponse;
import org.sensat.test.user.response.getToken.GetTokenResponse;
import org.sensat.test.user.response.getTownsByCityId.GetTownsByCityIdResponse;
import org.sensat.test.user.response.refreshToken.RefreshTokenResponse;
import org.sensat.test.user.response.updateUserDetails.UpdateUserDetailsResponse;
import org.sensat.test.user.response.userGetAddresess.UserGetAddressResponse;
import org.sensat.test.user.response.viewUserHistory.ViewUserHistoryResponse;
import org.sensat.test.user.response.viewUserHistoryDetails.ViewUserHistoryDetailsResponse;
import org.sensat.util.Util;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class IndividualUserTest extends IndividualAccount {

    private int beDeletedAddressId;
    private int beUpdatedAddressId;
    private int beCurrentAddressId;
    private String refreshToken;
    private int blockUserId;

    private APIRequestContext getApiRequestContext() {
        headers.put("servicesecuritykey", SecurityKey.USER_SECURITY_KEY);
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(UserServiceParameters.USER_PREPROD_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = UserServiceParameters.CREATE_ADDRESS + " Method = POST")
    public void createAddress() {
        CreateAddressPayload createAddressPayload = new CreateAddressPayload();

        String randomCode = Util.generateRandomCode();

        createAddressPayload.setAddressTitle("Adres Title Demo " + randomCode);
        createAddressPayload.setAddressDetail("Adres Detail Demo " + randomCode);
        createAddressPayload.setCityId(16);
        createAddressPayload.setTownId(202);
        createAddressPayload.setNeighborhoodId(15693);

        createAddressPayload.setCurrent(true);

        String response = getApiRequestContext().post(UserServiceParameters.CREATE_ADDRESS, RequestOptions.create().setData(createAddressPayload)).text();

        CreateAddressResponse createAddressResponse = new Gson().fromJson(response, CreateAddressResponse.class);

        assertTrue(createAddressResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_ADDRESSES + "  Method = GET", priority = 1)
    public void getAddresses() {
        GetAddressPayload userGetAddress = new GetAddressPayload();

        String response = getApiRequestContext().get(UserServiceParameters.GET_ADDRESSES, RequestOptions.create().setData(userGetAddress)).text();

        UserGetAddressResponse userGetAddressResponse = new Gson().fromJson(response, UserGetAddressResponse.class);

        beDeletedAddressId = userGetAddressResponse.getData().get(userGetAddressResponse.getData().size() - 1).getAddressId();
        beUpdatedAddressId = userGetAddressResponse.getData().get(0).getAddressId();
        beCurrentAddressId = userGetAddressResponse.getData().get(userGetAddressResponse.getData().size() - 2).getAddressId();

        assertTrue(userGetAddressResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.DELETE_ADDRESS + " Method = POST", priority = 2)
    public void deleteAddress() {
        DeleteAddressPayload deleteAddressPayload = new DeleteAddressPayload();

        deleteAddressPayload.setAddressId(beDeletedAddressId);

        String response = getApiRequestContext().post(UserServiceParameters.DELETE_ADDRESS, RequestOptions.create().setData(deleteAddressPayload)).text();

        DeleteAddressResponse deleteAddressResponse = new Gson().fromJson(response, DeleteAddressResponse.class);

        assertTrue(deleteAddressResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.UPDATE_ADDRESS + " Method = POST", priority = 3)
    public void updateAddress() {
        UpdateAddressPayload updateAddressPayload = new UpdateAddressPayload();

        String randomCode = Util.generateRandomCode();

        updateAddressPayload.setAddressId(beUpdatedAddressId);

        updateAddressPayload.setAddressTitle("Adres Title Demo " + randomCode);
        updateAddressPayload.setAddressDetail("Adres Detail Demo " + randomCode);
        updateAddressPayload.setCityId(16);
        updateAddressPayload.setTownId(202);
        updateAddressPayload.setNeighborhoodId(15693);
        updateAddressPayload.setCurrent(true);

        String response = getApiRequestContext().post(UserServiceParameters.UPDATE_ADDRESS, RequestOptions.create().setData(updateAddressPayload)).text();

        UpdateAddressResponse updateAddressResponse = new Gson().fromJson(response, UpdateAddressResponse.class);

        assertTrue(updateAddressResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.UPDATE_ADDRESS_AS_CURRENT + " Method = POST", priority = 4)
    public void updateAddressAsCurrent() {
        UpdateAddressPayload updateAddressPayload = new UpdateAddressPayload();

        updateAddressPayload.setAddressId(beCurrentAddressId);

        String response = getApiRequestContext().post(UserServiceParameters.UPDATE_ADDRESS_AS_CURRENT, RequestOptions.create().setData(updateAddressPayload)).text();

        UpdateAddressResponse updateAddressResponse = new Gson().fromJson(response, UpdateAddressResponse.class);

        assertTrue(updateAddressResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_TOKEN + " Method = POST", priority = 5)
    public void getToken() {
        GetTokenPayload getTokenPayload = new GetTokenPayload(
                1,
                "bireysel@sensat.com",
                "Sensat2023",
                "refresh_token_nocaptcha"
        );

        String response = getApiRequestContext().post(UserServiceParameters.GET_TOKEN, RequestOptions.create().setData(getTokenPayload)).text();

        GetTokenResponse getTokenResponse = new Gson().fromJson(response, GetTokenResponse.class);

        refreshToken = getTokenResponse.getData().getRefreshToken();

        assertTrue(getTokenResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_AUTHORIZED_USER_INFO + " Method = POST", priority = 6)
    public void getAuthorizedUserInfo() {
        GetAuthorizedUserInfoPayload getAuthorizedUserInfoPayload = new GetAuthorizedUserInfoPayload();

        String response = getApiRequestContext().post(UserServiceParameters.GET_AUTHORIZED_USER_INFO, RequestOptions.create().setData(getAuthorizedUserInfoPayload)).text();

        GetAuthorizedUserInfoResponse getAuthorizedUserInfoResponse = new Gson().fromJson(response, GetAuthorizedUserInfoResponse.class);

        assertTrue(getAuthorizedUserInfoResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_ALL_CITIES + " Method = GET", priority = 7)
    public void getAllCities() {

        String response = getApiRequestContext().get(UserServiceParameters.GET_ALL_CITIES).text();

        GetAllCitiesResponse getAllCitiesResponse = new Gson().fromJson(response, GetAllCitiesResponse.class);

        assertTrue(getAllCitiesResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_TOWNS_BY_CITY_ID + " Method = POST", priority = 8)
    public void getTownsByCityId() {
        GetTownsByCityIdPayload getTownsByCityIdPayload = new GetTownsByCityIdPayload();

        getTownsByCityIdPayload.setCityId(16);

        String response = getApiRequestContext().post(UserServiceParameters.GET_TOWNS_BY_CITY_ID, RequestOptions.create().setData(getTownsByCityIdPayload)).text();

        GetTownsByCityIdResponse getTownsByCityIdResponse = new Gson().fromJson(response, GetTownsByCityIdResponse.class);

        assertTrue(getTownsByCityIdResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_NEIGHBORHOODS_BY_TOWN_ID + " Method = POST", priority = 9)
    public void getNeighborhoodsByTownId() {
        GetNeighborhoodsByTownIdPayload getNeighborhoodsByTownIdPayload = new GetNeighborhoodsByTownIdPayload();

        getNeighborhoodsByTownIdPayload.setTownId(202);

        String response = getApiRequestContext().post(UserServiceParameters.GET_NEIGHBORHOODS_BY_TOWN_ID, RequestOptions.create().setData(getNeighborhoodsByTownIdPayload)).text();

        GetNeighborhoodsByTownIdResponse getNeighborhoodsByTownIdResponse = new Gson().fromJson(response, GetNeighborhoodsByTownIdResponse.class);

        assertTrue(getNeighborhoodsByTownIdResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_TAX_ADMINISTRATIONS_BY_CITY_ID + " Method = POST", priority = 10)
    public void getTaxAdministrationsByCityId() {
        GetTaxAdministrationsByCityPayload getTaxAdministrationsByCityIdPayload = new GetTaxAdministrationsByCityPayload();

        getTaxAdministrationsByCityIdPayload.setCityId(16);

        String response = getApiRequestContext().post(UserServiceParameters.GET_TAX_ADMINISTRATIONS_BY_CITY_ID, RequestOptions.create().setData(getTaxAdministrationsByCityIdPayload)).text();

        GetTaxAdministrationsByCityResponse getTaxAdministrationsByCityResponse = new Gson().fromJson(response, GetTaxAdministrationsByCityResponse.class);

        assertTrue(getTaxAdministrationsByCityResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_NOTIFICATION_PERMISSION + " Method = GET", priority = 11)
    public void getNotificationPermission() {

        String response = getApiRequestContext().get(UserServiceParameters.GET_NOTIFICATION_PERMISSION).text();

        GetNotificationPermissionResponse getNotificationPermissionResponse = new Gson().fromJson(response, GetNotificationPermissionResponse.class);

        assertTrue(getNotificationPermissionResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_CONTACT_PERMISSIONS + " Method = GET", priority = 12)
    public void getContactPermissions() {

        String response = getApiRequestContext().get(UserServiceParameters.GET_CONTACT_PERMISSIONS).text();

        GetContactPermissionsResponse getContactPermissionsResponse = new Gson().fromJson(response, GetContactPermissionsResponse.class);

        assertTrue(getContactPermissionsResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.UPSERT_NOTIFICATION_PERMISSION_USER + " Method = POST", priority = 13)
    public void upsertNotificationPermissionUserTrue() {
        UpsertNotificationPermissionUserPayload upsertNotificationPermissionUserPayload = new UpsertNotificationPermissionUserPayload();

        upsertNotificationPermissionUserPayload.setNotificationPermissionId("6");
        upsertNotificationPermissionUserPayload.setSendMail(true);
        upsertNotificationPermissionUserPayload.setSendSms(true);

        String response = getApiRequestContext().post(UserServiceParameters.UPSERT_NOTIFICATION_PERMISSION_USER, RequestOptions.create().setData(upsertNotificationPermissionUserPayload)).text();

        UpsertNotificationPermissionUserResponse upsertNotificationPermissionUserResponse = new Gson().fromJson(response, UpsertNotificationPermissionUserResponse.class);

        assertTrue(upsertNotificationPermissionUserResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.UPSERT_NOTIFICATION_PERMISSION_USER + " Method = POST", priority = 14)
    public void upsertNotificationPermissionUserFalse() {
        UpsertNotificationPermissionUserPayload upsertNotificationPermissionUserPayload = new UpsertNotificationPermissionUserPayload();

        upsertNotificationPermissionUserPayload.setNotificationPermissionId("6");
        upsertNotificationPermissionUserPayload.setSendMail(true);
        upsertNotificationPermissionUserPayload.setSendSms(true);

        String response = getApiRequestContext().post(UserServiceParameters.UPSERT_NOTIFICATION_PERMISSION_USER, RequestOptions.create().setData(upsertNotificationPermissionUserPayload)).text();

        UpsertNotificationPermissionUserResponse upsertNotificationPermissionUserResponse = new Gson().fromJson(response, UpsertNotificationPermissionUserResponse.class);

        assertTrue(upsertNotificationPermissionUserResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.REFRESH_TOKEN + " Method = POST", priority = 98)
    public void refreshToken() {
        RefreshTokenPayload refreshTokenPayload = new RefreshTokenPayload();

        refreshTokenPayload.setRefreshToken(refreshToken);

        String response = getApiRequestContext().post(UserServiceParameters.REFRESH_TOKEN, RequestOptions.create().setData(refreshTokenPayload)).text();

        RefreshTokenResponse refreshTokenResponse = new Gson().fromJson(response, RefreshTokenResponse.class);

        refreshToken = refreshTokenResponse.getData().getRefreshToken();
        assertTrue(refreshTokenResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.UPDATE_CONTACT_PERMISSION + " Method = POST", priority = 16)
    public void updateContactPermissionFalse() {
        UpdateContactPermissionPayload updateContactPermissionPayload = new UpdateContactPermissionPayload();

        updateContactPermissionPayload.setCallingApprove(true);
        updateContactPermissionPayload.setSmsApprove(true);
        updateContactPermissionPayload.setMailingApprove(false);

        String response = getApiRequestContext().post(UserServiceParameters.UPDATE_CONTACT_PERMISSION, RequestOptions.create().setData(updateContactPermissionPayload)).text();

        UpdateContactPermissionResponse updateContactPermissionResponse = new Gson().fromJson(response, UpdateContactPermissionResponse.class);

        assertTrue(updateContactPermissionResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.UPDATE_CONTACT_PERMISSION + " Method = POST", priority = 17)
    public void updateContactPermissionFalseTrue() {
        UpdateContactPermissionPayload updateContactPermissionPayload = new UpdateContactPermissionPayload();

        updateContactPermissionPayload.setCallingApprove(true);
        updateContactPermissionPayload.setSmsApprove(true);
        updateContactPermissionPayload.setMailingApprove(true);

        String response = getApiRequestContext().post(UserServiceParameters.UPDATE_CONTACT_PERMISSION, RequestOptions.create().setData(updateContactPermissionPayload)).text();

        UpdateContactPermissionResponse updateContactPermissionResponse = new Gson().fromJson(response, UpdateContactPermissionResponse.class);

        assertTrue(updateContactPermissionResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.UPDATE_USER_DETAILS + " Method = POST", priority = 18)
    public void updateUserDetails() {
        UpdateUserDetailsPayload updateUserDetailsPayload = new UpdateUserDetailsPayload();

        String newName = "Sensat " + Util.generateRandomString(5);

        updateUserDetailsPayload.setAccountType(1);
        updateUserDetailsPayload.setBirthDate(null);
        updateUserDetailsPayload.setCitizenNumber(null);
        updateUserDetailsPayload.setGender(2);
        updateUserDetailsPayload.setName(newName);
        updateUserDetailsPayload.setSurname("Bireysel");
        updateUserDetailsPayload.setNewEmail("bireysel@sensat.com");
        updateUserDetailsPayload.setPhone("5000000000");

        String response = getApiRequestContext().post(UserServiceParameters.UPDATE_USER_DETAILS, RequestOptions.create().setData(updateUserDetailsPayload)).text();

        UpdateUserDetailsResponse updateUserDetailsResponse = new Gson().fromJson(response, UpdateUserDetailsResponse.class);

        assertTrue(updateUserDetailsResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.LOGOUT_USER + " Method = GET", priority = 99)
    public void logoutUser() {
        this.setup();
        String response = getApiRequestContext().get(UserServiceParameters.LOGOUT_USER).text();

        LogoutUserResponse logoutUserResponse = new Gson().fromJson(response, LogoutUserResponse.class);

        assertTrue(logoutUserResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.BLOCK_USER + " Method = POST", priority = 20)
    public void blockUser() {
        BlockUserPayload blockUserPayload = new BlockUserPayload();

        blockUserPayload.setBlockedUserId(343);
        blockUserPayload.setStoreId(579);
        blockUserPayload.setBlockReasonTypeId(2);

        String response = getApiRequestContext().post(UserServiceParameters.BLOCK_USER, RequestOptions.create().setData(blockUserPayload)).text();

        BlockUserResponse blockUserResponse = new Gson().fromJson(response, BlockUserResponse.class);

        assertTrue(blockUserResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USER_BLOCKS + " Method = GET", priority = 21)
    public void getUserBlocks() {
        String response = getApiRequestContext().get(UserServiceParameters.GET_USER_BLOCKS).text();

        GetUserBlocksResponse getUserBlocksResponse = new Gson().fromJson(response, GetUserBlocksResponse.class);

        blockUserId = getUserBlocksResponse.getData().get(0).getBlockId();

        assertTrue(getUserBlocksResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.UNBLOCK_USER + " Method = POST", priority = 22)
    public void unBlockUser() {
        UnBlockUserPayload unBlockUserPayload = new UnBlockUserPayload();

        unBlockUserPayload.setBlockId(blockUserId);

        String response = getApiRequestContext().post(UserServiceParameters.UNBLOCK_USER, RequestOptions.create().setData(unBlockUserPayload)).text();

        UnBlockUserResponse unBlockUserResponse = new Gson().fromJson(response, UnBlockUserResponse.class);

        assertTrue(unBlockUserResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_USER_AGREEMENT_TEXTS + " Method = GET", priority = 23)
    public void getUserAgreementTexts() {
        String response = getApiRequestContext().get(UserServiceParameters.GET_USER_AGREEMENT_TEXTS).text();

        GetUserAgreementTextsResponse getUserAgreementTextsResponse = new Gson().fromJson(response, GetUserAgreementTextsResponse.class);

        assertTrue(getUserAgreementTextsResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_IS_STORE_EXIST + " Method = POST", priority = 24)
    public void getIsStoreExist() {
        GetIsStoreExistPayload getIsStoreExistPayload = new GetIsStoreExistPayload();

        getIsStoreExistPayload.setPrefix("berkecan-dede");

        String response = getApiRequestContext().post(UserServiceParameters.GET_IS_STORE_EXIST, RequestOptions.create().setData(getIsStoreExistPayload)).text();

        GetIsStoreExistResponse getIsStoreExistResponse = new Gson().fromJson(response, GetIsStoreExistResponse.class);

        assertTrue(getIsStoreExistResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.GET_STORE_BY_STORE_ID + " Method = POST", priority = 25)
    public void getStoreByStoreId() {
        GetStoreByStoreIdPayload getStoreByStoreIdPayload = new GetStoreByStoreIdPayload();

        getStoreByStoreIdPayload.setStoreId(564);

        String response = getApiRequestContext().post(UserServiceParameters.GET_STORE_BY_STORE_ID, RequestOptions.create().setData(getStoreByStoreIdPayload)).text();

        GetStoreByStoreIdResponse getStoreByStoreIdResponse = new Gson().fromJson(response, GetStoreByStoreIdResponse.class);

        assertTrue(getStoreByStoreIdResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.VIEW_USER_HISTORY + " Method = POST", priority = 26)
    public void viewUserHistory() {
        ViewUserHistoryPayload viewUserHistoryPayload = new ViewUserHistoryPayload();

        viewUserHistoryPayload.setUserNo("ITVLLSFU3ZX0TBA");

        String response = getApiRequestContext().post(UserServiceParameters.VIEW_USER_HISTORY, RequestOptions.create().setData(viewUserHistoryPayload)).text();

        ViewUserHistoryResponse viewUserHistoryResponse = new Gson().fromJson(response, ViewUserHistoryResponse.class);

        assertTrue(viewUserHistoryResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.VIEW_USER_HISTORY_DETAILS + " Method = POST", priority = 27)
    public void viewUserHistoryDetails() {
        ViewUserHistoryDetailsPayload viewUserHistoryDetailsPayload = new ViewUserHistoryDetailsPayload();

        viewUserHistoryDetailsPayload.setHistoryId(287);

        String response = getApiRequestContext().post(UserServiceParameters.VIEW_USER_HISTORY_DETAILS, RequestOptions.create().setData(viewUserHistoryDetailsPayload)).text();

        ViewUserHistoryDetailsResponse viewUserHistoryDetailsResponse = new Gson().fromJson(response, ViewUserHistoryDetailsResponse.class);

        assertTrue(viewUserHistoryDetailsResponse.isSuccess());
    }

    @Test(description = UserServiceParameters.CHECK_IF_USER_CAN_CREATE_ADV + " Method = GET", priority = 7)
    public void checkIfUserCanCreateAdvertisement() {

        String response = getApiRequestContext().get(UserServiceParameters.CHECK_IF_USER_CAN_CREATE_ADV).text();

        CheckIfUserCanCreateAdvertisementResponse checkIfUserCanCreateAdvertisementResponse = new Gson().fromJson(response, CheckIfUserCanCreateAdvertisementResponse.class);

        assertTrue(checkIfUserCanCreateAdvertisementResponse.isSuccess());
    }


    @Test(description = UserServiceParameters.PASSWORD_RECOVERY + " Method = POST", priority = 28)
    public void passwordRecovery() {
        PasswordRecoveryPayload passwordRecoveryPayload = new PasswordRecoveryPayload();

        passwordRecoveryPayload.setEmail("bireysel@sensat.com");
        passwordRecoveryPayload.setCaptchaToken("");

        String response = getApiRequestContext().post(UserServiceParameters.PASSWORD_RECOVERY, RequestOptions.create().setData(passwordRecoveryPayload)).text();

        PasswordRecoveryResponse passwordRecoveryResponse = new Gson().fromJson(response, PasswordRecoveryResponse.class);

        assertTrue(passwordRecoveryResponse.isSuccess());
    }

    /*@Test(description = UserServiceParameters.CHANGE_ACCOUNT + " Method = POST", priority = 99)
    public void changeAccount() {
        ChangeAccountPayload changeAccountPayload = new ChangeAccountPayload();

        changeAccountPayload.setRefreshToken(refreshToken);

        String response = getApiRequestContext().post(UserServiceParameters.CHANGE_ACCOUNT, RequestOptions.create().setData(changeAccountPayload)).text();

        ChangeAccountResponse changeAccountResponse = new Gson().fromJson(response, ChangeAccountResponse.class);

        assertTrue(changeAccountResponse.isSuccess());
    }*/

}
