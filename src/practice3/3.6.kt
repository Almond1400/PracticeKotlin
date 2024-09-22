fun main()
{
    println("Введите год")
    var year = readln().toInt()

    if(year % 4 != 0)
        println("Год не високосный. Количество дней: 365")
    else
        println("Год високосный. Количество дней: 366")
}