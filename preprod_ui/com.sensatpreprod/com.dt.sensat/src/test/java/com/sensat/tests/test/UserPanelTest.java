package com.sensat.tests.test;

import com.sensat.pages.*;
import com.sensat.tests.base.BaseTest;
import org.testng.annotations.Test;
import qmframework.Parameters;

public class UserPanelTest  extends BaseTest {
    protected RegisterPage registerPage;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected UserPanelMyDiaryPage userPanelMyDiary;
    protected UserPanelPersonelInfoPage userPanelPersonelInfoPage;
    protected NavigationUserPage navigationUserPage;
    protected UserPanelAddresses userPanelAddresses;
    protected UserPanelChangePasswordPage userPanelChangePasswordPage;
    protected UserPanelContactPermissionsPage userPanelContactPermissionsPage;
    protected UserPanelBlockedUsersPage userPanelBlockedUsersPage;
    protected UserPanelMembershipCancellationPage userPanelMembershipCancellationPage;
    protected UserPanelMyFavoritesPage userPanelMyFavoritesPage;
    protected UserPanelMyAdvertsPage userPanelMyAdvertsPage;
    protected UserPanelMessagesPage userPanelMessagesPage;
    protected UserPanelNotificationsPage userPanelNotificationsPage;
    protected MyStoresPage myStoresPage;
    protected PersonnelsPage personnelsPage;

    @Test(priority = 0,description = "Bireysel Kullanıcı Günlügüm Alanı Kontrolü")
    public void UserPanelMyDairyControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelMyDiary=new UserPanelMyDiaryPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickAvatarMyDairy();
        userPanelMyDiary.verifyNameText();
        userPanelMyDiary.verifyContainerFields();
        homePage.isVisibleFooterİlanVerButton();
        homePage.logoutScenario();

    }
    @Test(description = "Bireysel Kullanıcı Üyelik İşlemlerim Sayfası Kontolü")
    public void UserPanelPersonelInfoControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        userPanelPersonelInfoPage.verifyHesapBilgileriAlanlar();
        userPanelPersonelInfoPage.verifyKisiselBilgilerAlanlar();
        homePage.logoutScenario();
    }
    @Test(description = "Bireysel Kullanıcı Adres Bilgilerim Sayfası Kontolü")
    public void UserPanelAddressesControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelAddresses=new UserPanelAddresses(page);
        navigationUserPage=new NavigationUserPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickAddresses();
        userPanelAddresses.verifyAdresBilgilerim();
        homePage.logoutScenario();
    }
    @Test(description = "Bireysel Kullanıcı Şifre İşlemlerim Sayfası Kontolü")
    public void UserPanelChangePasswordControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelChangePasswordPage=new UserPanelChangePasswordPage(page);
        navigationUserPage=new NavigationUserPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickSifreİslemlerim();
        userPanelChangePasswordPage.verifySifreIslemlerimText();
        userPanelChangePasswordPage.verifySifreDegisikligiAlanlar();
        homePage.logoutScenario();
    }

    @Test(description = "Bireysel Kullanıcı İletişim İzinleri Sayfası Kontolü")
    public void UserPanelContactPermissionsControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        userPanelContactPermissionsPage=new UserPanelContactPermissionsPage(page);
        navigationUserPage=new NavigationUserPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickIletisimIzinleriButton();
        userPanelContactPermissionsPage.verifyKampanyaText();
        userPanelContactPermissionsPage.verifyBildirimText();
        homePage.logoutScenario();
    }
    @Test(description = "Bireysel Kullanıcı Engelledigim Üyeler Sayfası Kontolü")
    public void UserPanelBlockedUsersControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelBlockedUsersPage=new UserPanelBlockedUsersPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickEngelledigimUyeler();
        userPanelBlockedUsersPage.verifyEngelledigimUyelerAlanlar();
        userPanelBlockedUsersPage.verifyEngelledigimUyelerAlanlarKurumsal();
        homePage.logoutScenario();
    }
    @Test(description = "Bireysel Kullanıcı Üyelik İptal Sayfası Kontolü")
    public void UserPanelMembershipCancellationControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelMembershipCancellationPage=new UserPanelMembershipCancellationPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickUyelikIptal();
        userPanelMembershipCancellationPage.verifyUyelikIptaliText();
        userPanelMembershipCancellationPage.verifyDialogAlanlarKontrol();
        homePage.logoutScenario();
    }

    @Test(description = "Bireysel Kullanıcı Favoriler Sayfası Kontolü")
    public void UserPanelMyFavoritesControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelMyFavoritesPage=new UserPanelMyFavoritesPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickFavorites();
        userPanelMyFavoritesPage.verifyTextFavoriIlanlar();
        userPanelMyFavoritesPage.verifyContentAlanlarKontrol();
        homePage.logoutScenario();
    }

    @Test(description = "Bireysel Kullanıcı İlanlarım Sayfası Kontolü")
    public void UserPanelMyAdvertsControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelMyAdvertsPage=new UserPanelMyAdvertsPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickIlanlarim();
        userPanelMyAdvertsPage.verifyIlanlarimText();
        userPanelMyAdvertsPage.verifyContentAlanlarKontrol();
        userPanelMyAdvertsPage.verifyIlanAlanlarKontrol();
        homePage.logoutScenario();
    }
    @Test(description = "Bireysel Kullanıcı Mesajlarım Sayfası Kontolü")
    public void UserPanelMessagesControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelMessagesPage=new UserPanelMessagesPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickMesajlarim();
        userPanelMessagesPage.verifyAlanlarKontrol();
        homePage.logoutScenario();
    }
    @Test(description = "Bireysel Kullanıcı Bildirimlerim Sayfası Kontolü")
    public void UserPanelNatificationsControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelNotificationsPage=new UserPanelNotificationsPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User1_Email,Parameters.User1_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickBildirimlerim();
        userPanelNotificationsPage.verifyTextBildirimlerim();
        homePage.logoutScenario();
    }
    @Test(priority = 0,description = "Kurumsal Kullanıcı Günlügüm Alanı Kontrolü")
    public void UserPanelCorporateMyDairyControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelMyDiary=new UserPanelMyDiaryPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickAvatarMyDairy();
        userPanelMyDiary.verifyNameTextCorporate();
        userPanelMyDiary.verifyContainerFieldsCorporate();
        homePage.isVisibleFooterİlanVerButton();
        homePage.logoutScenario();

    }
    @Test(description = "Kurumsal Kullanıcı Üyelik İşlemlerim Sayfası Kontolü")
    public void UserPanelCorporatePersonelInfoControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        userPanelPersonelInfoPage.verifyHesapBilgileriAlanlarCorporate();
        userPanelPersonelInfoPage.verifyFirmaBilgileriAlanlar();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı Adres Bilgilerim Sayfası Kontolü")
    public void UserPanelCorporateAddressesControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelAddresses=new UserPanelAddresses(page);
        navigationUserPage=new NavigationUserPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickAddresses();
        userPanelAddresses.verifyAdresBilgilerim();
        userPanelAddresses.verifyCorporateAdres();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı Şifre İşlemlerim Sayfası Kontolü")
    public void UserPanelCorporateChangePasswordControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelChangePasswordPage=new UserPanelChangePasswordPage(page);
        navigationUserPage=new NavigationUserPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickSifreİslemlerim();
        userPanelChangePasswordPage.verifySifreIslemlerimText();
        userPanelChangePasswordPage.verifySifreDegisikligiAlanlar();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı İletişim İzinleri Sayfası Kontolü")
    public void UserPanelCorporateContactPermissionsControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        userPanelContactPermissionsPage=new UserPanelContactPermissionsPage(page);
        navigationUserPage=new NavigationUserPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickIletisimIzinleriButton();
        userPanelContactPermissionsPage.verifyKampanyaText();
        userPanelContactPermissionsPage.verifyBildirimText();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı Engelledigim Üyeler Sayfası Kontolü")
    public void UserPanelCorporateBlockedUsersControl(){
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelBlockedUsersPage=new UserPanelBlockedUsersPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickEngelledigimUyeler();
        userPanelBlockedUsersPage.verifyEngelledigimUyelerAlanlar();
        userPanelBlockedUsersPage.verifyEngelledigimUyelerAlanlarKurumsal();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı Üyelik İptal Sayfası Kontolü")
    public void UserPanelCorporateMembershipCancellationControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelMembershipCancellationPage=new UserPanelMembershipCancellationPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickUyelikIptal();
        userPanelMembershipCancellationPage.verifyUyelikIptaliText();
        userPanelMembershipCancellationPage.verifyDialogAlanlarKontrol();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı Favoriler Sayfası Kontolü")
    public void UserPanelCorporateMyFavoritesControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelMyFavoritesPage=new UserPanelMyFavoritesPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickFavorites();
        userPanelMyFavoritesPage.verifyTextFavoriIlanlar();
        //userPanelMyFavoritesPage.verifyContentAlanlarKontrol();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı İlanlarım Sayfası Kontolü")
    public void UserPanelCorporateMyAdvertsControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelMyAdvertsPage=new UserPanelMyAdvertsPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickIlanlarim();
        userPanelMyAdvertsPage.verifyIlanlarimText();
        userPanelMyAdvertsPage.verifyContentAlanlarKontrol();
       // userPanelMyAdvertsPage.verifyIlanAlanlarKontrol();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı Mesajlarım Sayfası Kontolü")
    public void UserPanelCorporateMessagesControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelMessagesPage=new UserPanelMessagesPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickMesajlarim();
        userPanelMessagesPage.verifyAlanlarKontrol();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı Bildirimlerim Sayfası Kontolü")
    public void UserPanelCorporateNatificationsControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        userPanelNotificationsPage=new UserPanelNotificationsPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickBildirimlerim();
        userPanelNotificationsPage.verifyTextBildirimlerim();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı Mağazalarım Sayfası Kontolü")
    public void UserPanelCorporateMyStoresPageControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        myStoresPage=new MyStoresPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickMagazalarim();
        myStoresPage.verifyMagazalarimText();
        myStoresPage.verifyMyOtoAlanlarKontrol();
        homePage.logoutScenario();
    }
    @Test(description = "Kurumsal Kullanıcı Danısmanlar Sayfası Kontolü")
    public void UserPanelCorporatePersonnelsPageControl() throws InterruptedException {
        loginPage=new LoginPage(page);
        homePage =new HomePage(page);
        registerPage =new RegisterPage(page);
        userPanelPersonelInfoPage=new UserPanelPersonelInfoPage(page);
        navigationUserPage=new NavigationUserPage(page);
        personnelsPage=new PersonnelsPage(page);
        homePage.clickLoginButton();
        loginPage.verifyLoginTextDeneme();
        loginPage.doLogin(Parameters.User3_Email,Parameters.User3_Password);
        homePage.clickAvatar();
        homePage.clickPersonelInfoButton();
        navigationUserPage.clickDanismanlarim();
        personnelsPage.verifyDanismanlarimText();
        personnelsPage.verifyDanismanContainerAlanlar();
        homePage.logoutScenario();
    }
}
