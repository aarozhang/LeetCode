package solutions.twoPointers

// O(nlogn) time, O(1) space
fun minimumDifference(nums: IntArray, k: Int): Int {
    nums.sort()

    var l = 0
    var r = k - 1
    var res = 100000

    while (r < nums.size) {
        res = minOf(res, nums[r] - nums[l])
        l += 1
        r += 1
    }

    return res
}
