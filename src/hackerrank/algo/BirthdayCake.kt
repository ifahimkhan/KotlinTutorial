package hackerrank.algo

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem

/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    val sortedCandles = candles.sortedArray();
    val num=sortedCandles[sortedCandles.size-1]
    var count=0
    for (i in sortedCandles.indices.reversed()){
        if (num == sortedCandles[i]){
            count++;
        }else break
    }
    return count
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
