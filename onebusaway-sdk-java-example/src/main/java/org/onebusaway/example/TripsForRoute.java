package org.onebusaway.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.models.tripsforroute.TripsForRouteListParams;
import org.onebusaway.models.tripsforroute.TripsForRouteListResponse;

public class TripsForRoute {

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
        // Define the route ID
        String routeId = "1_100224";

        TripsForRouteListParams params =
                TripsForRouteListParams.builder().routeId(routeId).build();

        // Get the trips for the route
        TripsForRouteListResponse trips = client.tripsForRoute().list(params);

        System.out.println(trips);
    }
}
