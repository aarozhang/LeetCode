class Solutions(){
    fun isUnique(input: String): Boolean {
        val string = input.lowercase()
        val set = mutableSetOf<Char>()

        for (c in string) {
            if (c == ' ') continue

            if (!set.add(c)) return false
        }

        return true
    }

    fun checkPermutation(input1: String, input2: String): Boolean {
        if (input1.length != input2.length) return false

        val string1 = input1.lowercase().replace(" ", "")
        val string2 = input2.lowercase().replace(" ", "")
        val map = mutableMapOf<Char, Int>()

        for (c in string1) {
            map[c] = map.getOrDefault(c, 0) + 1
        }

        for (c in string2) {
            if (!map.containsKey(c)) return false
            else {
                map[c] = map[c]!! - 1
            }
        }

        for (v in map.values) {
            if (v != 0) return false
        }

        return true
    }
}

fun main() {
    val solutions = Solutions()

    // isUnique
    println("Testing isUnique:")
    println(solutions.isUnique("Hi carl")) // true
    println(solutions.isUnique("cool stuff")) // false

    // checkPermutation
    println("Testing checkPermutation:")
    println(solutions.checkPermutation("racecar", "carrace")) // true
    println(solutions.checkPermutation("hi", "yo")) // false
}