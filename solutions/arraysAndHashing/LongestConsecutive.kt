package solutions.arraysAndHashing

// O(n) time, space
fun longestConsecutive(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    // add nums to a set
    val set = mutableSetOf<Int>()
    for (n in nums) {
        set.add(n)
    }

    // iterate nums and count sequences
    var maxLen = 0
    for (n in nums) {
        // check if at start of sequence
        if (n - 1 in set) {
            continue
        }

        var len = 0
        var currNum = n
        while (currNum in set) {
            len += 1
            currNum += 1
        }

        maxLen = maxOf(maxLen, len)
    }

    return maxLen
}