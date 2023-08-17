package solutions.arraysAndHashing

// O(n)
fun maxNumberOfBalloons(text: String): Int {
    val balloonCharCounts = IntArray(26) {0}

    for (c in "balloon") {
        balloonCharCounts[c - 'a'] += 1
    }

    val textCharCounts = IntArray(26) {0}

    for (c in text) {
        textCharCounts[c - 'a'] += 1
    }

    var numBalloons = text.length

    for (c in "balon") {
        numBalloons = minOf(numBalloons, textCharCounts[c - 'a'] / balloonCharCounts[c- 'a'])
    }

    return numBalloons
}
