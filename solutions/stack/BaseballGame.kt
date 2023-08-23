package solutions.stack

import java.util.*

// O(n) time and space
fun calPoints(operations: Array<String>): Int {
    val stack = Stack<Int>()

    for (op in operations) {
        when (op) {
            "+" -> {
                val top = stack.pop()
                val sum = top + stack.peek()
                stack.push(top)
                stack.push(sum)
            }

            "D" -> {
                stack.push(stack.peek() * 2)
            }

            "C" -> {
                stack.pop()
            }

            else -> {
                stack.push(op.toInt())
            }

        }
    }

    var res = 0
    for (n in stack) {
        res += n
    }

    return res
}
