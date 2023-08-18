package solutions.arraysAndHashing

// O(n) time O(n) space
class NumArray(nums: IntArray) {
    private val prefixSums = IntArray(nums.size)

    init {
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
            prefixSums[i] = sum
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        var prefixLeft = if (left == 0) 0 else prefixSums[left - 1]

        return prefixSums[right] - prefixLeft
    }

}
