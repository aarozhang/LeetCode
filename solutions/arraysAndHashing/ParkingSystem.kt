package solutions.arraysAndHashing

class ParkingSystem(big: Int, medium: Int, small: Int) {
    private val map = mutableMapOf<Int, Int>()

    init {
        map[1] = big
        map[2] = medium
        map[3] = small
    }

    fun addCar(carType: Int): Boolean {
        if (map[carType]!! > 0) {
            val spots = map[carType]!! - 1
            map[carType] = spots
            return true
        }

        return false
    }

}
