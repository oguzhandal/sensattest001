package org.sensat.test.message;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.base.MessageAccount;
import org.sensat.constant.MessageServiceParameters;
import org.sensat.constant.SecurityKey;
import org.sensat.constant.UserServiceParameters;
import org.sensat.test.message.payload.CreateConversationPayload;
import org.sensat.test.message.response.createConversation.CreateConversationResponse;
import org.sensat.test.message.payload.*;
import org.sensat.test.message.response.deleteConversation.DeleteConversationResponse;
import org.sensat.test.message.response.getUserConversationDetail.GetUserConversationDetailResponse;
import org.sensat.test.message.response.getUserConversations.GetUserConversationsResponse;
import org.sensat.test.message.response.updateUserShadowConversations.UpdateUserShadowConversationsResponse;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MessageTest extends MessageAccount {

    private APIRequestContext getApiRequestContext() {
        headers.put("servicesecuritykey", SecurityKey.USER_SECURITY_KEY);
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(MessageServiceParameters.MESSAGE_PREPROD_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = MessageServiceParameters.CREATE_CONVERSATION + "METHOD = POST", priority = 4)
    public void createConversation() {
        CreateConversationPayload createConversationPayload = new CreateConversationPayload();

        createConversationPayload.setAdvertNo("1");

        String response = getApiRequestContext().post(MessageServiceParameters.CREATE_CONVERSATION, RequestOptions.create().setData(createConversationPayload)).text();

        CreateConversationResponse createConversationResponse = new Gson().fromJson(response, CreateConversationResponse.class);

        // System.out.println(response);

        assertTrue(!createConversationResponse.isSuccess());
    }

    @Test(description = MessageServiceParameters.GET_USER_CONVERSATION_DETAIL + "METHOD = POST", priority = 4)
    public void getUserConversationDetail() {
        GetUserConversationDetailPayload getUserConversationDetailPayload = new GetUserConversationDetailPayload();

        getUserConversationDetailPayload.setAdvertNo(0);

        String response = getApiRequestContext().post(MessageServiceParameters.GET_USER_CONVERSATION_DETAIL, RequestOptions.create().setData(getUserConversationDetailPayload)).text();

        GetUserConversationDetailResponse getUserConversationDetailResponse = new Gson().fromJson(response, GetUserConversationDetailResponse.class);

        // System.out.println(response);

        assertTrue(getUserConversationDetailResponse.isSuccess());
    }

    @Test(description = MessageServiceParameters.GET_USER_CONVERSATIONS + "METHOD = POST", priority = 4)
    public void getUserConversations() {
        GetUserConversationsPayload getUserConversationsPayload = new GetUserConversationsPayload();

        getUserConversationsPayload.setSearchText("Text");
        getUserConversationsPayload.setPageIndex(1);
        getUserConversationsPayload.setPageSize(1);


        String response = getApiRequestContext().post(MessageServiceParameters.GET_USER_CONVERSATIONS, RequestOptions.create().setData(getUserConversationsPayload)).text();

        GetUserConversationsResponse getUserConversationsResponse = new Gson().fromJson(response, GetUserConversationsResponse.class);

        // System.out.println(response);

        assertTrue(getUserConversationsResponse.isSuccess());
    }

    @Test(description = MessageServiceParameters.DELETE_CONVERSATION + "METHOD = POST", priority = 4)
    public void deleteConversation() {
        DeleteConversationPayload deleteConversationPayload = new DeleteConversationPayload();

        deleteConversationPayload.setConversationId(0);

        String response = getApiRequestContext().post(MessageServiceParameters.DELETE_CONVERSATION, RequestOptions.create().setData(deleteConversationPayload)).text();

        DeleteConversationResponse deleteConversationResponse = new Gson().fromJson(response, DeleteConversationResponse.class);

        // System.out.println(response);

        assertTrue(!deleteConversationResponse.isSuccess());
    }

    @Test(description = MessageServiceParameters.UPDATE_USER_SHADOW_CONVERSATIONS + "METHOD = POST", priority = 4)
    public void updateUserShadowConversations() {
        UpdateUserShadowConversationsPayload updateUserShadowConversationsPayload = new UpdateUserShadowConversationsPayload();

        String response = getApiRequestContext().post(MessageServiceParameters.UPDATE_USER_SHADOW_CONVERSATIONS, RequestOptions.create().setData(updateUserShadowConversationsPayload)).text();

        UpdateUserShadowConversationsResponse updateUserShadowConversationsResponse = new Gson().fromJson(response, UpdateUserShadowConversationsResponse.class);

        // System.out.println(response);

        assertTrue(updateUserShadowConversationsResponse.isSuccess());
    }



}
