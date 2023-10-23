package week1

fun main() {
    System.`in`.bufferedReader().use { reader ->
        val total = reader.readLine().toInt()
        val n = reader.readLine().toInt()

        var sum = 0

        repeat(n) {
            val (money, m) = reader.readLine().split(" ").map { it.toInt() }

            sum += money * m
        }

        println(if (total == sum) "Yes" else "No")
    }
}
