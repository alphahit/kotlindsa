package com.example.dsa.sort

object Quicksort {
    fun sort(arr: IntArray): IntArray {
        if (arr.size < 2) {
            return arr
        }

        //  var pivot = arr[arr.size - 1]
        var pivot = arr.last()

        val left = arr.filter { it < pivot }.toIntArray()
        val right = arr.filter { it >= pivot && it != pivot }.toIntArray()

        return (sort(left).toList() + pivot + sort(right).toList()).toIntArray()
    }
}