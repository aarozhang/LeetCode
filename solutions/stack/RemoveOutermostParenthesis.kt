package solutions.stack

import java.util.*

// O(n) time, space
// using stack
fun removeOuterParenthesesUsingStack(s: String): String {
    val stack = Stack<Char>()
    var res = ""

    for (c in s) {
        if (c == '(' && stack.empty()) {
            stack.push(c)
        } else if (c == '(' && stack.size > 0) {
            stack.push(c)
            res += c
        } else if (c == ')' && stack.size > 1) {
            stack.pop()
            res += c
        } else {
            stack.pop()
        }
    }

    return res
}

// using counter
fun removeOuterParenthesesUsingCount(s: String): String {
    var outer = 0
    var res = ""

    for (c in s) {
        if (c == '(' && outer == 0) {
            outer += 1
        } else if (c == '(' && outer > 0) {
            outer += 1
            res += c
        } else if (c == ')' && outer > 1) {
            outer -= 1
            res += c
        } else {
            outer -= 1
        }
    }

    return res
}
