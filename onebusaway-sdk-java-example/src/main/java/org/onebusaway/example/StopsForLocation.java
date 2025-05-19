package org.onebusaway.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.models.*;

public class StopsForLocation {

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

        // Define location parameters (example: Space Needle)
        double lat = 47.6205;
        double lon = -122.3493;
        double radius = 500;

        // Build request parameters for fetching stops
        StopsForLocationListParams params = StopsForLocationListParams.builder()
                .lat(lat)
                .lon(lon)
                .radius(radius)
                .build();

        // Fetch stops for the given location
        StopsForLocationListResponse response = client.stopsForLocation().list(params);

        // Extract the data and references from the response
        StopsForLocationListResponse.Data data = response.data();
        References references = data.references();
        List<StopsForLocationListResponse.Data.List> stops = data.list();

        // Create a map to reference routes by their IDs for faster lookup
        Map<String, References.Route> referenceMap = new HashMap<>();
        for (References.Route route : references.routes()) {
            referenceMap.put(route.id(), route);
        }

        // Print information for each stop
        for (StopsForLocationListResponse.Data.List stop : stops) {
            System.out.printf("%s (%f, %f)\n", stop.name(), stop.lat(), stop.lon());
            System.out.println("  Routes:");

            // For each stop, print associated routes
            for (String routeId : stop.routeIds()) {
                References.Route route = referenceMap.get(routeId);
                if (route == null) continue; // Skip if route is not found

                // Build a description for the route
                String routeDescription = buildRouteDescription(route);
                System.out.printf("    %s\n", routeDescription);
            }

            System.out.println(); // Add a blank line between stops for clarity
        }
    }

    // Helper method to build the route description using optional values
    private static String buildRouteDescription(References.Route route) {
        StringBuilder description = new StringBuilder();

        // Append short name if present
        route.shortName().ifPresent(description::append);

        // Append description if present
        route.description().ifPresent(desc -> {
            if (description.length() > 0) {
                description.append(" - ");
            }
            description.append(desc);
        });

        return description.toString();
    }
}
