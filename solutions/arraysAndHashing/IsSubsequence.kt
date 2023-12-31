package solutions.arraysAndHashing

// O(s + t) time, O(1) space

fun isSubsequence(s: String, t: String): Boolean {
    var i = 0
    var j = 0

    while (i < s.length && j < t.length) {
        if (s[i] == t[j]) {
            i += 1
        }

        j += 1
    }

    if (i == s.length) return true

    return false
}
