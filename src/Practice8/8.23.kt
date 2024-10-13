fun sizeStr(string: String):Int
{
    var count = 0
    if (string != "")
        for (i in string.indices)
        {
            count++
        }
    else
        return 0

    return count
}
fun main()
{
    println("Введите строку")
    val str = readln()
    println(sizeStr(str))
}