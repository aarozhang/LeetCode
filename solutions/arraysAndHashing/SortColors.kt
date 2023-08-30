package solutions.arraysAndHashing

// O(n) time; O(1) space

// bucket sort approach
fun sortColors(nums: IntArray): Unit {
    val bucket = IntArray(3)

    for (n in nums) {
        when (n) {
            0 -> bucket[0] += 1
            1 -> bucket[1] += 1
            2 -> bucket[2] += 1
        }
    }

    var i = 0
    while (i < nums.size && bucket[0] != 0) {
        nums[i] = 0

        i += 1
        bucket[0] -= 1
    }

    while (i < nums.size && bucket[1] != 0) {
        nums[i] = 1

        i += 1
        bucket[1] -= 1
    }

    while (i < nums.size && bucket[2] != 0) {
        nums[i] = 2

        i += 1
        bucket[2] -= 1
    }
}

// todo: Optimized linear solution
