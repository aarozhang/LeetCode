package solutions.stack

import java.util.*

// O(n) time, space
class StockSpanner() {
    val prices = Stack<Int>()
    val spans = Stack<Int>()

    fun next(price: Int): Int {
        var span = 1
        while (!prices.empty() && prices.peek() <= price) {
            span += spans.peek()
            spans.pop()
            prices.pop()
        }

        spans.push(span)
        prices.push(price)

        return span
    }

}