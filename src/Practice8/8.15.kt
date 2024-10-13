fun compTwoNum(a: Int, b: Int): Int
{
    if (a > b)
        return a
    else
        return b
}

fun main()
{
    println("Введите два числа")
    val a = readln().toInt()
    val b = readln().toInt()
    println("Большее из них: ${compTwoNum(a, b)}")
}