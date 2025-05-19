package org.onebusaway.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.models.*;

public class RoutesForLocation {

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

        try {
            // Define the location parameters
            double lat = 47.653435;
            double lon = -122.305641;
            double radius = 1000.0;

            // Create the parameters for the routes for location request
            RoutesForLocationListParams params = RoutesForLocationListParams.builder()
                    .lat(lat)
                    .lon(lon)
                    .radius(radius)
                    .build();

            // Retrieve the routes for location
            RoutesForLocationListResponse routesForLocation =
                    client.routesForLocation().list(params);

            for (RoutesForLocationListResponse.Data.List route :
                    routesForLocation.data().list()) {
                System.out.println(route);
            }
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
