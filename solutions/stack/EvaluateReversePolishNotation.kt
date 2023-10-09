package solutions.stack

import java.util.*

class EvaluateReversePolishNotation {
    private fun doMath(token: String, stack: Stack<Int>): Int {
        val y = stack.pop()
        val x = stack.pop()

        return when (token) {
            "+" -> x + y
            "-" -> x - y
            "*" -> x * y
            else -> x / y
        }
    }

    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()

        for (t in tokens) {
            stack.push(
                when (t) {
                    "+", "-", "/", "*" -> doMath(t, stack)
                    else -> t.toInt()
                }
            )
        }

        return stack.pop()
    }
}