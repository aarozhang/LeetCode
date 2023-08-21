package solutions.arraysAndHashing

fun strStr(haystack: String, needle: String): Int {
    if (needle.length > haystack.length) return -1
    if (haystack == needle) return 0

    for (i in 0 until haystack.length - needle.length + 1) {
        if (haystack[i] == needle[0]) {
            var j = i + 1
            var k = 1
            while (k < needle.length && haystack[j] == needle[k]) {
                j += 1
                k += 1
            }

            if (k == needle.length) return i
        }
    }

    return -1
}
