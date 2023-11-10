package solutions.arraysAndHashing

// O(n) time O(n) space
class NumArray(nums: IntArray) {
    private val prefixes = mutableListOf<Int>()

    init {
        var sum = 0

        for (n in nums) {
            sum += n
            prefixes.add(sum)
        }
    }


    fun sumRange(left: Int, right: Int): Int {
        if (left == 0) return prefixes[right]
        return prefixes[right] - prefixes[left - 1]
    }

}
