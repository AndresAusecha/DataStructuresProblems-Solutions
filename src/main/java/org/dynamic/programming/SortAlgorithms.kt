package org.dynamic.programming

fun quickSort(arrayToSort: Array<Int>): Array<Int> {
    if (arrayToSort.isEmpty() ) {
        return arrayToSort
    }

    val pivot = arrayToSort[0]

    var newLeftArray = emptyArray<Int>()
    var newRightArray = emptyArray<Int>()
    for (number in arrayToSort) {
        if (number < pivot) {
            newLeftArray = newLeftArray.plus(number)
        } else if (number > pivot) {
            newRightArray = newRightArray.plus(number)
        }
    }

    return quickSort(newLeftArray).plus(pivot).plus(quickSort(newRightArray))
}