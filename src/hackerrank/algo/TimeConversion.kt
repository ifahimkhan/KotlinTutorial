package hackerrank.algo

import java.text.SimpleDateFormat
import java.util.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code
    try {

        lateinit var input: String
        if (s.contains("AM"))
            input = s.replace("AM", " AM")
        else
            input = s.replace("PM", " PM")
        var sdf: SimpleDateFormat = SimpleDateFormat("hh:mm:ss a")
        var date: Date = sdf.parse(input);

        var sdf24: SimpleDateFormat = SimpleDateFormat("HH:mm:ss")

        var ans: String = sdf24.format(date)
        return ans
    } catch (e: Exception) {
        return e.toString()
    }


}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
