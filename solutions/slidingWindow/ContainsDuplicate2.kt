package solutions.slidingWindow

// O(n) time and space
fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    var l = 0
    var r = 0
    val set = mutableSetOf<Int>()

    while (r < nums.size) {
        if (r - l > k) {
            set.remove(nums[l])
            l += 1
        }

        if (nums[r] in set) return true

        set.add(nums[r])
        r += 1
    }

    return false
}
