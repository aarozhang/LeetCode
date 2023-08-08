package solutions.arraysAndHashing

/**
 * Note: This solution can be optimized into one loop.
 */

fun isIsomorphic(s: String, t: String): Boolean {
    val sMap = mutableMapOf<Char, Char>()
    val tMap = mutableMapOf<Char, Char>()

    for (i in s.indices) {
        if (s[i] in sMap && sMap[s[i]] != t[i]) return false

        sMap[s[i]] = t[i]
    }

    for (i in t.indices) {
        if (t[i] in tMap && tMap[t[i]] != s[i]) return false

        tMap[t[i]] = s[i]
    }

    return true
}
