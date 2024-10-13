fun prostNumEx(num:Int): Boolean
{
    var count = 0

    for (i in 1 .. num)
    {
        if(num % i != 0)
            continue
        else
            count +=1
        if (count > 2)
            break
    }
    if (count >2)
        return false
    else
        return true
}
fun main()
{
    println("Введите число")
    val num = readln().toInt()
    if (prostNumEx(num))
        println("Это число простое")
    else
        println("Это число не простое")
}