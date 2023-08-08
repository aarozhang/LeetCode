package Solutions.ArrayHashing

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()

        for (n in nums) {
            map.put(n, map.getOrDefault(n, 0) + 1)
        }

        for (v in map.values) {
            if (v >= 2) return true
        }

        return false
    }
}