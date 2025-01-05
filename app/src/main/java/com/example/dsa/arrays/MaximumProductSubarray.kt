package com.example.dsa.arrays

import kotlin.math.max

object MaximumProductSubarray {
    fun maximumproduct(arr: IntArray): Int{
        var prefix = 1
        var suffix = 1
        var maxProduct = Int.MIN_VALUE
        var n = arr.size
        for (index in 0 until n) {
            if(prefix == 0) prefix = 1
            if (suffix == 0) suffix = 1
            prefix = prefix * arr[index]
            suffix = suffix * arr[n - index - 1]

            maxProduct = max(maxProduct, max(prefix, suffix))

        }
        return maxProduct
    }
}