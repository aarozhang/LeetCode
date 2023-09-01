package solutions.arraysAndHashing

// O(n) time; O(1) space

fun replaceElements(arr: IntArray): IntArray {
    var max = arr[arr.lastIndex]

    for (i in arr.size - 2 downTo 0) {
        val temp = arr[i]
        arr[i] = max
        max = maxOf(max, temp)
    }

    arr[arr.lastIndex] = -1
    return arr
}
