fun main() {
    val (n, h) = readln().split(" ").map { it.toInt() }
    val heights = readln().split(" ").map { it.toInt() }

    var width = 0
    for (height in heights) {
        if (height > h) {
            width += 2
        } else {
            width++
        }
    }

    println(width)
}
