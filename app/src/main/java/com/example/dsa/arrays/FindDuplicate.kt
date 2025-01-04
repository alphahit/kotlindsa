package com.example.dsa.arrays

import kotlin.math.abs

object FindDuplicate {
    fun findduplicate(list: List<Int>): Int {
        val modifiedList = list.toMutableList()
        for (element in modifiedList) {
            val idx = abs(element)
            if (modifiedList[idx] < 0) return idx
            modifiedList[idx] = -modifiedList[idx]
        }
        return -1
    }
}