package solutions.arraysAndHashing

fun lengthOfLastWord(s: String): Int {
    val str = s.trim(' ')
    var len = 0

    for (i in str.length - 1 downTo 0) {
        if (str[i] == ' ') {
            break
        }

        len += 1
    }

    return len
}
