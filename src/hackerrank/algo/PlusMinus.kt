package hackerrank.algo

//https://www.hackerrank.com/challenges/plus-minus/problem

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var negativeCount: Double = 0.0
    var positiveCount: Double = 0.0
    var zeroCount: Double = 0.0

    for (i in arr.indices) {
        if (arr[i] < 0) {
            negativeCount++
        } else if (arr[i] > 0) {
            positiveCount++
        } else {
            zeroCount++
        }
    }
    println(String.format("%.6f",positiveCount/arr.size ))
    println(String.format("%.6f",negativeCount/arr.size))
    println(String.format("%.6f",zeroCount/arr.size))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}
