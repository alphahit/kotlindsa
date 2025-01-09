package com.example.dsa.arrays

object PrefixSum {
    fun prefixsum(arr: IntArray): IntArray{
        val prefixSum = IntArray(arr.size)
        prefixSum[0] = arr[0]
        for(i in 1 until arr.size){
            prefixSum[i] = prefixSum[i-1] + arr[i]
        }
        return prefixSum
    }
}