package org.onebusaway.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.models.*;

public class ArrivalAndDepartureForStop {

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

        // Define the stop ID and trip ID
        String stopId = "1_75403";
        String tripId = "1_604670535";

        // Define the service date directly as a Unix timestamp (in seconds)
        long serviceDate = 1810918000; // Example timestamp

        // Create parameters for arrival and departure request
        ArrivalAndDepartureRetrieveParams params = ArrivalAndDepartureRetrieveParams.builder()
                .stopId(stopId)
                .tripId(tripId)
                .serviceDate(serviceDate) // Use the Unix timestamp directly
                .build();

        // Retrieve arrival and departure information
        ArrivalAndDepartureRetrieveResponse arrivalAndDepartureForStop =
                client.arrivalAndDeparture().retrieve(params);
        System.out.println(arrivalAndDepartureForStop);
    }
}
