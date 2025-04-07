package org.dynamic.programming

import kotlin.math.max

fun maxProductOfSubArray(numbers: Array<Int>): Int {
    var currentMaxProduct = 1
    var currentMinProduct = 1
    var maxProduct = currentMaxProduct

    for (number in numbers){
        if (number == 0) {
            currentMaxProduct = 1
            currentMinProduct = 1
        }
        val temp = currentMaxProduct * number
        currentMaxProduct = maxOf(currentMaxProduct * number, currentMinProduct * number, number)
        currentMinProduct = minOf(temp, number * currentMinProduct, number)

        maxProduct = max(currentMaxProduct, maxProduct)
    }

    return maxProduct
}