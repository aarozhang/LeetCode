package solutions.arraysAndHashing

// O(n) time; O(1) space
fun finalValueAfterOperations(operations: Array<String>): Int {
    var x = 0

    for (s in operations) {
        if (s[0] == '-' || s[2] == '-') {
            x -= 1
        } else if (s[0] == '+' || s[2] == '+') {
            x += 1
        }
    }

    return x
}