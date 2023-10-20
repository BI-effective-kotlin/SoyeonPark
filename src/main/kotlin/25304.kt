import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val total = br.readLine().toInt()
    val n = br.readLine().toInt()

    var sum = 0

    for (i in 1..n) {
        val st = StringTokenizer(br.readLine())

        val money = st.nextToken().toInt()
        val m = st.nextToken().toInt()

        sum += money * m
    }

    if (total == sum) {
        println("Yes")
    } else {
        println("No")
    }
}
