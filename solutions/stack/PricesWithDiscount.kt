package solutions.stack

import java.util.*

// O(n) time, space
fun finalPrices(prices: IntArray): IntArray {
    val stack = Stack<Int>()
    val res = IntArray(prices.size) { 0 }

    stack.push(prices[prices.lastIndex])
    res[res.lastIndex] = stack.peek()

    for (i in prices.size - 2 downTo 0) {
        while (!stack.empty() && stack.peek() > prices[i]) {
            stack.pop()
        }

        if (stack.empty()) {
            res[i] = prices[i]
        } else {
            res[i] = prices[i] - stack.peek()
        }

        stack.push(prices[i])
    }

    return res
}
