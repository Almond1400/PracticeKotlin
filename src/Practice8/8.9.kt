fun kn(k:Int, n:Int):Boolean
{

    if (Math.pow(k.toDouble(), k.toDouble()) == n.toDouble())
        return true
    else
        return false
}

fun main()
{
    println("Введите k и n")
    val k = readln().toInt()
    val n = readln().toInt()
    println("Результат: ${kn(k, n)}")
}