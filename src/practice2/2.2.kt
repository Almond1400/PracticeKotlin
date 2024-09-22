fun main() {
    val x = false
    val y = true
    val z = false

    var f = x or z
    println("a) $f")
    f = x and y
    println("б) $f")
    f = x and z
    println("в) $f")
}
