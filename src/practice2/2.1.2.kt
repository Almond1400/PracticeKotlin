fun main() {
    println("Введите трехзначное число")
    val num = readln().toInt()
    if ((num > 999) or (num < 100))
        println("Ошибка. Число нетрехзначное")
    else {
        println("Число единиц: $num")
        println("Число десятков: ${num / 10}")
        println("Сумма его цифр: ${num / 100 + (num % 100) / 10 + num % 10}")
        println("Произведение его цифр: ${(num / 100) * ((num % 100) / 10) * (num % 10)}")
    }
}