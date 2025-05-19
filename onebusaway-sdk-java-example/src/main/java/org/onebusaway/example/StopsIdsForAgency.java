package org.onebusaway.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.models.*;

public class StopsIdsForAgency {

    // Retrieve constants from environment variables or fallback to default values
    static final String API_KEY =
            System.getenv("ONEBUSAWAY_API_KEY") != null ? System.getenv("ONEBUSAWAY_API_KEY") : "TEST";
    static final String BASE_URL = System.getenv("ONEBUSAWAY_BASE_URL") != null
            ? System.getenv("ONEBUSAWAY_BASE_URL")
            : "https://api.pugetsound.onebusaway.org";

    // Initialize the Onebusaway SDK client
    static final OnebusawaySdkClient client = OnebusawaySdkOkHttpClient.builder()
            .apiKey(API_KEY)
            .baseUrl(BASE_URL)
            .build();

    public static void main(String[] args) {
        // Define the agency ID
        String agencyId = "1";

        StopIdsForAgencyListParams params =
                StopIdsForAgencyListParams.builder().agencyId(agencyId).build();
        // Get the list of stop IDs for the agency
        StopIdsForAgencyListResponse stopIds = client.stopIdsForAgency().list(params);

        // Print the list of stop IDs
        for (String stopId : stopIds.data().list()) {
            System.out.println(stopId);
        }
    }
}
