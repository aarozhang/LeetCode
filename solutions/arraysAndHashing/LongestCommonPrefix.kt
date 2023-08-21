package solutions.arraysAndHashing

fun longestCommonPrefix(strs: Array<String>): String {
    val map = mutableMapOf<String, Int>()

    for (s in strs) {
        var prefix = ""
        for (c in s) {
            prefix += c
            map[prefix] = map.getOrDefault(prefix, 0) + 1
        }
    }

    var maxLen = 0
    var res = ""

    for ((k, v) in map) {
        if (k.length > maxLen && v == strs.size) {
            res = k
            maxLen = k.length
        }
    }

    return res
}
