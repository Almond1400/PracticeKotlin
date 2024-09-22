fun main() {
    val a = true
    val b = false
    val c = false

    var f = a or !(a and b)
    println("a) $f")

    f = !a or a and (b or c)
    println("б) $f")

    f = (a or b and !c) and c
    println("в) $f")
}
