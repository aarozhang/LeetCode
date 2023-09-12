package solutions.stack

import java.util.*

// O(n) time, space
fun find132pattern(nums: IntArray): Boolean {
    val nStack = Stack<Int>()
    val minStack = Stack<Int>()
    var currMin = nums[0]

    for (n in nums) {
        while (!nStack.empty() && n >= nStack.peek()) {
            nStack.pop()
            minStack.pop()
        }

        if (!minStack.empty() && n > minStack.peek()) {
            return true
        }

        nStack.push(n)
        minStack.push(currMin)
        currMin = minOf(currMin, n)
    }

    return false
}
