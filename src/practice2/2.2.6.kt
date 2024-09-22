fun main() {
    val x = false
    val y = false
    val z = true

    var f = x or y and !z
    println("a) $f")

    f = x and !y or z
    println("б) $f")

    f = !(x and z) or y
    println("в) $f")

    f = x and (!y or z)
    println("д) $f")

    f = x or (!(y or z))
    println("е) $f")
}