package solutions.arraysAndHashing

// O(n)
fun wordPattern(pattern: String, s: String): Boolean {
    val map1 = mutableMapOf<Char, String>()
    val map2 = mutableMapOf<String, Char>()

    val words = s.split(" ")
    if (words.size != pattern.length) return false

    for (i in pattern.indices) {
        if (pattern[i] in map1 && map1[pattern[i]] != words[i]) return false
        map1[pattern[i]] = words[i]

        if (words[i] in map2 && map2[words[i]] != pattern[i]) return false
        map2[words[i]] = pattern[i]
    }

    return true
}
