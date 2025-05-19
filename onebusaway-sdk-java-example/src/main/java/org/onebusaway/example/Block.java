package org.onebusaway.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.errors.OnebusawaySdkServiceException;
import org.onebusaway.models.*;

public class Block {

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

        // Define the block ID
        String blockId = "1_7331695";

        try {
            // Define the parameters for the block retrieval request
            BlockRetrieveParams params =
                    BlockRetrieveParams.builder().blockId(blockId).build();

            // Retrieve the block information
            BlockRetrieveResponse block = client.block().retrieve(params);

            System.out.println(block);

        } catch (OnebusawaySdkServiceException e) {

            // Handle the SDK-specific service exception
            System.err.println("Error occurred: " + e.getMessage());
            System.err.println("Status Code: " + e.statusCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
