package solutions.arraysAndHashing

fun lengthOfLastWord(s: String): Int {
    val string = s.trim(' ')

    var lastWordLen = 0

    for (i in string.length - 1 downTo 0) {
        if (i == 0) return lastWordLen + 1

        if (string[i] == ' ') return lastWordLen

        lastWordLen += 1
    }

    return 0
}
