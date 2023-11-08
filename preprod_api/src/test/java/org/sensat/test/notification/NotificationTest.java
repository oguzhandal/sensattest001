package org.sensat.test.notification;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.base.NotificationAccount;
import org.sensat.constant.NotificationServiceParameters;
import org.sensat.constant.SecurityKey;
import org.sensat.constant.UserServiceParameters;
import org.sensat.test.notification.payload.*;
import org.sensat.test.notification.response.create.CreateResponse;
import org.sensat.test.notification.response.getUserNotificationTypes.GetUserNotificationTypesResponse;
import org.sensat.test.notification.response.markAsRead.MarkAsReadResponse;
import org.sensat.test.notification.response.markAsReadPagination.MarkAsReadPaginationResponse;
import org.sensat.test.notification.response.notifications.NotificationsResponse;
import org.sensat.test.notification.response.sendSms.SendSmsResponse;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NotificationTest extends NotificationAccount {

    private APIRequestContext getApiRequestContext() {
        headers.put("servicesecuritykey", SecurityKey.USER_SECURITY_KEY);
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(UserServiceParameters.NOTIFICATION_PREPROD_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = NotificationServiceParameters.SEND_SMS + " METHOD = POST", priority = 4)
    public void sendSms() {
        SendSmsPayload sendSmsPayload = new SendSmsPayload();

        sendSmsPayload.setPhoneNumber("5548997094");
        sendSmsPayload.setMessage("Bu mesaj otomasyon ile gönderilmiştir, Berke :)");

        String response = getApiRequestContext().post(NotificationServiceParameters.SEND_SMS, RequestOptions.create().setData(sendSmsPayload)).text();

        SendSmsResponse sendSmsResponse = new Gson().fromJson(response, SendSmsResponse.class);

        assertTrue(sendSmsResponse.isSuccess());
    }

    @Test(description = NotificationServiceParameters.CREATE + " METHOD = POST", priority = 4)
    public void create() {
        CreatePayload createPayload = new CreatePayload();

        createPayload.setUserId(250);
        createPayload.setType(1);
        createPayload.setDescription("Notification Create Description");
        createPayload.setContent("Notification Create Content");
        createPayload.setLabel("Notification Create Label");
        createPayload.setAccountType(2);

        String response = getApiRequestContext().post(NotificationServiceParameters.CREATE, RequestOptions.create().setData(createPayload)).text();

        CreateResponse createResponse = new Gson().fromJson(response, CreateResponse.class);

        assertTrue(createResponse.isSuccess());
    }

    @Test(description = NotificationServiceParameters.NOTIFICATIONS + " METHOD = POST", priority = 4)
    public void notifications() {
        NotificationsPayload notificationsPayload = new NotificationsPayload();

        notificationsPayload.setPage(1);
        notificationsPayload.setPageSize(1);
        notificationsPayload.setAccountType(2);
        notificationsPayload.setDisplayAll(true);
        notificationsPayload.setOnlyUnRead(true);

        String response = getApiRequestContext().post(NotificationServiceParameters.NOTIFICATIONS, RequestOptions.create().setData(notificationsPayload)).text();

        NotificationsResponse notificationsResponse = new Gson().fromJson(response, NotificationsResponse.class);

        assertTrue(notificationsResponse.isSuccess());
    }
    @Test(description = NotificationServiceParameters.MARK_AS_READ + "METHOD = GET", priority = 4)
    public void markAsRead() {
        MarkAsReadPayload markAsReadPayload = new MarkAsReadPayload();

        String response = getApiRequestContext().get(NotificationServiceParameters.MARK_AS_READ, RequestOptions.create().setData(markAsReadPayload)).text();

        MarkAsReadResponse markAsReadResponse = new Gson().fromJson(response, MarkAsReadResponse.class);

        assertTrue(markAsReadResponse.isSuccess());
    }
    @Test(description = NotificationServiceParameters.MARK_AS_READ_PAGINATION + "METHOD = POST", priority = 4)
    public void markAsReadPagination() {
        MarkAsReadPaginationPayload markAsReadPaginationPayload = new MarkAsReadPaginationPayload();

        markAsReadPaginationPayload.setPage(1);
        markAsReadPaginationPayload.setPageSize(1);

        String response = getApiRequestContext().post(NotificationServiceParameters.MARK_AS_READ_PAGINATION, RequestOptions.create().setData(markAsReadPaginationPayload)).text();

        MarkAsReadPaginationResponse markAsReadPaginationResponse = new Gson().fromJson(response, MarkAsReadPaginationResponse.class);

        // System.out.println(response);

        assertTrue(markAsReadPaginationResponse.isSuccess());
    }

    @Test(description = NotificationServiceParameters.GET_USER_NOTIFICATION_TYPES + "METHOD = GET", priority = 4)
    public void getUserNotificationTypes() {
        GetUserNotificationTypesPayload getUserNotificationTypesPayload = new GetUserNotificationTypesPayload();

        String response = getApiRequestContext().get(NotificationServiceParameters.GET_USER_NOTIFICATION_TYPES, RequestOptions.create().setData(getUserNotificationTypesPayload)).text();

        GetUserNotificationTypesResponse getUserNotificationTypesResponse = new Gson().fromJson(response, GetUserNotificationTypesResponse.class);

        // System.out.println(response);

        assertTrue(getUserNotificationTypesResponse.isSuccess());
    }
    
}

