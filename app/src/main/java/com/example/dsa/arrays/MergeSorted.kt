package com.example.dsa.arrays

import kotlin.math.max

object MergeSorted {

    private fun greaterSizeArray(listOne: List<Int>, listTwo: List<Int>): List<Int> {
        return if (listOne.size > listTwo.size) listOne else listTwo
    }

    fun mergesortednormal(listLeft: List<Int>, listRight: List<Int>): List<Int>{
        val mergedList  = mutableListOf<Int>()
        println(greaterSizeArray(listLeft,listRight).joinToString(", "))
        var i = 0
        var j = 0

        while (i < listLeft.size && j < listRight.size){
            if(listLeft[i]<= listRight[j]){
                mergedList.add(listLeft[i])
                i++
            }else{
                mergedList.add(listRight[j])
                j++
            }
        }

        while (i<listLeft.size){
            mergedList.add(listLeft[i])
            i++
        }
        while (j<listRight.size){
            mergedList.add(listLeft[j])
            j++
        }
        return mergedList
    }
}