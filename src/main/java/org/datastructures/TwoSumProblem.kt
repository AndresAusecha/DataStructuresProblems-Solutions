package org.datastructures

fun getIndicesOfAdditionToTarget(numbers: Array<Int>, target: Int): Array<Int> {
    for (i in 0..numbers.size - 2) {
        for (j in numbers.indices) {
            if((numbers[i] + numbers[j]) == target && i != j) {
                return arrayOf(i, j)
            }
        }
    }

    return emptyArray()
}

fun getIndicesOfAdditionToTargetAlt(numbers: Array<Int>, target: Int): Array<Int> {
    val mapOfIndexesAndNumbers = HashMap<Int, Int>()
    for (i in numbers.indices) {
        val subtraction = target - numbers[i]

        if (mapOfIndexesAndNumbers.values.contains(subtraction)) {
            val indexOfTheOtherInt = mapOfIndexesAndNumbers.filter { (_, value) -> value == subtraction }.keys.first()

            return arrayOf(i, indexOfTheOtherInt)
        }

        mapOfIndexesAndNumbers[i] = numbers[i]
    }

    return emptyArray()
}