package solutions.arraysAndHashing

fun containsDuplicate(nums: IntArray): Boolean {
    val map = mutableMapOf<Int, Int>()

    for (n in nums) {
        map[n] = map.getOrDefault(n, 0) + 1
    }

    for (v in map.values) {
        if (v >= 2) return true
    }

    return false
}

fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 4, 5)))
}


