package solutions.twoPointers

// O(n) time, space
// There is a way to do this with constant space.
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val arr = IntArray(m + n) { 0 }

    var p1 = 0
    var p2 = 0
    var i = 0

    // merge arrays until one arr is exhausted
    while (p1 < m && p2 < n) {
        if (nums1[p1] <= nums2[p2]) {
            arr[i++] = nums1[p1++]
        } else {
            arr[i++] = nums2[p2++]
        }
    }

    // add remaining elements from non-exhausted array
    if (p1 < m) {
        while (p1 < m) {
            arr[i++] = nums1[p1++]
        }
    } else {
        while (p2 < n) {
            arr[i++] = nums2[p2++]
        }
    }

    // copy to nums1
    for (i in arr.indices) {
        nums1[i] = arr[i]
    }
}
