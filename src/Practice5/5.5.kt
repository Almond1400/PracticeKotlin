fun main()
{
    println("Введите число N")
    val n = readln().toInt()
    var count = 0

    for (i in 1.. n)
    {
        if(n % i != 0)
            continue
        else
            count +=1
        if (count > 2)
            break
    }
    if (count >2)
        println("Число не простое")
    else
        println("Число простое")
}