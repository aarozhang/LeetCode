package solutions.arraysAndHashing

// O(n) time & space

fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableMapOf<Int, Int>()

    for (n in nums) {
        seen[n] = seen.getOrDefault(n, 0) + 1

        if (seen[n]!! >= 2) return true
    }

    return false
}

fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 4, 5)))
}
