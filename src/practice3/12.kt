fun main() {
    println("Введите двухзачное число")
    var a = readln().toInt()

    if ((9 < a) and (a < 100))
    {
        if (a/10 == a%10)
            println("Цифры равны")
        else if (a/10 > a%10)
            println("Первая цифра больше второй")
        else
            println("Вторая цифра больше первой")
    }
    else
        println("Ошибка. Число недвухзначное")
}