package solutions.arraysAndHashing

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    val newFlowerBed = intArrayOf(0) + flowerbed + intArrayOf(0)
    var flowersToPlant = n

    for (i in 1 until newFlowerBed.size - 1) {
        if (newFlowerBed[i - 1] == 0 && newFlowerBed[i] == 0 && newFlowerBed[i + 1] == 0) {
            newFlowerBed[i] = 1
            flowersToPlant -= 1
        }
    }

    return flowersToPlant <= 0
}
