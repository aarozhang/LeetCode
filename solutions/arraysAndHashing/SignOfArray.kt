package solutions.arraysAndHashing

fun arraySign(nums: IntArray): Int {
    var numNegs = 0

    for (n in nums) {
        if (n == 0) return 0
        if (n * -1 > 0) numNegs += 1
    }

    if (numNegs % 2 == 0) return 1
    else return -1
}
