package org.sensat.test.tests;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.base.BaseTest;
import org.sensat.constant.Parameters;
import org.sensat.test.request.search.*;
import org.sensat.test.request.search.searchByFilter.Criterias;
import org.sensat.test.request.search.searchByFilter.SearchByFilterRequest;
import org.sensat.test.response.search.autoComplete.AutoCompleteResponse;
import org.sensat.test.response.search.getRelatedAdvertisements.GetRelatedAdvertisementsResponse;
import org.sensat.test.response.search.getSeoSections.GetSeoSectionsResponse;
import org.sensat.test.response.search.getShowcaseAdvertisements.GetShowcaseAdvertisementsResponse;
import org.sensat.test.response.search.recommendedSearch.RecommendedSearchResponse;
import org.sensat.test.response.search.searchByFilter.SearchByFilterResponse;
import org.sensat.test.response.search.searchSummary.SearchSummaryResponse;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SearchTest extends BaseTest {

    private APIRequestContext getApiRequestContext() {
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(Parameters.SEARCH_TEST_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = "Search By Filter")
    public void searchByFilter() {
        apiRequestContext = getApiRequestContext();

        SearchByFilterRequest request = new SearchByFilterRequest();
        request.setPage(1);
        request.setPageSize(20);
        request.setSortingCriteria(2);
        Criterias criterias = new Criterias();
        criterias.setCategoryId("1");
        criterias.setInner360(false);
        criterias.setHasOnlyVideo(false);
        criterias.setHasOnlyPhoto(false);
        criterias.setAdvertsNotOptional(false);
        request.setCriterias(criterias);

        String requestResponse = apiRequestContext.post(Parameters.SEARCH_BY_FILTER, RequestOptions.create().setData(request)).text();

        SearchByFilterResponse response = new Gson().fromJson(requestResponse, SearchByFilterResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Auto Complete")
    public void autoComplete() {
        apiRequestContext = getApiRequestContext();

        AutoCompleteRequest request = new AutoCompleteRequest();
        request.setKeyword("sk");

        String requestResponse = apiRequestContext.post(Parameters.AUTO_COMPLETE, RequestOptions.create().setData(request)).text();

        AutoCompleteResponse response = new Gson().fromJson(requestResponse, AutoCompleteResponse.class);

        AssertJUnit.assertEquals("SKODA", response.getData().getAdverts().get(0).getBrand());
    }

    @Test(description = "Search Summary")
    public void searchSummary() {
        apiRequestContext = getApiRequestContext();

        SearchSummaryRequest request = new SearchSummaryRequest();
        request.setKeyword("volvo");

        String requestResponse = apiRequestContext.post(Parameters.SEARCH_SUMMARY, RequestOptions.create().setData(request)).text();

        SearchSummaryResponse response = new Gson().fromJson(requestResponse, SearchSummaryResponse.class);

        AssertJUnit.assertEquals("/satilik/otomobil/volvo", response.getData().getResultData().getAdverts().get(0).getPath());
    }

    @Test(description = "Recommended Search")
    public void recommendedSearch() {
        apiRequestContext = getApiRequestContext();

        RecommendedSearchRequest request = new RecommendedSearchRequest();

        String requestResponse = apiRequestContext.post(Parameters.RECOMMENDED_SEARCH, RequestOptions.create().setData(request)).text();

        RecommendedSearchResponse response = new Gson().fromJson(requestResponse, RecommendedSearchResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Seo Sections")
    public void getSeoSections() {
        apiRequestContext = getApiRequestContext();

        String requestResponse = apiRequestContext.post(Parameters.GET_SEO_SECTIONS).text();

        GetSeoSectionsResponse response = new Gson().fromJson(requestResponse, GetSeoSectionsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Showcase Advertisements: 1")
    public void getShowcaseAdvertisements1() {
        apiRequestContext = getApiRequestContext();

        GetShowcaseAdvertisementsRequest request = new GetShowcaseAdvertisementsRequest();
        request.setCategoryId(1);

        String requestResponse = apiRequestContext.post(Parameters.GET_SHOWCASE_ADVERTISEMENTS, RequestOptions.create().setData(request)).text();

        GetShowcaseAdvertisementsResponse response = new Gson().fromJson(requestResponse, GetShowcaseAdvertisementsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Showcase Advertisements: 2")
    public void getShowcaseAdvertisements2() {
        apiRequestContext = getApiRequestContext();

        GetShowcaseAdvertisementsRequest request = new GetShowcaseAdvertisementsRequest();
        request.setCategoryId(2);

        String requestResponse = apiRequestContext.post(Parameters.GET_SHOWCASE_ADVERTISEMENTS, RequestOptions.create().setData(request)).text();

        GetShowcaseAdvertisementsResponse response = new Gson().fromJson(requestResponse, GetShowcaseAdvertisementsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Showcase Advertisements: 3")
    public void getShowcaseAdvertisements3() {
        apiRequestContext = getApiRequestContext();

        GetShowcaseAdvertisementsRequest request = new GetShowcaseAdvertisementsRequest();
        request.setCategoryId(3);

        String requestResponse = apiRequestContext.post(Parameters.GET_SHOWCASE_ADVERTISEMENTS, RequestOptions.create().setData(request)).text();

        GetShowcaseAdvertisementsResponse response = new Gson().fromJson(requestResponse, GetShowcaseAdvertisementsResponse.class);

        assertTrue(response.isSuccess());
    }

    @Test(description = "Get Related Advertisements")
    public void getRelatedAdvertisements() {
        apiRequestContext = getApiRequestContext();

        GetRelatedAdvertisementsRequest request = new GetRelatedAdvertisementsRequest();
        request.setCategoryId(1);
        request.setBrand("SKODA");
        request.setModel("FABIA");

        String requestResponse = apiRequestContext.post(Parameters.GET_RELATED_ADVERTISEMENTS, RequestOptions.create().setData(request)).text();

        GetRelatedAdvertisementsResponse response = new Gson().fromJson(requestResponse, GetRelatedAdvertisementsResponse.class);

        assertTrue(response.isSuccess());
    }

}
