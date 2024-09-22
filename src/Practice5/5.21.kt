fun leapYear(year:Int): Boolean
{
    if (year % 4 != 0)
        return false
    else
        return true
}

fun main()
{
    println("Введите год")
    val year = readln().toInt()
    println("Введите номер месяца")
    val month = readln().toInt()
    var qDay = 0

    when(month)
    {
        1 ->  qDay = 31
        2 ->  {
            if (leapYear(year))
                qDay = 29
            else
                qDay = 28
                }
        3 ->  qDay = 31
        4 ->  qDay = 30
        5 ->  qDay = 31
        6 ->  qDay = 30
        7 ->  qDay = 31
        8 ->  qDay = 31
        9 ->  qDay = 30
        10 ->  qDay = 31
        11 ->  qDay = 30
        12 ->  qDay = 31
        else -> println("Некорректный месяц")
    }

    println("Даты в этом месяце:")
    for (i in 1.. qDay)
    {
        println("$i.$month.$year")
    }
}