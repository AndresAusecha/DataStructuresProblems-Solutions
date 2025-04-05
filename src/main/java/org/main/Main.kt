package org.main

import org.datastructures.getIndicesOfAdditionToTarget
import org.datastructures.getIndicesOfAdditionToTargetAlt

fun main() {
    getIndicesOfAdditionToTarget(arrayOf(10, 7, 9, 8, 16, 2), 10)
        .forEach { i ->
            println("index $i")
        }

    getIndicesOfAdditionToTargetAlt(arrayOf(10, 7, 9, 8, 16, 2), 10)
        .forEach { i ->
            println("index $i")
        }
}