package org.acme

import javax.validation.constraints.Positive
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/primes")
class PrimeResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{max}/{certainty}")
    fun primes(@Positive @PathParam("max") input: Long, @Positive @PathParam("certainty") certainty: Int): Primes {
        return Primes.generate(input, certainty)
    }
}