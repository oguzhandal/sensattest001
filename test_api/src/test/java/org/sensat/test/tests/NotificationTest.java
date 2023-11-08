package org.sensat.test.tests;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.base.BaseTest;
import org.sensat.constant.Parameters;
import org.sensat.test.request.notification.CreateNotificationRequest;
import org.sensat.test.request.notification.NotificationsRequest;
import org.sensat.test.response.notification.CreateNotificationResponse;
import org.sensat.test.response.notification.MarkAsReadResponse;
import org.sensat.test.response.notification.notifications.NotificationsResponse;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class NotificationTest extends BaseTest {

    private APIRequestContext getApiRequestContext() {
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.NOTIFICATION_TEST_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = "Create Notification Type: 1")
    public void createNotificationType1() {
        apiRequestContext = getApiRequestContext();

        CreateNotificationRequest request = new CreateNotificationRequest();
        request.setUserId(228);
        request.setType(1);
        request.setDescription("Bu bir Type: 1 bildirimidir ve 2100 numaralı ilana gider.");
        request.setContent("http://webtest.sensat.com/vehicle-detail/AUDI/A6/2100");

        String requestResponse = apiRequestContext.post(Parameters.CREATE_NOTIFICATION, RequestOptions.create().setData(request)).text();

        CreateNotificationResponse response = new Gson().fromJson(requestResponse, CreateNotificationResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Create Notification Type: 2")
    public void createNotificationType2() {
        apiRequestContext = getApiRequestContext();

        CreateNotificationRequest request = new CreateNotificationRequest();
        request.setUserId(228);
        request.setType(2);
        request.setDescription("Bu bir Type: 2 bildirimidir.");

        String requestResponse = apiRequestContext.post(Parameters.CREATE_NOTIFICATION, RequestOptions.create().setData(request)).text();

        CreateNotificationResponse response = new Gson().fromJson(requestResponse, CreateNotificationResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Create Notification Type: 3")
    public void createNotificationType3() {
        apiRequestContext = getApiRequestContext();

        CreateNotificationRequest request = new CreateNotificationRequest();
        request.setUserId(228);
        request.setType(3);
        request.setDescription("Bu bir Type: 3 bildirimidir ve 2102 numaralı ilana gider.");
        request.setContent("http://webtest.sensat.com/vehicle-detail/AUDI/A6/2102");

        String requestResponse = apiRequestContext.post(Parameters.CREATE_NOTIFICATION, RequestOptions.create().setData(request)).text();

        CreateNotificationResponse response = new Gson().fromJson(requestResponse, CreateNotificationResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Create Notification Type: 4")
    public void createNotificationType4() {
        apiRequestContext = getApiRequestContext();

        CreateNotificationRequest request = new CreateNotificationRequest();
        request.setUserId(228);
        request.setType(4);
        request.setDescription("Bu bir Type: 4 bildirimidir ve 2022 model Skoda ilanlarına gider.");
        request.setContent("http://webtest.sensat.com/search?category=1&year=2022&brand=SKODA");

        String requestResponse = apiRequestContext.post(Parameters.CREATE_NOTIFICATION, RequestOptions.create().setData(request)).text();

        CreateNotificationResponse response = new Gson().fromJson(requestResponse, CreateNotificationResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Notifications")
    public void notifications() {
        apiRequestContext = getApiRequestContext();

        NotificationsRequest request = new NotificationsRequest();
        request.setPage(1);
        request.setPageSize(10);
        request.setDisplayAll(false);
        request.setOnlyUnRead(false);

        String requestResponse = apiRequestContext.post(Parameters.NOTIFICATIONS, RequestOptions.create().setData(request)).text();

        NotificationsResponse response = new Gson().fromJson(requestResponse, NotificationsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Mark As Read")
    public void markAsRead() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.get(Parameters.MARK_AS_READ).text();

        MarkAsReadResponse response = new Gson().fromJson(requestResponse, MarkAsReadResponse.class);

        assertTrue(response.isSuccess());
    }

}
