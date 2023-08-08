package solutions.arraysAndHashing

fun isAnagram(s: String, t: String): Boolean {
    val counts = Array(26) {0}

    for (c in s) {
        counts[c - 'a'] += 1
    }

    for (c in t) {
        counts[c - 'a'] -= 1
    }

    for (n in counts) {
        if (n != 0) return false
    }

    return true
}