fun main() {
    println("Введите двухзначное число")
    val num = readln().toInt()
    if ((num > 99) or (num < 10))
        println("Ошибка. Число недвухзначное")
    else {
        println("Число десятков: ${num / 10}")
        println("Число единиц: $num")
        println("Сумма его цифр: ${num / 10 + num % 10}")
        println("Произведение его цифр: ${(num / 10) * (num % 10)}")
    }
}