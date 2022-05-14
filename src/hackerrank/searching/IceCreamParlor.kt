package hackerrank.searching
//https://www.hackerrank.com/challenges/icecream-parlor/problem


/*
 * Complete the 'icecreamParlor' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER m
 *  2. INTEGER_ARRAY arr
 */

fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {
    // Write your code here
    val sum: Array<Int> = Array<Int>(2) { 0 }
    val map: HashMap<Int, Int> = HashMap()
    var complement = 0
    for (i in arr.indices) {
        complement = m - arr[i]
        if (map.containsKey(complement)) {
            sum[0] = map.get(complement)!!
            sum[1] = i + 1
            break
        } else {
            map.put(arr[i], i + 1)
        }

    }
    return sum

}

fun icecreamParlorSorted(m: Int, arr: Array<Int>): Array<Int> {
    // Write your code here
    val sortedArray = arr.sortedArray()
    val sum: Array<Int> = Array<Int>(2) { 0 }
    var left = 0
    var right = sortedArray.size - 1
    var addition = 0
    while (left < right) {
        addition = sortedArray[left] + sortedArray[right]
        if (addition == m) {
            sum[0] = left + 1
            sum[1] = right + 1
            break
        } else if (addition > m) {
            right--

        } else if (addition < m) left++
    }
    return sum

}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val m = readLine()!!.trim().toInt()

        val n = readLine()!!.trim().toInt()

        val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        val result = icecreamParlor(m, arr)
//        val result = icecreamParlorSorted(m, arr)

        println(result.joinToString(" "))
    }
}
