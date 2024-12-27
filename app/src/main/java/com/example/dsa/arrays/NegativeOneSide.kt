package com.example.dsa.arrays

object NegativeOneSide {

    fun negativeOneSide(arr: List<Int>): List<Int> {

        // Create a mutable copy of the input list to allow in-place modifications
        val modifiedArr = arr.toMutableList()

        var i = 0
        var j = modifiedArr.size - 1

        while (i < j) {
            while (i < j && modifiedArr[i] < 0) {
                i++
            }
            while (i < j && modifiedArr[j] > 0) {
                j--
            }
            if (i < j) {
                var temp = modifiedArr[i]
                modifiedArr[i] = modifiedArr[j]
                modifiedArr[j] = temp
            }


        }

        return modifiedArr
    }
}