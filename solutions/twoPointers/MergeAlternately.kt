package solutions.twoPointers

// O(n + m) time, space
fun mergeAlternately(word1: String, word2: String): String {
    var res = ""
    var p1 = 0
    var p2 = 0

    while (p1 < word1.length && p2 < word2.length) {
        res += word1[p1]
        res += word2[p2]

        p1 += 1
        p2 += 1
    }

    res += word1.substring(p1)
    res += word2.substring(p2)

    return res
}
