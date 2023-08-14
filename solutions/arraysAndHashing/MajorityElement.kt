package solutions.arraysAndHashing

fun majorityElement(nums: IntArray): Int {
    val counts = mutableMapOf<Int, Int>()

    for (n in nums) {
        counts[n] = counts.getOrDefault(n, 0) + 1
    }

    for ((k, v) in counts) {
        if (v >= (nums.size / 2) + 1) return k
    }

    return -1
}
