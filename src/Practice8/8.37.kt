fun multpliTabl(x: Int)
{
    for (i in 1..10)
    {
        println("$x * $i = ${x*i}")
    }
}

fun main()
{
    println("Введите число")
    val x = readln().toInt()
    multpliTabl(x)
}