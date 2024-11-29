package org.onebusaway.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.errors.OnebusawaySdkServiceException;
import org.onebusaway.models.*;

public class RouteForAgency {

    // Retrieve constants from environment variables or fallback to default values
    static final String API_KEY = System.getenv("ONEBUSAWAY_API_KEY") != null ? System.getenv("ONEBUSAWAY_API_KEY") : "TEST";
    static final String BASE_URL = System.getenv("ONEBUSAWAY_BASE_URL") != null ? System.getenv("ONEBUSAWAY_BASE_URL") : "https://api.pugetsound.onebusaway.org";

    // Initialize the Onebusaway SDK client
    static final OnebusawaySdkClient client = OnebusawaySdkOkHttpClient.builder()
            .apiKey(API_KEY)
            .baseUrl(BASE_URL)
            .build();


    public static void main(String[] args) {

        try {

            // Define the agency ID
            String agencyId = "1";

            // Create the parameters for the routes for agency list request
            RoutesForAgencyListParams params = RoutesForAgencyListParams.builder()
                    .agencyId(agencyId)
                    .build();

            // Retrieve the routes for the agency
            RoutesForAgencyListResponse routesForAgency = client.routesForAgency().list(params);

            for (RoutesForAgencyListResponse.Data.List route : routesForAgency.data().list()) {
                System.out.println(route);
            }
        }
        catch (OnebusawaySdkServiceException e) {
            System.err.println("Error occurred: " + e.getMessage());
            System.err.println("Status Code: " + e.statusCode());
        }
        catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }

}
