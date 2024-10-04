package org.onebusaway.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.models.*;

public class Stop {

    // Retrieve constants from environment variables or fallback to default values
    static final String API_KEY = System.getenv("ONEBUSAWAY_API_KEY") != null ? System.getenv("ONEBUSAWAY_API_KEY") : "TEST";
    static final String BASE_URL = System.getenv("ONEBUSAWAY_BASE_URL") != null ? System.getenv("ONEBUSAWAY_BASE_URL") : "https://api.pugetsound.onebusaway.org";

    // Initialize the Onebusaway SDK client
    static final OnebusawaySdkClient client = OnebusawaySdkOkHttpClient.builder()
            .apiKey(API_KEY)
            .baseUrl(BASE_URL)
            .build();


    public static void main(String[] args) {

        // Define the stop ID
        String StopID = "1_75403";

        // Define the parameters for the stop retrieval request
        StopRetrieveParams params = StopRetrieveParams.builder().stopId(StopID).build();

        // Retrieve the stop information
        StopRetrieveResponse stop = client.stop().retrieve(params);

        System.out.println(stop);
    }

}
