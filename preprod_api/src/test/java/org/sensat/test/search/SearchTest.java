package org.sensat.test.search;

import com.google.gson.Gson;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.options.RequestOptions;
import org.sensat.base.SearchAccount;
import org.sensat.constant.SearchServiceParameters;
import org.sensat.constant.SecurityKey;
import org.sensat.constant.UserServiceParameters;
import org.sensat.test.search.payload.*;
import org.sensat.test.search.payload.searchByFilter.*;
import org.sensat.test.search.response.autocomplete.AutocompleteResponse;
import org.sensat.test.search.response.getAdvertisementVehicleDetailsById.GetAdvertisementVehicleDetailsByIdResponse;
import org.sensat.test.search.response.getInsideVehicleModels.GetInsideVehicleModelsResponse;
import org.sensat.test.search.response.getInsideVehicleYears.GetInsideVehicleYearsResponse;
import org.sensat.test.search.response.getRelatedAdvertisements.GetRelatedAdvertisementsResponse;
import org.sensat.test.search.response.getSeoSections.GetSeoSectionsResponse;
import org.sensat.test.search.response.getVehicleCounts.GetVehicleCountsResponse;
import org.sensat.test.search.response.searchByFilter.SearchByFilterResponse;
import org.sensat.test.search.response.searchSummary.SearchSummaryResponse;
import org.sensat.util.Util;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTest extends SearchAccount {

    private APIRequestContext getApiRequestContext() {
        headers.put("servicesecuritykey", SecurityKey.USER_SECURITY_KEY);
        return playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(UserServiceParameters.SEARCH_PREPROD_URL)
                .setExtraHTTPHeaders(headers));
    }

    @Test(description = SearchServiceParameters.GET_SEO_SECTIONS + " METHOD = POST")
    public void getSeoSections() {
        String response = getApiRequestContext().post(SearchServiceParameters.GET_SEO_SECTIONS).text();

        GetSeoSectionsResponse getSeoSectionsResponse = new Gson().fromJson(response, GetSeoSectionsResponse.class);

        assertTrue(getSeoSectionsResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.GET_SHOWCASE_ADVERTISEMENTS + " METHOD = POST", priority = 1)
    public void getShowcaseAdvertisements() {
        GetShowcaseAdvertisementsPayload getShowcaseAdvertisementsPayload = new GetShowcaseAdvertisementsPayload();

        String response = getApiRequestContext().post(SearchServiceParameters.GET_SHOWCASE_ADVERTISEMENTS, RequestOptions.create().setData(getShowcaseAdvertisementsPayload)).text();

        GetSeoSectionsResponse getSeoSectionsResponse = new Gson().fromJson(response, GetSeoSectionsResponse.class);

        assertTrue(getSeoSectionsResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.SEARCH_BY_FILTER + " METHOD = POST", priority = 2)
    public void searchByFilterDefault() {
        SearchByFilterPayload searchByFilterPayload = new SearchByFilterPayload();

        searchByFilterPayload.setPage(1);
        searchByFilterPayload.setPageSize(20);
        searchByFilterPayload.setSortingCriteria(2);

        Criterias criterias;
        criterias = Util.getCriterias(
                "1",
                "",
                0,
                0,
                0,
                0,
                0,
                0,
                false
        );

        searchByFilterPayload.setCriterias(criterias);

        String response = getApiRequestContext().post(SearchServiceParameters.SEARCH_BY_FILTER, RequestOptions.create().setData(searchByFilterPayload)).text();

        SearchByFilterResponse searchByFilterResponse = new Gson().fromJson(response, SearchByFilterResponse.class);

        assertTrue(searchByFilterResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID + " METHOD = POST", priority = 3)
    public void getAdvertisementVehicleDetailsById() {
        GetAdvertisementVehicleDetailsByIdPayload getAdvertisementVehicleDetailsByIdPayload = new GetAdvertisementVehicleDetailsByIdPayload();

        getAdvertisementVehicleDetailsByIdPayload.setAdvertNo("2023011NE6UTF26");

        String response = getApiRequestContext().post(SearchServiceParameters.GET_ADVERTISEMENT_VEHICLE_DETAILS_BY_ID, RequestOptions.create().setData(getAdvertisementVehicleDetailsByIdPayload)).text();

        GetAdvertisementVehicleDetailsByIdResponse getAdvertisementVehicleDetailsByIdResponse = new Gson().fromJson(response, GetAdvertisementVehicleDetailsByIdResponse.class);

        assertTrue(getAdvertisementVehicleDetailsByIdResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.GET_RELATED_ADVERTISEMENTS + " METHOD = POST", priority = 4)
    public void getRelatedAdvertisements() {
        GetRelatedAdvertisementsPayload getRelatedAdvertisementsPayload = new GetRelatedAdvertisementsPayload();

        getRelatedAdvertisementsPayload.setAdvertNo("2023011NE6UTF26");

        String response = getApiRequestContext().post(SearchServiceParameters.GET_RELATED_ADVERTISEMENTS, RequestOptions.create().setData(getRelatedAdvertisementsPayload)).text();

        GetRelatedAdvertisementsResponse getRelatedAdvertisementsResponse = new Gson().fromJson(response, GetRelatedAdvertisementsResponse.class);

        assertTrue(getRelatedAdvertisementsResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.AUTOCOMPLETE + " METHOD = POST", priority = 5)
    public void autocompleteFiat() {
        AutocompletePayload autocompletePayload = new AutocompletePayload();

        autocompletePayload.setKeyword("fiat");

        String response = getApiRequestContext().post(SearchServiceParameters.AUTOCOMPLETE, RequestOptions.create().setData(autocompletePayload)).text();

        AutocompleteResponse autocompleteResponse = new Gson().fromJson(response, AutocompleteResponse.class);

        assertTrue(autocompleteResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.SEARCH_SUMMARY + " METHOD = POST", priority = 6)
    public void searchSummaryFiat() {
        SearchSummaryPayload searchSummaryPayload = new SearchSummaryPayload();

        searchSummaryPayload.setKeyword("fiat");

        String response = getApiRequestContext().post(SearchServiceParameters.SEARCH_SUMMARY, RequestOptions.create().setData(searchSummaryPayload)).text();

        SearchSummaryResponse searchSummaryResponse = new Gson().fromJson(response, SearchSummaryResponse.class);

        assertTrue(searchSummaryResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.GET_VEHICLE_COUNTS + " METHOD = POST", priority = 7)
    public void getVehicleCounts() {
        String response = getApiRequestContext().post(SearchServiceParameters.GET_VEHICLE_COUNTS, RequestOptions.create()).text();

        GetVehicleCountsResponse getVehicleCountsResponse = new Gson().fromJson(response, GetVehicleCountsResponse.class);

        assertTrue(getVehicleCountsResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.SEARCH_BY_FILTER + " METHOD = POST", priority = 8)
    public void searchByFilterMinMaxKm() {
        SearchByFilterPayload searchByFilterPayload = new SearchByFilterPayload();

        searchByFilterPayload.setPage(1);
        searchByFilterPayload.setPageSize(20);
        searchByFilterPayload.setSortingCriteria(2);

        Criterias criterias;
        criterias = Util.getCriterias(
                "1",
                "",
                10000,
                100000,
                0,
                0,
                0,
                0,
                false
        );

        searchByFilterPayload.setCriterias(criterias);

        String response = getApiRequestContext().post(SearchServiceParameters.SEARCH_BY_FILTER, RequestOptions.create().setData(searchByFilterPayload)).text();

        SearchByFilterResponse searchByFilterResponse = new Gson().fromJson(response, SearchByFilterResponse.class);

        assertTrue(searchByFilterResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.SEARCH_BY_FILTER + " METHOD = POST", priority = 9)
    public void searchByFilterMaxPriceOneMillion() {
        SearchByFilterPayload searchByFilterPayload = new SearchByFilterPayload();

        searchByFilterPayload.setPage(1);
        searchByFilterPayload.setPageSize(20);
        searchByFilterPayload.setSortingCriteria(2);

        Criterias criterias;
        criterias = Util.getCriterias(
                "1",
                "",
                0,
                0,
                0,
                1000000,
                0,
                0,
                false
        );

        searchByFilterPayload.setCriterias(criterias);

        String response = getApiRequestContext().post(SearchServiceParameters.SEARCH_BY_FILTER, RequestOptions.create().setData(searchByFilterPayload)).text();

        SearchByFilterResponse searchByFilterResponse = new Gson().fromJson(response, SearchByFilterResponse.class);

        assertTrue(searchByFilterResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.SEARCH_BY_FILTER + " METHOD = POST", priority = 10)
    public void searchByFilterMinYear2015() {
        SearchByFilterPayload searchByFilterPayload = new SearchByFilterPayload();

        searchByFilterPayload.setPage(1);
        searchByFilterPayload.setPageSize(20);
        searchByFilterPayload.setSortingCriteria(2);

        Criterias criterias;
        criterias = Util.getCriterias(
                "1",
                "",
                0,
                0,
                0,
                0,
                2015,
                0,
                false
        );

        searchByFilterPayload.setCriterias(criterias);

        String response = getApiRequestContext().post(SearchServiceParameters.SEARCH_BY_FILTER, RequestOptions.create().setData(searchByFilterPayload)).text();

        SearchByFilterResponse searchByFilterResponse = new Gson().fromJson(response, SearchByFilterResponse.class);

        assertTrue(searchByFilterResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.AUTOCOMPLETE + " METHOD = POST", priority = 11)
    public void autocompleteAudi() {
        AutocompletePayload autocompletePayload = new AutocompletePayload();

        autocompletePayload.setKeyword("skoda");

        String response = getApiRequestContext().post(SearchServiceParameters.AUTOCOMPLETE, RequestOptions.create().setData(autocompletePayload)).text();

        AutocompleteResponse autocompleteResponse = new Gson().fromJson(response, AutocompleteResponse.class);

        assertTrue(autocompleteResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.AUTOCOMPLETE + " METHOD = POST", priority = 12)
    public void autocompleteBmw() {
        AutocompletePayload autocompletePayload = new AutocompletePayload();

        autocompletePayload.setKeyword("skoda");

        String response = getApiRequestContext().post(SearchServiceParameters.AUTOCOMPLETE, RequestOptions.create().setData(autocompletePayload)).text();

        AutocompleteResponse autocompleteResponse = new Gson().fromJson(response, AutocompleteResponse.class);

        assertTrue(autocompleteResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.SEARCH_SUMMARY + " METHOD = POST", priority = 13)
    public void searchSummaryAudi() {
        SearchSummaryPayload searchSummaryPayload = new SearchSummaryPayload();

        searchSummaryPayload.setKeyword("audi");

        String response = getApiRequestContext().post(SearchServiceParameters.SEARCH_SUMMARY, RequestOptions.create().setData(searchSummaryPayload)).text();

        SearchSummaryResponse searchSummaryResponse = new Gson().fromJson(response, SearchSummaryResponse.class);

        assertTrue(searchSummaryResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.SEARCH_SUMMARY + " METHOD = POST", priority = 14)
    public void searchSummaryBmw() {
        SearchSummaryPayload searchSummaryPayload = new SearchSummaryPayload();

        searchSummaryPayload.setKeyword("bmw");

        String response = getApiRequestContext().post(SearchServiceParameters.SEARCH_SUMMARY, RequestOptions.create().setData(searchSummaryPayload)).text();

        SearchSummaryResponse searchSummaryResponse = new Gson().fromJson(response, SearchSummaryResponse.class);

        assertTrue(searchSummaryResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.SEARCH_BY_FILTER + " METHOD = POST", priority = 15)
    public void searchByFilterBrandFiat() {
        SearchByFilterPayload searchByFilterPayload = new SearchByFilterPayload();

        searchByFilterPayload.setPage(1);
        searchByFilterPayload.setPageSize(20);
        searchByFilterPayload.setSortingCriteria(2);

        Criterias criterias;
        criterias = Util.getCriterias(
                "1",
                "fiat",
                0,
                0,
                0,
                0,
                0,
                0,
                false
        );

        searchByFilterPayload.setCriterias(criterias);

        String response = getApiRequestContext().post(SearchServiceParameters.SEARCH_BY_FILTER, RequestOptions.create().setData(searchByFilterPayload)).text();

        SearchByFilterResponse searchByFilterResponse = new Gson().fromJson(response, SearchByFilterResponse.class);

        assertTrue(searchByFilterResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.SEARCH_BY_FILTER + " METHOD = POST", priority = 16)
    public void searchByFilterHasOnlyVideo() {
        SearchByFilterPayload searchByFilterPayload = new SearchByFilterPayload();

        searchByFilterPayload.setPage(1);
        searchByFilterPayload.setPageSize(20);
        searchByFilterPayload.setSortingCriteria(2);

        Criterias criterias;
        criterias = Util.getCriterias(
                "1",
                "",
                0,
                0,
                0,
                0,
                0,
                0,
                true
        );

        searchByFilterPayload.setCriterias(criterias);

        String response = getApiRequestContext().post(SearchServiceParameters.SEARCH_BY_FILTER, RequestOptions.create().setData(searchByFilterPayload)).text();

        SearchByFilterResponse searchByFilterResponse = new Gson().fromJson(response, SearchByFilterResponse.class);

        assertTrue(searchByFilterResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.GET_INSIDE_VEHICLE_YEARS + " METHOD = POST", priority = 14)
    public void getInsideVehicleYears() {
        GetInsideVehicleYearsPayload getInsideVehicleYearsPayload = new GetInsideVehicleYearsPayload();

        getInsideVehicleYearsPayload.setCategoryId(1);

        String response = getApiRequestContext().post(SearchServiceParameters.GET_INSIDE_VEHICLE_YEARS, RequestOptions.create().setData(getInsideVehicleYearsPayload)).text();

        GetInsideVehicleYearsResponse getInsideVehicleYearsResponse = new Gson().fromJson(response, GetInsideVehicleYearsResponse.class);

        assertTrue(getInsideVehicleYearsResponse.isSuccess());
    }

    @Test(description = SearchServiceParameters.GET_INSIDE_VEHICLE_MODELS + " METHOD = POST", priority = 14)
    public void getInsideVehicleModels() {
        GetInsideVehicleModelsPayload getInsideVehicleModelsPayload = new GetInsideVehicleModelsPayload();

        getInsideVehicleModelsPayload.setCategoryId(1);
        getInsideVehicleModelsPayload.setYear(2018);
        getInsideVehicleModelsPayload.setBrandId(1);

        String response = getApiRequestContext().post(SearchServiceParameters.GET_INSIDE_VEHICLE_MODELS, RequestOptions.create().setData(getInsideVehicleModelsPayload)).text();

        GetInsideVehicleModelsResponse getInsideVehicleModelsResponse = new Gson().fromJson(response, GetInsideVehicleModelsResponse.class);

        assertTrue(getInsideVehicleModelsResponse.isSuccess());
    }
}
