package solutions.arraysAndHashing

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<String, MutableList<String>>()

    for (s in strs) {
        val charCounts = Array(26) { 0 }

        for (c in s) {
            charCounts[c - 'a'] += 1
        }

        val key = charCounts.joinToString()
        map[key] = map.getOrDefault(key, mutableListOf()).also({ it.add(s) })
    }

    val output = mutableListOf<List<String>>()
    for (list in map.values) {
        output.add(list.toList())
    }

    return output.toList()
}
