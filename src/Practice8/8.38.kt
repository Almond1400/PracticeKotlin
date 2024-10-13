fun stringSize(string: String):Int
{
    var count = 0
    for (i in string.indices)
        count++
    return count
}

fun main()
{
    println("Введите строку")
    val string = readln()
    println("Длина строки: ${stringSize(string)}")
}