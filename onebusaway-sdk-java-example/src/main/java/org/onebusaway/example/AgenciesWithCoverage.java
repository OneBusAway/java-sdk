package org.onebusaway.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.models.agencieswithcoverage.AgenciesWithCoverageListParams;
import org.onebusaway.models.agencieswithcoverage.AgenciesWithCoverageListResponse;

public class AgenciesWithCoverage {

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

        // Define the required Params
        AgenciesWithCoverageListParams params =
                AgenciesWithCoverageListParams.builder().build();

        // Get the agencies with coverage
        AgenciesWithCoverageListResponse agencies =
                client.agenciesWithCoverage().list(params);

        for (AgenciesWithCoverageListResponse.Data.List agency : agencies.data().list()) {
            System.out.println(agency);
        }
    }
}
