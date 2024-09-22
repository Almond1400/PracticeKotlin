fun main()
{
    println("Введите числовое значение")
    val gradeNum = readln().toInt()

    when (gradeNum)
    {
        5 -> println("Оценка: A")
        4 -> println("Оценка: B")
        3 -> println("Оценка: C")
        2 -> println("Оценка: D")
        0 or 1 -> println("Оценка: F")
        else -> println("Ошибка. Некорректное значение")
    }
}