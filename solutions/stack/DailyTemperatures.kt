package solutions.stack

import java.util.*

// O(n) time, space
fun dailyTemperatures(temperatures: IntArray): IntArray {
    if (temperatures.size == 1) return intArrayOf(0)
    val output = IntArray(temperatures.size)
    val stack = Stack<Int>()

    for (i in temperatures.indices) {
        while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
            output[stack.peek()] = i - stack.peek()
            stack.pop()
        }

        stack.push(i)
    }

    return output
}