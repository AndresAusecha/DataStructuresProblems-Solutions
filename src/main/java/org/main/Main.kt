package org.main

import org.datastructures.*
import org.dynamic.programming.*

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

    /*
    calculateTheSumExceptI(arrayOf(-1, 1, 0, -3, 3)).forEach { element ->
        println("element: $element")
    }
     */
    /*
    findTheMaximumSubArray(arrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)).forEach { el ->
        println("subarray element: $el")
    }
    */
    //println(maxProductOfSubArray(arrayOf(-2, 1, 5, -6, -5, 12, 1, 0, 15)))

    //println("the in index of the target is: ${findTargetIndex(arrayOf(1, 2, 3, 4, 5, 6, 7), 4)}")

    //println("minimum: ${findTheMinInRotatedArray(arrayOf(3, 4, 5, 1, 2))}")

    //println(findWordsInDictionary("leetcode", arrayOf("leet", "code")))

    //println(findWordsInDictionary("leetcode", arrayOf("leet")))

    //quickSort(arrayOf(3, 5, 8, 7, 4, 6, 1, 2, 9)).forEach { i -> "element ${println(i)}" }

    //val (_, unbalancedTree) = generateBinaryTrees2()

    //println("is height-balanced ${validateHeightBalance(tree.first)}")
    //println("is height-balanced ${validateHeightBalance(tree.second)}")

    //println("is tree balanced: ${validateTheBinaryTree(unbalancedTree)}")
    //println("is tree balanced: ${validateTheBinaryTree(balanceBinaryTree(unbalancedTree))}")

    val matrix = MatrixHashMap(3, 4)

    matrix.setValue(0, 0, "a")
    matrix.setValue(0, 1, "b")
    matrix.setValue(0, 2, "c")
    matrix.setValue(0, 3, "e")
    matrix.setValue(1, 0, "s")
    matrix.setValue(1, 1, "f")
    matrix.setValue(1, 2, "c")
    matrix.setValue(1, 3, "s")
    matrix.setValue(2, 0, "a")
    matrix.setValue(2, 1, "d")
    matrix.setValue(2, 2, "e")
    matrix.setValue(2, 3, "e")

    print("this is the result: ${matrix.searchWord("abcced")}")

}