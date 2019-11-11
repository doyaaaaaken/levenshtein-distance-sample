import java.lang.Integer.max

/**
 * Get Levenshtein distance
 * https://en.wikipedia.org/wiki/Levenshtein_distance
 *
 * Computational complexity: O(mn)
 */
fun checkDistance(s1: String, s2: String): Int {
    val n = s1.length
    val m = s2.length

    if (n == 0 || m == 0) return max(n, m)

    val table = Array(n + 1) { rowIndex ->
        Array(m + 1) { colIndex ->
            if (rowIndex == 0) {
                colIndex
            } else if (colIndex == 0) {
                rowIndex
            } else {
                0
            }
        }
    }

    for (rowIndex in 1..n) {
        for (colIndex in 1..m) {
            val insert = table[rowIndex][colIndex - 1] + 1
            val delete = table[rowIndex - 1][colIndex] + 1
            val replace = table[rowIndex - 1][colIndex - 1] + if (s1[rowIndex - 1] == s2[colIndex - 1]) 0 else 1
            table[rowIndex][colIndex] = minOf(insert, delete, replace)
        }
    }

    return table[n][m]
}
