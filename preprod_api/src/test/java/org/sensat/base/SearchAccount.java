package org.sensat.base;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.constant.BaseParameters;
import org.sensat.constant.UserServiceParameters;
import org.sensat.test.user.payload.GetTokenPayload;
import org.sensat.test.user.response.getToken.GetTokenResponse;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

public class SearchAccount {

    protected Map<String, String> headers = new HashMap<>();
    protected Playwright playwright;
    protected APIRequestContext apiRequestContext;
    protected final int accountChannelCode = 1;
    protected final String accountEmail = "bireysel@sensat.com";
    protected final String accountPassword = "Sensat2023";
    protected final String accountGrantType = "refresh_token_nocaptcha";

    @BeforeTest
    public void setup() {
        playwright = Playwright.create();
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions().setBaseURL(BaseParameters.USER_PREPROD_URL));

        GetTokenPayload getTokenPayload = new GetTokenPayload(accountChannelCode, accountEmail, accountPassword, accountGrantType);

        String response = apiRequestContext.post(UserServiceParameters.GET_TOKEN, RequestOptions.create().setData(getTokenPayload)).text();

        GetTokenResponse getTokenResponse = new Gson().fromJson(response, GetTokenResponse.class);
        String token = getTokenResponse.getData().getAccessToken();

        headers.put("accept", "application/json");
        headers.put("authorization", "token " + token);
    }

    @AfterTest
    public void tearDown() {
        apiRequestContext.dispose();
        playwright.close();
    }

}
