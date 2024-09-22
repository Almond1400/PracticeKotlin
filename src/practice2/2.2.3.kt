fun main() {
    val a = true
    val b = false
    val c = false

    var f = !a and b
    println("a) $f")
    f = a or !b
    println("б) $f")
    f = a and b or c
    println("в) $f")
}
