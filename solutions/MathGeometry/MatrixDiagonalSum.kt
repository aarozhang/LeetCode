package solutions.MathGeometry

// O(n) time and space

fun diagonalSum(mat: Array<IntArray>): Int {
    var sum = 0
    val seen = mutableSetOf<String>()
    var j = 0

    for (i in mat.indices) {
        sum += mat[i][j]
        seen.add("$i$j")
        j += 1
    }

    j = mat.size - 1
    for (i in mat.indices) {
        if ("$i$j" in seen) {
            j -= 1
            continue
        }

        sum += mat[i][j]
        j -= 1
    }

    return sum
}
