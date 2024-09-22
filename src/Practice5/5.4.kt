fun main()
{
    println("Введите число N")
    val n = readln().toInt()
    var pro = 1

    for (i in 1.. n)
    {
        pro *= i
    }
    println("Факториал числа:$pro")
}