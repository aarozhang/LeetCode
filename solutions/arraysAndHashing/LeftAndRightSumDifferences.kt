package solutions.arraysAndHashing

// O(n) time, space
fun leftRightDifference(nums: IntArray): IntArray {
    if (nums.size == 1) return intArrayOf(0)

    val leftSums = IntArray(nums.size) {0}
    val rightSums = IntArray(nums.size){0}

    // calculate leftSums
    for (i in 1 until leftSums.size) {
        leftSums[i] = leftSums[i - 1] + nums[i - 1]
    }

    // calculate rightSums
    for (i in rightSums.size - 2 downTo 0) {
        rightSums[i] = rightSums[i + 1] + nums[i + 1]
    }

    // calculate res
    val res = IntArray(nums.size)
    for (i in res.indices) {
        res[i] = abs(leftSums[i] - rightSums[i])
    }

    return res
}