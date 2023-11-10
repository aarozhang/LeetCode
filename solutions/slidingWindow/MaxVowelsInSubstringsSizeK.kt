package solutions.slidingWindow

// O(n) time, O(1) space
fun maxVowels(s: String, k: Int): Int {
    val vowels = mutableSetOf<Char>()
    vowels.add('a')
    vowels.add('e')
    vowels.add('i')
    vowels.add('o')
    vowels.add('u')

    var max = 0

    for (i in 0 until k) {
        if (s[i] in vowels) max += 1
    }

    var count = max
    var l = 0

    for (r in k until s.length) {
        if (s[l] in vowels) count -= 1
        l += 1
        if (s[r] in vowels) count += 1

        max = maxOf(max, count)
    }

    return max
}