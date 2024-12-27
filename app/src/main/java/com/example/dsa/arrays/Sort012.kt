package com.example.dsa.arrays

object Sort012 {
    fun sort(arr: List<Int>): List<Int>{
        var count1 = 0
        var count0 = 0
        var count2 = 0
        for(k in arr){
            if(k == 0){
                count0++
            }else if (k == 1){
                count1++
            }else{
                count2++
            }
        }
        var i = 0
        var sortedList = mutableListOf<Int>()
        while (i < count0){
            sortedList.add(0)
            i++
        }
        i = 0
        while (i < count1){
            sortedList.add(1)
            i++
        }
        i = 0
        while (i < count2){
            sortedList.add(2)
            i++
        }
        return sortedList
    }
}