package solutions.twoPointers

fun threeSum(nums: IntArray): List<List<Int>> {
    val output = mutableListOf<List<Int>>()
    nums.sort()

    for (i in 0 until nums.size - 2) {
        if (i != 0 && nums[i] == nums[i - 1]) continue

        var l = i + 1
        var r = nums.size - 1

        while (l < r) {
            val sum = nums[i] + nums[l] + nums[r]

            if (sum == 0) {
                output.add(listOf(nums[i], nums[l], nums[r]))
                l++
                r--

                while (l < r && nums[l] == nums[l - 1]) {
                    l++
                }

                while (l < r && nums[r] == nums[r + 1]) {
                    r--
                }
            } else if (sum < 0) {
                l++
            } else {
                r--
            }
        }
    }

    return output
}