package com.example.dsa

import com.example.dsa.arrays.ReverseArray

fun main(){

    //The intArrayOf function in Kotlin is a standard library function used to
    //create an IntArray, which is a specialized array type for storing integers.
    //Kotlin provides similar functions for creating arrays of other primitive
    //types as well, such as doubleArrayOf, floatArrayOf, and charArrayOf.
    ReverseArray.reverse(intArrayOf(1,4,3,5,67,44)) //O(n/2)
}