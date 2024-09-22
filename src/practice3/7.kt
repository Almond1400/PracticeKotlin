fun main() {
    println("Введите два вещественных числа")
    var a = readln().toDouble()
    var b = readln().toDouble()

    if (a == b)
        println("Числа равны")
    else if (a > b) {
        println("$a - больше чем другое")
        println("$b - меньше чем другое")
    } else {
        println("$b - больше чем другое")
        println("$a - меньше чем другое")
    }
}