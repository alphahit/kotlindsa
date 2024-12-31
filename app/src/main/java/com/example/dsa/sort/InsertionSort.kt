package com.example.dsa.sort

object InsertionSort {
    fun sort(arr: List<Int>):List<Int>{
        val modifiedArr = arr.toMutableList()
      for (i in 1 until modifiedArr.size){
          var current = modifiedArr[i]
          var j = i-1
          while (j >= 0 && modifiedArr[j] > current) {
              modifiedArr[j+1] = modifiedArr[j]
              j--
          }
          modifiedArr[j+1] = current
      }
        return modifiedArr
    }
}