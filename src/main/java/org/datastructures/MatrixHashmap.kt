package org.datastructures


class MatrixHashMap(
    private val rows: Int,
    private val cols: Int,
    private val matrix: HashMap<String, String> = java.util.HashMap()
) {
    fun setValue(row: Int, col: Int, value: String) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw IllegalArgumentException("Invalid row or column index");
        }
        this.matrix["$row,$col"] = value
    }

    fun getValue(row: Int, col: Int): String? {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw IllegalArgumentException("Invalid row or column index");
        }
        return matrix.let {
            if (matrix.containsKey("$row,$col")) matrix["$row,$col"]
            else null
        }
    }

    private fun findAdjacentCells(row: Int, col: Int): List<String> {
        var adjacentCells = emptyList<String>()

        if (this.matrix.containsKey("${row},${col+1}")) {
            adjacentCells = adjacentCells.plus("${row},${col+1}")
        }

        if (this.matrix.containsKey("${row},${col-1}")) {
            adjacentCells = adjacentCells.plus("${row},${col-1}")
        }

        if (this.matrix.containsKey("${row+1},${col}")) {
            adjacentCells = adjacentCells.plus("${row+1},${col}")
        }

        if (this.matrix.containsKey("${row-1},${col}")) {
            adjacentCells = adjacentCells.plus("${row-1},${col}")
        }

        return adjacentCells
    }

    fun searchWord(word: String): Boolean {
        return this.searchWord(0, 0, "", word)
    }

    private fun searchWord(i: Int, j: Int, currentWord: String, word: String): Boolean {
        val adjacentCells = this.findAdjacentCells(i, j)

        val currentWordWithCurrentLetter = "$currentWord${this.getValue(i, j)}"

        if (word == currentWordWithCurrentLetter) {
            return true
        }

        if (i == this.rows && j == this.cols) {
            return false
        }

        if (word.contains(currentWordWithCurrentLetter)) {
            return adjacentCells.map { cellKey ->
                val partsOfKey = cellKey.split(",")

                this.searchWord(Integer.valueOf(partsOfKey[0]), Integer.valueOf(partsOfKey[1]), currentWordWithCurrentLetter, word)
            }.any { result -> result }
        }

        return false
    }
}