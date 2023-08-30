package solutions.arraysAndHashing

// O(nlogn) time; O(n) space

// Merge Sort
fun sortArray(nums: IntArray): IntArray {
    mergeSort(nums, 0, nums.lastIndex)
    return nums
}

private fun mergeSort(nums: IntArray, left: Int, right: Int) {
    if (left == right) return

    val mid = (left + right) / 2
    mergeSort(nums, left, mid)
    mergeSort(nums, mid + 1, right)
    merge(nums, left, mid, right)

    return
}

private fun merge(nums: IntArray, left: Int, mid: Int, right: Int) {
    val leftHalf = nums.copyOfRange(left, mid + 1)
    val rightHalf = nums.copyOfRange(mid + 1, right + 1)

    var i = left
    var j = 0 // left half pointer
    var k = 0 // right half pointer

    // iterate and sort using the three pointers
    while (j < leftHalf.size && k < rightHalf.size) {
        if (leftHalf[j] <= rightHalf[k]) {
            nums[i] = leftHalf[j]
            j += 1
        } else {
            nums[i] = rightHalf[k]
            k += 1
        }

        i += 1
    }

    // add remaining values from left, if any
    while (j < leftHalf.size) {
        nums[i] = leftHalf[j]
        j += 1
        i += 1
    }

    // add remaining values from right, if any
    while (k < rightHalf.size) {
        nums[i] = rightHalf[k]
        k += 1
        i += 1
    }
}
