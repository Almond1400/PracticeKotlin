fun main() {
    val x = true
    val y = true
    val z = false

    var f = !x and y
    println("a) $f")
    f = x or !y
    println("б) $f")
    f = x or y and z
    println("в) $f")
}