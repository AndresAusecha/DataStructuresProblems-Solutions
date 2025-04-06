package org.main

import org.dynamic.programming.calculateTheSumExceptI

fun main() {
    /*
    getIndicesOfAdditionToTarget(arrayOf(10, 7, 9, 8, 16, 2), 10)
        .forEach { i ->
            println("index $i")
        }

    getIndicesOfAdditionToTargetAlt(arrayOf(10, 7, 9, 8, 16, 2), 10)
        .forEach { i ->
            println("index $i")
        }
        */
    /*
    calculateTheSumExceptI(arrayOf(1, 2, 3, 4)).forEach { element ->
        println("element: $element")
    }*/

    calculateTheSumExceptI(arrayOf(-1, 1, 0, -3, 3)).forEach { element ->
        println("element: $element")
    }
}