package com.example.dsa.arrays

import kotlin.math.max

//TC : O(n1 + n2)
//SC : O(n1 + n2)
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
            mergedList.add(listRight[j])
            j++
        }
        return mergedList
    }

    fun mergesortinplace(listLeft: List<Int>, listRight: List<Int>): MutableList<Int> {

        val modifierLeft = listLeft.toMutableList()
        val modifierRight = listRight.toMutableList()
        var i = modifierLeft.size - 1
        var j = 0
        while (i>= 0 && j<modifierRight.size){
            if (modifierLeft[i]<modifierRight[j]){
                i--
            }else{
                val temp = modifierRight[j]
                modifierRight[j] = modifierLeft[i]
                modifierLeft[i] = temp
                i--
                j++
            }
        }
        modifierLeft.sort()
        modifierRight.sort()
        modifierLeft.addAll(modifierRight)
        //To convert to normal list
        //modifierLeft.toList()
        return modifierLeft
    }
}