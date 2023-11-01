package week2

fun main() {
    System.`in`.bufferedReader().use { reader ->
        val n = reader.readLine().toInt()
        val arr = IntArray(n) { reader.readLine()!!.toInt() }

        arr.sorted().forEach { print("$it\n") }
    }
}
