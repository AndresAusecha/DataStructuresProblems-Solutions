package org.dynamic.programming

/*
* Given a string s and a dictionary of words wordDict, return true if s can be segmented
* into a space-separated sequence of one or more dictionary words
*
* Note that the same word in the dictionary may be reused multiple times in the segmentation
*
* Example 1:
* Input: s = "leetcode", wordDict = ["leet", "code"]
* Output: true
* Explanation: return true because the "leetcode" can be segmented as "leetcode"
*
* */
fun findWordsInDictionary(s: String, wordDict: Array<String>): Boolean {
    var currentWord = ""
    var brokenS = s.split("").dropLast(1).drop(1)
    var char: String
    var i = 0
    while (i <= brokenS.indices.last) {
        char = brokenS[i]
        currentWord += char

        if (wordDict.contains(currentWord)) {
            currentWord = ""
            brokenS = brokenS.drop(i + 1)
            i = -1
        }

        i++
    }

    return brokenS.isEmpty()
}