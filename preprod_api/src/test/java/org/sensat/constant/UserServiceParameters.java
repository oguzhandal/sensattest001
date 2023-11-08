package org.sensat.constant;

public class UserServiceParameters extends BaseParameters {
    /*----------------------------------ENDPOINTS USER PATH-------------------------------------------*/
    public static final String GET_ALL_CITIES = "user/getAllCities";
    public static final String GET_TOWNS_BY_CITY_ID = "user/getTownsByCityId";
    public static final String GET_TAX_ADMINISTRATIONS_BY_CITY_ID = "user/getTaxAdministrationsByCity";
    public static final String GET_NEIGHBORHOODS_BY_TOWN_ID = "user/getNeighborhoodsByTownId";
    public static final String CREATE_ADDRESS = "user/createAddress";
    public static final String GET_ADDRESSES = "user/getAddresses";
    public static final String UPDATE_ADDRESS = "user/updateAddress";
    public static final String DELETE_ADDRESS = "user/deleteAddress";
    public static final String UPDATE_ADDRESS_AS_CURRENT = "user/updateAddressAsCurrent";
    public static final String GET_NOTIFICATION_PERMISSION = "user/getNotificationPermission";
    public static final String GET_CONTACT_PERMISSIONS = "user/getContactPermissions";
    public static final String UPSERT_NOTIFICATION_PERMISSION_USER = "user/upsertNotificationPermissionUser";
    public static final String UPDATE_CONTACT_PERMISSION = "user/updateContactPermissions";
    public static final String UPDATE_USER_DETAILS = "user/updateUserDetails";

    public static final String CHECK_IF_USER_CAN_CREATE_ADV = "user/CheckIfUserCanCreateAdvertisement";

    public static final String LOGOUT_USER = "user/logoutUser";
    public static final String GET_USER_BLOCKS = "user/getUserBlocks";
    public static final String BLOCK_USER = "user/blockUser";
    public static final String UNBLOCK_USER = "user/unBlockUser";
    public static final String GET_USER_AGREEMENT_TEXTS = "user/getUserAgreementTexts";
    public static final String GET_IS_STORE_EXIST = "user/getIsStoreExist";
    public static final String GET_STORE_BY_STORE_ID = "user/getStoreByStoreId";
    public static final String VIEW_USER_HISTORY = "user/ViewUserHistory";
    public static final String VIEW_USER_HISTORY_DETAILS = "user/ViewUserHistoryDetails";
    public static final String PASSWORD_RECOVERY = "user/passwordRecovery";
    public static final String CREATE_STORE = "user/createStore";
    public static final String GET_STORES_BY_USER = "user/getStoresByUser";
    public static final String DELETE_STORE = "user/deleteStore";
    public static final String GET_STORE_WITH_DETAILS = "user/getStoreWithDetails";
    public static final String GET_INVITATION_ROLES = "user/getInvitationRoles";
    public static final String INVITE_CONSULTANT = "user/inviteConsultant";
    public static final String GET_WAITING_FOR_CONSULTANTS_BY_STORE_ID = "user/getWaitingConsultantsByStoreId";
    public static final String DELETE_CONSULTANT_INVITATION = "user/deleteConsultantInvitation";
    public static final String GET_CONSULTANTS_BY_STORE = "user/getConsultantsByStore";
    public static final String GET_SELECTED_CONSULTANT_ROLES = "user/GetSelectedConsultantRoles";
    public static final String GET_CONSULTANTS = "user/getConsultants";
    public static final String GET_USER_STORES = "user/getUserStores";
    public static final String GET_STORE_CONSULTANTS_BY_STORES_ID = "user/getStoreConsultantsByStoreId";
    public static final String GET_SELLER_INFO = "user/getSellerInfo";
    /*-------------------------------------ENDPOINTS AUTH PATH-------------------------------------------*/
    public static final String GET_TOKEN = "Auth/getToken";
    public static final String REFRESH_TOKEN = "auth/refreshToken";
    public static final String GET_AUTHORIZED_USER_INFO = "Auth/getAuthorizedUserInfo";
    public static final String CHANGE_ACCOUNT = "Auth/changeAccount";
    /*-------------------------------------ENDPOINTS BACKOFFICE PATH------------------------------------*/
    public static final String GET_CORPORATE_CLIENT_DETAILS_BY_DATE = "backoffice/User/getCorporateClientDetailsByDate";
    public static final String GET_STORES_COUNT = "backoffice/User/getStoresCount";
    public static final String GET_USER_ROLES = "backoffice/User/getUserRoles";
    public static final String GET_USERS_COUNT = "backoffice/User/getUsersCount";
    public static final String TOTAL_COUNT_OF_MEMBERS_BY_DATE = "backoffice/User/totalCountOfMembersByDate";
    public static final String NUMBER_OF_USERS_BY_DATE = "backoffice/User/numberOfUsersByDate";
    public static final String GET_AGREEMENT_TEXT_BY_ID = "backoffice/User/getAgreementTextById";
    public static final String GET_USERS_BY_STATUS = "backoffice/User/getUsersByStatus";
    public static final String GET_USER_BY_ID = "backoffice/User/getUserById";
    public static final String GET_STORES_BY_STATUS = "backoffice/User/getStoresByStatus";
    public static final String GET_STORE_BY_ID = "backoffice/User/getStoreById";
    public static final String USER_APPROVAL = "backoffice/User/userApproval";
    public static final String GET_REJECTIONS_BY_REJECTION_ENTITY_TYPE = "backoffice/User/getRejectionsByRejectionEntityType";
    public static final String STORE_APPROVAL = "backoffice/User/storeApproval";
}
