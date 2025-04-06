package org.datastructures

/*
* Problem proposed
* Given an array of nums, return an array answer such that answer[i] is equal to the product
* of all elements of nums except for nums[i]
*
* Example 1:
* Input: nums = [1, 2, 3, 4]
* Output: [24, 12, 8, 6]
*
* Example 2:
*
* */

fun calculateTheSumExceptI(arrayOfElements: Array<Int>): Array<Int> {
    var responseArray = emptyArray<Int>()
    for (i in 0..arrayOfElements.indices.last){
        val sumOfElementsExceptIndexI = calculateRecursivelyTheSumOfArray(
            arrayOfElements.sliceArray(arrayOfElements.indices.filter { ind -> ind != i })
        )
        responseArray = responseArray.plus(sumOfElementsExceptIndexI)
    }

    return responseArray
}

fun calculateRecursivelyTheSumOfArray(arrayOfElements: Array<Int>): Int {
    if (arrayOfElements.size == 1) {
        return arrayOfElements[0]
    }
    return arrayOfElements[0] *
            calculateRecursivelyTheSumOfArray(arrayOfElements.sliceArray(arrayOfElements.indices.drop(1)))
}