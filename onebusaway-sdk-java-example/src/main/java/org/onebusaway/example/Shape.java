package org.onebusaway.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.models.*;

public class Shape {

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

        // Define the shape ID
        String shapeId = "1_10002005";

        // Define the parameters for the shape retrieval request
        ShapeRetrieveParams params =
                ShapeRetrieveParams.builder().shapeId(shapeId).build();

        // Retrieve the shape information
        ShapeRetrieveResponse shape = client.shape().retrieve(params);

        System.out.println(shape.data());
    }
}
