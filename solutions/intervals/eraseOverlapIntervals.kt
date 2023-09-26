package solutions.intervals

// O(nlogn) time; O(1) space
fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
    intervals.sortBy { it.first() }
    var lastEnd = intervals[0][1]
    var count = 0

    for (i in 1 until intervals.size) {
        if (intervals[i][0] >= lastEnd) {
            lastEnd = intervals[i][1]
        } else {
            count += 1
            lastEnd = minOf(lastEnd, intervals[i][1])
        }
    }

    return count
}
