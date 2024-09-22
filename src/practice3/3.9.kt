fun main() {
    println("Введите число m")
    var m = readln().toInt()
    println("Введите число n")
    var n = readln().toInt()

    if (m % n != 0)
        println("m на n нацело не делится")
    else
        println("Частное от деления: ${m / n}")
}