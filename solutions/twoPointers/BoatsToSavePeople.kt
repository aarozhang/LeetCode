package solutions.twoPointers

// O(nlogn) time, O(1) space
fun numRescueBoats(people: IntArray, limit: Int): Int {
    people.sort()

    var l = 0
    var r = people.size - 1
    var res = 0

    while (l <= r) {
        if (people[l] + people[r] <= limit) {
            l += 1
        }

        r -= 1
        res += 1
    }

    return res
}
