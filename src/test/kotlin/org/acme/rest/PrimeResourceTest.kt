package org.acme.rest

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.hasItems
import org.junit.jupiter.api.Test

@QuarkusTest
class PrimeResourceTest {

    @Test
    fun testPrimeEndpoint() {
        given()
            .`when`().get("/primes/11/100")
            .then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("certainty", equalTo(100))
            .body("max", equalTo(11))
            .body("results.size()", equalTo(5))
            .body("results", hasItems(2, 3, 5, 7, 11))
    }
}