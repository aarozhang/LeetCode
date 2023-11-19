package solutions.slidingWindow

fun characterReplacement(s: String, k: Int): Int {
    val map = mutableMapOf<Char, Int>()

    var l = 0
    var maxf = 0
    var res = 0

    for (r in s.indices) {
        map[s[r]] = map.getOrDefault(s[r], 0) + 1

        maxf = maxOf(map[s[r]]!!, maxf)

        val windowLen = r - l + 1

        if (windowLen - maxf > k) {
            map[s[l]] = map[s[l]]!! - 1
            l += 1
        }

        res = maxOf(r - l + 1, res)
    }

    return res
}