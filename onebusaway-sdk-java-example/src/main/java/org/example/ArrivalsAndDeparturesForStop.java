package org.example;

import org.onebusaway.client.OnebusawaySdkClient;
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient;
import org.onebusaway.models.*;
public class ArrivalsAndDeparturesForStop {

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
        String stopId = "1_75403";
        int minutesBefore = 5;
        int minutesAfter = 35;

        // Define the parameters for the arrival and departure list request
        ArrivalAndDepartureListParams params = ArrivalAndDepartureListParams.builder()
                .stopId(stopId)
                .minutesBefore(minutesBefore)
                .minutesAfter(minutesAfter)
                .build();

        // Retrieve arrival and departure information
        ArrivalAndDepartureListResponse arrivalsAndDeparturesForStop = client.arrivalAndDeparture().list(params);

        for (ArrivalAndDepartureListResponse.Data.Entry.ArrivalsAndDeparture arrivalAndDeparture : arrivalsAndDeparturesForStop.data().entry().arrivalsAndDepartures()) {
            System.out.println(arrivalAndDeparture);
        }
    }

}
