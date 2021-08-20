package hackerrank.algo

//https://www.hackerrank.com/challenges/mini-max-sum/problem

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    var sorted: Array<Int> = arr.sortedArray()
    var sum: Long= 0
    for (i in sorted) {
        sum += i
    }
    print("${sum - sorted[arr.size - 1]} "+"${sum - sorted[0]}")


}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
