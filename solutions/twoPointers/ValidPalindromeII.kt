package solutions.twoPointers

// O(n) time, O(1) space
fun validPalindromeII(s: String): Boolean {
    var l = 0
    var r = s.length - 1

    while (l <= r) {
        if (s[l] != s[r]) {
            return isValid(s, l + 1, r) || isValid(s, l, r - 1)
        }

        l += 1
        r -= 1
    }

    return true
}

private fun isValid(s: String, left: Int, right: Int): Boolean {
    var l = left
    var r = right

    while (l <= r) {
        if (s[l] != s[r]) return false

        l += 1
        r -= 1
    }

    return true
}
