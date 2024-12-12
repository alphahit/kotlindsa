package com.example.dsa.hashmap

object TwoSum {
    fun twosum(array: IntArray, targetSum: Int) {

        var sumMap: HashMap<Int, Int> = HashMap<Int, Int>()

        for ((index, num) in array.withIndex()){
            val complement = targetSum - num
            if(sumMap.containsKey(complement)){
                println(intArrayOf(array[index],array[sumMap[complement]!!]).contentToString())
                return
            }else{
                sumMap[num] = index
            }
        }


       println("No Pairs Found")
    }
}