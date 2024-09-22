fun prostNum(num:Int): Boolean
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
    println("Введите границы диапозона")
    var a = readln().toInt()
    var b = readln().toInt()

    println("Все простые числа: ")
    for (i in a..b)
    {
        if (prostNum(i))
            continue
        else
            print("$i ")
    }

}