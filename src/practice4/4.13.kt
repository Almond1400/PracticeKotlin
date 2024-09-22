fun main()
{
    println("Введите код ошибки")
    val codeError = readln()

    when(codeError)
    {
        "100" -> println("Ошибка сети")
        "404" -> println("Страница не найдена")
        "500" -> println("Ошибка клиента")
        "102" -> println("Ошибка ввода")
        "700" -> println("Синтаксическая ошибка")
        "300" -> println("Ошибка вывода")
    }

}