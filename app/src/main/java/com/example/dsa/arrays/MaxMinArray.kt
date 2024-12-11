package com.example.dsa.arrays

object MaxMinArray {
    fun min(array: IntArray): Unit {
       var currentMin = Int.MAX_VALUE

        for (i in array) {
            if (i <  currentMin) {
                currentMin = i
            }

        }

        println("Minimum Value: $currentMin")
    }


    fun max(array: IntArray): Unit {
        var currentMax = Int.MIN_VALUE


        for (i in array) {
            if (i > currentMax) {
                currentMax = i
            }
        }
        println("Maximum Value: $currentMax")

    }


}