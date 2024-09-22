fun main()
{
    println("Введите число и шаг")
    var num = readln().toInt()
    val step = readln().toInt()

    for (i in 1..10)
    {
        num += step
        print("$num ")
    }
}