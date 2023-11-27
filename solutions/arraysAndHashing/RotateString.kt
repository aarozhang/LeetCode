package solutions.arraysAndHashing

// O(n) time, space
fun rotateString(s: String, goal: String): Boolean {
    var curr = s
    var i = s.length

    while (i > 0) {
        if (curr == goal) return true

        curr = curr[curr.lastIndex] + curr.substring(0, curr.length - 1)
        i -= 1
    }

    return false
}