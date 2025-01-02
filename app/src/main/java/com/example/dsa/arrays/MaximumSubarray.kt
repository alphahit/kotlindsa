package com.example.dsa.arrays

object MaximumSubarray {
    fun maximumsubarrayBrute(arr: List<Int>) {

        var maxSum = Int.MIN_VALUE
        for (i in 0 until arr.size) {
            var sum = 0
            for (j in i until arr.size)
                sum = sum + arr[j]
            if (sum > maxSum) {
                maxSum = sum
            }
        }

        println("Brute -> $maxSum")
    }

    fun maximumsubarrayKadane(arr: List<Int>){
        var maxSum = Int.MIN_VALUE
        var sum = 0
        for (i in 0 until arr.size) {
           sum = sum + arr[i]
           if(sum > maxSum){
               maxSum = sum
           }else if(sum < 0){
               sum = 0
           }
        }
        println("Kadane -> $maxSum")
    }
}