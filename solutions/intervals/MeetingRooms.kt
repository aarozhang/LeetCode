package solutions.intervals

// O(nlogn) time; O(1) space
fun canAttendMeetings(intervals: List<IntArray>): Boolean {
    intervals.sortedBy { it.first() }
    var lastEnd = intervals[0][1]

    for (i in 1 until intervals.size) {
        if (intervals[i][0] < lastEnd) {
            return false
        }

        lastEnd = intervals[i][1]
    }

    return true
}
