package com.example.dsa.sort
import kotlin.math.*
object MergeSort {
    fun sort(arr: List<Int>) : List<Int> {
        if(arr.size < 2){
            return arr;
        }

        val mid  = arr.size / 2
        val left = arr.subList(0,mid)
        val right = arr.subList(mid, arr.size)

        return merge(sort(left), sort(right))

    }


    fun merge(left: List<Int>, right: List<Int>): List<Int> {
        val sortedList = mutableListOf<Int>()

        var i = 0
        var j = 0

        while (i< left.size && j < right.size){
            if(left[i] < right[j]){
                sortedList.add(left[i])
                i++
            }else{
                sortedList.add(right[j])
                j++
            }
        }

        while( i < left.size){
            sortedList.add(left[i])
            i++
        }

        while( j < right.size){
            sortedList.add(right[j])
            j++
        }

        return sortedList
    }


}