package solutions.arraysAndHashing

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        val pair = target - nums[i]

        if (pair in map) {
            return intArrayOf(map[pair]!!, i)
        } else {
            map[nums[i]] = i
        }
    }

    return intArrayOf()
}
