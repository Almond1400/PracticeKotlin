fun factorial(a:Int):Int
{
    var res = 1
    for(i in 1..a)
       res *= i

    return res
}

fun main()
{
    println("Введите число")
    val n = readln().toInt()
    println("$n! = ${factorial(n)}")
}