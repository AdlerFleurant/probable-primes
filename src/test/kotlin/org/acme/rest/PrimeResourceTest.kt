package org.acme.rest

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class PrimeResourceTest {

    @Test
    fun testPrimeEndpoint() {
        given()
            .`when`().get("/primes/11/100")
            .then()
            .statusCode(200)
            .body(`is`("{\"certainty\":100,\"max\":11,\"results\":[2,3,5,7,11]}"))
    }
}