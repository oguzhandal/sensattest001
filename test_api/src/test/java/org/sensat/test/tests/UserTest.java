package org.sensat.test.tests;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.expectedData.user.*;
import org.sensat.base.BaseTest;
import org.sensat.constant.Parameters;
import org.sensat.test.request.user.*;
import org.sensat.test.request.user.UserGetConsultants.GetConsultantsRequest;
import org.sensat.test.request.user.UserGetConsultants.Pagination;
import org.sensat.test.request.user.UserGetConsultantsByStore.GetUserConsultantsByStoreRequest;
import org.sensat.test.response.user.CreateAddresess.UserCreateAddresessResp;
import org.sensat.test.response.user.CreateStoreResponse;
import org.sensat.test.response.user.DeleteProfilePhoto.DeleteProfilePhotoResponse;
import org.sensat.test.response.user.GetActiveStoresByUser.GetActiveStoresByUserResponse;
import org.sensat.test.response.user.GetAllCities.UserGetAllCitiesResponse;
import org.sensat.test.response.user.GetAllTowns.UserGetAllTownsResponse;
import org.sensat.test.response.user.GetChangeEmail.GetChangeEmailResponse;
import org.sensat.test.response.user.GetCityName.GetCityNameResponse;
import org.sensat.test.response.user.GetConsultantsByStore.GetConsultantsByStoreResponse;
import org.sensat.test.response.user.GetContactPermissions.GetContactPermissionsResponse;
import org.sensat.test.response.user.GetInvitationRoles.GetInvitationRolesResponse;
import org.sensat.test.response.user.GetNeighborhoodsByTownId.GetNeighborhoodsByTownIdResponse;
import org.sensat.test.response.user.GetNotificationPermission.GetNotificationPermissionResponse;
import org.sensat.test.response.user.GetSellerInfo.GetSellerInfoResponse;
import org.sensat.test.response.user.GetStoreConsultantsByStoreId.GetStoreConsultantsByStoreIdResponse;
import org.sensat.test.response.user.GetStoreDetailsForAdvertisement.GetStoreDetailsForAdvertisementResponse;
import org.sensat.test.response.user.GetStoreWithDetails.GetStoreWithDetailsResponse;
import org.sensat.test.response.user.GetStoresByUser.GetStoresByUserResponse;
import org.sensat.test.response.user.GetTownByCityId.GetTownByCityIdResponse;
import org.sensat.test.response.user.GetUserConsultants.GetUserConsultantsResponse;
import org.sensat.test.response.user.GetUserDetailsForAdvertisement.GetUserDetailsForAdvertisementResponse;
import org.sensat.test.response.user.GetUserMailDetailsForAdvertisement.GetUserMailDetailsForAdvertisementResponse;
import org.sensat.test.response.user.GetUserStores.GetUserStoresResponse;
import org.sensat.test.response.user.LogoutUser.LogoutUserResponse;
import org.sensat.test.response.user.PasswordRecovery.PasswordRecovery;
import org.sensat.test.response.user.UpdateAddresess.UserUpdateAddresessResponse;
import org.sensat.test.response.user.UpdateContactPermission.UpdateContactPermissionResponse;
import org.sensat.test.response.user.UpdateStoreLogo.UserUpdateStoreLogoResponse;
import org.sensat.test.response.user.UserDeleteAdresess.UserDeleteAddresessResponse;
import org.sensat.test.response.user.UserGetAddresess.UserGetAddresessResponse;
import org.sensat.test.response.user.UsergetAuthorizedUserInfo.UsergetAuthInfoResponse;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;

import static org.testng.AssertJUnit.assertTrue;

public class UserTest extends BaseTest {

    @Test(description = "User a kayıtlı tüm adresleri çağırma (UsId:2002)")
    public void UsergetAddresses() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserGetAddresess userGetAddresess = new UserGetAddresess();
        String resp = apiRequestContext.get(Parameters.USERGETADDRESESS, RequestOptions.create().setData(userGetAddresess)).text();
        System.out.println(resp);
        UserGetAddresessResponse userGetAddresessResponse = new Gson().fromJson(resp, UserGetAddresessResponse.class);
        assertTrue(userGetAddresessResponse.isSuccess());
    }

    @Test(description = "Belirtilen User a yeni adres ekleme  (UsId:2001)")
    public void UserCreateAddress() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserCreateAddresess userCreateAddresess = new UserCreateAddresess();
        userCreateAddresess.setAddressTitle("Berke Test");
        userCreateAddresess.setAddressDetail("test36");
        userCreateAddresess.setCityId(1);
        userCreateAddresess.setTownId(1);
        userCreateAddresess.setNeighborhoodId(1);
        userCreateAddresess.setCurrent(true);
        String resp = apiRequestContext.post(Parameters.CreateAdresses, RequestOptions.create().setData(userCreateAddresess)).text();
        System.out.println(resp);
        UserCreateAddresessResp userCreateAddresessResp = new Gson().fromJson(resp, UserCreateAddresessResp.class);
        assertTrue(userCreateAddresessResp.isSuccess());
    }

    @Test(description = "Belirtilen User ın adresini güncelleme (UsId:2003)")
    public void UserUpdateAddresess() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserUpdateAddresess userUpdateAddresess = new UserUpdateAddresess();
        userUpdateAddresess.setAddressId(610);
        userUpdateAddresess.setAddressTitle("Otomasyon Test Silmeyin!");
        userUpdateAddresess.setAddressDetail("test");
        userUpdateAddresess.setCityId(1);
        userUpdateAddresess.setTownId(1);
        userUpdateAddresess.setNeighborhoodId(1);
        userUpdateAddresess.setCurrent(true);
        String resp = apiRequestContext.post(Parameters.UserUpdateAddresess, RequestOptions.create().setData(userUpdateAddresess)).text();
        System.out.println(resp);

        UserUpdateAddresessResponse userUpdateAddresessResponse = new Gson().fromJson(resp, UserUpdateAddresessResponse.class);
        assertTrue(userUpdateAddresessResponse.isSuccess());
    }

    @Test(description = "Belirtilen User ın adresini silme (güncel adres)(UsId:2004) ")
    public void UserDeleteAddresses() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        UserDeleteAddresess userDeleteAddresess = new UserDeleteAddresess();
        userDeleteAddresess.setAddressId(201);
        String resp = apiRequestContext.post(Parameters.UserDeleteAddresess, RequestOptions.create().setData(userDeleteAddresess)).text();
        //System.out.println(resp);
        UserDeleteAddresessResponse userDeleteAddresessResponse = new Gson().fromJson(resp, UserDeleteAddresessResponse.class);
        assertTrue(!userDeleteAddresessResponse.isSuccess());
    }

    @Test(description = "Tüm Şehirleri Listele (UsId:2006) ")
    public void UserGetAllCities() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        String resp = apiRequestContext.get(Parameters.UserGetAllCities).text();
        System.out.println(resp);
        UserGetAllCitiesResponse userGetAllCitiesResponse = new Gson().fromJson(resp, UserGetAllCitiesResponse.class);
        assertTrue(userGetAllCitiesResponse.isSuccess());
    }

    @Test(description = "Seçilen İldeki İlçeleri Listele (UsId:2008)")
    public void UserGetTownsByCityId() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        UserGetTownByCityId userGetTownByCityId = new UserGetTownByCityId();
        userGetTownByCityId.setCityId(1);
        String resp = apiRequestContext.post(Parameters.UserGetTownsByCityId, RequestOptions.create().setData(userGetTownByCityId)).text();
        // System.out.println(resp);
        GetTownByCityIdResponse getTownByCıtyIdResponse = new Gson().fromJson(resp, GetTownByCityIdResponse.class);
        assertTrue(getTownByCıtyIdResponse.isSuccess());
        //System.out.println("Başarılı : " + getTownByCıtyIdResponse.getResponseMessage());
    }

    @Test(description = "Belirtilen ilçenin mahallelerini listeleme (UsId:2009)")
    public void UserGetNeighborhoodsByTownId() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        UserGetNeighborhoodsByTownId userGetNeighborhoodsByTownId = new UserGetNeighborhoodsByTownId();
        userGetNeighborhoodsByTownId.setTownId(1);
        String resp = apiRequestContext.post(Parameters.UserGetNeighborhoodsByTownId, RequestOptions.create().setData(userGetNeighborhoodsByTownId)).text();
        // System.out.println(resp);
        GetNeighborhoodsByTownIdResponse getNeighborhoodsByTownIdResponse = new Gson().fromJson(resp, GetNeighborhoodsByTownIdResponse.class);
        assertTrue(getNeighborhoodsByTownIdResponse.isSuccess());
        //System.out.println("Başarılı : " + getNeighborhoodsByTownIdResponse.getResponseMessage());
    }

    /*@Test(description = "Tüm Vergi Dairelerini Listele (UsId:2010)")
    public void UserGetAllTaxAdministrations(){
        apiRequestContext=playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        String resp = apiRequestContext.get(Parameters.UserGetAllTaxAdministrations).text();
        // System.out.println(resp);
        UserGetAllTaxAdministrationsResponse userGetAllTaxAdministrationsResponse=new Gson().fromJson(resp,UserGetAllTaxAdministrationsResponse.class);
        assertTrue(userGetAllTaxAdministrationsResponse.isSuccess());
    }*/

    // servis = user/getCityName: (test ortamında otomasyon kodu yazılmamış) // tekrar test edilmeli
    // bu servis success, responseMessage ve responseCode değerleri dönmüyor
    @Test(description = "Şehir adını getirme")
    public void GetCityName() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserGetCityNameRequest userGetCityNameRequest = new UserGetCityNameRequest();
        userGetCityNameRequest.setCityId(16);
        String response = apiRequestContext.post(Parameters.UserGetCityName, RequestOptions.create().setData(userGetCityNameRequest)).text();

        System.out.println(response);

        GetCityNameResponse getCityNameResponse = new Gson().fromJson(response, GetCityNameResponse.class);
        Assert.assertEquals(GetCityNameData.GetCityName, getCityNameResponse.getCityName());
        // assertTrue(getCityNameResponse.isSuccess());
    }

    @Test(description = "İletişim İzinlerini Getir (UsId:2014)")
    //bakılacak
    public void UserGetContactPermissions() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        String resp = apiRequestContext.get(Parameters.UserGetContactPermissions).text();
        //System.out.println(resp);
        GetContactPermissionsResponse getContactPermissionsResponse = new Gson().fromJson(resp, GetContactPermissionsResponse.class);
        assertTrue(getContactPermissionsResponse.isSuccess());
        // System.out.println("Başarılı : " + getContactPermissionsResponse.getResponseMessage());

    }

    @Test(description = "İletişim İzinlerini Güncelle")
    public void UserUpdateContactPermissions() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        UserUpdateContactPermissions userUpdateContactPermissions = new UserUpdateContactPermissions();
        userUpdateContactPermissions.setCallingApprove(true);
        userUpdateContactPermissions.setSmsApprove(true);
        userUpdateContactPermissions.setMailingApprove(true);
        String resp = apiRequestContext.post(Parameters.UserUpdateContactPermissions, RequestOptions.create().setData(userUpdateContactPermissions)).text();
        // System.out.println(resp);
        UpdateContactPermissionResponse updateContactPermissionResponse = new Gson().fromJson(resp, UpdateContactPermissionResponse.class);
        assertTrue(!updateContactPermissionResponse.isSuccess());

    }

    @Test(description = "Mağaza Oluştur")
    public void UserCreateStore() throws IOException {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.USER_TEST_URL)
                .setExtraHTTPHeaders(headers));

        String storeRandomCode = String.valueOf(ThreadLocalRandom.current().nextInt()).replace("-", "");

        byte[] fileContentMedia = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/test/image/store.jpg"));
        String encodedStringMedia = Base64.getEncoder().encodeToString(fileContentMedia);

        byte[] fileContentExpert = FileUtils.readFileToByteArray(new File("src/test/java/org/sensat/test/document/sample_document.pdf"));
        String encodedStringExpert = Base64.getEncoder().encodeToString(fileContentExpert);

        CreateStoreRequest request = new CreateStoreRequest();
        request.setTitle("Otomasyon Mağaza " + storeRandomCode);
        request.setAbout("Otomasyon Açıklama " + storeRandomCode);
        request.setLogoUrl("data:image/jpeg;base64," + encodedStringMedia);
        request.setCertificateNo(storeRandomCode.substring(0, 8));
        request.setTaxPlate("data:application/pdf;base64," + encodedStringExpert);
        request.setTradeRegistryGazette("data:application/pdf;base64," + encodedStringExpert);
        request.setVehicleTradeAuthorizationCertificate("data:application/pdf;base64," + encodedStringExpert);
        request.setWorkPhone("5350830145");
        request.setPhone("5350830145");
        request.setDocumentValidityDate("01/01/28");
        request.setWorkDaysBusinessTime("08:00-15:00");
        request.setAddressDetail("Adres Detay");
        request.setTownId(1);
        request.setCityId(1);

        String requestResponse = apiRequestContext.post(Parameters.UserCreateStore, RequestOptions.create().setData(request)).text();

        CreateStoreResponse response = new Gson().fromJson(requestResponse, CreateStoreResponse.class);

        assertTrue(response.isSuccess());
    }

    /* @Test(description = "Mağaza Sil")
    public void UserDeleteStore(){
        apiRequestContext=playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
       UserDeleteStore userDeleteStore=new UserDeleteStore();
        userDeleteStore.setStoreId(90);
        String resp = apiRequestContext.post(Parameters.UserDeleteStore,RequestOptions.create().setData(userDeleteStore)).text();
         //System.out.println(resp);
        UserDeleteStoreResponse userDeleteStoreResponse=new Gson().fromJson(resp,UserDeleteStoreResponse.class);
        assertTrue(!userDeleteStoreResponse.isSuccess());
    } */

    /*@Test(description = "Mağaza Bilgilerini Güncelle")
    public void UserUpdateStore(){
        apiRequestContext=playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        //Request//
        UserUpdateStore userUpdateStore=new UserUpdateStore();
        userUpdateStore.setStoreId(41);
        userUpdateStore.setTitle("BMW & Mercedes Store");
        userUpdateStore.setLogoUrl("https://logopond.com/logos/14f5b64e1de45d2759e9dbafb6e91ee1.png");
        userUpdateStore.setAbout("test");
        userUpdateStore.setBusinessLicenseUrl("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
        userUpdateStore.setVehicleTradeAuthorizationCertificateUrl("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
        userUpdateStore.setCertificateNo("122547");
        userUpdateStore.setWorkPhone("5467862706");
        userUpdateStore.setPhone("5467862706");
        userUpdateStore.setDocumentValidityDate("12/45/98");
        userUpdateStore.setWorkDaysBusinessTime("");
        userUpdateStore.setSaturdayBusinessTime("");
        userUpdateStore.setSaturdayBusinessTime("");
        userUpdateStore.setAddressDetail("testtest");
        userUpdateStore.setTownId(64);
        userUpdateStore.setCityId(6);
        //Response//
        String resp = apiRequestContext.post(Parameters.UserUpdateStore,RequestOptions.create().setData(userUpdateStore)).text();
         //System.out.println(resp);
        UserUpdateStoreResponse userUpdateStoreResponse=new Gson().fromJson(resp,UserUpdateStoreResponse.class);
        //Control//
        assertTrue(userUpdateStoreResponse.isSuccess());
    } */

    @Test(description = "Aktif User Bilgilerini Listeleme")
    public void UsergetAuthorizedUserInfo() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        UsergetAuthInfo usergetAuthInfo = new UsergetAuthInfo();
        String resp = apiRequestContext.post(Parameters.UsergetAuthorizedUserInfo, RequestOptions.create().setData(usergetAuthInfo)).text();
        UsergetAuthInfoResponse usergetAuthInfoResponse = new Gson().fromJson(resp, UsergetAuthInfoResponse.class);
        //System.out.println(resp);
        assertTrue(usergetAuthInfoResponse.isSuccess());
        Assert.assertEquals(UserGetAuthInfo.UserGetAuthInfoSurname, usergetAuthInfoResponse.data.surname);
        System.out.println("Basarili : " + usergetAuthInfoResponse.getResponseMessage());

    }

    @Test(description = "Aktif User Güncel Adresini Değiştirme")
    public void UserupdateAddressAsCurrent() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserupdateAddressAsCurrent userupdateAddressAsCurrent = new UserupdateAddressAsCurrent();
        userupdateAddressAsCurrent.setAddressId(610);
        String resp = apiRequestContext.post(Parameters.UserUpdateAddressAsCurrent, RequestOptions.create().setData(userupdateAddressAsCurrent)).text();
        UsergetAuthInfoResponse usergetAuthInfoResponse = new Gson().fromJson(resp, UsergetAuthInfoResponse.class);
        System.out.println(resp);
        assertTrue(usergetAuthInfoResponse.isSuccess());
        //Assert.assertEquals(UserGetAuthInfo.UserGetAuthInfoSurname,usergetAuthInfoResponse.data.surname);
        System.out.println("Basarili : " + usergetAuthInfoResponse.getResponseMessage());

    }

    @Test(description = "User a ait mağazaları listeleme")
    public void UserGetStoresByUser() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        String resp = apiRequestContext.get(Parameters.UserGetStoresByUser).text();
        System.out.println(resp);
        GetStoresByUserResponse getStoresByUserResponse = new Gson().fromJson(resp, GetStoresByUserResponse.class);
        assertTrue(getStoresByUserResponse.isSuccess());

        // Assert.assertEquals(UserGetStoresByUser.UserGetStoresByUserTitle,getStoresByUserResponse.data.get(0).title);

    }

    @Test(description = "Mağaza İlan Detayı Listeleme")
    public void UserGetStoreDetailsForAdvertisement() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        UserGetStoreDetailsForAdvertisement userGetStoreDetailsForAdvertisement = new UserGetStoreDetailsForAdvertisement();
        userGetStoreDetailsForAdvertisement.setUserId(122);
        userGetStoreDetailsForAdvertisement.setStoreId(58);
        String resp = apiRequestContext.post(Parameters.UserGetStoreDetailsForAdvertisement, RequestOptions.create().setData(userGetStoreDetailsForAdvertisement)).text();
        GetStoreDetailsForAdvertisementResponse getStoreDetailsForAdvertisementResponse = new Gson().fromJson(resp, GetStoreDetailsForAdvertisementResponse.class);
        //System.out.println(resp);
        //assertTrue(getStoreDetailsForAdvertisementResponse.isSuccess());
        Assert.assertEquals(GetStoreDetailsForAdvertisementData.GetStoreDetailsForAdvertisementTittle, getStoreDetailsForAdvertisementResponse.title);

    }

    @Test(description = "Mağaza Detayı Listeleme")
    public void UserGetStoreWithDetails() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        UsergetStoreWithDetails usergetStoreWithDetails = new UsergetStoreWithDetails();
        usergetStoreWithDetails.setStoreId(38);

        String resp = apiRequestContext.post(Parameters.UserGetStoreWithDetails, RequestOptions.create().setData(usergetStoreWithDetails)).text();
        GetStoreWithDetailsResponse getStoreWithDetailsResponse = new Gson().fromJson(resp, GetStoreWithDetailsResponse.class);
        //System.out.println(resp);
        assertTrue(getStoreWithDetailsResponse.isSuccess());
        Assert.assertEquals(UserGetStoreWithDetailsData.getStoreWithDetailsTitle, getStoreWithDetailsResponse.getData().title);
        //System.out.println("Başarılı : " + getStoresByUserResponse.getResponseMessage());

    }

    @Test(description = "Belirtilen Mağazanın Profil Fotoğrafını Güncelleme")
    public void UserupdateStoreLogo() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        UserUpdateStoreLogo userUpdateStoreLogo = new UserUpdateStoreLogo();
        userUpdateStoreLogo.setStoreId(38);
        userUpdateStoreLogo.setStoreLogo("https://logopond.com/logos/14f5b64e1de45d2759e9dbafb6e91ee1.png");


        String resp = apiRequestContext.post(Parameters.UserUpdateStoreLogo, RequestOptions.create().setData(userUpdateStoreLogo)).text();
        UserUpdateStoreLogoResponse userUpdateStoreLogoResponse = new Gson().fromJson(resp, UserUpdateStoreLogoResponse.class);
        // System.out.println(resp);
        assertTrue(userUpdateStoreLogoResponse.isSuccess());
        //Assert.assertEquals(UserGetStoreWithDetailsData.getStoreWithDetailsTitle,getStoreWithDetailsResponse.getData().title);

    }


    /*@Test(description = "Create Bireysel User")
    public void CreateUser (){
        apiRequestContext=playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserCreate userCreate=new UserCreate();
        userCreate.setDataProcessingConfirmation(true);
        userCreate.setKvkkApprove(true);
        userCreate.setName("Test Otomasyon");
        userCreate.setSurname("test Otomasyon");
        userCreate.setEmail("test@otomasyon.com");
        userCreate.setPassword("Tema1122");
        userCreate.setPasswordAgain("Tema1122");
        userCreate.setClientIpAddress("");
        userCreate.setPhone("5467862706");
        userCreate.setAccountType(1);
        userCreate.setCommercialTitle("");
        userCreate.setBusinessType(0);
        userCreate.setTaxAdministrationId(0);
        String resp = apiRequestContext.post(Parameters.UserCreate,RequestOptions.create().setData(userCreate)).text();
        CreateUserİndividualResponse createUserİndividualResponse=new Gson().fromJson(resp,CreateUserİndividualResponse.class);
        System.out.println(resp);
        assertTrue(!createUserİndividualResponse.isSuccess());
        Assert.assertEquals(CreateUserİndividual.CreateUserIndıvidualMessage,createUserİndividualResponse.responseMessage);
    }*/

    // servis = user/logoutUser (test ortamında yazılmamış)
    @Test(priority = 1, description = "Kullanıcı Çıkış Yapma")
    public void LogoutUser() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        // request body almadığı için Request içinde class'ını oluşturup burada kullanmamıza gerek kalmadı.

        String resp = apiRequestContext.get(Parameters.UserLogoutUser).text();
        System.out.println(resp);
        LogoutUserResponse logoutUserResponse = new Gson().fromJson(resp, LogoutUserResponse.class);
        assertTrue(logoutUserResponse.isSuccess());

        System.out.println(logoutUserResponse);
    }

    @Test(description = "Password yenileme maili")
    public void UserPasswordRecovery() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        UserPasswordRecovery userPasswordRecovery = new UserPasswordRecovery();
        userPasswordRecovery.setEmail("test.bireysel@gmail.com");
        String resp = apiRequestContext.post(Parameters.UserpasswordRecovery, RequestOptions.create().setData(userPasswordRecovery)).text();

        PasswordRecovery passwordRecovery = new Gson().fromJson(resp, PasswordRecovery.class);
        //System.out.println(resp);
        assertTrue(passwordRecovery.isSuccess());
        Assert.assertEquals(UserPasswordRecoveryData.passwordRecoveryData, passwordRecovery.responseMessage);

    }

    /* @Test(description = "Activasyon mail servisi")
    public void UsergetActivationEmail(){
        apiRequestContext=playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UsergetActivationEmail usergetActivationEmail=new UsergetActivationEmail();
        usergetActivationEmail.setEmail("test.bireysel@gmail.com");
        String resp = apiRequestContext.post(Parameters.UsergetActivationEmail,RequestOptions.create().setData(usergetActivationEmail)).text();

        GetActivationMailResponse getActivationMailResponse=new Gson().fromJson(resp,GetActivationMailResponse.class);
        //System.out.println(resp);
        assertTrue(!getActivationMailResponse.isSuccess());
        Assert.assertEquals(GetActivationMailData.GetActivationMailData,getActivationMailResponse.responseMessage);
    } */


    /*@Test(description = "User Password Yenileme")
    public void UserUpdatePassword(){
        apiRequestContext=playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserUpdatePassword userUpdatePassword=new UserUpdatePassword();
        userUpdatePassword.setNewPassword("Sensat123");
        userUpdatePassword.setNewPasswordAgain("Sensat123");
        userUpdatePassword.setOldPassword("Sensat123");
        String resp = apiRequestContext.post(Parameters.UserUpdatePassword,RequestOptions.create().setData(userUpdatePassword)).text();
        UpdatePasswordResponse updatePasswordResponse=new Gson().fromJson(resp,UpdatePasswordResponse.class);
        //System.out.println(resp);
        assertTrue(!updatePasswordResponse.isSuccess());
        Assert.assertEquals(UserUpdatePasswordData.UserUpdatePasswordData,updatePasswordResponse.responseMessage);
    } */

    /* @Test(description = "Hesabı Pasife Alma")
    public void UserCancelMembership(){
        apiRequestContext=playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserCancelMembershipRequest userCancelMembershipRequest=new UserCancelMembershipRequest();
        userCancelMembershipRequest.setPassive(true);

        String resp = apiRequestContext.post(Parameters.UserCancelMembership,RequestOptions.create().setData(userCancelMembershipRequest)).text();
        CancelMembershipResponse cancelMembershipResponse=new Gson().fromJson(resp,CancelMembershipResponse.class);
        // response'u swagger'dan mawol66305@cnogs.com hesabı için aldım

        System.out.println(resp);

        assertTrue(cancelMembershipResponse.isSuccess());
    } */

    @Test(description = "Email Değişikliği Onay Maili")
    public void UserGetChangeEmail() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        String resp = apiRequestContext.get(Parameters.UserGetChangeEmail).text();
        // System.out.println(resp);
        GetChangeEmailResponse getChangeEmailResponse = new Gson().fromJson(resp, GetChangeEmailResponse.class);
        Assert.assertEquals(UserGetChanceEmailData.UsergetChanceEmailData, getChangeEmailResponse.responseMessage);
        assertTrue(getChangeEmailResponse.isSuccess());
    }

    @Test(description = "Kullanıcı Profil Fotosu Silme")
    public void UserDeleteProfilePhoto() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        // request body almadığı için Request içinde class'ını oluşturup burada kullanmamıza gerek kalmadı.

        String resp = apiRequestContext.get(Parameters.UserDeleteProfilePhoto).text();
        // System.out.println(resp);
        DeleteProfilePhotoResponse deleteProfilePhotoResponse = new Gson().fromJson(resp, DeleteProfilePhotoResponse.class);
        assertTrue(deleteProfilePhotoResponse.isSuccess());

        System.out.println(deleteProfilePhotoResponse);
    }

    @Test(description = "Get User Details for Adv")
    public void GetUserDetailsForAdvertisement() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserGetUserDetailsForAdvertisementRequest userGetUserDetailsForAdvertisementRequest = new UserGetUserDetailsForAdvertisementRequest();
        userGetUserDetailsForAdvertisementRequest.setUserId(122);

        String resp = apiRequestContext.post(Parameters.UserGetUserDetailsForAdvertisement, RequestOptions.create().setData(userGetUserDetailsForAdvertisementRequest)).text();
        GetUserDetailsForAdvertisementResponse getUserDetailsForAdvertisementResponse = new Gson().fromJson(resp, GetUserDetailsForAdvertisementResponse.class);

        // System.out.println(resp);

        // assertTrue(updatePasswordResponse.isSuccess()); // response'da success, responseCode, responseMessage dönmüyor

        Assert.assertEquals("Sayın Berke", getUserDetailsForAdvertisementResponse.getName());
    }

    @Test(description = "Get User Mail Details")
    public void GetUserMailDetailsForAdvertisement() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserGetUserMailDetailsForAdvertisementRequest userGetUserMailDetailsForAdvertisementRequest = new UserGetUserMailDetailsForAdvertisementRequest();
        userGetUserMailDetailsForAdvertisementRequest.setUserId(122);

        String resp = apiRequestContext.post(Parameters.UserGetUserMailDetailsForAdvertisement, RequestOptions.create().setData(userGetUserMailDetailsForAdvertisementRequest)).text();

        GetUserMailDetailsForAdvertisementResponse getUserMailDetailsForAdvertisementResponse = new Gson().fromJson(resp, GetUserMailDetailsForAdvertisementResponse.class);

        System.out.println(resp);

        // assertTrue(updatePasswordResponse.isSuccess()); // response'da success, responseCode, responseMessage dönmüyor

        Assert.assertEquals("Sayın", getUserMailDetailsForAdvertisementResponse.getSurname());
    }

    // servis = user/getNotificationPermission // bunun test fonksiyonuna tekrar bakalım
    @Test(description = "Notification")
    public void GetNotificationPermission() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        UserGetNotificationPermissionRequest userGetNotificationPermissionRequest = new UserGetNotificationPermissionRequest();
        userGetNotificationPermissionRequest.setUserId(122);

        String resp = apiRequestContext.post(Parameters.UserGetNotificationPermission, RequestOptions.create().setData(userGetNotificationPermissionRequest)).text();

        GetNotificationPermissionResponse getNotificationPermissionResponse = new Gson().fromJson(resp, GetNotificationPermissionResponse.class);

        System.out.println(resp);

        assertTrue(getNotificationPermissionResponse.isSuccess());
    }

    @Test(description = "BE-Mevcut Tüm İlçeleri Listemele (US ID:2007)")
    public void UserGetAllTowns() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        String resp = apiRequestContext.get(Parameters.UserGetAllTowns).text();
        // System.out.println(resp);
        UserGetAllTownsResponse userGetAllTownsResponse = new Gson().fromJson(resp, UserGetAllTownsResponse.class);
        assertTrue(userGetAllTownsResponse.success);
    }

    @Test(description = "İletişim İzinlerini Güncelle")
    public void UserGetConsultants() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        GetConsultantsRequest request = new GetConsultantsRequest();
        request.setConsultantType(3);
        request.setPagination(new Pagination());
        request.getPagination().setCurrentPage(1);
        request.getPagination().setTake(10);

        String resp = apiRequestContext.post(Parameters.UserGetConsultants, RequestOptions.create().setData(request)).text();
        System.out.println(resp);

        GetUserConsultantsResponse getUserConsultantsResponse = new Gson().fromJson(resp, GetUserConsultantsResponse.class);
        assertTrue(getUserConsultantsResponse.isSuccess());
    }

    @Test(description = "İletişim İzinlerini Güncelle")
    public void UserGetConsultantsByStore() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        GetUserConsultantsByStoreRequest request = new GetUserConsultantsByStoreRequest();
        request.setStoreId(61);
        request.setPagination(new org.sensat.test.request.user.UserGetConsultantsByStore.Pagination());
        request.getPagination().setCurrentPage(1);
        request.getPagination().setTake(10);

        String resp = apiRequestContext.post(Parameters.UserGetConsultantsByStore, RequestOptions.create().setData(request)).text();

        System.out.println(resp);

        GetConsultantsByStoreResponse getConsultantsByStoreResponse = new Gson().fromJson(resp, GetConsultantsByStoreResponse.class);
        assertTrue(getConsultantsByStoreResponse.isSuccess());
    }


    @Test(description = "Get Active Stores")
    public void GetActiveStoresByUser() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        String resp = apiRequestContext.get(Parameters.UserGetActiveStoresByUser).text();
        System.out.println(resp);
        GetActiveStoresByUserResponse getActiveStoresByUserResponse = new Gson().fromJson(resp, GetActiveStoresByUserResponse.class);
        assertTrue(getActiveStoresByUserResponse.isSuccess());
    }

    @Test(description = "Get Invitation Roles")
    public void GetInvitationRoles() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        String resp = apiRequestContext.get(Parameters.UserGetInvitationRoles).text();
        System.out.println(resp);
        GetInvitationRolesResponse getInvitationRolesResponse = new Gson().fromJson(resp, GetInvitationRolesResponse.class);
        assertTrue(getInvitationRolesResponse.isSuccess());
    }

    @Test(description = "Get Invitation Roles")
    public void GetUserStores() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        String resp = apiRequestContext.get(Parameters.UserGetUserStores).text();
        System.out.println(resp);
        GetUserStoresResponse getUserStoresResponse = new Gson().fromJson(resp, GetUserStoresResponse.class);
        assertTrue(getUserStoresResponse.isSuccess());
    }

    @Test(description = "Get Store Consultants By Store Id")
    public void GetStoreConsultantsByStoreId() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));
        String resp = apiRequestContext.get(Parameters.UserGetStoreConsultantsByStoreId, RequestOptions.create().setQueryParam("storeId", "243")).text();
        ;

        System.out.println(resp);

        GetStoreConsultantsByStoreIdResponse getStoreConsultantsByStoreIdResponse = new Gson().fromJson(resp, GetStoreConsultantsByStoreIdResponse.class);
        assertTrue(getStoreConsultantsByStoreIdResponse.isSuccess());
    }

    @Test(description = "Get Store Consultants By Store Id")
    public void GetSellerInfo() {
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.UserTestUrl)
                .setExtraHTTPHeaders(headers));

        String resp = apiRequestContext.get(Parameters.UserGetSellerInfo,
                RequestOptions.create().setQueryParam("storeId", "243").setQueryParam("sellerId", "122")).text();

        System.out.println(resp);

        GetSellerInfoResponse getSellerInfoResponse = new Gson().fromJson(resp, GetSellerInfoResponse.class);
        assertTrue(getSellerInfoResponse.isSuccess());
    }

}
