package solutions.arraysAndHashing

// O(26 * n) ~ O(n) time; O(n) space

fun countPalindromicSubsequence(s: String): Int {
    val leftSet = mutableSetOf<Char>()
    val rightMap = IntArray(26) { 0 }
    val res = mutableSetOf<String>()
    val letters = "abcdefghijklmnopqrstuvwxyz"

    // add letters to set and map
    leftSet.add(s[0])

    for (i in 2 until s.length) {
        rightMap[s[i] - 'a'] += 1
    }

    // find palindromes
    for (i in 1 until s.length - 1) {
        for (c in letters) {
            if (c in leftSet && rightMap[c - 'a'] > 0 && !res.contains("$c${s[i]}$c")) {
                res.add("$c${s[i]}$c")
            }
        }

        leftSet.add(s[i])
        rightMap[s[i + 1] - 'a'] -= 1
    }

    return res.size
}
