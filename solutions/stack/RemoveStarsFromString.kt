package solutions.stack

import java.util.*

// O(n) time, space
fun removeStars(s: String): String {
    val stack = Stack<Char>()

    for (c in s) {
        if (c == '*' && !stack.empty()) {
            stack.pop()

        } else {
            stack.push(c)
        }
    }

    return stack.joinToString("")
}
