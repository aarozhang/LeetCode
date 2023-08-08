package solutions.arraysAndHashing

fun getConcatenation(nums: IntArray): IntArray {
    val numsSize = nums.size
    val ans = Array(numsSize * 2){0}

    for (i in 0 until numsSize) {
        ans[i] = nums[i]
        ans[i + numsSize] = nums[i]
    }

    return ans.toIntArray()
}
