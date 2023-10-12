// import java.io.BufferedReader
// import java.io.InputStreamReader
// import java.util.StringTokenizer
//
// fun main() {
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val st = StringTokenizer(br.readLine())
//
//    val first = Integer.parseInt(st.nextToken())
//    val second = Integer.parseInt(st.nextToken())
//    val third = Integer.parseInt(st.nextToken())
//
//    val total = if (first == second && first == third) {
//        10000 + first * 1000
//    } else if (first == second || first == third) {
//        1000 + first * 100
//    } else if (second == third) {
//        1000 + second * 100
//    } else {
//        listOf(first, second, third).max() * 100
//    }
//
//    println("$total")
// }
