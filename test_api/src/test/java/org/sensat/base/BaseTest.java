package org.sensat.base;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.constant.Parameters;
import org.sensat.test.request.token.PayloadUserRequest;
import org.sensat.test.response.token.TokenResponse;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    protected Map<String, String> headers = new HashMap<>();
    protected Playwright playwright;
    protected APIRequestContext apiRequestContext;
    protected String token;

    @BeforeTest
    public void setup() {
        playwright = Playwright.create();
        apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions().setBaseURL(Parameters.USER_TEST_URL));
        PayloadUserRequest payloadUserRequest = new PayloadUserRequest();
        payloadUserRequest.setChannelCode(1);
        payloadUserRequest.setEmail("bayraklar_term.0i@icloud.com");
        payloadUserRequest.setPassword("Sensat123");
        payloadUserRequest.setGrantType("password");

        String response = apiRequestContext.post("auth/getToken", RequestOptions.create().setData(payloadUserRequest)).text();
        TokenResponse json = new Gson().fromJson(response, TokenResponse.class);
        token = json.getData().getAccessToken();

        headers.put("Accept", "application/vnd.github.v3+json");
        headers.put("Authorization", "token " + token);
    }

    @AfterTest
    public void tearDown() {
        apiRequestContext.dispose();
        playwright.close();
    }

}
