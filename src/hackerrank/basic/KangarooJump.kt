package hackerrank.basic

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 */
//  0   3   6   9   12
//  4   6   8   10  12
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // Write your code here
    if (x2 > x1 && v2 >= v1) return "NO"
    if (x1 > x2 && v1 >= v2) return "NO"
    if (x1 == x2 && v1 != v2) return "NO"

    var kangroo1 = x1;
    var kangroo2 = x2;

    var behindKangroo1 = kangroo1 < kangroo2

    while (kangroo1 != kangroo2) {
        kangroo1 += v1
        kangroo2 += v2
        if (behindKangroo1) {
            if (kangroo1 > kangroo2) return "NO"
        } else {
            if (kangroo2 > kangroo1) return "NO"
        }
        println("$kangroo1 $kangroo2 ${kangroo1 == kangroo2}")
    }
    return "YES"
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
