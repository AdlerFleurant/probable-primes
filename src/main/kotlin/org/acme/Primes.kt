package org.acme

import java.math.BigInteger
import java.util.stream.Collectors
import java.util.stream.LongStream

class Primes private constructor(val max: Long, val results: Set<Long>, val certainty: Int) {
    companion object {
        fun generate(max: Long, certainty: Int): Primes {
            val results = LongStream.rangeClosed(1, max)
                .filter { i: Long -> BigInteger.valueOf(i).isProbablePrime(certainty) }
                .boxed()
                .collect(Collectors.toSet())

            return Primes(max, results, certainty)
        }
    }
}