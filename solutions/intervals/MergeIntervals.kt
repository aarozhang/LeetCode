package solutions.intervals

// O(nlogn) time, O(n) space
fun merge(intervals: Array<IntArray>): Array<IntArray> {
    intervals.sortBy { it.first() }
    val res = mutableListOf<IntArray>()

    for (interval in intervals) {
        if (res.size == 0 || res.last()[1] < interval[0]) {
            res.add(interval)
        } else {
            res.last()[1] = maxOf(res.last()[1], interval[1])
        }
    }

    return res.toTypedArray()
}
