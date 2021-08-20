package hackerrank.sorting

import java.util.*


/*You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. Find the minimum number of swaps required to sort the array in ascending order.

Example


Perform the following steps:

i   arr                         swap (indices)
0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
5   [1, 2, 3, 4, 5, 6, 7]
It took  swaps to sort the array.

Function Description

Complete the function minimumSwaps in the editor below.

minimumSwaps has the following parameter(s):

int arr[n]: an unordered array of integers
Returns

int: the minimum number of swaps to sort the array
Input Format

The first line contains an integer, , the size of .
The second line contains  space-separated integers .

Constraints

Sample Input 0

4
4 3 1 2
Sample Output 0

3*/

// Complete the minimumSwaps function below.
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val res = minimumSwaps(arr)

    for (e in res) {
        print(e)
    }
}

fun minimumSwaps(array: Array<Int>): Array<Int> {

    return merge_Sort(array)

}

fun merge_Sort(array: Array<Int>): Array<Int> {
    if (array.size == 1) {
        array[0]
        return array;
    } else {
        val splitIndex: Int = array.size / 2;
        val left: Array<Int> = array.sliceArray(0..splitIndex - 1);
        val right: Array<Int> = array.sliceArray(splitIndex..array.size - 1)

        return _merge(
            mergeSort(left),
            mergeSort(right)
        )
    }
}

// Merge two sorted arrays
fun _merge(arr1: Array<Int>, arr2: Array<Int>): Array<Int> {
    var shift: Int = 0
    var i = 0
    var j = 0
    var mergedArr =  ArrayList<Int>()
    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] > arr2[j]) {
            mergedArr.add(arr2[j++])
            shift++
        } else mergedArr.add(arr1[i++])
    }
    while (i < arr1.size) {
        mergedArr.add(arr1[i++])

    }
    while (j < arr2.size) {
        mergedArr.add(arr2[j++])

    }

    return mergedArr.toTypedArray()
}