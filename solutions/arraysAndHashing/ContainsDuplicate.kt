package solutions.arraysAndHashing

// O(n) time & space

fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()

    for (n in nums) {
        if (n in seen) return true

        seen.add(n)
    }

    return false
}

fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 4, 5)))
}
