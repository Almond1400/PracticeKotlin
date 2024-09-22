fun main()
{
    println("Введите время в 24-ом формате (минуты через точку)")
    val time = readln().toFloat()

    when(time)
    {
        in 23.01..5.59 -> println("Сейчас ночь")
        in 6.00..12.00 -> println("Сейчас утро")
        in 12.01..18.00 -> println("Сейчас день")
        in 18.01..23.00 -> println("Сейчас вечер")
    }
}