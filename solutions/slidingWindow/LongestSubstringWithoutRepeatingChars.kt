package solutions.slidingWindow

// O(n) time, space
fun lengthOfLongestSubstring(s: String): Int {
    val set = mutableSetOf<Char>()

    var l = 0
    var r = 0
    var maxLen = 0

    while (r < s.length) {
        if (s[r] in set) {
            set.remove(s[l++])
        } else {
            maxLen = maxOf(maxLen, r - l + 1)
            set.add(s[r++])
        }
    }

    return maxLen
}