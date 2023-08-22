package solutions.arraysAndHashing

fun generate(numRows: Int): List<List<Int>> {
    val res = mutableListOf<List<Int>>()
    res.add(mutableListOf<Int>(1))

    for (i in 1 until numRows) {
        val temp = mutableListOf(0) + res[i - 1] + mutableListOf(0)
        val row = mutableListOf<Int>()

        for (j in 0 until temp.size - 1) {
            row.add(temp[j] + temp[j + 1])
        }

        res.add(row)
    }

    return res
}
