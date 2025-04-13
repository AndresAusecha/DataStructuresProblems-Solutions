package org.dynamic.programming

fun findTargetIndex(numbers: Array<Int>, target: Int): Int {
    if (target < numbers[0] || numbers[numbers.lastIndex] < target) {
        return -1
    }
    return findTargetByBinarySearch(numbers, target, numbers.indices.first, numbers.indices.last)
}

fun findTargetByBinarySearch(numbers: Array<Int>, target: Int, startInd: Int, endInd: Int): Int {
    val middle = (startInd + endInd) / 2

    if (numbers[middle] == target) {
        return middle
    }

    return if (target < numbers[middle]) {
        findTargetByBinarySearch(numbers, target, startInd, middle)
    } else {
        findTargetByBinarySearch(numbers, target, middle, endInd)
    }
}

