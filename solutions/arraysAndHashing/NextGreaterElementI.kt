package solutions.arraysAndHashing

import java.util.*

// O(n * m) time solution
fun nextGreaterElementBruteForce(nums1: IntArray, nums2: IntArray): IntArray {
    val res = IntArray(nums1.size) { -1 }

    for (i in nums1.indices) {
        for (j in nums2.indices) {
            if (nums2[j] == nums1[i]) {
                var k = j + 1

                while (k < nums2.size) {
                    if (nums2[k] > nums2[j]) {
                        res[i] = nums2[k]
                        break
                    }

                    k += 1
                }

                break
            }
        }
    }

    return res
}

// O(n + m) time solution
fun nextGreaterElementOptimized(nums1: IntArray, nums2: IntArray): IntArray {
    val res = IntArray(nums1.size) { -1 }
    val map = mutableMapOf<Int, Int>()

    for (i in nums1.indices) {
        map[nums1[i]] = i
    }

    val stack = Stack<Int>()

    for (curr in nums2) {
        while (!stack.empty() && curr > stack.peek()) {
            val element = stack.pop()
            val index = map[element]!!
            res[index] = curr
        }

        if (curr in map) {
            stack.push(curr)
        }
    }

    return res
}
