fun main() {
    println("Введите число")
    var a = readln().toInt()

    if (a % 2 != 0)
        println("Число нечетное")
    else
        println("Число четное")
    if (a % 10 == 7)
        println("Число оканчивается на 7")
    else
        println("Число не оканчивается на 7")
}