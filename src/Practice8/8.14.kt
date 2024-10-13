fun sumTwoNum(a: Int, b: Int): Int
{
    return a + b
}

fun main()
{
    println("Введите два числа")
    val a = readln().toInt()
    val b = readln().toInt()
    println("Сумма: ${sumTwoNum(a, b)}")
}