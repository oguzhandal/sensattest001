package org.sensat.constant;

public class Parameters {

    public static final String UserTestUrl = "https://usertest.sensat.com/";
    public static final String USER_TEST_URL = "https://gwtest.sensat.com/gw-user/";
    public static final String ADVERTISEMENT_TEST_URL = "https://gwtest.sensat.com/gw-advertisement/";
    public static final String SEARCH_TEST_URL = "https://gwtest.sensat.com/gw-search/";
    public static final String NOTIFICATION_TEST_URL = "https://gwtest.sensat.com/gw-notification/";

    /*--------------------------------------ENDPOINTS USER SERVICE--------------------------------------*/
    public static final String USERGETADDRESESS = "/api/v1/User/getAddresses";
    public static final String CreateAdresses = "/api/v1/User/createAddress";
    public static final String UserUpdateAddresess = "/api/v1/User/updateAddress";
    public static final String UserDeleteAddresess = "/api/v1/User/deleteAddress";
    public static final String UserGetAllCities = "/api/v1/User/getAllCities";
    public static final String UserGetAllTowns = "/api/v1/User/getAllTowns";
    public static final String UserGetTownsByCityId = "/api/v1/User/getTownsByCityId";
    public static final String UserGetNeighborhoodsByTownId = "/api/v1/User/getNeighborhoodsByTownId";
    public static final String UserGetAllTaxAdministrations = "/api/v1/User/getAllTaxAdministrations";
    public static final String UserGetCityName = "/api/v1/User/getCityName";
    public static final String UserGetContactPermissions = "/api/v1/User/getContactPermissions";
    public static final String UserUpdateContactPermissions = "/api/v1/User/updateContactPermissions";
    public static final String UserCreateStore = "user/createStore";
    public static final String UserDeleteStore = "/api/v1/User/deleteStore";
    public static final String UsergetAuthorizedUserInfo = "/api/v1/Auth/getAuthorizedUserInfo";
    public static final String UserUpdateAddressAsCurrent = "/api/v1/User/updateAddressAsCurrent";
    public static final String UserUpdateStore = "/api/v1/User/updateStore";
    public static final String UserGetStoresByUser = "/api/v1/User/getStoresByUser";
    public static final String UserGetStoreDetailsForAdvertisement = "/api/v1/User/getStoreDetailsForAdvertisement";
    public static final String UserGetStoreWithDetails = "/api/v1/User/getStoreWithDetails";
    public static final String UserUpdateStoreLogo = "/api/v1/User/updateStoreLogo";
    public static final String UserCreate = "/api/v1/User/createUser";
    public static final String UserLogoutUser = "/api/v1/User/logoutUser";
    public static final String UserpasswordRecovery = "/api/v1/User/passwordRecovery";
    public static final String UsergetActivationEmail = "/api/v1/User/getActivationEmail";
    public static final String UserUpdatePassword = "/api/v1/User/updatePassword";
    public static final String UserCancelMembership = "/api/v1/User/cancelMembership";
    public static final String UserDeleteProfilePhoto = "/api/v1/User/deleteProfilePhoto";
    public static final String UserGetUserDetailsForAdvertisement = "/api/v1/User/getUserDetailsForAdvertisement";
    public static final String UserGetUserMailDetailsForAdvertisement = "/api/v1/User/getUserMailDetailsForAdvertisement";
    public static final String UserGetNotificationPermission = "/api/v1/User/getNotificationPermission";
    public static final String UserGetConsultants = "/api/v1/User/getConsultants";
    public static final String UserGetConsultantsByStore = "/api/v1/User/getConsultantsByStore";
    public static final String UserGetChangeEmail = "/api/v1/User/getChangeEmail";
    public static final String UserGetActiveStoresByUser = "/api/v1/User/getActiveStoresByUser";
    public static final String UserGetInvitationRoles = "/api/v1/User/getInvitationRoles";
    public static final String UserGetUserStores = "/api/v1/User/getUserStores";
    public static final String UserGetStoreConsultantsByStoreId = "/api/v1/User/getStoreConsultantsByStoreId";
    public static final String UserGetSellerInfo = "/api/v1/User/getSellerInfo";
    /*--------------------------------------ENDPOINTS USER SERVICE--------------------------------------*/

    /*--------------------------------------ENDPOINTS ADVERTISEMENT SERVICE--------------------------------------*/
    public static final String GET_SEARCH_ADVERTISEMENT_FROM_WHO = "property/GetSearchAdvertisementFromWho";
    public static final String GET_SEARCH_ADVERTISEMENT_PROPERTIES_BY_CATEGORY_ID = "property/GetSearchAdvertisementPropertiesByCategoryId";
    public static final String GET_VEHICLE_YEARS = "advertisement/GetVehicleYears";
    public static final String GET_ALL_PROPERTIES = "property/GetAllProperties";
    public static final String GET_VEHICLE_BRANDS = "advertisement/GetVehicleBrands";
    public static final String GET_VEHICLE_MODELS = "advertisement/GetVehicleModels";
    public static final String GET_VEHICLE_BODY_TYPES = "advertisement/GetVehicleBodyTypes";
    public static final String GET_VEHICLE_GEAR_TYPES = "advertisement/GetVehicleGearTypes";
    public static final String GET_VEHICLE_FUEL_TYPES = "advertisement/GetVehicleFuelTypes";
    public static final String GET_VEHICLE_MODEL_TYPES = "advertisement/GetVehicleModelTypes";
    public static final String GET_VEHICLE_JATO_ID = "advertisement/GetVehicleJatoId";
    public static final String GET_VEHICLE_DETAIL_PROPERTIES_FOR_CREATE_ADVERTISEMENT_QUERY = "property/GetVehicleDetailPropertiesForCreateAdvertisementQuery";
    public static final String GET_JATO_VEHICLE_PROPS_BY_JATO_VEHICLE_ID = "advertisement/GetJatoVehiclePropsByJatoVehicleId";
    public static final String GET_ADVERTISEMENT_DETAILS_FOR_CREATE_ADVERTISEMENT_BY_CATEGORY_ID = "property/GetAdvertisementDetailsForCreateAdvertisementByCategoryId";
    public static final String CREATE_VEHICLE_ADVERTISEMENT = "advertisement/CreateVehicleAdvertisement";
    public static final String GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID = "advertisement/GetAdvertisementVehicleDetailsById";
    public static final String GET_FAVORITE_ADVERTISEMENTS = "advertisement/GetFavoriteAdvertisements";
    public static final String ADD_ADVERTISEMENT_TO_FAVORITE = "advertisement/AddAdvertisementToFavorite";
    public static final String REMOVE_ADVERTISEMENT_FROM_FAVORITE = "advertisement/RemoveAdvertisementFromFavorite";
    public static final String GET_VEHICLE_CATEGORIES = "advertisement/GetVehicleCategories";
    public static final String GET_VEHICLE_COMPARE = "advertisement/GetVehicleCompare";
    public static final String UPDATE_ADVERTISEMENT_OPTIONAL_STATUS = "advertisement/UpdateAdvertisementOptionalStatus";
    public static final String GET_DIARY_DETAILS_BY_USERS = "advertisement/GetDiaryDetailsByUser";
    public static final String GET_ADVERTISEMENT_BY_ID = "advertisement/GetAdvertisementById";
    public static final String GET_VEHICLE_COUNTS = "advertisement/GetVehicleCounts";
    public static final String GET_IS_VEHICLE_ADVERTISEMENT_BY_ID = "advertisement/GetIsVehicleAdvertisementById";
    public static final String GET_ADVERT_VEHICLE_CHOICE_MODEL_FOR_EDIT_BY_ID = "advertisement/GetAdvertVehicleChoiceModelForEditById";
    public static final String GET_ADVERT_VEHICLE_PROPERTIES_MODEL_FOR_EDIT_BY_ID = "advertisement/GetAdvertVehiclePropertiesModelForEditById";
    public static final String GET_ADVERT_DETAIL_MODEL_FOR_EDIT_BY_ID = "advertisement/GetAdvertDetailModelForEditById";
    public static final String GET_CONTACT_INFORMATION_MODEL_FOR_EDIT_BY_ID = "advertisement/GetContactInformationModelForEditById";
    public static final String UPDATE_ADVERTISEMENT_STATUS = "advertisement/UpdateAdvertisementStatus";
    public static final String GET_ADVERTISEMENT_IMAGE_BY_ID = "advertisement/GetAdvertisementImageById";
    public static final String GET_USER_PUBLISHED_ADVERTISEMENTS_BY_USER_ID = "advertisement/GetUserPublishedAdvertisementsByUserId";
    public static final String GET_USER_PENDING_ADVERTISEMENTS_BY_USER_ID = "advertisement/GetUserPendingAdvertisementsByUserId";
    public static final String GET_USER_UNPUBLISHED_ADVERTISEMENTS_BY_USER_ID = "advertisement/GetUserUnpublishedAdvertisementsByUserId";
    public static final String GET_USER_ADVERTISEMENTS_BY_USER_ID = "advertisement/GetUserAdvertisementsByUserId";

    /*--------------------------------------ENDPOINTS ADVERTISEMENT SERVICE--------------------------------------*/

    /*------------------------------------ENDPOINTS BACKOFFICE SERVICE------------------------------------*/
    public static final String GET_ADVERTISEMENTS_BY_TYPE_AND_STATUS = "backoffice/Advertisement/getAdvertisementsByTypeAndStatus";
    public static final String GET_ADVERTISEMENTS_BY_ID = "backoffice/Advertisement/getAdvertisementsById";
    public static final String GET_USERS_BY_STATUS = "backoffice/User/getUsersByStatus";
    public static final String GET_STORES_BY_STATUS = "backoffice/User/getStoresByStatus";
    public static final String ADVERTISEMENT_CHANGE_SHOWCASE_STATUS = "backoffice/Advertisement/advertisementChangeShowcaseStatus";
    public static final String ADVERTISEMENT_APPROVAL = "backoffice/Advertisement/advertisementApproval";
    public static final String GET_ADVERTISEMENTS_COUNT = "backoffice/Advertisement/getAdvertisementsCount";
    public static final String GET_USERS_COUNT = "backoffice/User/getUsersCount";
    public static final String GET_STORES_COUNT = "backoffice/User/getStoresCount";
    public static final String GET_STORE_BY_ID = "backoffice/User/getStoreById";
    public static final String STORE_APPROVAL = "backoffice/User/storeApproval";
    public static final String GET_USER_BY_ID = "backoffice/User/getUserById";
    public static final String USER_APPROVAL = "backoffice/User/userApproval";
    /*------------------------------------ENDPOINTS BACKOFFICE SERVICE------------------------------------*/

    /*--------------------------------------ENDPOINTS SEARCH SERVICE--------------------------------------*/
    public static final String SEARCH_BY_FILTER = "Search/searchByFilter";
    public static final String AUTO_COMPLETE = "Search/autocomplete";
    public static final String SEARCH_SUMMARY = "Search/searchSummary";
    public static final String RECOMMENDED_SEARCH = "Search/recommendedSearch";
    public static final String GET_SEO_SECTIONS = "Search/getSeoSections";
    public static final String GET_SHOWCASE_ADVERTISEMENTS = "Search/getShowcaseAdvertisements";
    public static final String GET_RELATED_ADVERTISEMENTS = "Search/getRelatedAdvertisements";
    /*--------------------------------------ENDPOINTS SEARCH SERVICE--------------------------------------*/

    /*-----------------------------------ENDPOINTS NOTIFICATION SERVICE-----------------------------------*/
    public static final String CREATE_NOTIFICATION = "userNotification/create";
    public static final String NOTIFICATIONS = "userNotification/notifications";
    public static final String MARK_AS_READ = "userNotification/markAsRead";
    /*-----------------------------------ENDPOINTS NOTIFICATION SERVICE-----------------------------------*/

}
