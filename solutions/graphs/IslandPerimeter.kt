package solutions.graphs

// O(n x m) time; O(1) space

fun islandPerimeter(grid: Array<IntArray>): Int {
    if (grid.isEmpty() || grid[0].isEmpty()) return 0

    var perim = 0

    for (i in grid.indices) {
        for (j in grid[0].indices) {
            if (grid[i][j] == 1) {
                perim += 4

                if (i > 0 && grid[i - 1][j] == 1) {
                    perim -= 2
                }

                if (j > 0 && grid[i][j - 1] == 1) {
                    perim -= 2
                }
            }
        }
    }

    return perim
}
