package solutions.stack

import java.util.*

// O(n) times, space
fun calculate(s: String): Int {
    val stack = Stack<Int>()
    var currNumber = 0
    var operation = '+'
    var i = 0

    for (c in s) {
        if (c.isDigit()) {
            currNumber = (currNumber * 10) + (c - '0')
        }

        if (!c.isDigit() && !c.isWhitespace() || i == s.length - 1) {
            when (operation) {
                '+' -> stack.push(currNumber)
                '-' -> stack.push(-currNumber)
                '*' -> stack.push(stack.pop() * currNumber)
                '/' -> stack.push(stack.pop() / currNumber)
            }

            operation = c
            currNumber = 0
        }

        i += 1
    }

    var res = 0
    for (n in stack) {
        res += n
    }

    return res
}
