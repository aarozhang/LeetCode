package solutions.twoPointers

// O(n) time, space
// more intuitive approach but requires extra space
fun rotate(nums: IntArray, k: Int): Unit {
    val output = nums.copyOf()

    for (i in nums.indices) {
        val newIndex = (i + k) % nums.size
        nums[newIndex] = output[i]
    }

}

//O(n) time, O(1) space
// rotate in place by using array reversal
fun rotateInPlace(nums: IntArray, k: Int): Unit {
    fun reverse(left: Int, right: Int) {
        var l = left
        var r = right

        while (l < r) {
            val temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp

            l += 1
            r -= 1
        }
    }

    val modk = k % nums.size
    reverse(0, nums.lastIndex)
    reverse(0, modk - 1)
    reverse(modk, nums.lastIndex)
}
