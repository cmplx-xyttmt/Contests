val primes = seive(41)

// Prime seive
fun seive(n: Int): List<Long> {
    val primes = mutableListOf<Long>()
    val isPrime = MutableList(n + 1) { true }
    for (i in 2..n) {
        if (isPrime[i]) {
            primes.add(i.toLong())
            for (j in 2*i until isPrime.size step i) isPrime[j] = false
        }
    }

    return primes
}

// Factorise n using the list of primes above
fun factorise(n: Int): Map<Long, Long> {
    val factors = mutableMapOf<Long, Long>()
    var nBacking = n.toLong()
    primes.forEach { prime ->
        while (nBacking % prime == 0L) {
            factors[prime] = factors[prime]?.plus(1) ?: 1
            nBacking /= prime
        }
    }

    return factors
}