package solutions.arraysAndHashing

// This problem can be surprisingly tricky when trying to figure out how to collect occurrences of occurrences
// O(n) time, space
fun uniqueOccurrences(arr: IntArray): Boolean {
    // count occurrences of nums in arr
    val map = mutableMapOf<Int, Int>()

    for (n in arr) {
        map[n] = map.getOrDefault(n, 0) + 1
    }

    // count occurrences of occurrences
    val counts = mutableMapOf<Int, Int>()

    for (v in map.values) {
        counts[v] = counts.getOrDefault(v, 0) + 1
    }

    // check for uniqueness
    for (v in counts.values) {
        if (v != 1) return false
    }

    return true
}