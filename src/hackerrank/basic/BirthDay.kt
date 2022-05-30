package hackerrank.basic

//https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
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
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    var result = 0
//    1,2,1,3,1,1,1,1 d=3,m=3 size 8
    for (i in s.indices) {

        var sum = 0
        if (i + m <= s.size) { //size is 8
            for (j in 0 until m) {
                sum += s[i + j] //index. 0-1-2  1 - 2 -1
            }
            if (sum == d) {
                result++
            }
        }

    }


    return result

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
