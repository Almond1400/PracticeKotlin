fun sumdoN(n:Int): Int
{
    var sum = 0
    for (i in 1..n)
        sum += i
    return  sum
}

fun main()
{
    println("Введите n")
    val n = readln().toInt()
    println("Сумма чисел от 1 до $n = ${sumdoN(n)}")
}