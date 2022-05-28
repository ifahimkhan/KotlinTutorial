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
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var result: Array<Int> = Array<Int>(2) { 0 }
    var max = -1
    var min = -1
    for (score in scores) {
        if (max == -1) {
            max = score
            min = score
            continue
        }
        if (score > max) {
            max = score
            result[0] = result[0] + 1
        }
        if (score < min) {
            min = score
            result[1] = result[1] + 1
        }
    }
    return result

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
