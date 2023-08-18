package solutions.arraysAndHashing

// O(n) time
// O(n) space
fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val set = mutableSetOf<Int>()

    for (n in nums) {
        set.add(n)
    }

    val res = mutableListOf<Int>()

    for (i in 1..nums.size) {
        if (i in set) {
            continue
        }

        res.add(i)
    }

    return res.toList()
}
