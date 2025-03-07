class Solution {
    fun closestPrimes(left: Int, right: Int): IntArray {
        if (right < 2) return intArrayOf(-1, -1) // No primes exist below 2

        // Step 1: Use Sieve of Eratosthenes to find primes
        val isPrime = BooleanArray(right + 1) { true }
        isPrime[0] = false
        isPrime[1] = false

        for (i in 2..Math.sqrt(right.toDouble()).toInt()) { // Loop only up to sqrt(right)
            if (isPrime[i]) {
                for (j in i * i..right step i) { // Mark multiples of i as false
                    isPrime[j] = false
                }
            }
        }

        // Step 2: Collect primes within the range [left, right]
        val primes = mutableListOf<Int>()
        for (i in left..right) {
            if (isPrime[i]) primes.add(i)
        }

        // Step 3: Find the closest prime pair
        if (primes.size < 2) return intArrayOf(-1, -1) // Not enough primes

        var minDiff = Int.MAX_VALUE
        var result = intArrayOf(-1, -1)

        for (i in 0 until primes.size - 1) {
            val diff = primes[i + 1] - primes[i]
            if (diff < minDiff) {
                minDiff = diff
                result = intArrayOf(primes[i], primes[i + 1])
            }
        }

        return result
    }
}
