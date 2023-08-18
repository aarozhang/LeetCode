package solutions.arraysAndHashing

// O(n) time O(n) memory
fun pivotIndex(nums: IntArray): Int {
    val leftSums = IntArray(nums.size)
    val rightSums = IntArray(nums.size)

    var sum = 0
    for (i in nums.indices) {
        leftSums[i] = sum
        sum += nums[i]
    }

    sum = 0
    for (i in nums.size - 1 downTo 0) {
        rightSums[i] = sum
        sum += nums[i]
    }

    for (i in nums.indices) {
        if (leftSums[i] == rightSums[i]) return i
    }

    return -1
}
