package solutions.twoPointers

// O(n) time, space
fun isPalindrome(s: String): Boolean {
    val s = s.toLowerCase()
    var l = 0
    var r = s.length - 1

    while (l < r) {
        if (!s[l].isLetterOrDigit()) {
            l += 1
        } else if (!s[r].isLetterOrDigit()) {
            r -= 1
        } else if (s[l++] != s[r--]) {
            return false
        }
    }

    return true
}
