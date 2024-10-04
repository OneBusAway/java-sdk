package org.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.models.*;

public class SearchForStop {

    // Retrieve constants from environment variables or fallback to default values
    static final String API_KEY = System.getenv("ONEBUSAWAY_API_KEY") != null ? System.getenv("ONEBUSAWAY_API_KEY") : "TEST";
    static final String BASE_URL = System.getenv("ONEBUSAWAY_BASE_URL") != null ? System.getenv("ONEBUSAWAY_BASE_URL") : "https://api.pugetsound.onebusaway.org";

    // Initialize the Onebusaway SDK client
    static final OnebusawaySdkClient client = OnebusawaySdkOkHttpClient.builder()
            .apiKey(API_KEY)
            .baseUrl(BASE_URL)
            .build();


    public static void main(String[] args) {

        // Define the search input
        String searchInput = "crysta";

        // Create the parameters for the stop search request
        SearchForStopListParams params = SearchForStopListParams.builder().input(searchInput).build();

        // Retrieve the stop search results
        SearchForStopListResponse searchForStopListResponse = client.searchForStop().list(params);

        System.out.println(searchForStopListResponse);

    }
}
