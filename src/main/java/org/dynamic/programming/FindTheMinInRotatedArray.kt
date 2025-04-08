package org.dynamic.programming

fun findTheMinInRotatedArray(rotatedArray: Array<Int>): Int {
    var i = 1
    while (rotatedArray[i - 1] < rotatedArray[i]){
        i++
    }
    return rotatedArray[i]
}