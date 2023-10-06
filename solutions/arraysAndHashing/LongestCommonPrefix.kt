package solutions.arraysAndHashing

// O(n * m) time, space: where m is the avg length of the strings

fun longestCommonPrefix(strs: Array<String>): String {
    val map = mutableMapOf<String, Int>()

    for (s in strs) { // count up all prefix occurrences
        var prefix = ""
        for (c in s) {
            prefix += c
            map[prefix] = map.getOrDefault(prefix, 0) + 1
        }
    }

    var maxLen = 0
    var res = ""

    for ((k, v) in map) {
        if (k.length > maxLen && v == strs.size) { // find longest common prefix
            res = k
            maxLen = k.length
        }
    }

    return res
}
