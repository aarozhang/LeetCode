package solutions.twoPointers

// O(n) time, O(1) space
fun removeDuplicates(nums: IntArray): Int {
    var l = 0

    for (r in 1 until nums.size) {
        if (nums[r] != nums[l]) {
            l += 1
            nums[l] = nums[r]
        }
    }

    return l + 1
}
