package com.example.dsa

import android.util.Log
import com.example.dsa.arrays.ReverseArray
import com.example.dsa.arrays.MaxMinArray

fun main() {
    //The intArrayOf function in Kotlin is a standard library function used to
    //create an IntArray, which is a specialized array type for storing integers.
    //Kotlin provides similar functions for creating arrays of other primitive
    //types as well, such as doubleArrayOf, floatArrayOf, and charArrayOf.
    val array = intArrayOf(11, 4, 3, 5, 67, 44)


    ReverseArray.reverse(array) //O(n/2)
        MaxMinArray.max(array)
        MaxMinArray.min(array)
}