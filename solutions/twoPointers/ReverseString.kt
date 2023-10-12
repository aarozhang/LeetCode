package solutions.twoPointers

// O(n) time; O(1) space
fun reverseString(s: CharArray): Unit {
    var l = 0
    var r = s.size - 1

    while (l < r) {
        val temp = s[l]
        s[l] = s[r]
        s[r] = temp

        l += 1
        r -= 1
    }
}
