package hackerrank.sorting

import java.util.*

/*
Sample input
4
4 3 1 2*/
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val res = mergeSort(arr)

    for (e in res) {
        print(e)
    }
}



fun mergeSort(array: Array<Int>): Array<Int> {
    if (array.size == 1) {
        array[0]
        return array;
    } else {
        val splitIndex: Int = array.size / 2;
        val left: Array<Int> = array.sliceArray(0..splitIndex - 1);
        val right: Array<Int> = array.sliceArray(splitIndex..array.size - 1)

        return merge(
            mergeSort(left),
            mergeSort(right)
        )
    }
}

// Merge two sorted arrays
fun merge(arr1: Array<Int>, arr2: Array<Int>): Array<Int> {
    var i = 0
    var j = 0
    var mergedArr =  ArrayList<Int>()
    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] > arr2[j]) {
            mergedArr.add(arr2[j++])
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