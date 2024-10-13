fun sumTrFl(first:Int, Second:Int):Boolean
{
    if ((first+Second)<100)
        return true
    else
        return false
}

fun main()
{
    println("Введите два числа")
    val f = readln().toInt()
    val s = readln().toInt()
    println("Результат: ${sumTrFl(f, s)}")
}