package solutions.twoPointers

// O(n) time; O(1) space
fun moveZeroes(nums: IntArray): Unit {
    if (nums.size == 1) return

    var l = 0

    for (r in nums.indices){
        if (nums[r] != 0) {
            val temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp
            l += 1
        }
    }
}
