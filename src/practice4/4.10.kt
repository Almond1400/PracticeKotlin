fun main()
{
    println("Выберите способ оплаты:")
    println("1 - наличными"); println("2 - кредитная карта"); println("3 - PayPal")
    val turn = readln()

    when(turn)
    {
        "1" -> println("Оплата наличными")
        "2" -> println("Оплата кредитной картой")
        "3" -> println("Оплата PayPal")
        else -> println("Ошибка ввода")
    }
}