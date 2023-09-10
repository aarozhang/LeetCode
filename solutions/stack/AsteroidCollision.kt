package solutions.stack

import java.util.*

// O(n) time, space
fun asteroidCollision(asteroids: IntArray): IntArray {
    val stack = Stack<Int>()

    for (n in asteroids) {
        if (n >= 0) {
            stack.push(n)
            continue
        }

        while (!stack.empty() && stack.peek() > 0 && stack.peek() + n < 0) {
            stack.pop()
        }

        if (!stack.empty() && stack.peek() + n == 0) {
            stack.pop()
        } else if (stack.empty() || stack.peek() < 0) {
            stack.push(n)
        }
    }

    return stack.toIntArray()
}
