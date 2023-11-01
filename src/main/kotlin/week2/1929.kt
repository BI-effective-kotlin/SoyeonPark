package week2

import kotlin.math.sqrt

fun main() {
    System.`in`.bufferedReader().use { reader ->
        val (m, n) = reader.readLine().split(" ").map { it.toInt() }

        val isPrime = BooleanArray(n + 1) { true }
        isPrime[0] = false
        isPrime[1] = false

        for (i in 2..sqrt(n.toDouble()).toInt()) {
            if (!isPrime[i]) continue

            for (j in i * i..n step i) {
                isPrime[j] = false
            }
        }

        for (i in m..n) {
            if (isPrime[i]) println(i)
        }
    }
}
