package hackerrank.basic
//https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
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
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
//    // Write your code here
//    apples.map { print("$it,") }
//    println("")
//    oranges.map { print("$it,") }

    println(apples.map { it + a }.filter { it >= s && it<=t }.size)
    println(oranges.map { it + b }.filter { it >=s && it <= t }.size)
//    println("After")

//    addedApples.map { print("$it,") }
//    println("")
//    addedOranges.map { print("$it,") }
//    val applesCount = addedApples.filter { it >= s }.size
//    val orangesCount = addedOranges.filter { it <= t }.size
//    println(addedApples)
//    println(addedOranges)

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
