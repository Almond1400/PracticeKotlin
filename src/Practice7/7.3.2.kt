fun main()
{
    println("Введите количество чисел в списке")
    val size = readln().toInt()
    println("Вводите список чисел через enter")
    var numberList = Array(size){readln().toInt()}

    var min = numberList[0]

    for (i in numberList)
    {
        if (i < min)
            min = i
    }
    println("Минимальное число в списке: $min")
}