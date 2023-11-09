package solutions.slidingWindow

// O(n) time, space
class Solution {
    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
        if (k > arr.size || k == 0) return 0

        var res = 0
        var sum = 0
        var l = 0

        // sum up initial subarray
        for (i in 0 until k - 1) {
            sum += arr[i]
        }

        // find remaining subarrays
        for (r in k - 1 until arr.size) {
            if (r - l + 1 > k) {
                sum -= arr[l]
                l += 1
            }

            sum += arr[r]

            if (sum / k >= threshold) {
                res += 1
            }

        }

        return res
    }
}