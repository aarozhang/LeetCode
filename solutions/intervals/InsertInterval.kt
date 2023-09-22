package solutions.intervals

// O(n) time, space
fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    var res = mutableListOf<IntArray>()

    for (i in intervals.indices) {
        if (newInterval[1] < intervals[i][0]) { // if new interval ends before curr interval start
            res.add(newInterval)
            res += intervals.copyOfRange(i, intervals.size)
            return res.toTypedArray()
        } else if (newInterval[0] > intervals[i][1]) { // if new interval starts after curr interval end
            res.add(intervals[i])
        } else { // if new interval collides with curr interval
            newInterval[0] = minOf(intervals[i][0], newInterval[0])
            newInterval[1] = maxOf(intervals[i][1], newInterval[1])
        }
    }

    if (newInterval != null) res.add(newInterval)

    return res.toTypedArray()
}
