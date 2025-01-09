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

    fun subarraysumOptimal(arr: IntArray, k: Int): Int{
        val prefixSumOccurMap = HashMap<Int, Int>()
        prefixSumOccurMap[0] = 1
        var totalSubarrays = 0
        var prefixSum = 0
        for (num in arr) {
            prefixSum += num

            // Check if (prefixSum - k) exists in the map
            if (prefixSumOccurMap.containsKey(prefixSum - k)) {
                totalSubarrays += prefixSumOccurMap[prefixSum - k]!!
            }

            // Update the map with the current prefixSum
            prefixSumOccurMap[prefixSum] = prefixSumOccurMap.getOrDefault(prefixSum, 0) + 1
        }

        return totalSubarrays
    }
}