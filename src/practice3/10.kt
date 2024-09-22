fun main() {
    println("Введите два числа")
    var a = readln().toInt()
    var b = readln().toInt()

    if (b % a != 0)
        println("$a - число не является делителем числа $b")
    else
        println("$a - число является делителем числа $b")
}