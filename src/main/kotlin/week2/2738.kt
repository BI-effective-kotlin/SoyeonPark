package week2

fun main() {
    System.`in`.bufferedReader().use { reader ->
        val (n, m) = reader.readLine().split(" ").map { it.toInt() }
        val mat = Array(n) { IntArray(m) }

        for (i in 0 until n) {
            val input = reader.readLine().split(" ").map { it.toInt() }

            for (j in 0 until m) {
                mat[i][j] = input[j]
            }
        }

        for (i in 0 until n) {
            val input = reader.readLine().split(" ").map { it.toInt() }

            for (j in 0 until m) {
                mat[i][j] += input[j]
            }
        }

        for (i in 0 until n) {
            for (j in 0 until m) {
                print("${mat[i][j]} ")
            }
            println()
        }
    }
}
