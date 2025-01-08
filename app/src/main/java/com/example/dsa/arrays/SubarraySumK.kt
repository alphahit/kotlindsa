package com.example.dsa.arrays

object SubarraySumK {
    fun subarraysumBrute(list: List<Int>, k: Int): Boolean{
        for(i in list.indices){
            var tempSum = 0
            for(j in i until  list.size){
                tempSum = tempSum + list[j]
                if(tempSum == k){
                    return true
                }
            }
        }
        return false
    }
}