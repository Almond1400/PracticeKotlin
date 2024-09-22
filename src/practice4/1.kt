fun main()
{
    println("Введите номер дня недели")
    val numW = readln().toInt()

    when(numW)
    {
        1 -> println("Это понедельник")
        2 -> println("Это вторник")
        3 -> println("Это среда")
        4 -> println("Это четверг")
        5 -> println("Это пятница")
        6 -> println("Это суббота")
        7 -> println("Это воскресение")
        else -> println("Ошибка. Нет такого дня недели")
    }
}