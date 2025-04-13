package org.datastructures

import kotlin.math.abs

class TreeNode(val value: Int){
    var leftNode: TreeNode? = null
    var rightNode: TreeNode? = null
}

fun validateTheBinaryTree(tree: TreeNode?): Boolean {
    if (tree == null) {
        return true
    }
    return tree.value > (tree.leftNode?.value ?: Int.MIN_VALUE) && tree.value < (tree.rightNode?.value ?: Int.MAX_VALUE)
            && validateTheBinaryTree(tree.leftNode) && validateTheBinaryTree(tree.rightNode)
}

fun validateHeightBalance(tree: TreeNode?): Boolean {
    val leftHeight = validateHeightBalanceRecursive(tree?.leftNode)
    val rightHeight = validateHeightBalanceRecursive(tree?.rightNode)

    return abs(leftHeight - rightHeight) <= 1
}

fun validateHeightBalanceRecursive(tree: TreeNode?): Int {
    if (tree == null) {
        return 0
    }
    return 1 + validateHeightBalanceRecursive(tree.leftNode) + validateHeightBalanceRecursive(tree.rightNode)
}

fun generateBinaryTrees(): Pair<TreeNode, TreeNode> {
    val balancedTree = TreeNode(20)
    val leftNode1 = TreeNode(13)
    val rightNode1 = TreeNode(30)

    balancedTree.leftNode = leftNode1
    balancedTree.rightNode = rightNode1

    val leftNode2 = TreeNode(10)
    val rightNode2 = TreeNode(14)

    balancedTree.leftNode!!.leftNode = leftNode2
    balancedTree.leftNode!!.rightNode = rightNode2

    val rightNode2Left = TreeNode(25)
    val rightNode2Right = TreeNode(35)

    balancedTree.rightNode!!.leftNode = rightNode2Left
    balancedTree.rightNode!!.rightNode = rightNode2Right


    // -------------------------------------------------

    val unBalancedTree = TreeNode(20)
    val unBalancedTreeLeft = TreeNode(25)
    val unBalancedTreeRight = TreeNode(30)

    unBalancedTree.leftNode = unBalancedTreeLeft
    unBalancedTree.rightNode = unBalancedTreeRight

    return Pair(balancedTree, unBalancedTree)
}

fun generateBinaryTrees2(): Pair<TreeNode, TreeNode> {
    val heightUnbalancedTree = TreeNode(0)
    val heightUnbalancedTree1 = TreeNode(1)
    val heightUnbalancedTree2 = TreeNode(2)

    val heightUnbalancedTree21 = TreeNode(3)
    val heightUnbalancedTree22 = TreeNode(4)

    val heightUnbalancedTree221 = TreeNode(5)
    val heightUnbalancedTree222 = TreeNode(6)

    heightUnbalancedTree22.leftNode = heightUnbalancedTree221
    heightUnbalancedTree22.rightNode = heightUnbalancedTree222

    heightUnbalancedTree2.leftNode = heightUnbalancedTree21
    heightUnbalancedTree2.rightNode = heightUnbalancedTree22

    heightUnbalancedTree.leftNode = heightUnbalancedTree1
    heightUnbalancedTree.rightNode = heightUnbalancedTree2

    // ------------------------------------------------------------ //

    val balancedTree = TreeNode(0)
    val balancedTree1 = TreeNode(1)
    val balancedTree2 = TreeNode(2)

    val balancedTree11 = TreeNode(3)
    val balancedTree12 = TreeNode(4)

    val balancedTree21 = TreeNode(5)
    val balancedTree22 = TreeNode(6)

    balancedTree1.leftNode = balancedTree11
    balancedTree1.rightNode = balancedTree12

    balancedTree2.leftNode = balancedTree21
    balancedTree2.rightNode = balancedTree22

    return Pair(balancedTree, heightUnbalancedTree)
}
