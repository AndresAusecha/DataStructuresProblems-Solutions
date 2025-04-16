package org.dynamic.programming

fun quickSort(arrayToSort: List<Int>): List<Int> {
    if (arrayToSort.isEmpty() ) {
        return arrayToSort
    }

    val pivot = arrayToSort[0]

    var newLeftArray = emptyList<Int>()
    var newRightArray = emptyList<Int>()
    for (number in arrayToSort) {
        if (number < pivot) {
            newLeftArray = newLeftArray.plus(number)
        } else if (number > pivot) {
            newRightArray = newRightArray.plus(number)
        }
    }

    return quickSort(newLeftArray).plus(pivot).plus(quickSort(newRightArray))
}