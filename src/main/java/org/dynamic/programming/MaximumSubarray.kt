package org.dynamic.programming

fun findTheMaximumSubArray(elements: Array<Int>): Array<Int> {
    var maxSum = elements[0]
    var curSum = 0
    var subArray = emptyArray<Int>()
    var maxSubArray = subArray
    for (i in elements.indices) {
        if (curSum < 0) {
            curSum = 0
            subArray = emptyArray()
        }
        curSum += elements[i]
        subArray = subArray.plus(elements[i])

        if (curSum > maxSum) {
            maxSum = curSum
            maxSubArray = subArray
        }
    }

    return maxSubArray
}