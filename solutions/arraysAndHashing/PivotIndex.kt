package solutions.arraysAndHashing

// O(n) time O(1) memory
fun pivotIndex(nums: IntArray): Int {
    var rightSum = 0

    for (n in nums) {
        rightSum += n
    }

    var leftSum = 0

    for (i in nums.indices) {
        rightSum -= nums[i]

        if (leftSum == rightSum) {
            return i
        }

        leftSum += nums[i]
    }

    return -1
}
