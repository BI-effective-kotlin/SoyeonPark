package week1

fun main() {
    System.`in`.bufferedReader().use { reader ->
        val (first, second, third) = reader.readLine().split(" ").map { it.toInt() }

        val total = when {
            first == second && first == third ->
                10000 + first * 1000

            first == second || first == third ->
                1000 + first * 100

            second == third ->
                1000 + second * 100

            else ->
                maxOf(first, second, third) * 100
        }
        println(total)
    }
}
