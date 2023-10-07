package solutions.arraysAndHashing

// O(n) time & space
// approach using array as hash map
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val counts = Array(26) { 0 }

    for (i in s.indices) {
        counts[s[i] - 'a'] += 1
        counts[t[i] - 'a'] -= 1
    }

    for (n in counts) {
        if (n != 0) return false
    }

    return true
}

// Approach using hashmap
fun isAnagramHashMap(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val map = mutableMapOf<Char, Int>()

    for (i in s.indices) {
        map[s[i]] = map.getOrDefault(s[i], 0) + 1
        map[t[i]] = map.getOrDefault(t[i], 0) - 1
    }

    for (v in map.values) {
        if (v != 0) return false
    }

    return true
}
