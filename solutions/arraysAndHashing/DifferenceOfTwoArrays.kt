package solutions.arraysAndHashing

fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val diff1 = mutableListOf<Int>()
    val diff2 = mutableListOf<Int>()

    val set1 = mutableSetOf<Int>()
    val set2 = mutableSetOf<Int>()

    for (n in nums1) {
        set1.add(n)
    }

    for (n in nums2) {
        set2.add(n)
    }

    var seen = mutableSetOf<Int>()

    for (n in nums1) {
        if (!set2.contains(n) && !seen.contains(n)) {
            seen.add(n)
            diff1.add(n)
        }
    }

    seen = mutableSetOf<Int>()

    for (n in nums2) {
        if (!set1.contains(n) && !seen.contains(n)) {
            seen.add(n)
            diff2.add(n)
        }
    }

    return listOf(diff1.toList(), diff2.toList())
}
