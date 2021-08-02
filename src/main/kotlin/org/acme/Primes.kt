package org.acme

import java.math.BigInteger

class Primes private constructor(val max: Long, val results: Set<Long>, val certainty: Int) {
    companion object {
        fun generate(max: Long, certainty: Int): Primes {
            val results = (1..max).filter {
                BigInteger.valueOf(it).isProbablePrime(certainty)
            }.toSortedSet()

            return Primes(max, results, certainty)
        }
    }
}