package com.example.dsa.arrays

object ReverseArray {
    fun reverse(array: IntArray): IntArray {
        var start = 0
        var end = array.size - 1
        while (start < end) {
            var temp = array[start]
            array[start] = array[end]
            array[end] = temp
            start++
            end--
        }


        println(array.joinToString(", "))

        return array

    }
}