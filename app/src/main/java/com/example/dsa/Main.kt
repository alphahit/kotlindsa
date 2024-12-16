package com.example.dsa

import com.example.dsa.arrays.ReverseArray
import com.example.dsa.arrays.MaxMinArray
import com.example.dsa.hashmap.TwoSum
import com.example.dsa.sort.Quicksort
import com.example.dsa.sort.MergeSort
import java.util.Scanner

fun main() {
    //The intArrayOf function in Kotlin is a standard library function used to
    //create an IntArray, which is a specialized array type for storing integers.
    //Kotlin provides similar functions for creating arrays of other primitive
    //types as well, such as doubleArrayOf, floatArrayOf, and charArrayOf.
    //val array = intArrayOf(11, 4, 3, 5, 67, 44)
    val scanner = Scanner(System.`in`)
    // Read input numbers from the user
    println("Enter required number of integers separated by spaces and then press enter: ")
    val input = scanner.nextLine()


    //Parse input into an IntArray
    val numbers = input.trim().split("\\s+".toRegex()).mapNotNull {
        it.toIntOrNull()
    }.toIntArray()
    val numberList = input.split(" ").map { it.toInt() }
    //Display the numbers entered
    println("Numbers entered:")
    numbers.forEach { println(it) }

    //ReverseArray.reverse(array) //O(n/2)
    //MaxMinArray.max(array)
    //MaxMinArray.min(array)
    //TwoSum.twosum(array,16)
    //println(Quicksort.sort(numbers).joinToString(", "))
    println(MergeSort.sort(numberList).joinToString(", "))



}