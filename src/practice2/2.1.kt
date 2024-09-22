fun main() {
    val a = true
    val b = false
    val c = false

    var f = a or b
    println("a) $f")
    f = a and b
    println("б) $f")
    f = b or c
    println("в) $f")
}
