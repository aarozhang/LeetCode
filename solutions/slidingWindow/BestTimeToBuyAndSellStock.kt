package solutions.slidingWindow

fun maxProfit(prices: IntArray): Int {
    var maxProf = 0

    var l = 0
    var r = 0

    while (r < prices.size) {
        if (prices[r] < prices[l]) {
            l = r
            r += 1
        } else {
            maxProf = maxOf(maxProf, prices[r] - prices[l])
            r += 1
        }
    }

    return maxProf
}
