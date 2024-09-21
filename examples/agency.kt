import com.open_transit.api.client.OnebusawaySdkClient;

fun main() {
    val client = OnebusawaySdkClient.builder()
        .baseUrl("https://api.onebusaway.org/api/where/")
        .build()

    val agency = client.agency.retrieve(AgencyRetrieveParams.builder().build())

    println("Agency: ${agency}"))
}


main();
